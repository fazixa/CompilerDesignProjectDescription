<h1 dir="rtl">فاز سوم</h1>
<h3 dir="rtl">مقدمه</h3>
<p dir="rtl">در فاز قبل پروژه به تکمیل جدول علایم و ذخیره موارد مورد نیاز به صورت سازماندهی شده پرداختیم. در فاز سوم پروژه می خواهیم با استفاده از جدول علایم به بررسی خطا های موجود در برنامه بپردازیم. خطا های لغوی و نحوی در فاز قبل پروژه بررسی شده اند بنابراین ما در این فاز خطاهای معنایی را بررسی خواهیم کرد.</p>

<h3 dir="rtl">بررسی خطا</h3>
<p dir="rtl"></p>

<h3 dir="rtl"> فرمت گزارش خطا</h3>
<p dir="rtl">خطا های موجود در برنامه را بر اساس فرمت زیر گزارش دهید: </p>

<ul dir="rtl">
<li>تعریف دوباره یک کلاس:</li>
</ul>

```
Error101 : in line [lineNumber] , [className] has been defined already
```


<ul dir="rtl">
<li>  تعریف دوباره متد یا خصیصه در یک کلاس :</li>
</ul>

```
Error102 : in line [lineNumber] , [Name] has been defined already in [className] 
```

<ul dir="rtl">
<li>تعریف دوباره یک متغیر محلی در یک حوزه:</li>
</ul>

```
Error103: in line [lineNumber] , [Name] has been defined already  in current scope
```
<ul dir="rtl">
<li>عدم وجود متد اصلی در برنامه: </li>
</ul>

```
Error104 : Can not find main method  
```
<ul dir="rtl">
<li>استفاده از یک کلاس تعریف نشده در یک حوزه : </li>
</ul>

```
Error105 : in line [lineNumber] , cannot find  class [className] 
```
<ul dir="rtl">
<li>استفاده از یک متغیر یا خصیصه تعریف نشده :   </li>
</ul>

```
Error106 : in line [lineNumber] , Can not find Variable [name]
```
<ul dir="rtl">
<li>وجود دور در ارث بری :</li>
</ul>

```
Error107 : Invalid inheritance [classname1] -> [classname2] -> [classname3] …
```
<ul dir="rtl">
<li>عدم تطابق نوع بازگشتی متد با نوع بازگشتی تعریف شده توسط متد:</li>
</ul>

```
Error210 : in line [lineNumber], ReturnType of this method must be [MethodReturnType]
```

<ul dir="rtl">
<li>تعداد و نوع پارامترهای متد در هنگام فراخوانی با تعداد پارامترهای رسمی در هنگام تعریف برابر نباشد: </li>
</ul>

```
Error220: in line [lineNumber], Mismatch arguments.
```

<ul dir="rtl">
<li>در دستورات انتساب نوع عملوند چپ و راست یکی نباشد:</li>
</ul>

```
Error 230 : in line [lineNumber] , Incompatible types : [LeftType] can not be converted to [RightType]
```
-----------------------
<ul dir="rtl">
<li>در صورت  implement کردن یک کلاس باید تمامی متد های این کلاس پیاده سازی شوند :</li>
</ul>

```
Error: Class [className] must implement all abstract methods
```

<ul dir="rtl">
<li>ارث بردن از کلاس های   String, Bool, Int</li>
</ul>

```
Error: in line [lineNumber], class [ClassName] can not inherits from class [superClassName]
```

<ul dir="rtl">
<li>تنها توابعی از کلاس پدر که توسط فرزند ارث بری شده اند می توانند override شوند:</li>
</ul>

```
Error: in line [lineNumber], Only inherited methods can be overridden.
```

<ul dir="rtl">
<li>سطح دسترسی تابع نمی تواند محدودتر از سطح دسترسی تابع override شده باشد:</li>
</ul>

```
Error: in line [lineNumber], he access level cannot be more restrictive than the overridden method's access level
```

<ul dir="rtl">
<li>نوع مقدار بازگشتی تابع باید همانند نوع مقدار بازگشتی تابع override شده کلاس پدر باشد:</li>
</ul>

```
h
```


<ul dir="rtl">
<li>لیست آرگومان های تابع باید دقیقا با لیست آرگومان های تابع override شده یکی باشد.</li>
</ul>

```
h
```

<ul dir="rtl">
<li>خروجی متد main  حتما باید void  باشد.</li>
</ul>

```
h
```

<ul dir="rtl">
<li>عدم تعریف یک متد با نام  : length</li>
</ul>

```
h
```

<ul dir="rtl">
<li></li>
</ul>

```
h
```









