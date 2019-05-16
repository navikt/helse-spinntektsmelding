//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:07:18 AM CEST 
//


package no.nav.model.databatch;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MetadataList" type="{}MetadataList" minOccurs="0"/&gt;
 *         &lt;element name="Approvers" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Approver" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="approverId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="approvedTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                           &lt;attribute name="securityLevel"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                 &lt;enumeration value="notSensitive"/&gt;
 *                                 &lt;enumeration value="lessSensitive"/&gt;
 *                                 &lt;enumeration value="sensitive"/&gt;
 *                                 &lt;enumeration value="verySensitive"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FormTask" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ServiceEditionCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CaseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="SOEncryptedSymmetricdKey" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="EncryptedKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                             &lt;element name="CertificateThumbprint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Form" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DataFormatId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DataFormatVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ParentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FormData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="reportee" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="11"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="archiveReference" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="50"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="archiveTimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metadataList",
    "approvers",
    "formTask"
})
@XmlRootElement(name = "DataUnit")
public class DataUnit {

    @XmlElement(name = "MetadataList")
    protected MetadataList metadataList;
    @XmlElement(name = "Approvers")
    protected List<Approvers> approvers;
    @XmlElement(name = "FormTask")
    protected DataUnit.FormTask formTask;
    @XmlAttribute(name = "reportee", required = true)
    protected String reportee;
    @XmlAttribute(name = "archiveReference", required = true)
    protected String archiveReference;
    @XmlAttribute(name = "archiveTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar archiveTimeStamp;

    /**
     * Gets the value of the metadataList property.
     *
     * @return
     *     possible object is
     *     {@link MetadataList }
     *
     */
    public MetadataList getMetadataList() {
        return metadataList;
    }

    /**
     * Sets the value of the metadataList property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataList }
     *
     */
    public void setMetadataList(MetadataList value) {
        this.metadataList = value;
    }

    /**
     * Gets the value of the approvers property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvers property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovers().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataUnit.Approvers }
     *
     *
     */
    public List<Approvers> getApprovers() {
        if (approvers == null) {
            approvers = new ArrayList<Approvers>();
        }
        return this.approvers;
    }

    /**
     * Gets the value of the formTask property.
     *
     * @return
     *     possible object is
     *     {@link DataUnit.FormTask }
     *
     */
    public DataUnit.FormTask getFormTask() {
        return formTask;
    }

    /**
     * Sets the value of the formTask property.
     *
     * @param value
     *     allowed object is
     *     {@link DataUnit.FormTask }
     *
     */
    public void setFormTask(DataUnit.FormTask value) {
        this.formTask = value;
    }

    /**
     * Gets the value of the reportee property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportee() {
        return reportee;
    }

    /**
     * Sets the value of the reportee property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportee(String value) {
        this.reportee = value;
    }

    /**
     * Gets the value of the archiveReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArchiveReference() {
        return archiveReference;
    }

    /**
     * Sets the value of the archiveReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArchiveReference(String value) {
        this.archiveReference = value;
    }

    /**
     * Gets the value of the archiveTimeStamp property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getArchiveTimeStamp() {
        return archiveTimeStamp;
    }

    /**
     * Sets the value of the archiveTimeStamp property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setArchiveTimeStamp(XMLGregorianCalendar value) {
        this.archiveTimeStamp = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Approver" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="approverId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="approvedTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                 &lt;attribute name="securityLevel"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;enumeration value="notSensitive"/&gt;
     *                       &lt;enumeration value="lessSensitive"/&gt;
     *                       &lt;enumeration value="sensitive"/&gt;
     *                       &lt;enumeration value="verySensitive"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "approver"
    })
    public static class Approvers {

        @XmlElement(name = "Approver")
        protected List<Approver> approver;

        /**
         * Gets the value of the approver property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the approver property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApprover().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataUnit.Approvers.Approver }
         *
         *
         */
        public List<Approver> getApprover() {
            if (approver == null) {
                approver = new ArrayList<Approver>();
            }
            return this.approver;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="approverId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="approvedTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *       &lt;attribute name="securityLevel"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *             &lt;enumeration value="notSensitive"/&gt;
         *             &lt;enumeration value="lessSensitive"/&gt;
         *             &lt;enumeration value="sensitive"/&gt;
         *             &lt;enumeration value="verySensitive"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Approver {

            @XmlAttribute(name = "approverId")
            protected String approverId;
            @XmlAttribute(name = "approvedTimeStamp")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar approvedTimeStamp;
            @XmlAttribute(name = "securityLevel")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String securityLevel;

            /**
             * Gets the value of the approverId property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getApproverId() {
                return approverId;
            }

            /**
             * Sets the value of the approverId property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setApproverId(String value) {
                this.approverId = value;
            }

            /**
             * Gets the value of the approvedTimeStamp property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getApprovedTimeStamp() {
                return approvedTimeStamp;
            }

            /**
             * Sets the value of the approvedTimeStamp property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setApprovedTimeStamp(XMLGregorianCalendar value) {
                this.approvedTimeStamp = value;
            }

            /**
             * Gets the value of the securityLevel property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSecurityLevel() {
                return securityLevel;
            }

            /**
             * Sets the value of the securityLevel property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSecurityLevel(String value) {
                this.securityLevel = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ServiceEditionCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CaseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="SOEncryptedSymmetricdKey" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="EncryptedKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *                   &lt;element name="CertificateThumbprint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Form" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DataFormatId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DataFormatVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ParentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FormData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceCode",
        "serviceEditionCode",
        "caseID",
        "soEncryptedSymmetricdKey",
        "form"
    })
    public static class FormTask {

        @XmlElement(name = "ServiceCode", required = true)
        protected String serviceCode;
        @XmlElement(name = "ServiceEditionCode", required = true)
        protected String serviceEditionCode;
        @XmlElement(name = "CaseID")
        protected Integer caseID;
        @XmlElement(name = "SOEncryptedSymmetricdKey")
        protected DataUnit.FormTask.SOEncryptedSymmetricdKey soEncryptedSymmetricdKey;
        @XmlElement(name = "Form", required = true)
        protected List<Form> form;

        /**
         * Gets the value of the serviceCode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getServiceCode() {
            return serviceCode;
        }

        /**
         * Sets the value of the serviceCode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setServiceCode(String value) {
            this.serviceCode = value;
        }

        /**
         * Gets the value of the serviceEditionCode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getServiceEditionCode() {
            return serviceEditionCode;
        }

        /**
         * Sets the value of the serviceEditionCode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setServiceEditionCode(String value) {
            this.serviceEditionCode = value;
        }

        /**
         * Gets the value of the caseID property.
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getCaseID() {
            return caseID;
        }

        /**
         * Sets the value of the caseID property.
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setCaseID(Integer value) {
            this.caseID = value;
        }

        /**
         * Gets the value of the soEncryptedSymmetricdKey property.
         *
         * @return
         *     possible object is
         *     {@link DataUnit.FormTask.SOEncryptedSymmetricdKey }
         *
         */
        public DataUnit.FormTask.SOEncryptedSymmetricdKey getSOEncryptedSymmetricdKey() {
            return soEncryptedSymmetricdKey;
        }

        /**
         * Sets the value of the soEncryptedSymmetricdKey property.
         *
         * @param value
         *     allowed object is
         *     {@link DataUnit.FormTask.SOEncryptedSymmetricdKey }
         *
         */
        public void setSOEncryptedSymmetricdKey(DataUnit.FormTask.SOEncryptedSymmetricdKey value) {
            this.soEncryptedSymmetricdKey = value;
        }

        /**
         * Gets the value of the form property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the form property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForm().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataUnit.FormTask.Form }
         *
         *
         */
        public List<Form> getForm() {
            if (form == null) {
                form = new ArrayList<Form>();
            }
            return this.form;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="DataFormatId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DataFormatVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ParentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FormData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dataFormatId",
            "dataFormatVersion",
            "reference",
            "parentReference",
            "formData"
        })
        public static class Form {

            @XmlElement(name = "DataFormatId", required = true)
            protected String dataFormatId;
            @XmlElement(name = "DataFormatVersion", required = true)
            protected String dataFormatVersion;
            @XmlElement(name = "Reference", required = true)
            protected String reference;
            @XmlElement(name = "ParentReference")
            protected String parentReference;
            @XmlElement(name = "FormData", required = true)
            protected String formData;

            /**
             * Gets the value of the dataFormatId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataFormatId() {
                return dataFormatId;
            }

            /**
             * Sets the value of the dataFormatId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataFormatId(String value) {
                this.dataFormatId = value;
            }

            /**
             * Gets the value of the dataFormatVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataFormatVersion() {
                return dataFormatVersion;
            }

            /**
             * Sets the value of the dataFormatVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataFormatVersion(String value) {
                this.dataFormatVersion = value;
            }

            /**
             * Gets the value of the reference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * Sets the value of the reference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
            }

            /**
             * Gets the value of the parentReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentReference() {
                return parentReference;
            }

            /**
             * Sets the value of the parentReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentReference(String value) {
                this.parentReference = value;
            }

            /**
             * Gets the value of the formData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormData() {
                return formData;
            }

            /**
             * Sets the value of the formData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormData(String value) {
                this.formData = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="EncryptedKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
         *         &lt;element name="CertificateThumbprint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "encryptedKey",
            "certificateThumbprint"
        })
        public static class SOEncryptedSymmetricdKey {

            @XmlElement(name = "EncryptedKey", required = true)
            protected byte[] encryptedKey;
            @XmlElement(name = "CertificateThumbprint", required = true)
            protected String certificateThumbprint;

            /**
             * Gets the value of the encryptedKey property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getEncryptedKey() {
                return encryptedKey;
            }

            /**
             * Sets the value of the encryptedKey property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setEncryptedKey(byte[] value) {
                this.encryptedKey = value;
            }

            /**
             * Gets the value of the certificateThumbprint property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCertificateThumbprint() {
                return certificateThumbprint;
            }

            /**
             * Sets the value of the certificateThumbprint property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCertificateThumbprint(String value) {
                this.certificateThumbprint = value;
            }

        }

    }

}