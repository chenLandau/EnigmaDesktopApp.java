//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.31 at 10:30:06 PM IDT 
//


package jaxbGenerated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="input" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="output" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CTE-Reflect")
public class CTEReflect {

    @XmlAttribute(name = "input", required = true)
    protected int input;
    @XmlAttribute(name = "output", required = true)
    protected int output;

    /**
     * Gets the value of the input property.
     * 
     */
    public int getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     */
    public void setInput(int value) {
        this.input = value;
    }

    /**
     * Gets the value of the output property.
     * 
     */
    public int getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     */
    public void setOutput(int value) {
        this.output = value;
    }

}
