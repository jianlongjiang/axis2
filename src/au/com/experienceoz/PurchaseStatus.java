/**
 * PurchaseStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz;

public class PurchaseStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PurchaseStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CREATED = "CREATED";
    public static final java.lang.String _PROCESSING = "PROCESSING";
    public static final java.lang.String _PROCESSED = "PROCESSED";
    public static final java.lang.String _READY_FOR_PAYMENT = "READY_FOR_PAYMENT";
    public static final java.lang.String _PAYING = "PAYING";
    public static final java.lang.String _PAYMENT_FAILED = "PAYMENT_FAILED";
    public static final java.lang.String _FINALISED = "FINALISED";
    public static final java.lang.String _CANCELLED = "CANCELLED";
    public static final java.lang.String _ERROR = "ERROR";
    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _PREPARING = "PREPARING";
    public static final java.lang.String _PREPARED = "PREPARED";
    public static final java.lang.String _FINALISING = "FINALISING";
    public static final PurchaseStatus CREATED = new PurchaseStatus(_CREATED);
    public static final PurchaseStatus PROCESSING = new PurchaseStatus(_PROCESSING);
    public static final PurchaseStatus PROCESSED = new PurchaseStatus(_PROCESSED);
    public static final PurchaseStatus READY_FOR_PAYMENT = new PurchaseStatus(_READY_FOR_PAYMENT);
    public static final PurchaseStatus PAYING = new PurchaseStatus(_PAYING);
    public static final PurchaseStatus PAYMENT_FAILED = new PurchaseStatus(_PAYMENT_FAILED);
    public static final PurchaseStatus FINALISED = new PurchaseStatus(_FINALISED);
    public static final PurchaseStatus CANCELLED = new PurchaseStatus(_CANCELLED);
    public static final PurchaseStatus ERROR = new PurchaseStatus(_ERROR);
    public static final PurchaseStatus PENDING = new PurchaseStatus(_PENDING);
    public static final PurchaseStatus PREPARING = new PurchaseStatus(_PREPARING);
    public static final PurchaseStatus PREPARED = new PurchaseStatus(_PREPARED);
    public static final PurchaseStatus FINALISING = new PurchaseStatus(_FINALISING);
    public java.lang.String getValue() { return _value_;}
    public static PurchaseStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PurchaseStatus enumeration = (PurchaseStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PurchaseStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "purchaseStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
