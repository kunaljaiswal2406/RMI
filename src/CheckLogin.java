
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CheckLogin extends UnicastRemoteObject implements LoginInterface {

    public CheckLogin() throws Exception {
    }

    public boolean verify(String userId, String password) throws RemoteException {
        if (userId.equals("abc") && password.equals("abc")) {
            return true;
        } else {
            return false;
        }
    }
}
