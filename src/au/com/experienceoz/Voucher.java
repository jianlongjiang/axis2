/**
 * Voucher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz;

public class Voucher  implements java.io.Serializable {
    private au.com.experienceoz.Product product;

    private java.util.Date bookingDate;

    private java.lang.String bookingNotes;

    private java.math.BigDecimal soldPrice;

    private java.math.BigDecimal soldPriceTax;

    private java.math.BigDecimal resellerShare;

    private java.math.BigDecimal resellerShareTax;

    private au.com.experienceoz.VoucherOption[] voucherOptions;

    private au.com.experienceoz.Data[] metaData;

    private au.com.experienceoz.VoucherStatus status;

    private long id;  // attribute

    public Voucher() {
    }

    public Voucher(
           au.com.experienceoz.Product product,
           java.util.Date bookingDate,
           java.lang.String bookingNotes,
           java.math.BigDecimal soldPrice,
           java.math.BigDecimal soldPriceTax,
           java.math.BigDecimal resellerShare,
           java.math.BigDecimal resellerShareTax,
           au.com.experienceoz.VoucherOption[] voucherOptions,
           au.com.experienceoz.Data[] metaData,
           au.com.experienceoz.VoucherStatus status,
           long id) {
           this.product = product;
           this.bookingDate = bookingDate;
           this.bookingNotes = bookingNotes;
           this.soldPrice = soldPrice;
           this.soldPriceTax = soldPriceTax;
           this.resellerShare = resellerShare;
           this.resellerShareTax = resellerShareTax;
           this.voucherOptions = voucherOptions;
           this.metaData = metaData;
           this.status = status;
           this.id = id;
    }


    /**
     * Gets the product value for this Voucher.
     * 
     * @return product
     */
    public au.com.experienceoz.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this Voucher.
     * 
     * @param product
     */
    public void setProduct(au.com.experienceoz.Product product) {
        this.product = product;
    }


    /**
     * Gets the bookingDate value for this Voucher.
     * 
     * @return bookingDate
     */
    public java.util.Date getBookingDate() {
        return bookingDate;
    }


    /**
     * Sets the bookingDate value for this Voucher.
     * 
     * @param bookingDate
     */
    public void setBookingDate(java.util.Date bookingDate) {
        this.bookingDate = bookingDate;
    }


    /**
     * Gets the bookingNotes value for this Voucher.
     * 
     * @return bookingNotes
     */
    public java.lang.String getBookingNotes() {
        return bookingNotes;
    }


    /**
     * Sets the bookingNotes value for this Voucher.
     * 
     * @param bookingNotes
     */
    public void setBookingNotes(java.lang.String bookingNotes) {
        this.bookingNotes = bookingNotes;
    }


    /**
     * Gets the soldPrice value for this Voucher.
     * 
     * @return soldPrice
     */
    public java.math.BigDecimal getSoldPrice() {
        return soldPrice;
    }


    /**
     * Sets the soldPrice value for this Voucher.
     * 
     * @param soldPrice
     */
    public void setSoldPrice(java.math.BigDecimal soldPrice) {
        this.soldPrice = soldPrice;
    }


    /**
     * Gets the soldPriceTax value for this Voucher.
     * 
     * @return soldPriceTax
     */
    public java.math.BigDecimal getSoldPriceTax() {
        return soldPriceTax;
    }


    /**
     * Sets the soldPriceTax value for this Voucher.
     * 
     * @param soldPriceTax
     */
    public void setSoldPriceTax(java.math.BigDecimal soldPriceTax) {
        this.soldPriceTax = soldPriceTax;
    }


    /**
     * Gets the resellerShare value for this Voucher.
     * 
     * @return resellerShare
     */
    public java.math.BigDecimal getResellerShare() {
        return resellerShare;
    }


    /**
     * Sets the resellerShare value for this Voucher.
     * 
     * @param resellerShare
     */
    public void setResellerShare(java.math.BigDecimal resellerShare) {
        this.resellerShare = resellerShare;
    }


    /**
     * Gets the resellerShareTax value for this Voucher.
     * 
     * @return resellerShareTax
     */
    public java.math.BigDecimal getResellerShareTax() {
        return resellerShareTax;
    }


    /**
     * Sets the resellerShareTax value for this Voucher.
     * 
     * @param resellerShareTax
     */
    public void setResellerShareTax(java.math.BigDecimal resellerShareTax) {
        this.resellerShareTax = resellerShareTax;
    }


    /**
     * Gets the voucherOptions value for this Voucher.
     * 
     * @return voucherOptions
     */
    public au.com.experienceoz.VoucherOption[] getVoucherOptions() {
        return voucherOptions;
    }


    /**
     * Sets the voucherOptions value for this Voucher.
     * 
     * @param voucherOptions
     */
    public void setVoucherOptions(au.com.experienceoz.VoucherOption[] voucherOptions) {
        this.voucherOptions = voucherOptions;
    }


    /**
     * Gets the metaData value for this Voucher.
     * 
     * @return metaData
     */
    public au.com.experienceoz.Data[] getMetaData() {
        return metaData;
    }


    /**
     * Sets the metaData value for this Voucher.
     * 
     * @param metaData
     */
    public void setMetaData(au.com.experienceoz.Data[] metaData) {
        this.metaData = metaData;
    }


    /**
     * Gets the status value for this Voucher.
     * 
     * @return status
     */
    public au.com.experienceoz.VoucherStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Voucher.
     * 
     * @param status
     */
    public void setStatus(au.com.experienceoz.VoucherStatus status) {
        this.status = status;
    }


    /**
     * Gets the id value for this Voucher.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Voucher.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Voucher)) return false;
        Voucher other = (Voucher) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.bookingDate==null && other.getBookingDate()==null) || 
             (this.bookingDate!=null &&
              this.bookingDate.equals(other.getBookingDate()))) &&
            ((this.bookingNotes==null && other.getBookingNotes()==null) || 
             (this.bookingNotes!=null &&
              this.bookingNotes.equals(other.getBookingNotes()))) &&
            ((this.soldPrice==null && other.getSoldPrice()==null) || 
             (this.soldPrice!=null &&
              this.soldPrice.equals(other.getSoldPrice()))) &&
            ((this.soldPriceTax==null && other.getSoldPriceTax()==null) || 
             (this.soldPriceTax!=null &&
              this.soldPriceTax.equals(other.getSoldPriceTax()))) &&
            ((this.resellerShare==null && other.getResellerShare()==null) || 
             (this.resellerShare!=null &&
              this.resellerShare.equals(other.getResellerShare()))) &&
            ((this.resellerShareTax==null && other.getResellerShareTax()==null) || 
             (this.resellerShareTax!=null &&
              this.resellerShareTax.equals(other.getResellerShareTax()))) &&
            ((this.voucherOptions==null && other.getVoucherOptions()==null) || 
             (this.voucherOptions!=null &&
              java.util.Arrays.equals(this.voucherOptions, other.getVoucherOptions()))) &&
            ((this.metaData==null && other.getMetaData()==null) || 
             (this.metaData!=null &&
              java.util.Arrays.equals(this.metaData, other.getMetaData()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getBookingDate() != null) {
            _hashCode += getBookingDate().hashCode();
        }
        if (getBookingNotes() != null) {
            _hashCode += getBookingNotes().hashCode();
        }
        if (getSoldPrice() != null) {
            _hashCode += getSoldPrice().hashCode();
        }
        if (getSoldPriceTax() != null) {
            _hashCode += getSoldPriceTax().hashCode();
        }
        if (getResellerShare() != null) {
            _hashCode += getResellerShare().hashCode();
        }
        if (getResellerShareTax() != null) {
            _hashCode += getResellerShareTax().hashCode();
        }
        if (getVoucherOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoucherOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoucherOptions(), i);
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Voucher.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "Voucher"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "Product"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BookingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BookingNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("resellerShare");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResellerShare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resellerShareTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResellerShareTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VoucherOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "VoucherOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "VoucherOption"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MetaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "Data"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Data"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "voucherStatus"));
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
