package hw04_task1;

public abstract class PopularGrocery extends GroceryItem{

	protected int popularityLevel;
	protected int quantity;	
	
	public PopularGrocery(int popularityLevel) {
		super(0, 0);
		isPopular = true;
		this.popularityLevel = popularityLevel;
	}
	
	@Override
	public abstract boolean showWarning();
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
