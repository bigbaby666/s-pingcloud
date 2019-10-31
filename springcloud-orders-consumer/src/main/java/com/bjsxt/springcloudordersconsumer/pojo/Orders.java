package com.bjsxt.springcloudordersconsumer.pojo;

import java.io.Serializable;

public class Orders implements Serializable {

    private Integer id;
    private String remark;
    private Double total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", remark='" + remark + '\'' +
                ", total=" + total +
                '}';
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
