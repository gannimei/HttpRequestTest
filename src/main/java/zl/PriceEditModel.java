/**
 * 
 */
package zl;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author gz
 *
 */
public class PriceEditModel {
	
	private String CustomerID;
	private OptionEditModel[] PriceArray;

	@JSONField(name = "CustomCode")
	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	@JSONField(name = "PriceArray")
	public OptionEditModel[] getPriceArray() {
		return PriceArray;
	}

	public void setPriceArray(OptionEditModel[] priceArray) {
		PriceArray = priceArray;
	}
}
