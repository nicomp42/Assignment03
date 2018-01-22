package nicholdw_Assignment03;

/**
 * Models a phone on the shelf at Best Buy
 * @author nicomp
 *
 */
public class Phone {
	private String model;
	private String SKU;

	/**
	 * Create a phone object
	 * @param model Model of the phone
	 * @throws Exception
	 */
	public Phone(String model, String SKU) throws Exception {
		setModel(model);
		setSKU(SKU);
	}
	
	/**
	 * Get model of phone
	 * @return model of phone
	 */
	public String getModel() {
		return model;
	}
	/**
	 * Set model of phone
	 * @param model
	 * @throws Exception if model is zero length
	 */
	public void setModel(String model) throws Exception {
		if (model.trim().length() != 0) {
			this.model = model;
		} else {
			throw new Exception("Phone.setModel(): model cannot be zero length");
		}
	}
	/**
	 * @return a string representation of the object
	 */
	public String toString() {
		return "model = " + getModel() + ", SKU = " + getSKU();
	}

	/**
	 * @return The SKU
	 */
	public String getSKU() {
		return SKU;
	}
	/**
	 * Set the SKU
	 * @param SKU non-blank SKU
	 * @throws Exception if SKU is zero length
	 */
	public void setSKU(String SKU) throws Exception {
		if (SKU.trim().length() != 0) {
			this.SKU = SKU;
		} else {
			throw new Exception("Phone.setSKU(): SKU cannot be zero length");
		}
	}
}
