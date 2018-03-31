/**
 * 
 */
package zl;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author gz
 *
 */
public class UserEditModel {

	private String customcode;
	
	private String vstop;
	
	public UserEditModel(String customcode, String vstop) {
		this.customcode = customcode;
		this.vstop = vstop;
	}

	@JSONField(name = "Customcode")
	public String getCustomcode() {
		return customcode;
	}

	public void setCustomcode(String customcode) {
		this.customcode = customcode;
	}

	@JSONField(name = "Vstop")
	public String getVstop() {
		return vstop;
	}

	public void setVstop(String vstop) {
		this.vstop = vstop;
	}
	
}
