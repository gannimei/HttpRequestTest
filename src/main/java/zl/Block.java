/**
 * 
 */
package zl;

/**
 * @author gz
 *
 */
public class Block {
	
	// ����Id
	private int ID;

	// �ɼ�����
	private String Title;

	// ����
	private String DisplayOrder;

	// Ĭ����ʾ
	private boolean IsDefault;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDisplayOrder() {
		return DisplayOrder;
	}

	public void setDisplayOrder(String displayOrder) {
		DisplayOrder = displayOrder;
	}

	public boolean isIsDefault() {
		return IsDefault;
	}

	public void setIsDefault(boolean isDefault) {
		IsDefault = isDefault;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Block block = (Block)o;
		return Title.equals(block.getTitle());
	}
	
	@Override
	public int hashCode() {
		return Title.hashCode();
	}
	
}
