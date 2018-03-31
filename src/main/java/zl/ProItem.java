/**
 * 
 */
package zl;

/**
 * @author gz
 *
 */
public class ProItem {

	private String prodClass;

	private String itemDec;

	private String itemCode;

	private boolean vstop;

	private boolean multiSelect;

	private boolean required;

	private String itemtype;

	private String prodItemDec;

	private String prodItemCode;

	private boolean isDefault;

	private boolean vitemStop;

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

	public boolean isVstop() {
		return vstop;
	}

	public void setVstop(boolean vstop) {
		this.vstop = vstop;
	}

	public boolean isMultiSelect() {
		return multiSelect;
	}

	public void setMultiSelect(boolean multiSelect) {
		this.multiSelect = multiSelect;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
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

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public boolean isVitemStop() {
		return vitemStop;
	}

	public void setVitemStop(boolean vitemStop) {
		this.vitemStop = vitemStop;
	}

	public Block AsBlock() {
		Block block = new Block();
		block.setTitle(prodClass);
		return block;
	}
	
	public ProItemEditModel AsEditModel() {
		ProItemEditModel model = new ProItemEditModel();
		model.setProdClass(prodClass);
		model.setItemDec(itemDec);
		model.setItemCode(itemCode);
		model.setVstop(vstop ? "0" : "1");
		model.setMultiSelect(multiSelect ? "1" : "0");
		model.setRequired(required ? "1" : "0");
		model.setItemtype(itemtype);
		model.setProdItemCode(prodItemCode);
		model.setProdItemDec(prodItemDec);
		model.setIsDefault(isDefault ? "1" : "0");
		model.setVitemStop(vitemStop ? "0" : "1");
		return model;
	}

}
