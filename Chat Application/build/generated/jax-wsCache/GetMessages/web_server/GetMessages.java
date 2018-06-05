
package web_server;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetMessages", targetNamespace = "http://Web_Server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetMessages {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessages", targetNamespace = "http://Web_Server/", className = "web_server.GetMessages_Type")
    @ResponseWrapper(localName = "getMessagesResponse", targetNamespace = "http://Web_Server/", className = "web_server.GetMessagesResponse")
    @Action(input = "http://Web_Server/GetMessages/getMessagesRequest", output = "http://Web_Server/GetMessages/getMessagesResponse")
    public List<String> getMessages();

}