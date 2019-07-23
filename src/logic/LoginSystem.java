package logic;

import data.Account;

public class LoginSystem {

	private static LoginSystem loginSystem;
	private LoginSystem() {}
	public static synchronized LoginSystem getInstance() {
		if (loginSystem==null) {
			loginSystem=new LoginSystem();
		}
		return loginSystem;
	}
	Account accounts=Account.getInstance();
	public String logIn(String account,String password) {
		if((accounts.getAccountAndPassword().containsKey(account))&&(accounts.getAccountAndPassword().get(account).equals(password))) {
			return accounts.getAccountAndUser().get(account);
		}
		else {
			return "wrong";
		}
	}
}
