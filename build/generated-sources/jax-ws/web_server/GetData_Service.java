
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
@WebServiceClient(name = "GetData", targetNamespace = "http://Web_Server/", wsdlLocation = "http://localhost:8080/Chat_Application_Web_Server/GetData?wsdl")
public class GetData_Service
    extends Service
{

    private final static URL GETDATA_WSDL_LOCATION;
    private final static WebServiceException GETDATA_EXCEPTION;
    private final static QName GETDATA_QNAME = new QName("http://Web_Server/", "GetData");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Chat_Application_Web_Server/GetData?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETDATA_WSDL_LOCATION = url;
        GETDATA_EXCEPTION = e;
    }

    public GetData_Service() {
        super(__getWsdlLocation(), GETDATA_QNAME);
    }

    public GetData_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETDATA_QNAME, features);
    }

    public GetData_Service(URL wsdlLocation) {
        super(wsdlLocation, GETDATA_QNAME);
    }

    public GetData_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETDATA_QNAME, features);
    }

    public GetData_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetData_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetData
     */
    @WebEndpoint(name = "GetDataPort")
    public GetData getGetDataPort() {
        return super.getPort(new QName("http://Web_Server/", "GetDataPort"), GetData.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetData
     */
    @WebEndpoint(name = "GetDataPort")
    public GetData getGetDataPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Web_Server/", "GetDataPort"), GetData.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETDATA_EXCEPTION!= null) {
            throw GETDATA_EXCEPTION;
        }
        return GETDATA_WSDL_LOCATION;
    }

}