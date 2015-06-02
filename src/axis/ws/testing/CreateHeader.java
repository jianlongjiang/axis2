package axis.ws.testing;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.client.ServiceClient;

public class CreateHeader {
	
	public void  create(){
		
		DocCategoryWebServiceImpServiceStub stub = new DocCategoryWebServiceImpServiceStub(
                "http://my.service.net:8080/test/services/DocCategoryWebService");
		
		
		String username = "admin";//服务器端分配的用户名
        String password = "1";//服务器端分配的密码
        ServiceClient client = stub._getServiceClient();
        SOAP11Factory factory = new SOAP11Factory();

        OMNamespace SecurityElementNamespace = factory
                .createOMNamespace(
                        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
                        "wsse");

        OMElement usernameTokenEl = factory.createOMElement("UsernameToken",
                SecurityElementNamespace);
        OMElement usernameEl = factory.createOMElement("Username",
                SecurityElementNamespace);
        OMElement passwordEl = factory.createOMElement("Password",
                SecurityElementNamespace);
        OMElement actionEl = factory.createOMElement("Action",
                SecurityElementNamespace);

        passwordEl
                .addAttribute(factory
                        .createOMAttribute(
                                "Type",
                                null,
                                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText"));

        usernameEl.setText(username);
        passwordEl.setText(password);
        usernameTokenEl.addChild(usernameEl);
        usernameTokenEl.addChild(passwordEl);
        usernameTokenEl.addChild(actionEl);
        SOAPHeaderBlockImpl block = new SOAP11HeaderBlockImpl("Security",
                SecurityElementNamespace, factory);
        block.addChild(usernameTokenEl);

        client.addHeader(block);
	}

}
