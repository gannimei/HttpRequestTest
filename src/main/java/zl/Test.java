/**
 * 
 */
package zl;

import java.util.LinkedList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**
 * @author gz
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject json = new JSONObject();
		List<String> list = new LinkedList<String>();
		for(int i = 0; i < 6; i++) {
			list.add("Cat0" + i);
		}
		json.put("OptionArray", list);
		json.put("app_name", "全民大讨论");
		json.put("app_ip", "10.21.243.234");
		json.put("app_port", 8080);
		json.put("app_type", "001");
		json.put("app_area", "asd");
		System.out.println(json.toString());
	}

}
