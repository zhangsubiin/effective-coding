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



## Intellij IDEA get set模板设置

因为 Intellij IDEA 对 boolean 类型 get set 的处理，如果 boolean 类型字段名是 is 开头的，生成的 get set 方法会自动去掉 is，这个在很多时候对我们造成了困扰，在 Intellij IDEA 的 get set 窗口可以自定义模板：

get 模板：

```
#if($field.modifierStatic)
static ##
#end
$field.type ##
#set($name = $StringUtil.capitalizeWithJavaBeanConvention($field.name))
get##
${name}() {
return $field.name;
}
```

set 模板：

```
#set($paramName = $field.name)
#if($field.modifierStatic)
static ##
#end
void set$StringUtil.capitalizeWithJavaBeanConvention($field.name)($field.type $paramName) {
#if ($field.name == $paramName)
    #if (!$field.modifierStatic)
    this.##
    #else
        $classname.##
    #end
#end
$field.name = $paramName;
}
```




