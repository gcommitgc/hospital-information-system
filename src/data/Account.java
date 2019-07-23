package data;

import java.util.HashMap;
import java.util.Map;

public class Account {

	private HashMap<String,String> accountAndPassword=(HashMap<String,String>)ReadUtil.read("c:/documents/account.txt");
	private HashMap<String,String> accountAndUser=(HashMap<String,String>)ReadUtil.read("c:/documents/user.txt");
	private static Account account;
	private Account() {}
	public static synchronized Account getInstance() {
		if(account==null) {
			account=new Account();
		}
		return account;
	}
	public Account(HashMap<String, String> accountAndPassword, HashMap<String, String> accountAndUser) {
		super();
		this.accountAndPassword = accountAndPassword;
		this.accountAndUser = accountAndUser;
	}
	public HashMap<String, String> getAccountAndPassword() {
		return accountAndPassword;
	}
	public void setAccountAndPassword(HashMap<String, String> accountAndPassword) {
		this.accountAndPassword = accountAndPassword;
	}
	public HashMap<String, String> getAccountAndUser() {
		return accountAndUser;
	}
	public void setAccountAndUser(HashMap<String, String> accountAndUser) {
		this.accountAndUser = accountAndUser;
	}
	
}
