
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoginInterface extends Remote {

    boolean verify(String userId, String password) throws RemoteException;
}
