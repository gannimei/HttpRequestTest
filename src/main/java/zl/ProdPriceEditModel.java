package zl;

import com.alibaba.fastjson.annotation.JSONField;

public class ProdPriceEditModel {

	private String CustomerID;
	
	private ProPriceArrayEditModel[] PriceArray;

	@JSONField(name = "CustomCode")
	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	@JSONField(name = "PriceArray")
	public ProPriceArrayEditModel[] getPriceArray() {
		return PriceArray;
	}

	public void setPriceArray(ProPriceArrayEditModel[] priceArray) {
		PriceArray = priceArray;
	}
}
