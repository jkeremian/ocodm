//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.15 at 01:17:07 PM EDT 
//


package org.cdisc.ns.odm.v130;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionAuditLogs;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionDiscrepancyNotes;


/**
 * <p>Java class for ODMcomplexTypeDefinition-StudyEventData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-StudyEventData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecord" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Signature" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}FormData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}StudyEventDataElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}StudyEventDataAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}StudyEventDataAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-StudyEventData", propOrder = {
    "auditRecord",
    "signature",
    "annotation",
    "formData",
    "studyEventDataElementExtension"
})
public class ODMcomplexTypeDefinitionStudyEventData {

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "FormData")
    protected List<ODMcomplexTypeDefinitionFormData> formData;
    @XmlElements({
        @XmlElement(name = "AuditLogs", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionAuditLogs.class),
        @XmlElement(name = "DiscrepancyNotes", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionDiscrepancyNotes.class)
    })
    protected List<Object> studyEventDataElementExtension;
    @XmlAttribute(name = "StudyEventOID", required = true)
    protected String studyEventOID;
    @XmlAttribute(name = "StudyEventRepeatKey")
    protected String studyEventRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "StudyEventLocation", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String studyEventLocation;
    @XmlAttribute(name = "EventName", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String eventName;
    @XmlAttribute(name = "StartDate", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String startDate;
    @XmlAttribute(name = "EndDate", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String endDate;
    @XmlAttribute(name = "Status", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String status;
    @XmlAttribute(name = "WorkflowStatus", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String workflowStatus;
    @XmlAttribute(name = "Signed", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String signed;
    @XmlAttribute(name = "Locked", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String locked;
    @XmlAttribute(name = "Removed", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String removed;
    @XmlAttribute(name = "Archived", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String archived;
    @XmlAttribute(name = "SubjectAgeAtEvent", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected BigInteger subjectAgeAtEvent;

    /**
     * Gets the value of the auditRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public ODMcomplexTypeDefinitionAuditRecord getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public void setAuditRecord(ODMcomplexTypeDefinitionAuditRecord value) {
        this.auditRecord = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public ODMcomplexTypeDefinitionSignature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public void setSignature(ODMcomplexTypeDefinitionSignature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAnnotation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the formData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFormData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFormData> getFormData() {
        if (formData == null) {
            formData = new ArrayList<ODMcomplexTypeDefinitionFormData>();
        }
        return this.formData;
    }

    /**
     * Gets the value of the studyEventDataElementExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEventDataElementExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEventDataElementExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionAuditLogs }
     * {@link OCodmComplexTypeDefinitionDiscrepancyNotes }
     * 
     * 
     */
    public List<Object> getStudyEventDataElementExtension() {
        if (studyEventDataElementExtension == null) {
            studyEventDataElementExtension = new ArrayList<Object>();
        }
        return this.studyEventDataElementExtension;
    }

    /**
     * Gets the value of the studyEventOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventOID() {
        return studyEventOID;
    }

    /**
     * Sets the value of the studyEventOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventOID(String value) {
        this.studyEventOID = value;
    }

    /**
     * Gets the value of the studyEventRepeatKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventRepeatKey() {
        return studyEventRepeatKey;
    }

    /**
     * Sets the value of the studyEventRepeatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventRepeatKey(String value) {
        this.studyEventRepeatKey = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the studyEventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventLocation() {
        return studyEventLocation;
    }

    /**
     * Sets the value of the studyEventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventLocation(String value) {
        this.studyEventLocation = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the workflowStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * Sets the value of the workflowStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStatus(String value) {
        this.workflowStatus = value;
    }

    /**
     * Gets the value of the signed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigned() {
        return signed;
    }

    /**
     * Sets the value of the signed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigned(String value) {
        this.signed = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocked(String value) {
        this.locked = value;
    }

    /**
     * Gets the value of the removed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoved() {
        return removed;
    }

    /**
     * Sets the value of the removed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoved(String value) {
        this.removed = value;
    }

    /**
     * Gets the value of the archived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchived(String value) {
        this.archived = value;
    }

    /**
     * Gets the value of the subjectAgeAtEvent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubjectAgeAtEvent() {
        return subjectAgeAtEvent;
    }

    /**
     * Sets the value of the subjectAgeAtEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubjectAgeAtEvent(BigInteger value) {
        this.subjectAgeAtEvent = value;
    }

}
