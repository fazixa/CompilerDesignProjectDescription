

# MiniJava Documentation






## Introduction
<div>
<ul dir="rtl">
<li>
	زبان MiniJava یک زبان شی گراست که برخی از قابلیت های زبان java را داراست.
</li>
<li>
	هر برنامه زبان MiniJava شامل یک فایل با فرمت jm. است
</li>
<li>
گرامر زبان در <a href="https://github.com/fazixa/CompilerDesignProjectDescription/blob/master/Documentation/MiniJava.g4">این قسمت </a> قابل مشاهده است.
</li>
	
</ul>
</div>


## Class Declaration

<div>
<ul dir="rtl">
<li>
تعریف هر کلاس از دو بخش نام و بدنه تشکیل شده است. بدنه هر کلاس شامل تعریف <a href="#field-declaration">فیلد</a> ها و <a href="#method-declaration">متد</a> ها می باشد.
</li>
<li>هر کلاس می تواند حداکثر از یک کلاس <a href="#inheritance">ارث بری</a> کند (با استفاده از کلید واژه extends )  به این معنی که می تواند  از فیلد ها و متد های پدرش استفاده نماید.  </li>
<li>همچنین یک کلاس میتواند از یک یا چند  <a href="#interface-declaration">interface</a> را پیاده سازی کند (با استفاده از کلمه کلیدی implements). </li>
</ul>
</div>

```java
class Pokemon{
    // Field Declaration
    // Method Declaration
}
```

<br>

## Import Class
<ul dir="rtl">
<li> برای استفاده از کلاس های از پیش تعریف شده باید آنها را قبل از شروع کلاس ها import کنیم.
  </li>
</ul>

```java
import Pokemon;
import Digimon;
```

<br>

## Interface Declaration
<ul dir="rtl">
<li>تعریف آن همانند کلاس بود با این تفاوت که متد های آن به صورت <a href="#abstract-method-declaration">abstract</a>  می باشد و از آنها برا ساخت ابجکت نمی توان استفاده کرد.</li>
<li> عملیات انتساب فیلد های یک interface  دقیقا پس از تعریف آنها صورت می گیرد.
<li> فیلد های یک اینترفیس به طور پیش فرض  static, public  و final(فقط یک بار مقداردهی می شوند) هستند</li>
<li>کلاسی که اینترفیس را implements می کند، باید تمامی متدهای آن را پیاده سازی کند.</li>
<li>اینترفیس نمی تواند از کلاسی ارث ببرد.</li>
</ul>


```java
interface Ball {
    // Field Declaration
    // Interface Method Declaration
}
class PokeBall implements Ball {
    ...
}
```


<br>

## Inheritance
<div>
<ul dir="rtl">
<li>هنگامی که یک کلاس از کلاس دیگر ارث می برد کلاس فرزند می تواند به خصوصیات و متد های کلاس پدر دسترسی داشته باشد مگر آنکه دسترسی آنها private  باشد.</li>
<li> متد های پدر در صورت نیاز میتوانند override شوند. ( با استفاده از کلید واژه @Override)  </li>
<li> قوانین override  کردن:<ul>
<li> لیست آرگومان های تابع باید دقیقا با لیست آرگومان های تابع override شده یکی باشد.  </li>
<li> نوع مقدار بازگشتی تابع باید همانند نوع مقدار بازگشتی تابع override شده کلاس پدر باشد.  </li>
<li> سطح دسترسی تابع نمی تواند محدودتر از سطح دسترسی تابع override شده باشد. برای مثال: اگر تابع کلاس پدر به صورت public تعریف شده باشد، در این صورت تابع کلاس فرزند نمی 
تواند private باشد.  </li>
<li> تنها توابعی از کلاس پدر که توسط فرزند ارث بری شده اند می توانند override شوند.  </li>
</ul>

</div>

```java
// Base Class 
class Pokemon {
    public int damage() {
    health = health - 5;
    return health;
    } 
}   
// Inherited class 
class Pikachu extends Pokemon { 
    @Override
    public int damage() {
    health = health - 2;
    return health;
    } 
} 
```

<br>

## Main Class Declaration

<ul dir="rtl">
<li><p>هر برنامه شامل فقط یک کلاس main  می باشد که به صورت تعریف می شود
</p></li>
<li><p>کلاس main تنها یک متد main  دارد وخروجی آن void  می باشد. همچنین این متد تنها متد static  در برنامه می باشد.
</p></li>
</ul>

```java
class ClassName{
    public static void main(String[] a){
	//statement
    }
}
```


<br>

## Field Declaration

<ul dir="rtl">
<li>هر کلاس دارای تعدادی خصیصه است که در زمان تعریف حتما نوع آن باید تعیین شود. <li>خصیصه ها فقط درون کلاس قرار میگیرند و نباید خصیصه های تکراری درون یک کلاس تعریف شود.</li>

</ul>

```java
class Pokemon {
   int health;
   final int maxMovesNum = 5;
   private int speed;
   boolean legendary;
   Pokeball ball;
   int[] powers = {1, 2, 3};
   Move[] moves = new Moves[maxMovesNum];
}
```
<br> 

## Local Variable Declaration

<ul dir="rtl" >
<li><p>متغیر ها همانند خصیصه ها مقدار دهی می شوند با این تفاوت که متغیر ها داخل متد ها تعریف می شوند</p></li>
</ul>

```java
public attack() {
    int hp;
}
```

<br>

