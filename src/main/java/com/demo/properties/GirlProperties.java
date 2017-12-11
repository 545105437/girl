package com.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wal
 * @date 2017/12/8
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String cupSize;
    private Integer age;
    private String value;
    private Integer number;
    private Long bignumber;
    private Integer test1;
    private Integer test2;


    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }
}
