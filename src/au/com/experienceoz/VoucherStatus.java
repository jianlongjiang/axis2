/**
 * VoucherStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz;

public class VoucherStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VoucherStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CREATED = "CREATED";
    public static final java.lang.String _PROCESSING = "PROCESSING";
    public static final java.lang.String _PROCESSED = "PROCESSED";
    public static final java.lang.String _FINALISING = "FINALISING";
    public static final java.lang.String _FINALISED = "FINALISED";
    public static final java.lang.String _CANCELLING = "CANCELLING";
    public static final java.lang.String _CANCELLED = "CANCELLED";
    public static final java.lang.String _ERROR = "ERROR";
    public static final java.lang.String _PREPARING = "PREPARING";
    public static final java.lang.String _PREPARED = "PREPARED";
    public static final java.lang.String _PENDING = "PENDING";
    public static final VoucherStatus CREATED = new VoucherStatus(_CREATED);
    public static final VoucherStatus PROCESSING = new VoucherStatus(_PROCESSING);
    public static final VoucherStatus PROCESSED = new VoucherStatus(_PROCESSED);
    public static final VoucherStatus FINALISING = new VoucherStatus(_FINALISING);
    public static final VoucherStatus FINALISED = new VoucherStatus(_FINALISED);
    public static final VoucherStatus CANCELLING = new VoucherStatus(_CANCELLING);
    public static final VoucherStatus CANCELLED = new VoucherStatus(_CANCELLED);
    public static final VoucherStatus ERROR = new VoucherStatus(_ERROR);
    public static final VoucherStatus PREPARING = new VoucherStatus(_PREPARING);
    public static final VoucherStatus PREPARED = new VoucherStatus(_PREPARED);
    public static final VoucherStatus PENDING = new VoucherStatus(_PENDING);
    public java.lang.String getValue() { return _value_;}
    public static VoucherStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VoucherStatus enumeration = (VoucherStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VoucherStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VoucherStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "voucherStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
