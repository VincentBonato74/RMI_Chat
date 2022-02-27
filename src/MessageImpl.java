import java.rmi.RemoteException;

public class MessageImpl implements Message_itf{
    public String sendMsg(String m, ClientImpl client) throws RemoteException {
        return client.getPseudo()+": "+m;
    }
}
