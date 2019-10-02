import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws SQLException {
        List<User> listOfUsers = new ArrayList();
        List<String> def = new ArrayList<>();

        ResultSet rs = null; //I just set it to null because I didnt know what it was..
        while (rs.next()) {
            String fetchedColumnNameAsString = rs.get(“ColumnName”);

            User userMadeWithASetter = new User();
            userMadeWithASetter.setUserIdAsString(fetchedColumnNameAsString);

            User userMadeWithStringConstructor = new User(fetchedColumnNameAsString);
        }
    }
}
