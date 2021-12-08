import com.chess.userauth.UserAuthFactory;
import com.chess.userauth.interfaces.IUserAuthFactory;

/**
 * @author Het Ketanbhai Shah
 */

public class Main {
    public static void main(String args[]) {
        IUserAuthFactory userAuthFactory = new UserAuthFactory();
        userAuthFactory.createHome().indexPart();
    }
}