
package web_server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
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
@WebService(name = "LoginUser", targetNamespace = "http://Web_Server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LoginUser {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginUser", targetNamespace = "http://Web_Server/", className = "web_server.LoginUser_Type")
    @ResponseWrapper(localName = "loginUserResponse", targetNamespace = "http://Web_Server/", className = "web_server.LoginUserResponse")
    @Action(input = "http://Web_Server/LoginUser/loginUserRequest", output = "http://Web_Server/LoginUser/loginUserResponse")
    public boolean loginUser(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
