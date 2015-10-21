package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.SelectionValues;
import com.silverpop.api.client.result.GetListsResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("AddListColumn")
public class AddListColumnCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    private Integer listId;

    @XStreamAlias("COLUMN_TYPE")
    private Integer columnType;

    @XStreamAlias("COLUMN_NAME")
    private String columnName;

    @XStreamAlias("DEFAULT")
    private String defaultValue;

    @XStreamAlias("SELECTION_VALUES")
    private SelectionValues selectionValues;

    @Override
    public Class<? extends ApiResult> getResultType() {
        return GetListsResult.class;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getColumnType() {
        return columnType;
    }

    /**
     * 0 – Text column
     * 1 – YES/No column
     * 2 – Numeric column
     * 3 – Date column
     * 4 – Time column
     * 5 – Country column
     * 6 – Select one
     * 8 – Segmenting
     * 15 – SMS Phone Number 16 – Phone Number
     * 17 – Timestamp
     * 20 – Multi-Select
     */
    public void setColumnType(Integer columnType) {
        this.columnType = columnType;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public SelectionValues getSelectionValues() {
        return selectionValues;
    }

    public void setSelectionValues(SelectionValues selectionValues) {
        this.selectionValues = selectionValues;
    }
}
