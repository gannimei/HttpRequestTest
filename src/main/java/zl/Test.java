/**
 * 
 */
package zl;

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
		
		OptionEditModel[] optionArray = new OptionEditModel[6];
		for(int i = 0; i < 6; i++) {
			optionArray[i] = new OptionEditModel();
			optionArray[i].setCategorySystemCode("Cat0" + i);
			optionArray[i].setOptionSystemCode("Opt0" + i);
			
		}
		PriceEditModel model = new PriceEditModel();
		model.setCustomerID("izdigital");
		model.setPriceArray(optionArray);
		//JSONObject json = (JSONObject)JSONObject.toJSON(model);
		//System.out.println(JSONObject.toJSONString(model));
		System.out.println(HttpConnectionUtil.RequestMethod(HttpConnectionUtil.METHOD_POST, "http://www.tcprogrammer.com/L5_Configurator/api/test", JSONObject.toJSONString(model), HttpConnectionUtil.CONTENT_TYPE__JSON));
	}

}
