/**
 * OrderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz;

public class OrderItem  implements java.io.Serializable {
    private long productId;

    private java.util.Date bookingDate;

    private java.lang.String bookingNotes;

    private au.com.experienceoz.OrderItemOption[] itemOptions;

    public OrderItem() {
    }

    public OrderItem(
           long productId,
           java.util.Date bookingDate,
           java.lang.String bookingNotes,
           au.com.experienceoz.OrderItemOption[] itemOptions) {
           this.productId = productId;
           this.bookingDate = bookingDate;
           this.bookingNotes = bookingNotes;
           this.itemOptions = itemOptions;
    }


    /**
     * Gets the productId value for this OrderItem.
     * 
     * @return productId
     */
    public long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this OrderItem.
     * 
     * @param productId
     */
    public void setProductId(long productId) {
        this.productId = productId;
    }


    /**
     * Gets the bookingDate value for this OrderItem.
     * 
     * @return bookingDate
     */
    public java.util.Date getBookingDate() {
        return bookingDate;
    }


    /**
     * Sets the bookingDate value for this OrderItem.
     * 
     * @param bookingDate
     */
    public void setBookingDate(java.util.Date bookingDate) {
        this.bookingDate = bookingDate;
    }


    /**
     * Gets the bookingNotes value for this OrderItem.
     * 
     * @return bookingNotes
     */
    public java.lang.String getBookingNotes() {
        return bookingNotes;
    }


    /**
     * Sets the bookingNotes value for this OrderItem.
     * 
     * @param bookingNotes
     */
    public void setBookingNotes(java.lang.String bookingNotes) {
        this.bookingNotes = bookingNotes;
    }


    /**
     * Gets the itemOptions value for this OrderItem.
     * 
     * @return itemOptions
     */
    public au.com.experienceoz.OrderItemOption[] getItemOptions() {
        return itemOptions;
    }


    /**
     * Sets the itemOptions value for this OrderItem.
     * 
     * @param itemOptions
     */
    public void setItemOptions(au.com.experienceoz.OrderItemOption[] itemOptions) {
        this.itemOptions = itemOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderItem)) return false;
        OrderItem other = (OrderItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.productId == other.getProductId() &&
            ((this.bookingDate==null && other.getBookingDate()==null) || 
             (this.bookingDate!=null &&
              this.bookingDate.equals(other.getBookingDate()))) &&
            ((this.bookingNotes==null && other.getBookingNotes()==null) || 
             (this.bookingNotes!=null &&
              this.bookingNotes.equals(other.getBookingNotes()))) &&
            ((this.itemOptions==null && other.getItemOptions()==null) || 
             (this.itemOptions!=null &&
              java.util.Arrays.equals(this.itemOptions, other.getItemOptions())));
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
        _hashCode += new Long(getProductId()).hashCode();
        if (getBookingDate() != null) {
            _hashCode += getBookingDate().hashCode();
        }
        if (getBookingNotes() != null) {
            _hashCode += getBookingNotes().hashCode();
        }
        if (getItemOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "OrderItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("itemOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "OrderItemOption"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ItemOption"));
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
