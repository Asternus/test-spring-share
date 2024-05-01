package com.asternus.testspring;


public class ParamBean {

    public String name;

    public String user;

    public String cat;

    public String spli;

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpli() {
        return spli;
    }

    public void setSpli(String spli) {
        this.spli = spli;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ParamBean(String user, String spli, String name, String cat) {
        this.user = user;
        this.spli = spli;
        this.name = name;
        this.cat = cat;
    }

    public ParamBean() {
    }
}
