package axis.ws.testing;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
//import org.apache.ws.security.WSPasswordCallback;
public class ClientPasswordCallback implements CallbackHandler {
	private String userid;
	private String password;
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
//		ApplicationContext context= SpringUtil.getContext();
//		PluginConfig cfg = (PluginConfig) context.getBean("globalCfg");
		pc.setIdentifier(this.getUserid());
		pc.setPassword(this.getPassword());
	}
}
