import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message_itf extends Remote {
    public String sendMsg(String m, ClientImpl client) throws RemoteException;
}
