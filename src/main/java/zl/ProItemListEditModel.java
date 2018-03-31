/**
 * 
 */
package zl;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author gz
 *
 */
public class ProItemListEditModel {

	@JSONField(name = "ConfigArray")
	private List<ProItemEditModel> proItemList;

	public List<ProItemEditModel> getProItemList() {
		return proItemList;
	}

	public void setProItemList(List<ProItemEditModel> proItemList) {
		this.proItemList = proItemList;
	}
	
}
