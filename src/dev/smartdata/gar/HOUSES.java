//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.06.20 às 03:10:31 PM IRKT 
//


package dev.smartdata.gar;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HOUSE" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="OBJECTID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="OBJECTGUID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="36"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="CHANGEID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="HOUSENUM">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="50"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ADDNUM1">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="50"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ADDNUM2">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="50"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="HOUSETYPE" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="ADDTYPE1">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ADDTYPE2">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="OPERTYPEID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="PREVID">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="NEXTID">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *                       &lt;totalDigits value="19"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="UPDATEDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="STARTDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ENDDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ISACTUAL" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;enumeration value="0"/>
 *                       &lt;enumeration value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ISACTIVE" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;enumeration value="0"/>
 *                       &lt;enumeration value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "house"
})
@XmlRootElement(name = "HOUSES")
public class HOUSES {

    @XmlElement(name = "HOUSE", required = true)
    protected List<HOUSES.HOUSE> house;

    /**
     * Gets the value of the house property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the house property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHOUSE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HOUSES.HOUSE }
     * 
     * 
     */
    public List<HOUSES.HOUSE> getHOUSE() {
        if (house == null) {
            house = new ArrayList<HOUSES.HOUSE>();
        }
        return this.house;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="OBJECTID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="OBJECTGUID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="36"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="CHANGEID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="HOUSENUM">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="50"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ADDNUM1">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="50"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ADDNUM2">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="50"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="HOUSETYPE" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="ADDTYPE1">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ADDTYPE2">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="OPERTYPEID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="PREVID">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="NEXTID">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
     *             &lt;totalDigits value="19"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="UPDATEDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="STARTDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ENDDATE" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ISACTUAL" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;enumeration value="0"/>
     *             &lt;enumeration value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ISACTIVE" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;enumeration value="0"/>
     *             &lt;enumeration value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HOUSE {

        @XmlAttribute(name = "ID", required = true)
        protected long id;
        @XmlAttribute(name = "OBJECTID", required = true)
        protected long objectid;
        @XmlAttribute(name = "OBJECTGUID", required = true)
        protected String objectguid;
        @XmlAttribute(name = "CHANGEID", required = true)
        protected long changeid;
        @XmlAttribute(name = "HOUSENUM")
        protected String housenum;
        @XmlAttribute(name = "ADDNUM1")
        protected String addnum1;
        @XmlAttribute(name = "ADDNUM2")
        protected String addnum2;
        @XmlAttribute(name = "HOUSETYPE")
        protected BigInteger housetype;
        @XmlAttribute(name = "ADDTYPE1")
        protected BigInteger addtype1;
        @XmlAttribute(name = "ADDTYPE2")
        protected BigInteger addtype2;
        @XmlAttribute(name = "OPERTYPEID", required = true)
        protected BigInteger opertypeid;
        @XmlAttribute(name = "PREVID")
        protected Long previd;
        @XmlAttribute(name = "NEXTID")
        protected Long nextid;
        @XmlAttribute(name = "UPDATEDATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar updatedate;
        @XmlAttribute(name = "STARTDATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startdate;
        @XmlAttribute(name = "ENDDATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar enddate;
        @XmlAttribute(name = "ISACTUAL", required = true)
        protected BigInteger isactual;
        @XmlAttribute(name = "ISACTIVE", required = true)
        protected BigInteger isactive;

        /**
         * Obtém o valor da propriedade id.
         * 
         */
        public long getID() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         */
        public void setID(long value) {
            this.id = value;
        }

        /**
         * Obtém o valor da propriedade objectid.
         * 
         */
        public long getOBJECTID() {
            return objectid;
        }

        /**
         * Define o valor da propriedade objectid.
         * 
         */
        public void setOBJECTID(long value) {
            this.objectid = value;
        }

        /**
         * Obtém o valor da propriedade objectguid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBJECTGUID() {
            return objectguid;
        }

        /**
         * Define o valor da propriedade objectguid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBJECTGUID(String value) {
            this.objectguid = value;
        }

        /**
         * Obtém o valor da propriedade changeid.
         * 
         */
        public long getCHANGEID() {
            return changeid;
        }

        /**
         * Define o valor da propriedade changeid.
         * 
         */
        public void setCHANGEID(long value) {
            this.changeid = value;
        }

        /**
         * Obtém o valor da propriedade housenum.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHOUSENUM() {
            return housenum;
        }

        /**
         * Define o valor da propriedade housenum.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHOUSENUM(String value) {
            this.housenum = value;
        }

        /**
         * Obtém o valor da propriedade addnum1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDNUM1() {
            return addnum1;
        }

        /**
         * Define o valor da propriedade addnum1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDNUM1(String value) {
            this.addnum1 = value;
        }

        /**
         * Obtém o valor da propriedade addnum2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDNUM2() {
            return addnum2;
        }

        /**
         * Define o valor da propriedade addnum2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDNUM2(String value) {
            this.addnum2 = value;
        }

        /**
         * Obtém o valor da propriedade housetype.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHOUSETYPE() {
            return housetype;
        }

        /**
         * Define o valor da propriedade housetype.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHOUSETYPE(BigInteger value) {
            this.housetype = value;
        }

        /**
         * Obtém o valor da propriedade addtype1.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getADDTYPE1() {
            return addtype1;
        }

        /**
         * Define o valor da propriedade addtype1.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setADDTYPE1(BigInteger value) {
            this.addtype1 = value;
        }

        /**
         * Obtém o valor da propriedade addtype2.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getADDTYPE2() {
            return addtype2;
        }

        /**
         * Define o valor da propriedade addtype2.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setADDTYPE2(BigInteger value) {
            this.addtype2 = value;
        }

        /**
         * Obtém o valor da propriedade opertypeid.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOPERTYPEID() {
            return opertypeid;
        }

        /**
         * Define o valor da propriedade opertypeid.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOPERTYPEID(BigInteger value) {
            this.opertypeid = value;
        }

        /**
         * Obtém o valor da propriedade previd.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPREVID() {
            return previd;
        }

        /**
         * Define o valor da propriedade previd.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPREVID(Long value) {
            this.previd = value;
        }

        /**
         * Obtém o valor da propriedade nextid.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getNEXTID() {
            return nextid;
        }

        /**
         * Define o valor da propriedade nextid.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setNEXTID(Long value) {
            this.nextid = value;
        }

        /**
         * Obtém o valor da propriedade updatedate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUPDATEDATE() {
            return updatedate;
        }

        /**
         * Define o valor da propriedade updatedate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUPDATEDATE(XMLGregorianCalendar value) {
            this.updatedate = value;
        }

        /**
         * Obtém o valor da propriedade startdate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTARTDATE() {
            return startdate;
        }

        /**
         * Define o valor da propriedade startdate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTARTDATE(XMLGregorianCalendar value) {
            this.startdate = value;
        }

        /**
         * Obtém o valor da propriedade enddate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getENDDATE() {
            return enddate;
        }

        /**
         * Define o valor da propriedade enddate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setENDDATE(XMLGregorianCalendar value) {
            this.enddate = value;
        }

        /**
         * Obtém o valor da propriedade isactual.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getISACTUAL() {
            return isactual;
        }

        /**
         * Define o valor da propriedade isactual.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setISACTUAL(BigInteger value) {
            this.isactual = value;
        }

        /**
         * Obtém o valor da propriedade isactive.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getISACTIVE() {
            return isactive;
        }

        /**
         * Define o valor da propriedade isactive.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setISACTIVE(BigInteger value) {
            this.isactive = value;
        }

    }

}
