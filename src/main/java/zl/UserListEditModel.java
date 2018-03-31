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
public class UserListEditModel {
	
	private List<UserEditModel> userList;

	@JSONField(name = "Array")
	public List<UserEditModel> getUserList() {
		return userList;
	}

	public void setUserList(List<UserEditModel> userList) {
		this.userList = userList;
	}
	
}
