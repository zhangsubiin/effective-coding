# code_guidelines
>  一些有用的开发规范



## toString 方法

```java
@Override
public String toString() {
    return ToStringBuilder.reflectionToString(this);
}
```

使用apache的ToStringBuilder 非常方便，这样在打印日志的时候就非常方便：

```
com.subin.code.guidelines.toString.ToStringModel@4617c264[name=Tom,age=20,height=185.0,birthday=Tue Mar 27 17:36:30 CST 2018,isGradeate=true]
```

IDEA可以配置一个模板自动生成该 toString() 方法，打开一个类，使用 Command + N 调出生成代码的窗口，输入 toString 回车，在打开的窗口中点击 “Settings” 按钮，选择 Templates 标签页，点击“+”号添加一个模板，名字取作 ToStringBuilder.reflectionToString，添加内容如下：

```
public java.lang.String toString() {
    return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(this);
}
```



