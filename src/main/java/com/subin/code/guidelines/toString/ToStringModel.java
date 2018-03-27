package com.subin.code.guidelines.toString;

/**
 * TODO description:
 *
 * @author shaoping (zhangsubin)
 * @since 27/03/2018 5:23 PM
 */
public class ToStringModel {
    private String name;

    private Integer age;

    private Double height;

    private java.util.Date birthday;

    private boolean isGradeate;

    public ToStringModel(String name, Integer age, Double height, java.util.Date birthday, boolean isGradeate) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.birthday = birthday;
        this.isGradeate = isGradeate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public java.util.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    public boolean getIsGradeate() {
        return isGradeate;
    }

    public void setIsGradeate(boolean isGradeate) {
        this.isGradeate = isGradeate;
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(this);
    }
}
