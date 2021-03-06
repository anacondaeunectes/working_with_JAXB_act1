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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for centroType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="centroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigocentro" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="nombrecentro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="director" type="{}directorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "centroType", propOrder = {
    "codigocentro",
    "nombrecentro",
    "direccion",
    "director"
})
public class CentroType {

    @XmlElement(required = true)
    protected BigInteger codigocentro;
    @XmlElement(required = true)
    protected String nombrecentro;
    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    protected DirectorType director;

    /**
     * Gets the value of the codigocentro property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigocentro() {
        return codigocentro;
    }

    /**
     * Sets the value of the codigocentro property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigocentro(BigInteger value) {
        this.codigocentro = value;
    }

    /**
     * Gets the value of the nombrecentro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrecentro() {
        return nombrecentro;
    }

    /**
     * Sets the value of the nombrecentro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrecentro(String value) {
        this.nombrecentro = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the director property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorType }
     *     
     */
    public DirectorType getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorType }
     *     
     */
    public void setDirector(DirectorType value) {
        this.director = value;
    }

}
