/**
 * 
 */
package zl;

import java.util.List;

import org.apache.ibatis.annotations.Select;

/**
 * @author gz
 *
 */
public interface ProItemDao {

	@Select("SELECT block.Title AS prodClass,category.Title AS itemDec,category.ExternalSystemCode AS itemCode,category.IsAvailable AS vstop,category.IsMultiselect AS multiSelect,category.IsMandatory AS required,`option`.Title AS itemtype,`option`.Description AS prodItemDec,`option`.ExternalSystemCode AS prodItemCode,`option`.IsAvailable AS vitemStop, `option`.IsDefault AS isDefault FROM block,category,`option` WHERE category.ParentID=block.ID AND `option`.ParentID=category.ID")
	public List<ProItem> GetAll();

}
