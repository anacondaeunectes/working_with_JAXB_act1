//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.08 at 11:42:06 AM CEST 
//


package datosClases;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profesorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profesorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoprofesor" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="nombreprofesor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profesorType", propOrder = {
    "codigoprofesor",
    "nombreprofesor"
})
@XmlSeeAlso({
    DirectorType.class
})
public class ProfesorType {

    @XmlElement(required = true)
    protected BigInteger codigoprofesor;
    @XmlElement(required = true)
    protected String nombreprofesor;

    /**
     * Gets the value of the codigoprofesor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoprofesor() {
        return codigoprofesor;
    }

    /**
     * Sets the value of the codigoprofesor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoprofesor(BigInteger value) {
        this.codigoprofesor = value;
    }

    /**
     * Gets the value of the nombreprofesor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreprofesor() {
        return nombreprofesor;
    }

    /**
     * Sets the value of the nombreprofesor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreprofesor(String value) {
        this.nombreprofesor = value;
    }

}
