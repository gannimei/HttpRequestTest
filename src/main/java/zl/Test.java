/**
 * 
 */
package zl;

import java.util.HashMap;
import java.util.Map;

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
		
		ProPriceArrayEditModel[] proPriceArray = new ProPriceArrayEditModel[2];
		for(int i = 0; i < 2; i++) {
			proPriceArray[i] = new ProPriceArrayEditModel();
			proPriceArray[i].setItemcode("80" + (i+1));
			proPriceArray[i].setProditemcode("80" + (i+1) + "-0" + (i+1));
		}
		ProdPriceEditModel model = new ProdPriceEditModel();
		model.setCustomerID("HQL002");
		model.setPriceArray(proPriceArray);
		//JSONObject json = (JSONObject)JSONObject.toJSON(model);
		//System.out.println(JSONObject.toJSONString(model));
		Map<String, String> map = new HashMap<String, String>();
		map.put("CustomerID", "HQL001");
		map.put("OrderStatus", "0");
		System.out.println(JSONObject.toJSONString(model));
		System.out.println(HttpConnectionUtil.RequestMethod(HttpConnectionUtil.METHOD_POST, "http://www.tcprogrammer.com/L5_Configurator/api/priceRequest", JSONObject.toJSONString(model), HttpConnectionUtil.CONTENT_TYPE__JSON));
		//System.out.println(HttpConnectionUtil.RequestMethod(HttpConnectionUtil.METHOD_POST, "http://www.tcprogrammer.com/L5_Configurator/api/orderConfirm", JSONObject.toJSONString(map), HttpConnectionUtil.CONTENT_TYPE__JSON));
		//System.out.println(HttpConnectionUtil.RequestMethod(HttpConnectionUtil.METHOD_POST, "http://tdstest.hq.faw.cn:8000/TdsWebService/WSInterface/CusAndItemList.aspx", JSONObject.toJSONString(map), HttpConnectionUtil.CONTENT_TYPE__JSON));
	}

}
