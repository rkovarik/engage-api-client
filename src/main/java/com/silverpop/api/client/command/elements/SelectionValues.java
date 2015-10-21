package com.silverpop.api.client.command.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 */
@XStreamAlias("SELECTION_VALUES")
public class SelectionValues {

    @XStreamImplicit(itemFieldName = "VALUE")
    public List<String> values = new ArrayList<String>();

    public SelectionValues() {
    }

    public SelectionValues(List<String> values) {
        this.values = values;
    }

    public String get(int index) {
        return values.get(index);
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public void addValue(String value) {
        this.values.add(value);
    }
}