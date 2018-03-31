/**
 * 
 */
package zl;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author gz
 *
 */
public interface BlockDao {

	@Select("select * from block order by DisplayOrder")
	public List<Block> GetAll();
	
	@Select("select * from block where ExternalSystemCode=#{externalSystemCode}")
	public Block GetByExternalSystemCode(String externalSystemCode);
	
	@Select("select * from block where Title=#{title}")
	public Block GetByTitle(String title);
	
	@Insert("insert into block(Title) values(#{Title})")
	@Options(useGeneratedKeys = true, keyProperty = "id")  
	public int Insert(Block block);
	
}
