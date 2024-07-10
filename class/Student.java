package com.powernode.javase.oop01;

/*
* 学生类
* 1.在java中, 如果一个类没有显示的去定义构造方法, 系统会默认提供一个无参数的构造方法.
* 2.在java中, 一个类可以定义多个构造方法, 而且这些构造方法自动构成了方法的重载.
*/
public class Student {
    // 无参数的构造方法
    public Student() {
        System.out.println("Student类的无参数构造方法执行了");
    }

    // 有参数的构造方法
    public Student(String name) {
        this.name = name;
    }

    // 属性(实例变量): 状态.
    private String name;

    // 描述一個对象的行为动作时, 不加static, 没有static的方法叫实例方法.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
