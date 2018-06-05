package Web_Server;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "GetData")
public class GetData {

    DatabaseConnection dbCon = new DatabaseConnection();
    
    static int threadID;

    @WebMethod(operationName = "getData")
    public ArrayList<String> getData() {

        dbCon.connection();

        ArrayList<String> msgArr = new ArrayList<>();

        String strThread = "No Threads";
        try {
            ResultSet query = dbCon.statement.executeQuery("SELECT * FROM `threads` ORDER BY `threads`.`ID` DESC LIMIT 2");
            while (query.next()) {
                int id = query.getInt("ID");
                String title = query.getString("title");
                String date = query.getString("date");
                String username = query.getString("username");
                strThread = (id + " , " + title + " , " + date + " , " + username);
                msgArr.add(strThread);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msgArr;
    }

    @WebMethod(operationName = "getThreadId")
    public int getThreadId(@WebParam(name = "ID") String ID) {
        int id = Integer.parseInt(ID);
        threadID = id;
        return id;
    }

    @WebMethod(operationName = "sendThreadId")
    public int sendThreadId() {
        int sendId = threadID;
        return sendId;
    }
}
