package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetListsResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("GetLists")
public class GetListsCommand implements ApiCommand {

	@XStreamAlias("VISIBILITY")
	private Integer visibility = 1;   // Defaults to public

	@XStreamAlias("LIST_TYPE")
	private Integer listType = 0;    // Defaults to Regular lists

	@Override
	public Class<? extends ApiResult> getResultType() {
		return GetListsResult.class;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Integer getListType() {
		return listType;
	}

    /**
     * @param listType
     * 0 – Databases
     * 1 – Queries
     * 2 – Databases, Contact Lists and Queries 5 – Test Lists
     * 6 – Seed Lists
     * 13 – Suppression Lists
     * 15 – Relational Tables
     * 18 – Contact Lists
     */
	public void setListType(Integer listType) {
		this.listType = listType;
	}
}
