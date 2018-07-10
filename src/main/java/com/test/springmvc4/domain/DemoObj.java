package com.test.springmvc4.domain;

public class DemoObj {
    private long id;
    private String name;

    public DemoObj(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //jackson 对对象和json进行转化是一定要使用空构造
    public DemoObj() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
