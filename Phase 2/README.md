<h1 dir="rtl">فاز دوم</h1>
<h3 dir="rtl">مقدمه</h3>
<p dir="rtl">در این فاز به پیاده سازی تحلیل گر معنایی می پردازیم. قبل از اینکه خطا های برنامه را توسط تحلیل گر معنایی بررسی کنیم باید اطلاعاتی را جمع آوری و در جدول علائم ذخیره کنیم .</p>
<h3 dir="rtl">جدول علائم (Symbol Table)</h3>
<p dir="rtl">ساختار داده ای است که در کامپایلرها برای نگه  داری و جمع ی آور شناسه های تعریف شده در کد  ورود استفاده میشود.</p>
<h3 dir="rtl">طراحی جدول علائم</h3>
<p dir="rtl">طراحی این  ، جدول به شکل های متفاوتی قابل انجام است که با توجه به نوع زبان پیچیدگی و نظر طراح کامپایلر تعیین میشود. ساده ترین نوع پیاده  سازی یک  جدول علائم استفاده از hashtable میباشد به این صورت که کلید آن نام شناسه و ارزش نسبت داده شده به این کلید مجموعه مقادیر ویژگی های مربوط به شناسه می باشد.</p>
<p dir="rtl">هر  جدول علائم دو متد اصلی دارد که اطلاعات مربوط به شناسه از طریق این دو متد در  جدول ذخیره و یا از آن  بازیابی میشوند.</p>


    insert (idefName, attributes)
    lookup (idefName)



<p dir="rtl">در زبان، یک جدول علائم مخصوص به خود دارد. scopeهر حوزه یا</p>
<h3 dir="rtl">حوزه ها (Scopes)</h3>
<p dir="rtl">هر یک از موارد زیر زبان MiniJava یک حوزه به حساب می آیند.</p>
<ul dir="rtl">
<li><p>تعریف  برنامه</p></li>
<li><p>تعریف کلاس</p></li>
<li><p>تعریف توابع</p></li>
<li><p>شروع else , if, for, while و nestedStatement ها</p></li>

> Note
</ul>
<h3 dir="rtl">ارتباط حوزه ها و جداول علائم</h3>
<p dir="rtl">هر حوزه یک جدول علائم دارد. لذا شناسه هایی که در هر حوزه تعریف می شوند باید در جدول علائم مربوط به این حوزه ذخیره شوند. از آنجایی که این زبان از حوزه های تودرتو 
پشتیبانی می کند یک روش مناسب برای نگهداری این حوزه ها استفاده از گراف می باشد.</p>
<blockquote dir="rtl"><p> می توانید از ساختار های دیگر هم استفاده نمایید </p></blockquote>
<p dir="rtl">ساختار جدول علائم برای حوزه ها به این صورت است:</p>



<img src="http://s11.picofile.com/file/8395066334/Capture_Copy.PNG" alt="scopes" width="500"/>


<p dir="rtl">
در ادامه یک قطعه کد و حوزه های آن و آنچه که باید در symbol table هر حوزه ذخیره شود را مشاهده می کنید.
<p>

