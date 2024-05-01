package com.asternus.testspring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class TextContext {

    private String guid;

    private String id;

    private String cat;

    public String test;

    public TextContext(String cat, String guid, String id) {
        this.cat = cat;
        this.guid = guid;
        this.id = id;
    }

    public TextContext() {
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "TextContext{" +
               "cat='" + cat + '\'' +
               ", guid='" + guid + '\'' +
               ", id='" + id + '\'' +
               ", test='" + test + '\'' +
               '}';
    }
}
