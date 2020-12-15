//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.15 at 02:51:39 PM EST 
//


package org.openclinica.ns.odm_ext_v130.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-PresentInForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-PresentInForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ItemGroupRepeat" minOccurs="0"/>
 *         &lt;element name="ItemGroupHeader" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInFormElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInFormAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInFormAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-PresentInForm", propOrder = {
    "itemGroupRepeat",
    "itemGroupHeader"
})
public class OCodmComplexTypeDefinitionPresentInForm {

    @XmlElement(name = "ItemGroupRepeat")
    protected OCodmComplexTypeDefinitionItemGroupRepeat itemGroupRepeat;
    @XmlElement(name = "ItemGroupHeader")
    protected String itemGroupHeader;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "ShowGroup")
    protected String showGroup;

    /**
     * Gets the value of the itemGroupRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionItemGroupRepeat }
     *     
     */
    public OCodmComplexTypeDefinitionItemGroupRepeat getItemGroupRepeat() {
        return itemGroupRepeat;
    }

    /**
     * Sets the value of the itemGroupRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionItemGroupRepeat }
     *     
     */
    public void setItemGroupRepeat(OCodmComplexTypeDefinitionItemGroupRepeat value) {
        this.itemGroupRepeat = value;
    }

    /**
     * Gets the value of the itemGroupHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupHeader() {
        return itemGroupHeader;
    }

    /**
     * Sets the value of the itemGroupHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupHeader(String value) {
        this.itemGroupHeader = value;
    }

    /**
     * Gets the value of the formOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOID() {
        return formOID;
    }

    /**
     * Sets the value of the formOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOID(String value) {
        this.formOID = value;
    }

    /**
     * Gets the value of the showGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowGroup() {
        return showGroup;
    }

    /**
     * Sets the value of the showGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowGroup(String value) {
        this.showGroup = value;
    }

}
