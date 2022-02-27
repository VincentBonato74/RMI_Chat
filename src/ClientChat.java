import java.rmi.registry.*;
import java.util.Scanner;

public class ClientChat {

    public static void main(String [] args) {
        try {
            if (args.length < 2) {
                System.out.println("Usage: java HelloClient <rmiregistry host> <name>");
                return;
            }

            String host = args[0];
            String name = args[1];
            Scanner scan = new Scanner(System.in);
            String msg;

            // Get remote object reference
            Registry registry = LocateRegistry.getRegistry(host);
            Message_itf c = (Message_itf) registry.lookup("MessageService");
            Registry_itf r = (Registry_itf) registry.lookup("RegistryService");

            ClientImpl client = new ClientImpl(name);
            r.register(client);

            while(true){
                msg = scan.nextLine();
                if(msg == "quit"){
                    r.leave(client);
                    break;
                }else{
                    c.sendMsg(msg, client);
                }
            }

        } catch (Exception e)  {
            System.err.println("Error on client: " + e);
        }
    }
}