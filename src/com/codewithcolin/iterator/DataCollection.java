package com.codewithcolin.iterator;

import java.util.ArrayList;
import java.util.List;

public class DataCollection {

    private List<String> dataList;
    private String[] dataArray;

    public DataCollection() {
        dataList = new ArrayList<String>();
        dataArray = new String[10];
    }

    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }

    public String[] getDataArray() {
        return dataArray;
    }

    public void setDataArray(String[] dataArray) {
        this.dataArray = dataArray;
    }



}