## Method Declaration
<ul dir="rtl">
<li>هر متد تعدادی ورودی و یک خروجی دارد، نوع ورودی ها و خروجی باید مشخص باشد</li>
<li>در صورتی که تابع خروجی نداشته باشد از کلید واژه void استفاده میشود</li>
<li>عبارت return حداکثر یک بار و در آخر  تابع ظاهر می شود</li>
</ul>

```java
public int damage(int amount) {
    health = health - amount;
    return health;
}

public static void attack(Pokemon target, int amount) {
    target.damage(amount);
}
```



## Abstract Method Declaration
<ul dir="rtl">
<li>متد های interface بدنه ندارند </li>
<li>همچنین در هنگام تعریف به صورت پیش فرض abstract و public)هستند و  هیچگاه به صورت private  نمیتوان آنها را تعریف کرد </li>
</ul>

```java
interface Pokemon { 
    void speedUp(int a); 
} 
```
<br></br>

## Statements

#### If Else Statement

```java
if (health < 1) {
  isAlive = 0
}
```

#### While Statement
```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```
<br>

### Assignmets Statement
#### Variable Assignment Statement
<ul dir="rtl">
<li><p>برای استفاده از ابجکت ها باید ابتدا آنها را instantiate کرد</li></ul>

```java
health = 100;
powers = new int[20];
ball= new PokeBall();
amount = power[4];
```
#### Array Assignment Statement
```java
power[1] = 5;
````

## This Keyword
<p dir="rtl">
کلید واژه this  به کلاسیکه در آن قرار داریم اشاره می کند  
<br>
راه های استفاده از this   در Minijava  به شرح زیر می باشد:

<p>
<ul dir="rtl">

<li>برای برگرداندن instace ای از کلاس فعلی </li>

<div dir="ltr"> 

```java
class Test 
{ 
    //Method that returns current class instance 
    Test get() 
    { 
        return this; 
    } 
}
```
</div>
<li> دسترسی به متد کلاس </li>

<div dir="ltr"> 

```java
class Test { 
    void display() 
    { 
        // calling function show() 
        this.show(); 
    } 
    void show() { 
        ...
    } 
}
```

</div>

</ul>


## Data Types

 <p dir="rtl"> زبان MiniJava   که در اختیار شماست شامل دو نوع داده ای پایه  Boolean و int  می باشد. علاوه برآن هر متغیر میتواند از جنس یکی از کلاس هایی باشد که در برنامه تعریف شده است. در این زبان، یک نوع آرایه نیز تعریف شده است. این آرایه، یک بعدی و می تواند از هر نوعی باشد.</p>

| نوع | توضیحات | مقدار پیش فرض |
| ------ | --- | ----- |
| int | <p dir="rtl">  یک نوع عدد دهدهی که با یک رقم 1 تا 9  شروع و می تواند با ارقام 0 تا 9 ادامه یابد همچنین رقم 0 نیز می تواند باشد </p>| 0|
| boolaen |<p dir="rtl">  نوع داده ای شامل true و  false  می باشد |fasle|
| array[]|<p dir="rtl">  آرایه ای یک بعدی از هر گونه | - |
| Class | <p dir="rtl"> داده ای از نوع کلاسهای تعریف شده در برنامه |null|

<ul dir="rtl">
<li>در صورتی که متغیر از جنس یک کلاس یا آرایه باشد، مقدار اولیه ندارد و در صورت استفاده، باید خطای مناسب به کاربر داده شود.</li>
<li>اندازه یک آرایه نمی تواند صفر یا عددی منفی باشد. 

<li>تعریف متغیر ها می تواند در هر کجای scope  (غیر از بیرونی ترین scope که scope کلاس هاست)
انجام شود</li>
</ul>

<br>

## Predefined Methods
<p dir="rtl">در زبان Minijava توابع و فیلدهای از پیش تعریف شده ای وجود دارند که عبارت اند از:</p>

#### println Method
<p dir="rtl">
این تابع به طور ضمنی تعریف شده است و می تواند یک مقدار intو boolean را دریافت کند وآن را بر روی کنسول چاپ کند</p>

```java
System.out.println(amount);
```

#### length field
<p dir="rtl">
این فیلد تنها برای آرایه ها تعریف می شود و طول یک آرایه را باز می گرداند.
</p>

```java
aray = new int[66];
print(array.length);
```
<br> 

##  Operators
#### Arithmetic operators

<p dir="rtl">در صورتی که A=10 و B=2  باشد، عملگر های زبان MiniJava  را به صورت زی تعریف میکنیم</p>
 
 |Operator|Description|Example
 |-----|-----|----|
 +(Adiituion)|Addss values on eithr side of theoperator|A + B will give 12
 -(Sibtraction)|Subtracts right-hand operand from left-hand operand| A - B will give 8
 *(Multiplication)|Multiplies values on eithr side of the operator| A * B will give 20
 \**(Exponentiation) |raise the number on the left to the power of the exponent of the right | A ** B will give 100

#### Assignment Operator
<p dir="rtl"> در زبان MiniJava  تنها یک دستور انتساب تعریف شده است<p>

 |Operator|Description|Example
 |-----|-----|----|
 =| Simple assingment operator. Assigns values from right side operands to left side operand| C= A + B will assign value of A + B into C
#### Logical Operators
 |Operator|Description
 |-----|-----|
 && | returns the boolean value TRUE if both operands are TRUE and returns FALSE otherwise.| 
#### Relational Operators
 |Operator|Description|Example
 |-----|-----|----|
 <(Less Than)|Checks if the value of the left opernad is less than the value of right operand, if yes then  the condition becoms true.| (A < B) is true
