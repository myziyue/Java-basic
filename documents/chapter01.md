# 基本的编程结构

```
本章要点：

1、在Java中，所有的方法必须在类中声明。非静态方法只能在该方法所属类的对象上调用。

2、静态方法不是通过对象调用。程序从静态的main方法开始执行。

3、Java有8个基本数据类型：5个整型、2个浮点型和1个布尔型。

4、Java操作符和控制结构与C或者JavaScript的非常相似。

5、Math类提供常见的数学函数。

6、字符串对象是字符序列，或者更精确地说，是UTF-16编码中的Unicode编码点的序列。

7、使用System.out对象，它是名为PrintStream类的实例，你可以在终端窗口显示输出。绑定System.in的Scanner可以读取终端输入。

8、数组和集合用来收集相同类型的元素。

```

## 第一节、第一个程序

[源代码](https://github.com/myziyue/Java-basic/tree/master/src/com/myziyue/ch01/)

编译：javac com/myziyue/ch01/ses01/HelloWorld.java

运行：java com.myziyue.ch01.ses01.HelloWorld

调用对象上的实例方法：object.methodName(arguments)

Random类的对象可以产生随机数。

## 第二节、基本类型


类型 | 存储需求  | 范围(包含该值 )
---|---|---
int  | 4个字节 | -2 147 483 648 ～ 2 147 483 647 (刚超过20亿)
long | 8个字节 | -9 223 372 036 854 775 808 ~ 9 223 372 036 854 775 807
short | 2个字节 | -32 768 ~ 32 767
byte | 1个字节 | -128 ~ 127

注意：常量Integer.MIN_VALUE和Integer.MAX_VALUE分别是最小和最大的整数。Long、Short、Byte类也有.MIN_VALUE和.MAX_VALUE常量。

在Java中，整型的范围不依赖于程序所运行的机器。

使用long整型变量值时带上L后缀。byte和short没有这种语法。

十六进制值使用0x前缀，二进制值使用0b前缀,八进制数有个前缀0。

你可以给数字添加下划线，如1_000_000，来方便阅读，Java编译器会直接删除他们。

类型 | 存储需求 | 范围
---|---|---
float | 4个字节 | 大约±3.40282347E+38F(6~7位有效的小数位数)
double | 8个字节 | 大约±1。79769313489231570E+308(15位有效的小数位数)

float类型有个F后缀。没有F的浮点类型默认为double类型。你也可以使用D作为double类型的后缀。

 


























