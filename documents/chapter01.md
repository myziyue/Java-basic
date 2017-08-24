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

## 1、第一个程序

[源代码](https://github.com/myziyue/Java-basic/tree/master/src/com/myziyue/ch01/)

编译：javac com/myziyue/ch01/ses01/HelloWorld.java

运行：java com.myziyue.ch01.ses01.HelloWorld

调用对象上的实例方法：object.methodName(arguments)

Random类的对象可以产生随机数。

## 2、基本类型

- 2.1、整型

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

- 2.2、浮点类型

类型 | 存储需求 | 范围
---|---|---
float | 4个字节 | 大约±3.40282347E+38F(6~7位有效的小数位数)
double | 8个字节 | 大约±1。79769313489231570E+308(15位有效的小数位数)

float类型有个F后缀。没有F的浮点类型默认为double类型。你也可以使用D作为double类型的后缀。

使用十六进制标示浮点数时，使用p代替e来表示指数。

特殊浮点数值Double.POSITIVE_INFINITY代表∞，Double.NEGATIVE_INFINITY代表-∞，Double.NaN代表"非数值"。
对应的检测方法为：Double.isInfinite()/Double.isFinite()/Double.isNaN()。

浮点数不可以做金融计算，因为金融计算中的舍入误差是不能接受的。

- 2.3、char型

char型描述了Java使用UTF-16字符编码中的"编码单元"。

编码单元可以使用十六进制表示，使用前缀'\u'。

- 2.4、布尔型

布尔型有两种值：false和true。

在Java中，布尔型不是数字类型，布尔值与正式0和1没有关系。

## 3、变量

Java是抢类型语言。变量值只能是某个具体类型的值。当你声明变量时，需要🈯️指定变量的类型、名称和一个可选的初始值。

变量名（方法活类也同样）必须以字母开始，它可以由任意字母、数字、下划线与$组成。

尽可能晚地声明变量，刚好在你首次需要变量的前一刻声明，被认为是一种好习惯。

常量：使用关键字final表示一个值，一旦赋值后就不能改变。根据习惯，常量的名字使用大写字母。
也可以在方法外，使用static关键字声明常量。

## 4、算术运算

Math.floorMod()求余数

数字类型转换：通常转换为位数长的类型。

如果基本的整型和浮点类型精确度还不够满足条件，可以使用java.math包中的BigInteger和BigDecimal类，这些类的对象代表了数字，
该数字有任意序列的位数。

## 5、字符串

字符串连接可以用+或者String.join()方法（第一个参数为分隔符，后续为连接的字符串）。

如果你只想要最终的结果，那么连接大量的字符就有些效率低下了。这种情况下，最好使用StringBuilder代替。

拆分字符串，使用substring方法。如果想将分隔符分割的字符串中的所有子字符串提取出来，split方法
就是执行这种任务的。

使用equals方法检查两个字符串是否相等。不考虑大小写比较两个字符串，可以使用equalsIgnoreCase方法。

现在，Unicode需要21个比特。每个有效的Unicode值被称为编码点（code point）。

在java中，字符串不是Unicode字符或者编码点的序列；而是编码单元(code unit)，UTF-16编码的16比特序列。

## 6、输入与输出

从"标准输入流"读取不是那样简单，因为相应的System.in对象只能读取单个字节的方法。要读取字符串和数字，
构建一个依附到System.in的Scanner。nextLine方法从输入读取一行。next读取单个单词。nextInt读取整型。
nextDouble读取浮点数。可以使用hasNextLine、hasNext、hasNextInt、hasNextDouble方法读取是否有另外一行、
另外一个单词、整数、浮点数。

提示：需要读取密码是，你不想使用Scanner类，因为在终端输入是可见的。你可以用Console类代替。

## 7、控制流

## 8、数组和数组列表

ArrayList类是泛类型类--一种带有类型参数的类。泛类型有个限制：不能直接使用基本类型作为类型参数，需要使用包装类。
基本类型和它们对应的包装类型之间是自动转换的，在调用add方法时。

基本类型与它们的包装类之间的转换对程序员完全透明的，但是==和!=操作符例外。==和!=操作符比较对象引用，而不是对象的内容。

数组与数组列表的复制：数组使用静态方法Arrays.copyOf(),数组列表使用ArrayList<String> copiedFriends = new ArrayList<>(friends);
构造函数也可以用来将数组复制到数组列表中，首先，你需要使用Arrays.asList方法，将数组包装到列表中。 

填充数组：使用Arrays.fill(number, 0); // int[]数组，使用Collections.fill(friends, ""); // ArrayList<String>

要对数组或数组列表排序，使用sort方法。Array.toString方法产生一个数组的字符串表示,数组列表直接输出即可。

数组反转：Collections.reverse(names);随机打乱元素：Collections.shuffle(names);

没有二维数的数组列表，但是你可以声明ArrayList<ArrayList<Integer>>类型的变量并自己构建行。

## 9、功能分解

可变参数：在类型之后加上...声明"变长参数"。


























