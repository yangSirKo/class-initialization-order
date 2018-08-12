# class-initialization-order
<br>
Three cases understanding class initialization order
<br>
#### InitClass.java exec
执行过程：
<br> 1. new B1()时，JVM需要加载B1.class字节码文件，此时会先初始化静态变量和静态代码块，按照自上而下的方式依次初始化。静态代码块只在加载class文件时执行一次。
<br> 2. 然后执行B1的构造函数

<br><br>
#### InitClass2.java
执行过程：<br>
 1. new B2()时，JVM需要加载B2.class字节码文件，此时会先初始化静态变量和静态代码块，按照自上而下的方式依次初始化。静态代码块只在加载class文件时执行一次。<br>
 2. 当静态代码块执行过一次，静态变量也初始化完成以后，先调用构造函数的第一行super()执行父类的构造函数，然后开始自上而下初始化全局变量。<br>
 3. 然后执行B2的构造方法内容。<br>
<br>

#### InitClass3.java<br>
当 B3继承A3时，执行过程：<br>
 1. new B3()时，JVM需要加载B3.class字节码文件，此时会先初始化静态变量和静态代码块，按照自上而下的方式依次初始化。静态代码块只在加载class文件时执行一次。<br>
 2. 当静态代码块执行过一次，静态变量也初始化完成以后，先调用构造函数的第一行super()执行父类的构造函数，然后开始自上而下初始化全局变量。<br>
 3. 最后执行B2的构造方法内容。<br>



