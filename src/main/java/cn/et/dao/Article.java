package cn.et.dao;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class Article implements java.io.Serializable {

	// Fields

	private Integer AId;
	private String ATitle;
	private String AContent;

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** full constructor */
	public Article(String ATitle, String AContent) {
		this.ATitle = ATitle;
		this.AContent = AContent;
	}

	// Property accessors

	public Integer getAId() {
		return this.AId;
	}

	public void setAId(Integer AId) {
		this.AId = AId;
	}

	public String getATitle() {
		return this.ATitle;
	}

	public void setATitle(String ATitle) {
		this.ATitle = ATitle;
	}

	public String getAContent() {
		return this.AContent;
	}

	public void setAContent(String AContent) {
		this.AContent = AContent;
	}

}