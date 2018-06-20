package com.test.spring4.ch3.fortest;

public class TestBean {
    private String Content;

    public TestBean(String content) {
        Content = content;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
