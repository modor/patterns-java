各个模式适用场景说明
===
软件开发当中基本上每项技术和概念都有其要解决的问题，有其适用的场景，同样，每种设计模式也有其要解决的问题，有其产生原因，技术更多的都是脱胎于需求，解决现实问题。  
设计模式大体分为三大类：  
创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。  
结构型模式，共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。  
行为型模式，共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。  
其他模式：并发型模式和线程池模式。  
遵循六大原则：  
1）单一职责原则  （Single Responsibility Principle） 
2）里氏替换原则（Liskov Substitution Principle）  
3）依赖倒转原则（Dependence Inversion Principle）  
4）接口隔离原则（Interface Segregation Principle）  
5）迪米特法则（最少知道原则）（Demeter Principle）  
6）合成复用原则（Composite Reuse Principle）  

工厂模式
-----
工厂模式是随着产品树的不断庞大而产生的类似分类管理类目的模型。  
1）简单工厂模型是指产品树较少的情况下，类似于一个简单的“人工作坊”只生产几类商品，我们需要根据需求（参数）来“生产”某个商品，产生该商品的参数信息等。  
2）当一个工厂规模不断扩大，生产商品种类不断繁多，在软件开发时，简单工厂模式这种单一种类管理一旦涉及改动会可能导致整个类目出现问题，为了尽量影响小，同时方便管理和查找，我们需要对这些商品进行分类，工厂方法模板适用场景大概既此。  
3）当多个工厂生产商品，而商品之间又有彼此的关联关系，那么我们就需要一种新的模型来管理这些关联关系，于是就产生了抽象工厂模型。  
***
* 简单工厂模式(Simple Factory Pattern)

简单工厂模式又称静态工厂方法(static factory method)，用来管理少量“商品”的情况。
***

* 工厂方法模式(Factory Method Pattern)


工厂方法模式根据不同商品类目来管理商品，“生产”不同商品时候我们只需要调用该类目的工厂方法即可。
***

* 抽象工厂模式(Abstract Factory Pattern)

抽象工厂模式用来管理多个工厂多个类目商品之间的关联关系，客户只需调用“抽象工厂”，即可生产出两个工厂生产的产品的组合产品，而不用关心具体的工厂是哪个。
***

单例模式
-----
单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。这个类称为单例类。
***
* 饿汉式

饿汉式是空间换时间，当类装载的时候就会创建类的实例，不管是否使用，先创建出来，然后每次调用的时候，就不需要判断是否创建，节省了运行时间。
***
* 懒汉式

懒汉式相反，是时间换取空间，就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间，如果一直没有人使用的话，那就不会创建实例，则节约内存空间。
***

建造模式
-----
建造模式是指对某个产品（对象）按照指定规格进行创建生产（初始化），对某个产品（对象）进行操作的类就称为建造者。
***
* 建造模式(Builder Pattern)

需要使用建造模式的情况：

1)需要生产的产品对象有复杂的内部结构。

2)需要生产的产品对象的属性相互依赖。
***

原型模式
-----
刚接触java时候总是觉着设计模式似乎很高大上，但实际上JAVA设计模式和算法一样，其实就是我们开发中遇到问题的总结，然后给这些总结起了个名字。开发经验丰富之后再看一下设计模式的书，便会恍然大悟：原来我一直用的东西叫这个名字。这个原型模式便是典型的这种总结，它甚至称不上模式，只是Cloneable接口的用法。
***
* 浅复制

在调用clone方法时候，对值类型的成员变量进行值的复制，,对引用类型的成员变量只复制引用,不复制引用的对象。即按值传递的数据（比如基本数据类型、String类型）复制，而不复制它所引用的对象的值，换言之，所有的对其他对象的引用都仍然指向原来的对象。
***
* 深复制

对值类型的成员变量进行值的复制,对引用类型的成员变量也进行引用对象的复制，这就需要引用类型的成员类也要重写Cloneable接口。
***

适配器模式
-----
适配器模式，装饰模式，代理模式、门面模式这几个模式很类似，就是原有的类不符合要求，通过一个改造类按照要求对原类进行改造，这个改造类就是适配器、装饰器、代理器、门面。
***
* 适配器模式

