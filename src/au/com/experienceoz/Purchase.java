/**
 * Purchase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz;

public class Purchase  implements java.io.Serializable {
    private au.com.experienceoz.CustomerDetails customerDetails;

    private java.math.BigDecimal soldPrice;

    private java.math.BigDecimal soldPriceTax;

    private au.com.experienceoz.PurchaseStatus status;

    private au.com.experienceoz.Voucher[] vouchers;

    private au.com.experienceoz.Data[] metaData;

    private long id;  // attribute

    public Purchase() {
    }

    public Purchase(
           au.com.experienceoz.CustomerDetails customerDetails,
           java.math.BigDecimal soldPrice,
           java.math.BigDecimal soldPriceTax,
           au.com.experienceoz.PurchaseStatus status,
           au.com.experienceoz.Voucher[] vouchers,
           au.com.experienceoz.Data[] metaData,
           long id) {
           this.customerDetails = customerDetails;
           this.soldPrice = soldPrice;
           this.soldPriceTax = soldPriceTax;
           this.status = status;
           this.vouchers = vouchers;
           this.metaData = metaData;
           this.id = id;
    }


    /**
     * Gets the customerDetails value for this Purchase.
     * 
     * @return customerDetails
     */
    public au.com.experienceoz.CustomerDetails getCustomerDetails() {
        return customerDetails;
    }


    /**
     * Sets the customerDetails value for this Purchase.
     * 
     * @param customerDetails
     */
    public void setCustomerDetails(au.com.experienceoz.CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }


    /**
     * Gets the soldPrice value for this Purchase.
     * 
     * @return soldPrice
     */
    public java.math.BigDecimal getSoldPrice() {
        return soldPrice;
    }


    /**
     * Sets the soldPrice value for this Purchase.
     * 
     * @param soldPrice
     */
    public void setSoldPrice(java.math.BigDecimal soldPrice) {
        this.soldPrice = soldPrice;
    }


    /**
     * Gets the soldPriceTax value for this Purchase.
     * 
     * @return soldPriceTax
     */
    public java.math.BigDecimal getSoldPriceTax() {
        return soldPriceTax;
    }


    /**
     * Sets the soldPriceTax value for this Purchase.
     * 
     * @param soldPriceTax
     */
    public void setSoldPriceTax(java.math.BigDecimal soldPriceTax) {
        this.soldPriceTax = soldPriceTax;
    }


    /**
     * Gets the status value for this Purchase.
     * 
     * @return status
     */
    public au.com.experienceoz.PurchaseStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Purchase.
     * 
     * @param status
     */
    public void setStatus(au.com.experienceoz.PurchaseStatus status) {
        this.status = status;
    }


    /**
     * Gets the vouchers value for this Purchase.
     * 
     * @return vouchers
     */
    public au.com.experienceoz.Voucher[] getVouchers() {
        return vouchers;
    }


    /**
     * Sets the vouchers value for this Purchase.
     * 
     * @param vouchers
     */
    public void setVouchers(au.com.experienceoz.Voucher[] vouchers) {
        this.vouchers = vouchers;
    }


    /**
     * Gets the metaData value for this Purchase.
     * 
     * @return metaData
     */
    public au.com.experienceoz.Data[] getMetaData() {
        return metaData;
    }


    /**
     * Sets the metaData value for this Purchase.
     * 
     * @param metaData
     */
    public void setMetaData(au.com.experienceoz.Data[] metaData) {
        this.metaData = metaData;
    }


    /**
     * Gets the id value for this Purchase.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Purchase.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Purchase)) return false;
        Purchase other = (Purchase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerDetails==null && other.getCustomerDetails()==null) || 
             (this.customerDetails!=null &&
              this.customerDetails.equals(other.getCustomerDetails()))) &&
            ((this.soldPrice==null && other.getSoldPrice()==null) || 
             (this.soldPrice!=null &&
              this.soldPrice.equals(other.getSoldPrice()))) &&
            ((this.soldPriceTax==null && other.getSoldPriceTax()==null) || 
             (this.soldPriceTax!=null &&
              this.soldPriceTax.equals(other.getSoldPriceTax()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.vouchers==null && other.getVouchers()==null) || 
             (this.vouchers!=null &&
              java.util.Arrays.equals(this.vouchers, other.getVouchers()))) &&
            ((this.metaData==null && other.getMetaData()==null) || 
             (this.metaData!=null &&
              java.util.Arrays.equals(this.metaData, other.getMetaData()))) &&
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
        if (getCustomerDetails() != null) {
            _hashCode += getCustomerDetails().hashCode();
        }
        if (getSoldPrice() != null) {
            _hashCode += getSoldPrice().hashCode();
        }
        if (getSoldPriceTax() != null) {
            _hashCode += getSoldPriceTax().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVouchers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVouchers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVouchers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetaData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetaData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetaData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Purchase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "Purchase"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "CustomerDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SoldPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldPriceTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SoldPriceTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "purchaseStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vouchers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Vouchers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "Voucher"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Voucher"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MetaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "Data"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Data"));
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
