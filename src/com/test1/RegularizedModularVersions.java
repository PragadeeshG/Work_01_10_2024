package com.test1;

public class RegularizedModularVersions {
	private Integer moduleIdentifier;
	private String modularVersionCode;
	private boolean modularVersionHeader;
	private Integer modularVersionConfigId;
	private String totalCount;
	private String headerSummary;
	private Integer jsonAsFormat;
	private Integer xmlAsFormat;
	private String resultSummary;
	private Integer dataCount;
	private String footerAvailable;
	private String defaultSort;
	private String defaultSearch;

	public RegularizedModularVersions() {

	}

	public RegularizedModularVersions(Integer moduleIdentifier, String modularVersionCode, boolean modularVersionHeader,
			Integer modularVersionConfigId, String totalCount, String headerSummary, Integer jsonAsFormat,
			Integer xmlAsFormat, String resultSummary, Integer dataCount, String footerAvailable, String defaultSort,
			String defaultSearch) {
		super();
		this.moduleIdentifier = moduleIdentifier;
		this.modularVersionCode = modularVersionCode;
		this.modularVersionHeader = modularVersionHeader;
		this.modularVersionConfigId = modularVersionConfigId;
		this.totalCount = totalCount;
		this.headerSummary = headerSummary;
		this.jsonAsFormat = jsonAsFormat;
		this.xmlAsFormat = xmlAsFormat;
		this.resultSummary = resultSummary;
		this.dataCount = dataCount;
		this.footerAvailable = footerAvailable;
		this.defaultSort = defaultSort;
		this.defaultSearch = defaultSearch;
	}

	public Integer getModuleIdentifier() {
		return moduleIdentifier;
	}

	public void setModuleIdentifier(Integer moduleIdentifier) {
		this.moduleIdentifier = moduleIdentifier;
	}

	public String getModularVersionCode() {
		return modularVersionCode;
	}

	public void setModularVersionCode(String modularVersionCode) {
		this.modularVersionCode = modularVersionCode;
	}

	public boolean isModularVersionHeader() {
		return modularVersionHeader;
	}

	public void setModularVersionHeader(boolean modularVersionHeader) {
		this.modularVersionHeader = modularVersionHeader;
	}

	public Integer getModularVersionConfigId() {
		return modularVersionConfigId;
	}

	public void setModularVersionConfigId(Integer modularVersionConfigId) {
		this.modularVersionConfigId = modularVersionConfigId;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getHeaderSummary() {
		return headerSummary;
	}

	public void setHeaderSummary(String headerSummary) {
		this.headerSummary = headerSummary;
	}

	public Integer getJsonAsFormat() {
		return jsonAsFormat;
	}

	public void setJsonAsFormat(Integer jsonAsFormat) {
		this.jsonAsFormat = jsonAsFormat;
	}

	public Integer getXmlAsFormat() {
		return xmlAsFormat;
	}

	public void setXmlAsFormat(Integer xmlAsFormat) {
		this.xmlAsFormat = xmlAsFormat;
	}

	public String getResultSummary() {
		return resultSummary;
	}

	public void setResultSummary(String resultSummary) {
		this.resultSummary = resultSummary;
	}

	public Integer getDataCount() {
		return dataCount;
	}

	public void setDataCount(Integer dataCount) {
		this.dataCount = dataCount;
	}

	public String getFooterAvailable() {
		return footerAvailable;
	}

	public void setFooterAvailable(String footerAvailable) {
		this.footerAvailable = footerAvailable;
	}

	public String getDefaultSort() {
		return defaultSort;
	}

	public void setDefaultSort(String defaultSort) {
		this.defaultSort = defaultSort;
	}

	public String getDefaultSearch() {
		return defaultSearch;
	}

	public void setDefaultSearch(String defaultSearch) {
		this.defaultSearch = defaultSearch;
	}

}
