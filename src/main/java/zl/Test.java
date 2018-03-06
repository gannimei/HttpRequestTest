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
		
		ProPriceArrayEditModel[] proPriceArray = new ProPriceArrayEditModel[6];
		for(int i = 0; i < 6; i++) {
			proPriceArray[i] = new ProPriceArrayEditModel();
			proPriceArray[i].setItemcode("Cat0" + i);
			proPriceArray[i].setProditemcode("Opt0" + i);
		}
		ProdPriceEditModel model = new ProdPriceEditModel();
		model.setCustomerID("izdigital");
		model.setPriceArray(proPriceArray);
		//JSONObject json = (JSONObject)JSONObject.toJSON(model);
		//System.out.println(JSONObject.toJSONString(model));
		System.out.println(HttpConnectionUtil.RequestMethod(HttpConnectionUtil.METHOD_POST, "http://localhost:8080/L5_Configurator/api/priceRequest", JSONObject.toJSONString(model), HttpConnectionUtil.CONTENT_TYPE__JSON));
	}

}
