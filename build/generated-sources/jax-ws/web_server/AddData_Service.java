
package web_server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AddData", targetNamespace = "http://Web_Server/", wsdlLocation = "http://localhost:8080/Chat_Application_Web_Server/AddData?wsdl")
public class AddData_Service
    extends Service
{

    private final static URL ADDDATA_WSDL_LOCATION;
    private final static WebServiceException ADDDATA_EXCEPTION;
    private final static QName ADDDATA_QNAME = new QName("http://Web_Server/", "AddData");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Chat_Application_Web_Server/AddData?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDDATA_WSDL_LOCATION = url;
        ADDDATA_EXCEPTION = e;
    }

    public AddData_Service() {
        super(__getWsdlLocation(), ADDDATA_QNAME);
    }

    public AddData_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDDATA_QNAME, features);
    }

    public AddData_Service(URL wsdlLocation) {
        super(wsdlLocation, ADDDATA_QNAME);
    }

    public AddData_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDDATA_QNAME, features);
    }

    public AddData_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddData_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AddData
     */
    @WebEndpoint(name = "AddDataPort")
    public AddData getAddDataPort() {
        return super.getPort(new QName("http://Web_Server/", "AddDataPort"), AddData.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddData
     */
    @WebEndpoint(name = "AddDataPort")
    public AddData getAddDataPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Web_Server/", "AddDataPort"), AddData.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDDATA_EXCEPTION!= null) {
            throw ADDDATA_EXCEPTION;
        }
        return ADDDATA_WSDL_LOCATION;
    }

}
