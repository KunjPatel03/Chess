import com.chess.userauth.UserAuthFactory;
import com.chess.userauth.interfaces.IUserAuthFactory;

/**
 * @author Het Ketanbhai Shah
 */

public class Main {
    private static IUserAuthFactory userAuthFactory = new UserAuthFactory();

    public static void main(String args[]) {

        userAuthFactory.createHome().indexPart();
    }
}