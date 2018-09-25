package com.infinium.rasheen.rainbowopapi.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "all_ops")
public class OperatorList {

    private int id;
    private String name;
    private String type;
    private String potrait_url;
    private String op_icon;
    private String atk_def_icon;

    public OperatorList() {
    }


    public OperatorList(int id, String name, String type, String potrait_url, String op_icon, String atk_def_icon) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.potrait_url = potrait_url;
        this.op_icon = op_icon;
        this.atk_def_icon = atk_def_icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPotrait_url() {
        return potrait_url;
    }

    public void setPotrait_url(String potrait_url) {
        this.potrait_url = potrait_url;
    }

    public String getOp_icon() {
        return op_icon;
    }

    public void setOp_icon(String op_icon) {
        this.op_icon = op_icon;
    }

    public String getAtk_def_icon() {
        return atk_def_icon;
    }

    public void setAtk_def_icon(String atk_def_icon) {
        this.atk_def_icon = atk_def_icon;
    }
}