![enter image description here](http://s11.picofile.com/file/8394956326/Capture.PNG)





<h3 dir="rtl">آنچه در این فاز انجام میدهیم</h3>
<p dir="rtl">در این فاز ابتدا چند برنامه به زبان Minijava بنویسید سپس هر قطعه کد را به عنوان ورودی دریافت و حوزه های آن را پردازش کنیدوجدول علائم مربوط به آن را بسازید و همه 
جدوال را دریک خروجی به ترتیب شماره خط شروع اسکوپ آنها با فرمت زیر نمایش دهید</p>

input ([get raw]()):
```java
1	class Classes {
2		public static void main(String[] args) {
3			Base b;
4			Derived d;
5			int x;
6			b = new Base();
7			d = new Derived();
8			b = d;
9			System.out.println(b.set(1));
10			System.out.println(b.set(3));
11		}
12	}
13
14	class Rest implements Nothing{
15
16	}
17
18	class Base extends Rest implements Face,MyFace{
19		int[] data;
20		private Rest[] d;
21		private int set(int[] x) {
22			data = x;
23			return data;
24		}
25		public int get() {
26			return data;
27		}
28		private int test(){
29
30		while(1)
31			int x;
32
33			int b ;
34			{
35				int t;
36				a = 0;
37				b = 5;
38			}
39			if(true){
40				bool n;
41			{
42			}
43
44			}
45
46			return a + b;
47		}
48
49	}
50
51	class Derived extends Base {
52
53		public int set(int x, C d) {
54			data = x * 2;
55			{
56						Base[] t;
57
58			}
59			if (a<0)
60				int a;
61			return data;
62		}
63	}
64
65	class Hi {
66		private void sayHi(int one, bool two, Hi three, int four){
67		}
68	}
69
70	interface Face{
71		final int[] a = {1,2};
72		int getFace(int s);
73	}
74
75	interface MyFace{
76		final String  myFace= ":)";
77	}
```
output ([get raw]()):
```java
-------------  program : 1  -------------
Key = class_Base  | Value = Class: (name: Base) (extends : Rest | implements: Face, MyFace)
Key = interface_Face  | Value = Interface: (name: Face)
Key = interface_MyFace  | Value = Interface: (name: MyFace)
Key = class_Rest  | Value = Class: (name: Rest) (extends : Object | implements: Nothing)
Key = mainClass_Classes  | Value = MainClass: (name: Classes)
Key = class_Hi  | Value = Class: (name: Hi) (extends : Object)
Key = class_Derived  | Value = Class: (name: Derived) (extends : Base)
-----------------------------------------

-------------  Classes : 1  -------------
Key = method_main  | Value = Method: (name: main) (returnType: void) (accessModifier: ACCESS_MODIFIER_PUBLIC) (parametersType: [array of [classType = String, isDefined = true] , index: 1] )
-----------------------------------------

-------------  mainMethod : 2  -------------
Key = var_d  | Value = LocalVar: (name: d) (type: [classType = Derived, isDefined = true])
Key = var_b  | Value = LocalVar: (name: b) (type: [classType = Base, isDefined = true])
Key = var_x  | Value = LocalVar: (name: x) (type: int)
Key = var_args  | Value = Parameter: (name: args) (type: array of [classType = String, isDefined = true]) (index: 1)
-----------------------------------------

-------------  Rest : 14  -------------
-----------------------------------------

-------------  Base : 18  -------------
Key = var_d  | Value = Field: (name: d) (type: array of [classType = Rest, isDefined = true]) (accessModifier: ACCESS_MODIFIER_PRIVATE)
Key = method_get  | Value = Method: (name: get) (returnType: int) (accessModifier: ACCESS_MODIFIER_PUBLIC)
Key = method_set  | Value = Method: (name: set) (returnType: int) (accessModifier: ACCESS_MODIFIER_PRIVATE) (parametersType: [array of int , index: 1] )
Key = var_data  | Value = Field: (name: data) (type: array of int) (accessModifier: ACCESS_MODIFIER_PUBLIC)
Key = method_test  | Value = Method: (name: test) (returnType: int) (accessModifier: ACCESS_MODIFIER_PRIVATE)
-----------------------------------------

-------------  set : 21  -------------
Key = var_x  | Value = Parameter: (name: x) (type: array of int) (index: 1)
-----------------------------------------

-------------  get : 25  -------------
-----------------------------------------

-------------  test : 28  -------------
Key = var_b  | Value = LocalVar: (name: b) (type: int)
-----------------------------------------

-------------  while : 31  -------------
Key = var_x  | Value = LocalVar: (name: x) (type: int)
-----------------------------------------

-------------  nested : 34  -------------
Key = var_t  | Value = LocalVar: (name: t) (type: int)
-----------------------------------------

-------------  nested : 39  -------------
Key = var_n  | Value = LocalVar: (name: n) (type: bool)
-----------------------------------------

-------------  nested : 41  -------------
-----------------------------------------

-------------  Derived : 51  -------------
Key = method_set  | Value = Method: (name: set) (returnType: int) (accessModifier: ACCESS_MODIFIER_PUBLIC) (parametersType: [int , index: 1]  [[classType = C, isDefined = false] , index: 2] )
-----------------------------------------

-------------  set : 53  -------------
Key = var_d  | Value = Parameter: (name: d) (type: [classType = C, isDefined = false]) (index: 2)
Key = var_x  | Value = Parameter: (name: x) (type: int) (index: 1)
-----------------------------------------

-------------  nested : 55  -------------
Key = var_t  | Value = LocalVar: (name: t) (type: array of [classType = Base, isDefined = true])
-----------------------------------------

-------------  if : 60  -------------
Key = var_a  | Value = LocalVar: (name: a) (type: int)
-----------------------------------------
-------------  Hi : 65  -------------
Key = method_sayHi  | Value = Method: (name: sayHi) (returnType: void) (accessModifier: ACCESS_MODIFIER_PRIVATE) (parametersType: [int , index: 1]  [bool , index: 2]  [[classType = Hi, isDefined = true] , index: 3]  [int , index: 4] )
-----------------------------------------

-------------  sayHi : 66  -------------
Key = var_four  | Value = Parameter: (name: four) (type: int) (index: 4)
Key = var_three  | Value = Parameter: (name: three) (type: [classType = Hi, isDefined = true]) (index: 3)
Key = var_one  | Value = Parameter: (name: one) (type: int) (index: 1)
Key = var_two  | Value = Parameter: (name: two) (type: bool) (index: 2)
-----------------------------------------

-------------  Face : 70  -------------
Key = var_a  | Value = Field: (name: a) (type: array of int) (accessModifier: ACCESS_MODIFIER_PUBLIC)
-----------------------------------------

-------------  MyFace : 75  -------------
Key = var_myFace  | Value = Field: (name: myFace) (type: [classType = String, isDefined = true]) (accessModifier: ACCESS_MODIFIER_PUBLIC)
-----------------------------------------
```

<h3 dir="rtl">مراحل گرفتن خروجی</h3>
<p dir="rtl">1. برای هر symbolTable  باید دو تابع زیر کال شوند تابع toString برای چاپ کردن مقادیر SymbolTable  و تابع getValue  برای دریافت مقادیر از Hashmap  استفاده می شود<p>

```java
public String toString() {
   return "-------------  " + name + " : " + scopeNumber + "  -------------\n" +
              printItems() +
             "-----------------------------------------\n";
}
```
```java
public String printItems(){
   String itemsStr = "";
   for (Map.Entry<String,SymbolTableItem> entry : items.entrySet()) {
       itemsStr += "Key = " + entry.getKey() + "  | Value = " + entry.getValue() + "\n";
   }
   return itemsStr;
}
```
<p dir="rtl">برای مثال خروجی برای اسکوپ گلوبال به شکل زیر می شود:</p>

```java
-------------  program : 1  -------------
Key = class_Base  | Value = Class: (name: Base) (extends : Rest | implements: Face, MyFace)
Key = interface_Face  | Value = Interface: (name: Face)
Key = interface_MyFace  | Value = Interface: (name: MyFace)
Key = class_Rest  | Value = Class: (name: Rest) (extends : Object | implements: Nothing)
Key = mainClass_Classes  | Value = MainClass: (name: Classes)
Key = class_Hi  | Value = Class: (name: Hi) (extends : Object)
Key = class_Derived  | Value = Class: (name: Derived) (extends : Base)
-----------------------------------------
```
<p dir="rtl">2. برای چاپ هر item نیز باید متد toString بنویسیم:</p>

#### ClassItem:
```java
public String toString() {
   String out = "Class: " + "(name: " + this.name + ") " +"(extends : " + parent.name;
   if(!interfaces.isEmpty()){
       out +=  " | implements: " ;
       int i ;
       for ( i = 0 ; i < interfaces.size() - 1 ; i++ ){
           out += interfaces.get(i).name +", ";
       }
       out += interfaces.get(i).name ;
   }
   return out +")";
}
```
<p dir="rtl"> بنابراین خروجی برای کلاس های مختلف به شکل زیر می شود. </p>

```java
Class: (name: Base) (extends : Rest | implements: Face, MyFace)
Class: (name: Rest) (extends : Object | implements: Nothing)
Class: (name: Hi) (extends : Object)
Class: (name: Derived) (extends : Base)
```
<br>

#### InterfaceItem:
```java
public String toString() {
   return "Interface: " + "(name: " + this.name + ")";
}
```
<p dir="rtl">همچنین خروجی برای اینترفیس های مختلف: </p>

```java
Interface: (name: Face)
Interface: (name: MyFace)
```
<br>

#### MainClassItem:
```java
public String toString() {
   return "MainClass: " + "(name: " + this.name + ")";
}
```
<p dir="rtl"> خروجی برای کلاس اصلی: </p>

```java
MainClass: (name: Classes)
````
<br>

#### methodItem:

```java
public String toString(){
   String method = "Method: " +  "(name: " + name + ") (returnType: " + returnType + ") (accessModifier: "
           + accessModifier + ")";
   if (parametersTypes.size() == 0){
       return method;
   }
   String types = " (parametersType:";
   for (int i=0; i<parametersTypes.size(); i++){
       types += " [" +parametersTypes.get(i) + " , index: " + (i+1) + "] ";
   }

   return  method + types + ")";
}
```
<p dir="rtl"> خروجی برای متد های مختلف:</p>

```java
Method: (name: main) (returnType: void) (accessModifier: ACCESS_MODIFIER_PUBLIC) (parametersType: [array of [classType = String, isDefined = true] , index: 1] )

Method: (name: set) (returnType: int) (accessModifier: ACCESS_MODIFIER_PRIVATE) (parametersType: [array of int , index: 1] )

Method: (name: sayHi) (returnType: void) (accessModifier: ACCESS_MODIFIER_PRIVATE) (parametersType: [int , index: 1]  [bool , index: 2]  [[classType = Hi, isDefined = true] , index: 3]  [int , index: 4] )

Method: (name: get) (returnType: int) (accessModifier: ACCESS_MODIFIER_PUBLIC)
```
<br>

#### FieldItem:

```java
public String toString(){
   return "Field: " + "(name: " + name + ") (type: " + type + ") (accessModifier: " + accessModifier + ")";
}
```
<p dir="rtl"> خروجی برای فیلد های مختلف:</p>

```java
Field: (name: data) (type: array of int) (accessModifier: ACCESS_MODIFIER_PUBLIC)
Field: (name: d) (type: array of [classType = Rest, isDefined = true]) (accessModifier: ACCESS_MODIFIER_PRIVATE)
Field: (name: a) (type: array of int) (accessModifier: ACCESS_MODIFIER_PUBLIC)
Field: (name: myFace) (type: [classType = String, isDefined = true]) (accessModifier: ACCESS_MODIFIER_PUBLIC)
```
<br>




#### parameterItem:

```java
public String toString() {
   return "Parameter: " + "(name: " + name + ") (type: " + type + ") (index: " + index + ")";
}
```
<p dir="rtl">خروجی برای پارامتر های مختلف: <br>
برای هر پارامتر باید index ان که نشان دهنده جایگاه پارامتر در ورودی های متد است چاپ شود  )شروع از 1(
</p>

```java
Parameter: (name: four) (type: int) (index: 4)
Parameter: (name: three) (type: [classType = Hi, isDefined = true]) (index: 3)
Parameter: (name: one) (type: int) (index: 1)
Parameter: (name: two) (type: bool) (index: 2)
Parameter: (name: args) (type: array of [classType = String, isDefined = true]) (index: 1)
Parameter: (name: x) (type: array of int) (index: 1)
```
<br>



#### localVarItem:

```java
public String toString() {
   return "LocalVar: " + "(name: " + name + ") (type: " + type + ")";
}
```
<p dir="rtl"> خروجی برای متغیرهای لوکال مختلف:</p>

```java
LocalVar: (name: n) (type: bool)
LocalVar: (name: t) (type: array of [classType = Base, isDefined = true])
LocalVar: (name: d) (type: [classType = Derived, isDefined = true])
LocalVar: (name: b) (type: [classType = Base, isDefined = true])
```
<br>


#### Type
##### Boolean:
```java
public String toString() {
   return "bool";
}
```
##### Int:
```java
public String toString() {
   return "int";
}
```
##### classType:
```java
public String toString() {
   return "[classType = " + name + ", isDefined = " + isDefined + "]";
}
```
<p dir="rtl"> 
مقدار isDefined بیانگر این است که کلاس در برنامه تعریف شده است یانه.
</p>

<p dir="rtl"> خروجی برای تایپ کلاس مختلف:
</p>
```java
[classType = Derived, isDefined = true]
[classType = String, isDefined = true]
[classType = C, isDefined = false]
```
<br>



#### arrayType:

```java
public String toString() {
   return "array of " + type.toString();
}
```
<p dir="rtl"> خروجی برای متغیرهای لوکال مختلف:</p>

```java
array of [classType = Base, isDefined = true]
array of int
array of [classType = String, isDefined = true]
```
<br>

<p dir="rtl">برای چاپ accessModifier:</p>

```java
“ACCESS_MODIFIER_PUBLIC” or “ACCESS_MODIFIER_PRIVATE”
```
<br>


<h3 dir="rtl">نکات</h3>

>  <p dir="rtl"> گرامر از فاز قبل مقداری تغییر یافته است  لطفا  <a href="https://github.com/fazixa/CompilerDesignProjectDescription/blob/master/Documentation/MiniJava.g4">گرامر جدید </a> را بگیرید <p>


><p dir="rtl">شماره خط  شروع هر اسکوپ را در ابتدا به همراه نام آن نمایش میدهیم<p>

    -------------  Base : 18  -------------



>  <p dir="rtl"> در صورتی که یک جدول خالی می باشد باز هم نیاز به نمایش دادن آن هست. <p>

    -------------  nested : 39  -------------
    -----------------------------------------


>  <p dir="rtl"> در هنگام ذخیره سازی هر یک از اجزا در Symbol table نیاز است نوع آن را در کنار نام آن ذخیره کنید به عنوان مثال در قطعه کد زیر نیاز است کلاس Base را به صورت class_Base و متد set را به صورت method_set  در قسمت key ذخیره کنید. <p>

```java
class Base{
  private int set() {
  }
}
````





>  <p dir="rtl"> چند نمونه ورودی و خروجی در قسمت <a href="https://github.com/fazixa/CompilerDesignProjectDescription/blob/master/Documentation">Samples </a>  برای تست کردن کدتان آورده شده است <p>







> <p dir="rtl">کلیه قسمت های در نظر گرفته شده در این فاز را با توجه به فرضیات موجود
> در <a href="https://github.com/fazixa/CompilerDesignProjectDescription/blob/master/Documentation">داکیومنت این زبان  </a>انجام دهید.</p>

 > <p dir="rtl">توجه کنید که در این فاز نیازی به یافتن خطا ها نمیباشد و تنها ساخت
> جدول علائم برای یک قطعه کد کافیست.</p>



<h3 dir="rtl">موارد تحویلی</h3>

