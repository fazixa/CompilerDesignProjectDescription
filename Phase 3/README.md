<h1 dir="rtl">فاز سوم</h1>
<h3 dir="rtl">مقدمه</h3>
<p dir="rtl">در فاز قبل پروژه به تکمیل جدول علایم و ذخیره موارد مورد نیاز به صورت سازماندهی شده پرداختیم. در فاز سوم پروژه می خواهیم با استفاده از جدول علایم به بررسی خطا های موجود در برنامه بپردازیم. خطا های لغوی و نحوی در فاز قبل پروژه بررسی شده اند بنابراین ما در این فاز خطاهای معنایی را بررسی خواهیم کرد.</p>




> <p dir="rtl"> پیاده سازی فاز قبل در <a href="https://github.com/fazixa/CompilerDesignProjectDescription/tree/master/Phase%203/src">این قسمت </a> در اختیار شما قرار داده شده است در صورتی که فاز قبل را پیاده سازی نمودید میتوانید کد خودتان را ادامه دهید و یا از کد آماده استفاده نمایید </p>

> <p dir="rtl"> 4  ارور اول در کد آماده پیاده سازی شده اند. چنانچه از کد آماده استفاده میکنید نیازی به پیاده سازی آنها نیست اما اگر میخواهید کد خودتان را ادامه دهید این 4 ارور را نیز پیاده سازی نمایید .</p>
<h3 dir="rtl">بررسی خطا</h3>
<p dir="rtl"></p>

<h3 dir="rtl"> فرمت گزارش خطا</h3>
<p dir="rtl">خطا های موجود در برنامه را بر اساس فرمت زیر گزارش دهید: </p>

> <p dir="rtl"> line  شماره خط ارور و column  پوزیشن آن را در یک خط نشان میدهد</p>
<ul dir="rtl">
<li>تعریف دوباره یک کلاس:</li>
</ul>

```
Error101 : in line  [line:column], class [name] has been defined already
```


<ul dir="rtl">
<li>  تعریف دوباره متد در یک کلاس :</li>
</ul>

```
Error102 : in line  [line:column] , method  [name] has been defined already
```

<ul dir="rtl">
<li>تعریف دوباره یک متغیر محلی در یک حوزه:</li>
</ul>

```
Error103 : in line  [line:column], var [name] has been defined already
```
<ul dir="rtl">
<li>تعریف دوباره یک خصیه در یک کلاس </li>
</ul>

```
Error104 : in line [line:column], field [name] has been defined already
```
> <p dir="rtl">  نکته:  دو نوع متفاوت میتوانند هم نام باشند به عنوان مثال اگر یک فیلد و متد هم اسم باشن مشکلی نیست
</p>


> <p dir="rtl"> نکته: در صورت تعریف دوباره یک کلاس، متد، فیلد یا لوکال اسم آن را عوض میکنیم و به سیمبل تیبل اضافه میکنیم و اسم آن را به این صورت ذخیره میکنیم: name_line_column 
</p>

> <p dir="rtl">  بعنوان مثال اگر متغییر d   دوباره تعریف شود آن را  به صورت d_34_48   ذخیره می نماییم
</p>

> <p dir="rtl">نکته:  هر کدام از موارد ذکر شده اگر دوبار تعریف شوند مورد دوم مطرح نیست و فرض میکنیم اصلا وجود ندارد  و  تنها از مورد اول استفاده میشود
</p>

> <p dir="rtl">  به عنوان مثال اگر یک کلاس دوبار تعریف شده باشد تنها میتوان از کلاس اول استفاده کرد
</p>




<ul dir="rtl">
<li>استفاده از یک کلاس تعریف نشده در یک حوزه : </li>
</ul>

```
Error105 : in line [line:column], cannot find  class [className] 
```
<ul dir="rtl">
<li>استفاده از یک متغیر یا خصیصه تعریف نشده :   </li>
</ul>

```
Error106 : in line [line:column], Can not find Variable [name]
```




---------------------



<ul dir="rtl">
<li>عدم تطابق نوع بازگشتی متد با نوع بازگشتی تعریف شده توسط متد:</li>
</ul>

```
Error210 : in line [line:column], ReturnType of this method must be [MethodReturnType]
```

<ul dir="rtl">
<li>تعداد و نوع پارامترهای متد در هنگام فراخوانی با تعداد پارامترهای رسمی در هنگام تعریف برابر نباشد: </li>
</ul>

```
Error220: in line [line:column], Mismatch arguments.
```

<ul dir="rtl">
<li>در دستورات انتساب نوع عملوند چپ و راست یکی نباشد:</li>
</ul>

```
Error 230 : in line [line:column], Incompatible types : [LeftType] can not be converted to [RightType]
```




<ul dir="rtl">
<li>نوع مقدار بازگشتی تابع باید همانند نوع مقدار بازگشتی تابع override شده کلاس پدر باشد:</li>
</ul>

```
Error240: in line [line:column], the return type of the overriding method must be the same as that of the overridden method
```


<ul dir="rtl">
<li>لیست آرگومان های تابع باید دقیقا با لیست آرگومان های تابع override شده یکی باشد.</li>
</ul>

```
Error250: in line [line:column], the parameters of the overriding method must be the same as that of the overridden method
```


<ul dir="rtl">
<li>خروجی متد main  حتما باید void  باشد.</li>
</ul>

```
Error260: in line [line:column], return type of main method must be void.
```





-------------------
<ul dir="rtl">
<li>متد ها و خصیصه های پرایوت یک کلاس در کلاس های دیگر قابل دسترسی نمی باشد.</li>
</ul>

```
Error310: in line [line:column], private methods or variables are not accessible outside of class.
```

<ul dir="rtl">
<li>سطح دسترسی تابع نمی تواند محدودتر از سطح دسترسی تابع override شده باشد:</li>
</ul>

```
Error320: in line [line:column], the access level cannot be more restrictive than the overridden method's access level
```

-----------------
<ul dir="rtl">
<li>وجود دور در ارث بری :</li>
</ul>

```
Error410 : Invalid inheritance [classname1] -> [classname2] -> [classname3] …
```


<ul dir="rtl">
<li>در صورت  implement کردن یک کلاس باید تمامی متد های این کلاس پیاده سازی شوند :</li>
</ul>

```
Error420: Class [className] must implement all abstract methods
```

<ul dir="rtl">
<li>ارث بردن از کلاس    String</li>
</ul>

```
Error430: in line [line:column], class [ClassName] can not inherits from class String
```




<ul dir="rtl">
<li>تنها توابعی از کلاس پدر که توسط فرزند ارث بری شده اند می توانند override شوند:</li>
</ul>

```
Error440: in line [line:column], method does not override method from its superclass.
```










<br>
<p dir="rtl">  برای چاپ کردن ارور ها از ساختار زیر استفاده کنید</p>

```
public String toString(){
        return "Error" + type + " : in line " + line + ":" + column + " , " + text;
    }
```









