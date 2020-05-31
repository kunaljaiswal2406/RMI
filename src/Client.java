
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Client {

    public static void main(String... ar) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter server name and port no ");
        String serverName = sc.next();
        int portNo = sc.nextInt();
        System.out.println("enter unique id ");
        String uniqueId = sc.next();//AUTH
        System.out.println("Enter userid and password");
        String userId = sc.next();
        String password = sc.next();
        Registry reg = LocateRegistry.getRegistry(serverName, 2000);
        LoginInterface li = (LoginInterface) reg.lookup(uniqueId);//lookup always search bind method on server side
        boolean result = li.verify(userId, password);
        if (result) {
            JOptionPane.showMessageDialog(null, "Welcome");
        } else {
            JOptionPane.showMessageDialog(null, "thats wrong");
        }
    }
}
