//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.24 at 11:41:29 AM EDT 
//


package org.openclinica.ns.rules.v31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RunOnStatus" type="{http://www.openclinica.org/ns/rules/v3.1}RunOnType" minOccurs="0"/&gt;
 *         &lt;element name="EventDestination" type="{http://www.openclinica.org/ns/rules/v3.1}EventDestinationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/rules/v3.1}DiscrepancyNoteActionAttributeType"/&gt;
 *       &lt;attribute name="OID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventActionType", propOrder = {
    "runOnStatus",
    "eventDestination"
})
public class EventActionType {

    @XmlElement(name = "RunOnStatus")
    protected RunOnType runOnStatus;
    @XmlElement(name = "EventDestination", required = true)
    protected List<EventDestinationType> eventDestination;
    @XmlAttribute(name = "OID")
    protected String oid;
    @XmlAttribute(name = "IfExpressionEvaluates")
    protected String ifExpressionEvaluates;

    /**
     * Gets the value of the runOnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RunOnType }
     *     
     */
    public RunOnType getRunOnStatus() {
        return runOnStatus;
    }

    /**
     * Sets the value of the runOnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunOnType }
     *     
     */
    public void setRunOnStatus(RunOnType value) {
        this.runOnStatus = value;
    }

    /**
     * Gets the value of the eventDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDestinationType }
     * 
     * 
     */
    public List<EventDestinationType> getEventDestination() {
        if (eventDestination == null) {
            eventDestination = new ArrayList<EventDestinationType>();
        }
        return this.eventDestination;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the ifExpressionEvaluates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfExpressionEvaluates() {
        return ifExpressionEvaluates;
    }

    /**
     * Sets the value of the ifExpressionEvaluates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfExpressionEvaluates(String value) {
        this.ifExpressionEvaluates = value;
    }

}
