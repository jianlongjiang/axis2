/**
 * VoucherOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz;

public class VoucherOption  implements java.io.Serializable {
    private au.com.experienceoz.ProductOption productOption;

    private java.math.BigDecimal soldPrice;

    private java.math.BigDecimal soldPriceTax;

    private java.math.BigDecimal unitSoldPrice;

    private java.math.BigDecimal unitSoldPriceTax;

    private int quantity;

    public VoucherOption() {
    }

    public VoucherOption(
           au.com.experienceoz.ProductOption productOption,
           java.math.BigDecimal soldPrice,
           java.math.BigDecimal soldPriceTax,
           java.math.BigDecimal unitSoldPrice,
           java.math.BigDecimal unitSoldPriceTax,
           int quantity) {
           this.productOption = productOption;
           this.soldPrice = soldPrice;
           this.soldPriceTax = soldPriceTax;
           this.unitSoldPrice = unitSoldPrice;
           this.unitSoldPriceTax = unitSoldPriceTax;
           this.quantity = quantity;
    }


    /**
     * Gets the productOption value for this VoucherOption.
     * 
     * @return productOption
     */
    public au.com.experienceoz.ProductOption getProductOption() {
        return productOption;
    }


    /**
     * Sets the productOption value for this VoucherOption.
     * 
     * @param productOption
     */
    public void setProductOption(au.com.experienceoz.ProductOption productOption) {
        this.productOption = productOption;
    }


    /**
     * Gets the soldPrice value for this VoucherOption.
     * 
     * @return soldPrice
     */
    public java.math.BigDecimal getSoldPrice() {
        return soldPrice;
    }


    /**
     * Sets the soldPrice value for this VoucherOption.
     * 
     * @param soldPrice
     */
    public void setSoldPrice(java.math.BigDecimal soldPrice) {
        this.soldPrice = soldPrice;
    }


    /**
     * Gets the soldPriceTax value for this VoucherOption.
     * 
     * @return soldPriceTax
     */
    public java.math.BigDecimal getSoldPriceTax() {
        return soldPriceTax;
    }


    /**
     * Sets the soldPriceTax value for this VoucherOption.
     * 
     * @param soldPriceTax
     */
    public void setSoldPriceTax(java.math.BigDecimal soldPriceTax) {
        this.soldPriceTax = soldPriceTax;
    }


    /**
     * Gets the unitSoldPrice value for this VoucherOption.
     * 
     * @return unitSoldPrice
     */
    public java.math.BigDecimal getUnitSoldPrice() {
        return unitSoldPrice;
    }


    /**
     * Sets the unitSoldPrice value for this VoucherOption.
     * 
     * @param unitSoldPrice
     */
    public void setUnitSoldPrice(java.math.BigDecimal unitSoldPrice) {
        this.unitSoldPrice = unitSoldPrice;
    }


    /**
     * Gets the unitSoldPriceTax value for this VoucherOption.
     * 
     * @return unitSoldPriceTax
     */
    public java.math.BigDecimal getUnitSoldPriceTax() {
        return unitSoldPriceTax;
    }


    /**
     * Sets the unitSoldPriceTax value for this VoucherOption.
     * 
     * @param unitSoldPriceTax
     */
    public void setUnitSoldPriceTax(java.math.BigDecimal unitSoldPriceTax) {
        this.unitSoldPriceTax = unitSoldPriceTax;
    }


    /**
     * Gets the quantity value for this VoucherOption.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this VoucherOption.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherOption)) return false;
        VoucherOption other = (VoucherOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productOption==null && other.getProductOption()==null) || 
             (this.productOption!=null &&
              this.productOption.equals(other.getProductOption()))) &&
            ((this.soldPrice==null && other.getSoldPrice()==null) || 
             (this.soldPrice!=null &&
              this.soldPrice.equals(other.getSoldPrice()))) &&
            ((this.soldPriceTax==null && other.getSoldPriceTax()==null) || 
             (this.soldPriceTax!=null &&
              this.soldPriceTax.equals(other.getSoldPriceTax()))) &&
            ((this.unitSoldPrice==null && other.getUnitSoldPrice()==null) || 
             (this.unitSoldPrice!=null &&
              this.unitSoldPrice.equals(other.getUnitSoldPrice()))) &&
            ((this.unitSoldPriceTax==null && other.getUnitSoldPriceTax()==null) || 
             (this.unitSoldPriceTax!=null &&
              this.unitSoldPriceTax.equals(other.getUnitSoldPriceTax()))) &&
            this.quantity == other.getQuantity();
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
        if (getProductOption() != null) {
            _hashCode += getProductOption().hashCode();
        }
        if (getSoldPrice() != null) {
            _hashCode += getSoldPrice().hashCode();
        }
        if (getSoldPriceTax() != null) {
            _hashCode += getSoldPriceTax().hashCode();
        }
        if (getUnitSoldPrice() != null) {
            _hashCode += getUnitSoldPrice().hashCode();
        }
        if (getUnitSoldPriceTax() != null) {
            _hashCode += getUnitSoldPriceTax().hashCode();
        }
        _hashCode += getQuantity();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "VoucherOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "ProductOption"));
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
        elemField.setFieldName("unitSoldPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnitSoldPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitSoldPriceTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnitSoldPriceTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
