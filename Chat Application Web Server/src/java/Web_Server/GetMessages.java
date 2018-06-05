package Web_Server;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "GetMessages")
public class GetMessages {

    DatabaseConnection dbCon = new DatabaseConnection();

    int threadID = GetData.threadID;

    @WebMethod(operationName = "getMessages")
    public ArrayList<String> getMessages() {

        dbCon.connection();

        ArrayList<String> msgArr = new ArrayList<>();

        String strMessage = "No Messages";
        try {
            ResultSet query = dbCon.statement.executeQuery("SELECT * FROM `messages` WHERE ID = '" + threadID + "' ORDER BY `messages`.`message` DESC LIMIT 3");
            while (query.next()) {
                String message = query.getString("message");
                String date = query.getString("date");
                String username = query.getString("user");
                strMessage = (message + "," + date + "," + username);
                msgArr.add(strMessage);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetMessages.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msgArr;
    }
}
