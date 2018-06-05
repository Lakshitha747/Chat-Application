package Web_Server;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "AddUser")
public class AddUser {

    DatabaseConnection dbCon = new DatabaseConnection();

    @WebMethod(operationName = "addUser")
    public String addUser(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {

        dbCon.connection();

        try {
            dbCon.statement.executeUpdate("INSERT INTO user VALUES('" + username + "','" + password + "')");
        } catch (SQLException ex) {
            Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ("Added User");
    }

}
