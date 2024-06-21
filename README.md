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
### 8.equals方法与 “==” 有何区别 ?
```
都可以用于比较两个对象, 区别在于: == 运算符用于比较两个对象的引用, 如果它们指向的是同一个对象, 则返回true. equals方法用于比较两个对象的内容是否相等, 当它们的内容相等时, 则返回true.
例: 判断用户名和密码正不正确
public class MethodsTest {
  // 入口
  public static void main(String[] args) {
    login();
  }
  // 登录
  public static void login() {
    // Java 提供的一个工具类, 可以通过 Scanner 类来获取用户的输入, 通过 next() 与 nextLine() 方法获取输入的字符串.
    java.util.Scanner = new java.util.Scanner(Syatem.in);
    String username = scanner.next();
    String password = scanner.next();
    boolean isOk = check(username, password);
    if (isOk) {
      System.out.println('登陆成功');
    } else {
      System.out.println('登陆失败');
    }
  }
  // 检查用户名和密码是否正确
  public static boolean check(String username, String password) {
    return username.equals('admin') && password.equals('abc123')
  }
}
```
### 9.搭建IDEA.
```
1.下载后创建一个空项目后, 首要任务是设置jdk: 文件 -> 项目结构 -> SDK.
2.创建模块: 右键 -> 新的 -> 模块
3.在模块中的src文件夹中创建包: 右键 -> 新的 -> 软件包
4.在包中创建类
```
### 10.IDEA常用快捷键.
```
新建: alt + insert
开发窗口最大化: ctrl + shift + F12
打开/关闭项目窗口: alt+ 1
生成 main 方法: psvm 或 main
快速生成输出语句: sout
查找: 敲两次shift
查找当页的内容: ctrl + F12
复制一行: ctrl + d
快速生成变量: 值.var
```
