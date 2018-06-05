package Web_Server;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "AddMessages")
public class AddMessages {

    DatabaseConnection dbCon = new DatabaseConnection();

    @WebMethod(operationName = "addMessages")
    public String addMessages(@WebParam(name = "threadID") int threadID, @WebParam(name = "message") String message, @WebParam(name = "date") String date, @WebParam(name = "user") String user) {

        dbCon.connection();

        try {
            dbCon.statement.executeUpdate("INSERT INTO messages (ID, message, date, user) VALUES('" + threadID + "','" + message + "','" + date + "','" + user + "')");
        } catch (SQLException ex) {
            Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ("Added Message");
    }
}
