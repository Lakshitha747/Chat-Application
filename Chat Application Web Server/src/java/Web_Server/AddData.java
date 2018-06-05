package Web_Server;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "AddData")
public class AddData {

    DatabaseConnection dbCon = new DatabaseConnection();

    @WebMethod(operationName = "addData")
    public String addData(@WebParam(name = "title") String title, @WebParam(name = "date") String date, @WebParam(name = "username") String username) {

        dbCon.connection();

        try {
            dbCon.statement.executeUpdate("INSERT INTO threads (title, date, username) VALUES ('" + title + "','" + date + "','" + username + "')"
            );
        } catch (SQLException ex) {
            Logger.getLogger(AddData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ("Message Added");
    }
}
