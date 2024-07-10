package com.powernode.javase.oop01;

public class StudentTest01 {
    public static void main(String[] args) {
       Student s1 = new Student();
       Student s2 = new Student("劉可");
       System.out.println("s1: " + s1.getName());
       System.out.println("s2: " + s2.getName());
    }
}
