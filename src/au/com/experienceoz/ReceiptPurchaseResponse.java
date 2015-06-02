/**
 * ReceiptPurchaseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz;

public class ReceiptPurchaseResponse  implements java.io.Serializable {
    private java.lang.String ticketPDFLink;

    private java.lang.String invoicePDFLink;

    private java.lang.String statusCode;

    private long id;  // attribute

    public ReceiptPurchaseResponse() {
    }

    public ReceiptPurchaseResponse(
           java.lang.String ticketPDFLink,
           java.lang.String invoicePDFLink,
           java.lang.String statusCode,
           long id) {
           this.ticketPDFLink = ticketPDFLink;
           this.invoicePDFLink = invoicePDFLink;
           this.statusCode = statusCode;
           this.id = id;
    }


    /**
     * Gets the ticketPDFLink value for this ReceiptPurchaseResponse.
     * 
     * @return ticketPDFLink
     */
    public java.lang.String getTicketPDFLink() {
        return ticketPDFLink;
    }


    /**
     * Sets the ticketPDFLink value for this ReceiptPurchaseResponse.
     * 
     * @param ticketPDFLink
     */
    public void setTicketPDFLink(java.lang.String ticketPDFLink) {
        this.ticketPDFLink = ticketPDFLink;
    }


    /**
     * Gets the invoicePDFLink value for this ReceiptPurchaseResponse.
     * 
     * @return invoicePDFLink
     */
    public java.lang.String getInvoicePDFLink() {
        return invoicePDFLink;
    }


    /**
     * Sets the invoicePDFLink value for this ReceiptPurchaseResponse.
     * 
     * @param invoicePDFLink
     */
    public void setInvoicePDFLink(java.lang.String invoicePDFLink) {
        this.invoicePDFLink = invoicePDFLink;
    }


    /**
     * Gets the statusCode value for this ReceiptPurchaseResponse.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ReceiptPurchaseResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the id value for this ReceiptPurchaseResponse.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this ReceiptPurchaseResponse.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiptPurchaseResponse)) return false;
        ReceiptPurchaseResponse other = (ReceiptPurchaseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ticketPDFLink==null && other.getTicketPDFLink()==null) || 
             (this.ticketPDFLink!=null &&
              this.ticketPDFLink.equals(other.getTicketPDFLink()))) &&
            ((this.invoicePDFLink==null && other.getInvoicePDFLink()==null) || 
             (this.invoicePDFLink!=null &&
              this.invoicePDFLink.equals(other.getInvoicePDFLink()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            this.id == other.getId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTicketPDFLink() != null) {
            _hashCode += getTicketPDFLink().hashCode();
        }
        if (getInvoicePDFLink() != null) {
            _hashCode += getInvoicePDFLink().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiptPurchaseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "ReceiptPurchaseResponse"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketPDFLink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketPDFLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicePDFLink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InvoicePDFLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
