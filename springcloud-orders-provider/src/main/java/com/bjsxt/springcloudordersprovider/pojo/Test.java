package com.bjsxt.springcloudordersprovider.pojo;

public class Test {

    private String test;
    private String ball;

    @Override
    public String toString() {
        return "Test{" +
                "test='" + test + '\'' +
                ", ball='" + ball + '\'' +
                '}';
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getBall() {
        return ball;
    }

    public void setBall(String ball) {
        this.ball = ball;
    }
}
