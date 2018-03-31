/**
 * 
 */
package zl;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;

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
		String resource = "conf.xml";
		InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		sessionFactory.getConfiguration().addMapper(BlockDao.class);  
		sessionFactory.getConfiguration().addMapper(ProItemDao.class);  
		SqlSession sqlSession = sessionFactory.openSession(true);
		try {
			ProItemDao dao = sqlSession.getMapper(ProItemDao.class);
			List<ProItem> list = dao.GetAll();
			ProItemListEditModel model = new ProItemListEditModel();
			model.setProItemList(list.stream().map(l -> l.AsEditModel()).collect(Collectors.toList()));
			System.out.println(JSON.toJSONString(model));
			String result = HttpConnectionUtil.RequestMethod(HttpConnectionUtil.METHOD_POST, "http://localhost:8080/L5_Configurator/api/itemListProcess", JSON.toJSONString(model), HttpConnectionUtil.CONTENT_TYPE__JSON);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
