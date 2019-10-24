
public abstract class Pizza  {
	private String topping;
	private String ukuran;
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getUkuran() {
		return ukuran;
	}
	public void setUkuran(String ukuran) {
		this.ukuran = ukuran;
	}
	public Pizza(String topping, String ukuran) {
		super();
		this.topping = topping;
		this.ukuran = ukuran;
	}
	

	

}
