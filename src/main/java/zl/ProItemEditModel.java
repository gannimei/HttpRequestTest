/**
 * 
 */
package zl;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author gz
 *
 */
public class ProItemEditModel {

	@JSONField(name = "Prodclass")
	private String prodClass;
	
	@JSONField(name = "Itemdec")
	private String itemDec;
	
	@JSONField(name = "Itemcode")
	private String itemCode;
	
	@JSONField(name = "Vstop")
	private String vstop;
	
	@JSONField(name = "MultiSelect")
	private String multiSelect;
	
	@JSONField(name = "Required")
	private String required;
	
	@JSONField(name = "Itemtype")
	private String itemtype;
	
	@JSONField(name = "Proditemdec")
	private String prodItemDec;
	
	@JSONField(name = "Proditemcode")
	private String prodItemCode;
	
	@JSONField(name = "Default")
	private String isDefault;
	
	@JSONField(name = "Vitemstop")
	private String vitemStop;

	public String getProdClass() {
		return prodClass;
	}

	public void setProdClass(String prodClass) {
		this.prodClass = prodClass;
	}

	public String getItemDec() {
		return itemDec;
	}

	public void setItemDec(String itemDec) {
		this.itemDec = itemDec;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getVstop() {
		return vstop;
	}

	public void setVstop(String vstop) {
		this.vstop = vstop;
	}

	public String getMultiSelect() {
		return multiSelect;
	}

	public void setMultiSelect(String multiSelect) {
		this.multiSelect = multiSelect;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public String getItemtype() {
		return itemtype;
	}

	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}

	public String getProdItemDec() {
		return prodItemDec;
	}

	public void setProdItemDec(String prodItemDec) {
		this.prodItemDec = prodItemDec;
	}

	public String getProdItemCode() {
		return prodItemCode;
	}

	public void setProdItemCode(String prodItemCode) {
		this.prodItemCode = prodItemCode;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getVitemStop() {
		return vitemStop;
	}

	public void setVitemStop(String vitemStop) {
		this.vitemStop = vitemStop;
	}
	
}
