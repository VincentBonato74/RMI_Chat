import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client_itf extends Remote {
    public String getPseudo() throws RemoteException;
}
