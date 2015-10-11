package com.silverpop.api.client.command;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.Column;
import com.silverpop.api.client.result.OnlySuccessElementResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XmlApiProperties("AddContactToContactList")
public class AddContactToContactListCommand implements ApiCommand {

    @XStreamAlias("CONTACT_LIST_ID")
    private String contactListId;

    @XStreamAlias("CONTACT_ID")
    private String contactId;

    @XStreamImplicit(itemFieldName = "COLUMN")
    private List<Column> columns = new ArrayList<Column>();

    public String getContactListId() {
        return contactListId;
    }

    public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }

    public String getContactId() {
        return contactId;
    }


    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    @Override
    public Class<OnlySuccessElementResult> getResultType() {
        return OnlySuccessElementResult.class;
    }


}
