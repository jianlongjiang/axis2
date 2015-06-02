/**
 * APIEndpointServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz.api;

public class APIEndpointServiceSoapBindingStub extends org.apache.axis.client.Stub implements au.com.experienceoz.ExperienceOZAPI {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AvailabilityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://experienceoz.com.au/", "AvailabilityRequest"), au.com.experienceoz.AvailabilityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "Availabilities"));
        oper.setReturnClass(au.com.experienceoz.Availability[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Availabilities"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "Availability"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://experienceoz.com.au/", "API"),
                      "au.com.experienceoz.API",
                      new javax.xml.namespace.QName("http://experienceoz.com.au/", "API"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MakePurchase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PurchaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://experienceoz.com.au/", "PurchaseRequest"), au.com.experienceoz.PurchaseRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "Purchase"));
        oper.setReturnClass(au.com.experienceoz.Purchase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Purchase"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://experienceoz.com.au/", "API"),
                      "au.com.experienceoz.API",
                      new javax.xml.namespace.QName("http://experienceoz.com.au/", "API"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Receipt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReceiptPurchaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://experienceoz.com.au/", "ReceiptPurchaseRequest"), au.com.experienceoz.ReceiptPurchaseRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://experienceoz.com.au/", "ReceiptPurchaseResponse"));
        oper.setReturnClass(au.com.experienceoz.ReceiptPurchaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ReceiptPurchaseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://experienceoz.com.au/", "API"),
                      "au.com.experienceoz.API",
                      new javax.xml.namespace.QName("http://experienceoz.com.au/", "API"), 
                      true
                     ));
        _operations[2] = oper;

    }

    public APIEndpointServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public APIEndpointServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public APIEndpointServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", ">Availability>ProductOptionGroups");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.ProductOptionGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "ProductOptionGroup");
            qName2 = new javax.xml.namespace.QName("", "ProductOptionGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", ">ProductOptionGroup>ProductOptions");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.ProductOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "ProductOption");
            qName2 = new javax.xml.namespace.QName("", "ProductOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", ">Purchase>MetaData");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Data[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Data");
            qName2 = new javax.xml.namespace.QName("", "Data");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", ">Purchase>Vouchers");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Voucher[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Voucher");
            qName2 = new javax.xml.namespace.QName("", "Voucher");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", ">PurchaseRequest>MetaData");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Data[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Data");
            qName2 = new javax.xml.namespace.QName("", "Data");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", ">Voucher>MetaData");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Data[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Data");
            qName2 = new javax.xml.namespace.QName("", "Data");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", ">Voucher>VoucherOptions");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.VoucherOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "VoucherOption");
            qName2 = new javax.xml.namespace.QName("", "VoucherOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "API");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.API.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Availabilities");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Availability[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Availability");
            qName2 = new javax.xml.namespace.QName("", "Availability");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Availability");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Availability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "AvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.AvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "CustomerDetails");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.CustomerDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Data");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "ItemOptions");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.OrderItemOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "OrderItemOption");
            qName2 = new javax.xml.namespace.QName("", "ItemOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Items");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.OrderItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "OrderItem");
            qName2 = new javax.xml.namespace.QName("", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "OrderItem");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.OrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "OrderItemOption");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.OrderItemOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Product");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "ProductOption");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.ProductOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "ProductOptionGroup");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.ProductOptionGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Purchase");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Purchase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "PurchaseRequest");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.PurchaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "purchaseStatus");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.PurchaseStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "ReceiptPurchaseRequest");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.ReceiptPurchaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "ReceiptPurchaseResponse");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.ReceiptPurchaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "Voucher");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.Voucher.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "VoucherOption");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.VoucherOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://experienceoz.com.au/", "voucherStatus");
            cachedSerQNames.add(qName);
            cls = au.com.experienceoz.VoucherStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public au.com.experienceoz.Availability[] getAvailability(au.com.experienceoz.AvailabilityRequest availabilityRequest) throws java.rmi.RemoteException, au.com.experienceoz.API {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://experienceoz.com.au/", "GetAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {availabilityRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (au.com.experienceoz.Availability[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (au.com.experienceoz.Availability[]) org.apache.axis.utils.JavaUtils.convert(_resp, au.com.experienceoz.Availability[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof au.com.experienceoz.API) {
              throw (au.com.experienceoz.API) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public au.com.experienceoz.Purchase makePurchase(au.com.experienceoz.PurchaseRequest purchaseRequest) throws java.rmi.RemoteException, au.com.experienceoz.API {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://experienceoz.com.au/", "MakePurchase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {purchaseRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (au.com.experienceoz.Purchase) _resp;
            } catch (java.lang.Exception _exception) {
                return (au.com.experienceoz.Purchase) org.apache.axis.utils.JavaUtils.convert(_resp, au.com.experienceoz.Purchase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof au.com.experienceoz.API) {
              throw (au.com.experienceoz.API) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public au.com.experienceoz.ReceiptPurchaseResponse receipt(au.com.experienceoz.ReceiptPurchaseRequest receiptPurchaseRequest) throws java.rmi.RemoteException, au.com.experienceoz.API {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://experienceoz.com.au/", "Receipt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiptPurchaseRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (au.com.experienceoz.ReceiptPurchaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (au.com.experienceoz.ReceiptPurchaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, au.com.experienceoz.ReceiptPurchaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof au.com.experienceoz.API) {
              throw (au.com.experienceoz.API) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
