package com.example.demo.domain.basic;


import java.util.List;

public class Table<T> {
    private Integer total;
    private List<T> data;
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public List<T> getData() {
        return data;
    }
    public void setData(List<T> data) {
        this.data = data;
    }
    public Table(Integer total, List<T> data) {
        super();
        this.total = total;
        this.data = data;
    }

}
