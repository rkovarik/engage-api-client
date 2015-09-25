package com.silverpop.api.client.command;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.Column;
import com.silverpop.api.client.result.RecipientResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XmlApiProperties("AddRecipient")
public class AddRecipientCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    private Integer listId;

    @XStreamAlias("CREATED_FROM")
    private Integer createdFrom;

    @XStreamAlias("SEND_AUTOREPLY")
    private Boolean sendAutoreply;

    @XStreamAlias("UPDATE_IF_FOUND")
    private Boolean updateIfFound;

    @XStreamAlias("ALLOW_HTML")
    private Boolean allowHtml;

    @XStreamImplicit(itemFieldName="COLUMN")
    private List<Column> columns;

    @XStreamAlias("VISITOR_KEY")
    private String visitorKey;

    public AddRecipientCommand () {
        columns = new ArrayList<Column>();
    }

    @Override
    public Class<RecipientResult> getResultType() {
        return RecipientResult.class;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public Integer getCreatedFrom() {
        return createdFrom;
    }

    public void setCreatedFrom(Integer createdFrom) {
        this.createdFrom = createdFrom;
    }

    public Boolean getSendAutoreply() {
        return sendAutoreply;
    }

    public void setSendAutoreply(Boolean sendAutoreply) {
        this.sendAutoreply = sendAutoreply;
    }

    public Boolean getUpdateIfFound() {
        return updateIfFound;
    }

    public void setUpdateIfFound(Boolean updateIfFound) {
        this.updateIfFound = updateIfFound;
    }

    public Boolean getAllowHtml() {
        return allowHtml;
    }

    public void setAllowHtml(Boolean allowHtml) {
        this.allowHtml = allowHtml;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void addColumn(final Column column) {
        this.columns.add(column);
    }

    public String getVisitorKey() {
        return visitorKey;
    }

    public void setVisitorKey(String visitorKey) {
        this.visitorKey = visitorKey;
    }
}
