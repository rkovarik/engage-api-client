package com.silverpop.api.client.command;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.Column;
import com.silverpop.api.client.result.RecipientResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XmlApiProperties("DoubleOptInRecipient")
public class DoubleOptInRecipientCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    private Integer listId;

    @XStreamAlias("SEND_AUTOREPLY")
    private Boolean sendAutoreply;

    @XStreamAlias("ALLOW_HTML")
    private Boolean allowHtml;

    @XStreamImplicit(itemFieldName = "COLUMN")
    private List<Column> columns;


    public DoubleOptInRecipientCommand() {
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

    public Boolean getSendAutoreply() {
        return sendAutoreply;
    }

    public void setSendAutoreply(Boolean sendAutoreply) {
        this.sendAutoreply = sendAutoreply;
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

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public void addColumn(final Column column) {
        this.columns.add(column);
    }
}
