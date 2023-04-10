package Learning.OOP.Interface;

public class Bank {
	private RBI rbi;
	Bank(RBI rbi){
		this.rbi = rbi;
	}
public void BankingPolicy() {
	rbi.policy();
	rbi.RBIPolicy();
}

	

	}

