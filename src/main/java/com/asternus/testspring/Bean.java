package com.asternus.testspring;

import java.time.LocalDateTime;
import java.util.Date;

public class Bean {

    String string;

    String cat;

    Integer a;

    Boolean is;

    Boolean[] isS;

    Date date;

    private LocalDateTime local;

    public LocalDateTime getLocal() {
        return local;
    }

    public void setLocal(LocalDateTime local) {
        this.local = local;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getA() {
        return a;
    }

    public String getCat() {
        return cat;
    }

    public Boolean getIs() {
        return is;
    }

    public Boolean[] getIsS() {
        return isS;
    }

    public String getString() {
        return string;
    }
}
