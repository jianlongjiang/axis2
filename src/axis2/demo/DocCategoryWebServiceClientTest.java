package axis2.demo;

import java.rmi.RemoteException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.soap.impl.dom.SOAPHeaderBlockImpl;
import org.apache.axiom.soap.impl.dom.soap11.SOAP11Factory;
import org.apache.axiom.soap.impl.dom.soap11.SOAP11HeaderBlockImpl;
import org.apache.axis2.client.ServiceClient;

public class DocCategoryWebServiceClientTest {

	    /**
	     * @param args
	     * @throws RemoteException
	     */
	    public static void main(String[] args) throws RemoteException {
	        // TODO Auto-generated method stub
	        DocCategoryWebServiceImpServiceStub stub = new DocCategoryWebServiceImpServiceStub(
	                "http://my.service.net:8080/test/services/DocCategoryWebService");
	        String username = "admin";
	        String password = "1";
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

	        DocCategoryWebServiceImpServiceStub.FindCategoryByParentId request = new DocCategoryWebServiceImpServiceStub.FindCategoryByParentId();
	        DocCategoryWebServiceImpServiceStub.FindCategoryByParentIdE requestE = new DocCategoryWebServiceImpServiceStub.FindCategoryByParentIdE();
	        request.setArg0("2");
	        requestE.setFindCategoryByParentId(request);
	        DocCategoryWebServiceImpServiceStub.FindCategoryByParentIdResponseE response = stub
	                .findCategoryByParentId(requestE);
	        ListObject listObject = response.getFindCategoryByParentIdResponse()
	                .get_return();
	        if (listObject != null && listObject.getList() != null) {
	            for (int i = 0; i < listObject.getList().length; i++) {
	                Object ob = listObject.getList()[i];
	                DocCategory cat = (DocCategory) ob;
	                System.out.println(cat.getFdName());
	            }
	        }
	    }
}
