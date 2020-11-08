package guru.springframework;

public class Money {

	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	protected String currency() {
		return currency;
	}
	
	public Money times(int multiplier) {
		return new Money(this.amount * multiplier, this.currency);
	};
	
	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return amount == money.amount && this.getClass().equals(obj.getClass());
	}
}
