
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

    private final static QName _ValidateUser_QNAME = new QName("http://Web_Server/", "validateUser");
    private final static QName _ValidateUserResponse_QNAME = new QName("http://Web_Server/", "validateUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web_server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateUser_Type }
     * 
     */
    public ValidateUser_Type createValidateUser_Type() {
        return new ValidateUser_Type();
    }

    /**
     * Create an instance of {@link ValidateUserResponse }
     * 
     */
    public ValidateUserResponse createValidateUserResponse() {
        return new ValidateUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUser_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "validateUser")
    public JAXBElement<ValidateUser_Type> createValidateUser(ValidateUser_Type value) {
        return new JAXBElement<ValidateUser_Type>(_ValidateUser_QNAME, ValidateUser_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "validateUserResponse")
    public JAXBElement<ValidateUserResponse> createValidateUserResponse(ValidateUserResponse value) {
        return new JAXBElement<ValidateUserResponse>(_ValidateUserResponse_QNAME, ValidateUserResponse.class, null, value);
    }

}
