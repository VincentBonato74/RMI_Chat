import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Registry_itf extends Remote {
    public void register(ClientImpl client) throws RemoteException;
    public void leave(ClientImpl client) throws RemoteException;
}