import java.rmi.server.*;
import java.rmi.registry.*;

public class ServerChat {
    public static void  main(String [] args) {
        try {
            // Create a Hello remote object
            RegistryImpl r = new RegistryImpl();
            MessageImpl m = new MessageImpl();
            Registry_itf r_stub = (Registry_itf) UnicastRemoteObject.exportObject(r, 0);
            Message_itf m_stub = (Message_itf) UnicastRemoteObject.exportObject(m, 0);

            // Register the remote object in RMI registry with a given identifier
            Registry registry= LocateRegistry.getRegistry();
            registry.rebind("MessageService", m_stub);
            registry.rebind("RegistryService", r_stub);

            System.out.println ("Server ready");

        } catch (Exception e) {
            System.err.println("Error on server :" + e) ;
            e.printStackTrace();
        }
    }
}
