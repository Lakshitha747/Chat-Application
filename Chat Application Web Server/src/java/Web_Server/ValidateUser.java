package Web_Server;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ValidateUser")
public class ValidateUser {

    DatabaseConnection dbCon = new DatabaseConnection();

    @WebMethod(operationName = "validateUser")
    public boolean validateUser(@WebParam(name = "username") String username) {

        dbCon.connection();

        boolean registeredUser = false;
        try {
            ResultSet query = dbCon.statement.executeQuery("SELECT username FROM user");
            while (query.next()) {
                String user = query.getString("username");
                if (user.equals(username)) {
                    registeredUser = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ValidateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registeredUser;
    }
}
