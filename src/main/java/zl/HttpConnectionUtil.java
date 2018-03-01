/**
 * 
 */
package zl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;

/**
 * @author gz
 *
 */
public class HttpConnectionUtil {
	// post请求
	public static final String METHOD_POST = "POST";

	// get请求
	public static final String METHOD_GET = "GET";

	// utf-8字符编码
	public static final String CHARSET_UTF_8 = "utf-8";

	// 请求超时时间,默认50s
	public static final int requestTimeout = 5000000;

	// 连接超时时间,默认10s
	public static final int timeout = 1000000;

	public static String RequestMethod(String method, String urlStr, String args) {
		// 是否有http正文提交
		boolean isDoInput = false;
		if (method.toUpperCase().equals(METHOD_POST) && args != null && !args.isEmpty()) {
			isDoInput = true;
		}
		if (method.toUpperCase().equals(METHOD_GET)) {
			urlStr += ("?" + args);
		}
		OutputStream outputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader reader = null;
		StringBuffer resultBuffer = new StringBuffer();
		String tempLine = null;
		try {
			// 统一资源
			URL url = new URL(urlStr);
			// 连接类的父类，抽象类
			URLConnection urlConnection = url.openConnection();
			// http的连接类
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

			// 设置是否向httpUrlConnection输出，因为这个是post请求，参数要放在
			// http正文内，因此需要设为true, 默认情况下是false;
			if (isDoInput) {
				httpURLConnection.setDoOutput(true);
				httpURLConnection.setRequestProperty("Content-Length", String.valueOf(args.length()));
			}
			// 设置是否从httpUrlConnection读入，默认情况下是true;
			httpURLConnection.setDoInput(true);
			// 设置一个指定的超时值（以毫秒为单位）
			httpURLConnection.setConnectTimeout(requestTimeout);
			// 将读超时设置为指定的超时，以毫秒为单位。
			httpURLConnection.setReadTimeout(timeout);
			// Post 请求不能使用缓存
			httpURLConnection.setUseCaches(false);
			// 设置字符编码
			httpURLConnection.setRequestProperty("Accept-Charset", CHARSET_UTF_8);
			// 设置内容类型
			httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			// 设定请求的方法，默认是GET
			httpURLConnection.setRequestMethod(method);
			// 打开到此 URL 引用的资源的通信链接（如果尚未建立这样的连接）。
			// 如果在已打开连接（此时 connected 字段的值为 true）的情况下调用 connect 方法，则忽略该调用。
			httpURLConnection.connect();
			if (isDoInput) {
				outputStream = httpURLConnection.getOutputStream();
				outputStreamWriter = new OutputStreamWriter(outputStream);
				outputStreamWriter.write(args);
				outputStreamWriter.flush();// 刷新
			}
			if (httpURLConnection.getResponseCode() >= 300) {
				throw new Exception(
						"HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
			}
			if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				inputStream = httpURLConnection.getInputStream();
				inputStreamReader = new InputStreamReader(inputStream);
				reader = new BufferedReader(inputStreamReader);
				while ((tempLine = reader.readLine()) != null) {
					resultBuffer.append(tempLine);
					resultBuffer.append("\n");
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// 关闭流
			try {
				if (outputStreamWriter != null) {
					outputStreamWriter.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (outputStream != null) {
					outputStream.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (inputStreamReader != null) {
					inputStreamReader.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultBuffer.toString();
	}

	/**
	 * 将map集合的键值对转化成：key1=value1&key2=value2 的形式
	 * 
	 * @param parameterMap
	 * @return
	 */
	public static String ConvertStringParamter(Map<String, ?> parameterMap) {
		StringBuffer parameterBuffer = new StringBuffer();
		if (parameterMap != null) {
			Iterator<String> iterator = parameterMap.keySet().iterator();
			String key = null;
			String value = null;
			while (iterator.hasNext()) {
				key = (String) iterator.next();
				if (parameterMap.get(key) != null) {
					value = (String) parameterMap.get(key);
				} else {
					value = "";
				}
				parameterBuffer.append(key).append("=").append(value);
				if (iterator.hasNext()) {
					parameterBuffer.append("&");
				}
			}
		}
		return parameterBuffer.toString();
	}
}
