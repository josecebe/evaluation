package org.sakaiproject.evaluation.model;

// Generated Mar 20, 2007 10:08:13 AM by Hibernate Tools 3.2.0.beta6a

import java.util.Date;

/**
 * EvalTemplateItem generated by hbm2java
 */
public class EvalTemplateItem implements java.io.Serializable {

	// Fields    

	private Long id;
	
	private String eid;

	private Date lastModified;

	private String owner;

	private EvalTemplate template;

	private EvalItem item;

	private Integer displayOrder;

	private String itemCategory;

	private String hierarchyLevel;

	private String hierarchyNodeId;

	private Integer displayRows;

	private String scaleDisplaySetting;

	private Boolean usesNA;

	private Boolean blockParent;

	private Long blockId;
    
   private String resultsSharing;

	// Constructors


    /** default constructor */
	public EvalTemplateItem() {
	}

	/** minimal constructor */
	public EvalTemplateItem(Date lastModified, String owner, EvalTemplate template, EvalItem item, Integer displayOrder, String itemCategory,
			String hierarchyLevel, String hierarchyNodeId) {
		this.lastModified = lastModified;
		this.owner = owner;
		this.template = template;
		this.item = item;
		this.displayOrder = displayOrder;
		this.itemCategory = itemCategory;
		this.hierarchyLevel = hierarchyLevel;
		this.hierarchyNodeId = hierarchyNodeId;
	}

	/** full constructor */
	public EvalTemplateItem(Date lastModified, String owner, EvalTemplate template, EvalItem item, Integer displayOrder, String itemCategory,
			String hierarchyLevel, String hierarchyNodeId, Integer displayRows, String scaleDisplaySetting, Boolean usesNA, 
            Boolean blockParent, Long blockId, String resultsSharing) {
		this.lastModified = lastModified;
		this.owner = owner;
		this.template = template;
		this.item = item;
		this.displayOrder = displayOrder;
		this.itemCategory = itemCategory;
		this.hierarchyLevel = hierarchyLevel;
		this.hierarchyNodeId = hierarchyNodeId;
		this.displayRows = displayRows;
		this.scaleDisplaySetting = scaleDisplaySetting;
		this.usesNA = usesNA;
		this.blockParent = blockParent;
		this.blockId = blockId;
        this.resultsSharing = resultsSharing;
	}

	// Property accessors
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public EvalTemplate getTemplate() {
		return this.template;
	}

	public void setTemplate(EvalTemplate template) {
		this.template = template;
	}

	public EvalItem getItem() {
		return this.item;
	}

	public void setItem(EvalItem item) {
		this.item = item;
	}

	public Integer getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getItemCategory() {
		return this.itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getHierarchyLevel() {
		return this.hierarchyLevel;
	}

	public void setHierarchyLevel(String hierarchyLevel) {
		this.hierarchyLevel = hierarchyLevel;
	}

	public String getHierarchyNodeId() {
		return this.hierarchyNodeId;
	}

	public void setHierarchyNodeId(String hierarchyNodeId) {
		this.hierarchyNodeId = hierarchyNodeId;
	}

	public Integer getDisplayRows() {
		return this.displayRows;
	}

	public void setDisplayRows(Integer displayRows) {
		this.displayRows = displayRows;
	}

	public String getScaleDisplaySetting() {
		return this.scaleDisplaySetting;
	}

	public void setScaleDisplaySetting(String scaleDisplaySetting) {
		this.scaleDisplaySetting = scaleDisplaySetting;
	}

	public Boolean getUsesNA() {
		return this.usesNA;
	}

	public void setUsesNA(Boolean usesNA) {
		this.usesNA = usesNA;
	}

	public Boolean getBlockParent() {
		return this.blockParent;
	}

	public void setBlockParent(Boolean blockParent) {
		this.blockParent = blockParent;
	}

	public Long getBlockId() {
		return this.blockId;
	}

	public void setBlockId(Long blockId) {
		this.blockId = blockId;
	}

    public String getResultsSharing() {
        return resultsSharing;
    }

    public void setResultsSharing(String resultsSharing) {
        this.resultsSharing = resultsSharing;
    }

}