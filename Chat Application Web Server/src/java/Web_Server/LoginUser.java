package Web_Server;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "LoginUser")
public class LoginUser {

    DatabaseConnection dbCon = new DatabaseConnection();

    @WebMethod(operationName = "loginUser")
    public boolean loginUser(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {

        dbCon.connection();

        boolean loggedIn = false;
        try {
            ResultSet query = dbCon.statement.executeQuery("SELECT * FROM user");
            while (query.next()) {
                String user = query.getString("username");
                String pass = query.getString("password");
                if (username.equals(user) && password.equals(pass)) {
                    loggedIn = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loggedIn;
    }
}
