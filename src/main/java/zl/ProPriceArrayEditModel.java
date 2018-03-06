package zl;

import com.alibaba.fastjson.annotation.JSONField;

public class ProPriceArrayEditModel {
	
	private String Itemcode;
	
	private String Proditemcode;

	@JSONField(name = "Itemcode")
	public String getItemcode() {
		return Itemcode;
	}

	public void setItemcode(String itemcode) {
		Itemcode = itemcode;
	}

	@JSONField(name = "Proditemcode")
	public String getProditemcode() {
		return Proditemcode;
	}

	public void setProditemcode(String proditemcode) {
		Proditemcode = proditemcode;
	}
}
