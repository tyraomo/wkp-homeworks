package HW05_task1;

public class Profile {

	private ShippingInfo shippingInfo;
	
	public Profile(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
	
	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}
	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
	
	public void missingShippingInfo() throws MissingShippingInfoException {
		if(shippingInfo == null) {
			throw new MissingShippingInfoException("shippinginfo is missing.");
		}
	}
}
