package hw04_task1;

public abstract class Article {
 
	protected int discountThreshold;
	protected int  householdLimit;
	
	public Article(int discountThreshold, int  householdLimit) {
		
		this.discountThreshold = discountThreshold;
		this.householdLimit =  householdLimit;
	}
	
	public abstract int getBulkDiscount();
	
	public abstract boolean  showWarning();
		
}
