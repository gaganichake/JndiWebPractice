package gagan.jndi.web.service;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JndiTestService {

	public String getValue(String jdniName) throws NamingException{
		
		InitialContext ctx = new InitialContext();
		Context envCtx = (Context) ctx.lookup("java:comp/env");
		String jndiValue = (String) envCtx.lookup(jdniName);
		
		return jndiValue;
	}
}
