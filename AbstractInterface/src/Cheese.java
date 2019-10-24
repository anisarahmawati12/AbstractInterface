
public class Cheese extends Pizza {

	private String CheeseType;
	
	public String getCheeseType() {
		return CheeseType;
	}

	public void setCheeseType(String cheeseType) {
		CheeseType = cheeseType;
	}

	public Cheese(String topping, String ukuran, String cheeseType) {
		super(topping, ukuran);
		CheeseType = cheeseType;
	}

	public Cheese(String topping, String ukuran) {
		super(topping, ukuran);

	}

	
}
