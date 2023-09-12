package pruebaprotected.hr;

import pruebaprotected.accts.*;

public class HRAccount extends Account{
	public static void main(String[] args){
		Account simpleAcct = new Account();
		//simpleAcct.acctId = "112";

		HRAccount hrAcct = new HRAccount();
		//hrAcct.acctId = "111";

		System.out.println(simpleAcct.acctId);
	}
}