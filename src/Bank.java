import java.util.Hashtable;


public class Bank {
	
	/*Money reduce(Expression source, String to) {
		Sum sum= (Sum) source;
		int amount= sum.augend.amount + sum.addend.amount;
		return new Money(amount, to);
	}*/
	/*Money reduce(Expression source, String to) {
		Sum sum= (Sum) source;
		return sum.reduce(to);
	}*/
	
/*	Money reduce(Expression source, String to) {
		if (source instanceof Money)
			return (Money) source.reduce(to);
		Sum sum= (Sum) source;
		return sum.reduce(to);
	}*/
	
	/*Money reduce(Expression source, String to) {
		return source.reduce(to);
	}*/
	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}
	/*int rate(String from, String to) {
		return (from.equals("CHF") && to.equals("USD"))
		? 2	: 1;
	}*/
	private Hashtable rates= new Hashtable();
	
	void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), new Integer(rate));
	}
	
	int rate(String from, String to) {
		if (from.equals(to)) return 1;
		Integer rate= (Integer) rates.get(new Pair(from, to));
		return rate.intValue();
	}
	
	private class Pair {
		private String from;
		private String to;
		Pair(String from, String to) {
			this.from= from;
			this.to= to;
		}
		
		public boolean equals(Object object) {
			Pair pair= (Pair) object;
			return from.equals(pair.from) && to.equals(pair.to);
		}
		public int hashCode() {
			return 0;
		}
	}
}
