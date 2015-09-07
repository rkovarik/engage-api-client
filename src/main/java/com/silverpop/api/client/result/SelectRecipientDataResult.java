package com.silverpop.api.client.result;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.command.elements.Column;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("RESULT")
public class SelectRecipientDataResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    private boolean successElement;

    @XStreamAlias("Email")
    private String email;

    @XStreamAlias("RecipientId")
    private Long recipientId;

    @XStreamAlias("EmailType")
    private Integer emailType;

    @XStreamAlias("LastModified")
    private String lastModifiedDateAsString;

    @XStreamAlias("CreatedFrom")
    private Integer createdFrom;

    @XStreamAlias("OptedIn")
    private String optedInDateAsString;

    @XStreamAlias("OptedOut")
    private String optedOutDateAsString;

    @XStreamAlias("COLUMNS")
    private List<Column> columns;

    public SelectRecipientDataResult() {
        columns = new ArrayList<Column>();
    }

    public boolean isSuccessElement() {
        return successElement;
    }

    public String getEmail() {
        return email;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public Integer getEmailType() {
        return emailType;
    }

    public String getLastModifiedDateAsString() {
        return lastModifiedDateAsString;
    }

    public Integer getCreatedFrom() {
        return createdFrom;
    }

    public String getOptedInDateAsString() {
        return optedInDateAsString;
    }

    public String getOptedOutDateAsString() {
        return optedOutDateAsString;
    }

	public List<Column> getColumns() {
		return columns;
	}

}
