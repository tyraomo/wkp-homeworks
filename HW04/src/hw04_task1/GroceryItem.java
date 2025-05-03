package hw04_task1;

public abstract class GroceryItem extends Article {
	 protected boolean isPopular;
	
	 
	 //super() - Pflicht weil Vererbung
	public GroceryItem(int discountThreshold, int householdLimit) {
		super(discountThreshold, householdLimit);
	}
}
