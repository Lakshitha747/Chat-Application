
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

    private final static QName _AddMessagesResponse_QNAME = new QName("http://Web_Server/", "addMessagesResponse");
    private final static QName _AddMessages_QNAME = new QName("http://Web_Server/", "addMessages");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web_server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMessagesResponse }
     * 
     */
    public AddMessagesResponse createAddMessagesResponse() {
        return new AddMessagesResponse();
    }

    /**
     * Create an instance of {@link AddMessages_Type }
     * 
     */
    public AddMessages_Type createAddMessages_Type() {
        return new AddMessages_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "addMessagesResponse")
    public JAXBElement<AddMessagesResponse> createAddMessagesResponse(AddMessagesResponse value) {
        return new JAXBElement<AddMessagesResponse>(_AddMessagesResponse_QNAME, AddMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessages_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "addMessages")
    public JAXBElement<AddMessages_Type> createAddMessages(AddMessages_Type value) {
        return new JAXBElement<AddMessages_Type>(_AddMessages_QNAME, AddMessages_Type.class, null, value);
    }

}