适配器模式，一个适配允许通常因为接口不兼容而不能在一起工作的类工作在一起，做法是将类自己的接口包裹在一个已存在的类中。在使用适配器模式的时候，我们必须同时持有原对象，适配对象，目标对象。
***
装饰器模式
-----
***
* 装饰器模式

装饰器模式，原有的不能满足现有的需求，对原有的进行增强。装饰器模式特点在于增强，他的特点是被装饰类和所有的装饰类必须实现同一个接口，而且必须持有被装饰的对象，可以无限装饰。
***

代理模式
-----
***
* 代理模式

代理模式，同一个类而去调用另一个类的方法，不对这个方法进行直接操作。代理模式的特点在于隔离，隔离调用类和被调用类的关系，通过一个代理类去调用。
***

享元模式
-----
***
* 享元模式（Flyweight Pattern）

享元模式主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
***

门面模式
-----
***
* 门面模式(外观模式)

门面模式又称外观模式，代理模式一般是通过某个类间接访问某个类，而门面模式则是“一群类”需要统筹协调，功能交叉，如果交给客户端来做比较混乱，于是就产生了门面模式，提供这些类功能的“封装”或“代理”，有点类似于建造者模式，但建造者模式是返回对象，而门面模式则强调接口调用和处理过程。

***

桥接模式
-----
***
* 桥接模式

桥接模式和装饰模式有一定的类似，装饰器模式是把对象传给装饰器类进行增强，而桥接模式是把B类传递给A类进行功能的拼接。装饰器类往往是原类没有该功能，而用新的类对齐加强，而桥接模式则是需要使用到两个类的功能，为了使用方便将两个类的功能整合到一起。

***

组合模式
-----
***
* 组合模式

设计模式中树形结构的实现称之为组合模式，将对象组合成树形结构以表示“部分整体”的层次结构，在算法当中，组合模式我们称之为树。操作系统目录结构管理很好的体现了这种设计模式。

***

策略模式
-----
***
* 策略模式

策略模式在使用上类似于桥接模式和装饰器模式，但是实际适用场景却类似于门面模式，Context角色类会根据不同的具体策略(ConcreteStrategy)角色，其方法会调用相应的ConcreteStrategy角色的方法，该模式很好的体现了java父类引用指向子类对象的特性。
***

模板方法模式
-----
***
* 模板方法模式

模板方法模式是指抽象类已经实现了模板方法，定义了方法的骨架，具体类会实现抽象类中的抽象方法，完成的完整的方法。实际上就是普通的抽象类继承，也算作一种模式吧。

***

观察者模式
-----
***
* 观察者模式

观察者模式有时又被称为发布（publish）-订阅（Subscribe）模式、模型-视图（View）模式、源-收听者(Listener)模式或从属者模式，是指当观察者（Observer）将自己注册到被观察对象（Subject）中，被观察对象将观察者存放在一个容器（Container）里，当需要修改并通知观察者时只需要调用Subject中的方法即可，同时Subject也会提供Observer的添加和删除接口。
***

命令模式
-----
***
* 命令模式

命令模式用于“行为请求者”与“行为实现者”解耦，或者说是间接调用，两个对象通过调用类实现了二者之间的松耦合。
***

责任链模式
-----
***
* 责任链模式

责任链模式是一种对象的行为模式。在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。请求在这个链上传递，直到链上的某一个对象决定处理此请求。发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。
***

备忘录模式
-----
***
* 备忘录模式

备忘录模式是在不破坏封闭的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态，简单而言就是对该对象的某些成员属性进行备份保存，以便后续恢复该对象对应的属性。
***

访问者模式
-----
***
* 访问者模式

访问者模式的目的主要是为了尽量少的对原有类进行改动，适用于业务处理时常发生变动的情况。在该模式中，增加或者减少新的业务，只需要修改visitor中的处理方法，然后增加或者删除相应的类即可。坏处就是服务于visitor类耦合太深，一旦改动出现问题会影响全部的业务，违反责任单一原则。
***

迭代子模式
-----
***
* 迭代子模式

提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节，Java集合对象一般都实现了迭代子模式。
***