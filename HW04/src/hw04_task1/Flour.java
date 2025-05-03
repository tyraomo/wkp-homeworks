package hw04_task1;

public class Flour  extends PopularGrocery{

	public Flour(int quantity, int discountThreshold, int popularityLevel) {
		super(popularityLevel);
		this.quantity = quantity;
		this.discountThreshold = discountThreshold;
		this.householdLimit = 15;

	}
	
	@Override
	public int getBulkDiscount() {
		if(quantity >= discountThreshold) {
			return 5;
		}else {
			return 0;
		}
	}
	
	@Override
	public boolean showWarning() {
		if(quantity > householdLimit) {
			return true;
		}else {
			return false;
		}
	}
	
}
