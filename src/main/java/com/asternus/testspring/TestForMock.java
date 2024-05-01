package com.asternus.testspring;

import org.springframework.stereotype.Service;

@Service
public class TestForMock {

    public String id;

    public String es;

    private TestForMock(String es, String id) {
        this.es = es;
        this.id = id;
    }

    public TestForMock() {
    }

    public TestForMock getResult() {
        return new TestForMock();
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
