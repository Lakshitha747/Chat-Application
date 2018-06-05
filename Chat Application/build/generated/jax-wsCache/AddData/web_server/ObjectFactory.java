
package web_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web_server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddData_QNAME = new QName("http://Web_Server/", "addData");
    private final static QName _AddDataResponse_QNAME = new QName("http://Web_Server/", "addDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web_server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddData_Type }
     * 
     */
    public AddData_Type createAddData_Type() {
        return new AddData_Type();
    }

    /**
     * Create an instance of {@link AddDataResponse }
     * 
     */
    public AddDataResponse createAddDataResponse() {
        return new AddDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddData_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "addData")
    public JAXBElement<AddData_Type> createAddData(AddData_Type value) {
        return new JAXBElement<AddData_Type>(_AddData_QNAME, AddData_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "addDataResponse")
    public JAXBElement<AddDataResponse> createAddDataResponse(AddDataResponse value) {
        return new JAXBElement<AddDataResponse>(_AddDataResponse_QNAME, AddDataResponse.class, null, value);
    }

}
