# Java-Books

### 1.java 底层是 C++
### 2.下载安装 JDK : 去 Oracle 官网下载
```
安装目录下有两个文件夹很重要。
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
