import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class RegistryImpl implements Registry_itf, Serializable {
    public ArrayList<ClientImpl> ListClient = new ArrayList<ClientImpl>();

    @Override
    public void register(ClientImpl client) throws RemoteException {
        ListClient.add(client);
    }

    @Override
    public void leave(ClientImpl client) throws RemoteException {
        ListClient.remove(client);
    }
}
