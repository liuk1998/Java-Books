# Java-Books

### 1.java 底层是 C++
### 2.下载安装 JDK : 去 Oracle 官网下载
```
安装目录下有两个文件夹很重要.
bin目录是存放jdk的命令的; lib目录是存放jdk的类库的.
bin目录下有两个命令很重要: 1. java.exe: 负责运行程序. 2.javac.exe: 负责编译程序.
需要保证这俩命令在cmd窗口中能够执行, 如果执行不了, 需要配置下环境变量, 将这俩命令的路径粘贴到电脑环境变量的path中.
```
### 3.在 cmd 中, 只要是命令执行不了, 一定会是系统环境变量配置的问题, 因为系统环境变量中 path 的作用就是给电脑指路的, 配置后电脑可在系统中查找 path 中配置的命令并执行.
### 4.对下列基础代码进行解释.
```
// 大括号当中是类体
public class HelloWorld {
  // 程序入口, 主方法. args 为主方法的参数.
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

  // System.out.println("Hello World!"); // 编译报错, 类体之中不能直接编写java语句
}
```
### 5.public class 与 class 的区别.
```
1.一个java源文件中可以定义多个class. 编译后, 每个class都会生成对应的class文件.
2.一个java源文件中只能有一个public class, 且类名与文件名必须一致.
```
### 6.java 的数据类型.
```
1.基本数据类型: 整数型(byte、short、int常用、long)、浮点型(float、double常用)、布尔型(boolean, 在java中只有true或false, 不存0或1)、字符型(char)
2.引用数据类型: 类(String、Object...)、接口、数组、枚举...
```
### 7.运算规则.
```
1.byte、short、char混合运算时, 各自先转换成 int 再做运算.
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println('a' + 1); // 先将char类型的'a'转化为int变成97, 再加1, 结果是98.
    char c = 'a' + 1;
    System.out.println(c); // 先算出相加的值为98, 然后将值赋给char类型的c, 因为是char类型, 所以会将98转化为'b', 最终结果为'b'.
  }
}
```
### 8.方法.
```
public class MethodsTest {
  // 入口
  public static void main(String[] args) {
    int sum = sunNum(1, 2)
  }

  public static int sumNum(int x, int y) {
     return x + y
  }
}
```
