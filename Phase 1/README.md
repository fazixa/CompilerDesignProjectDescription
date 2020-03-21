
<h1 dir="rtl">فاز اول</h1>

<h3 dir="rtl"> مقدمه</h3>
<p dir="rtl">
هدف از این پروژه طراحی کامپایلر زبان مینی جاوا می باشد . طراحی این کامپایلر به صورت فاز به فاز پیش خواهد رفت بنابراین فاز های بعدی ادامه همین قسمت خواهند بود .
سند زیان مینی جاوا <a href="https://www.aparat.com/v/1pnKe/%D8%AA%D9%88%D8%B6%DB%8C%D8%AD_%D9%BE%D8%B1%D9%88%DA%98%D9%87_%DA%A9%D8%A7%D9%85%D9%BE%D8%A7%DB%8C%D9%84%D8%B1_%D8%AF%D8%A7%D9%86%D8%B4%DA%AF%D8%A7%D9%87_%D9%81%D8%B1%D8%AF%D9%88%D8%B3%DB%8C_%D9%85%D8%B4%D9%87%D8%AF_2019">اینجا </a> در اختیار شما قرار گرفته است. در این فاز از شما انتظار می رود پس از مطالعه سند این زبان و آشنایی با قواعد آن، برای یک ورودی که قطعه کدی به زبان مینی جاوا است خروجی مورد نظر که توضیحات آن در ادامه است را تولید نمایید.
فاز یکم پروژه صرفا جهت آشنایی شما با قواعد زبان Minijava و ابزار ANTLR  فراگیری چگونگی خروجی گرفتن از توابع طراحی شده است و  بسیار ساده می باشد.

</p>


<h3 dir="rtl">توضیحات</h3>

<p dir="rtl">
ابتدا فابل های مربوط به پروژه را از همین ریپازیتوری clone کنید
 سپس با توجه به <a href="https://www.aparat.com/v/1pnKe/%D8%AA%D9%88%D8%B6%DB%8C%D8%AD_%D9%BE%D8%B1%D9%88%DA%98%D9%87_%DA%A9%D8%A7%D9%85%D9%BE%D8%A7%DB%8C%D9%84%D8%B1_%D8%AF%D8%A7%D9%86%D8%B4%DA%AF%D8%A7%D9%87_%D9%81%D8%B1%D8%AF%D9%88%D8%B3%DB%8C_%D9%85%D8%B4%D9%87%D8%AF_2019">این ویدئو</a>  به راه اندازی اولیه پروژه بپردازید. در این ویدئو  چگونگی عملکرد گرامر ها و طرز کار با listener ها نیز توضیح داده شده است. (توجه فرمایید ویدئو مربوط به پروژه ترم های گذشته می باشد)
 <p dir="rtl">
با توجه به ویدئو شما باید پس از ایمپورت کردن یک قطعه کد مینی جاوا،  با استفاده از Listener ها یک خروجی تولید نمایید. این خروجی  نمایگر اجزای مختلف قطعه کد ورودی و جزئیات آن است .




</p>

<p dir="rtl">
 شکل کلی خروجی مورد نظر به صورت زیر است.
مواردی که داخل [ ] قرار ندارند نشان دهنده اجزای مختلف یک برنامه در حالت کلی می باشد (کلاس، اینترفیس، متغیر و ...) و باید عینا در خروجی  نوشته  شوند. موارد داخل [ ]  وابسته به قطعه کد ورودی می باشد و در واقع توضیحی برای هر جزء هستند(نام کلاس ها، نام اینترفیس ها، نام متغیرها، نوع متغیر ها و.....) که باید  توسط شما با توجه به قطعه کد ورودی تکمیل شوند.



</p>

```java
program start{
	[program body]
}

import class: [class name]

main class: [class name]{
}

class: [class name]/ class parents: ([parent name], )*{
	[class body]
}

Interface: [interface name]{
	[interface body]
}

Interface method: [method name]/ return type=[return type]/ access modifier=[access modifier]
(parameters list= [  ([[parameter type] [parameter name]], )+])?

field: [field name]/ type=[type]/ access modifier=[access modifier] 

local var: [var name]/ type=[type]

class method: [method name]/ return type=[return type]/ access modifier=[access modifier]{
	(parameters list= [  ([[parameter type] [parameter name]], )+])?
	[method body]
}

nested statement{
}
```
<p dir="rtl">
در ادامه یک نمونه ورودی و خروجی برای درک بهتر آورده شده است.
</p>

#### Input:
```java
import sdf;
class BinarySearch{public static void main(String[] a){

    int sffs;
	System.out.println(new BS().Start(20));
    }


}

interface sf{
    jdshfk sdfd = 12;
    sdf sfsf();
}


class BS extends sf{ int[] number ;int size ; public int Start(int sz){
	int aux01 ;
	int aux02 ;
	aux01 = null;
		aux02 = this.Print();
		aux01 = this.Init(sz);
	if (this.Search(8)) System.out.println(1) ;
	else System.out.println(0) ;
	if (this.Search(19)) System.out.println(1) ;
	else System.out.println(0) ;
	if (this.Search(20)) System.out.println(1) ;
	else System.out.println(0) ;
	if (this.Search(21)) System.out.println(1) ;
	else System.out.println(0) ;
	if (this.Search(37)) System.out.println(1) ;
	else System.out.println(0) ;
	if (this.Search(38)) System.out.println(1) ;
	else System.out.println(0) ;
	if (this.Search(39)) System.out.println(1) ;
	else System.out.println(0) ;
	if (this.Search(50)) System.out.println(1) ;
	else System.out.println(0) ;

	return 999 ;
    }


    // Search for a specific value (num) using
    // binary search
    private boolean Search(int num){
	boolean bs01 ;
	int right ;
	int left ;
	boolean var_cont ;
	int medium ;
	int aux01 ;
	int nt ;

	bs01 = false ;
		right = number.length ;
		right = right - 1 ;
		aux01 = 1 ;
		left = 0 ;
	var_cont = true ;
	while (var_cont){
	    medium = left + right ;
	    medium = this.Div(medium);
	    aux01 = number[medium] ;
	    if (num < aux01) right = medium - 1 ;
	    else left = medium + 1 ;
	    if (this.Compare(aux01,num)) var_cont = false ;
	    else var_cont = true ;
	    if (right < left) var_cont = false ;
	    else nt = 0 ;
	}

	if (this.Compare(aux01,num)) bs01 = true ;
	else bs01 = false ;
	return bs01 ;
    }

    // This method computes and returns the
    // integer division of a number (num) by 2
    public int Div(int num){
	int count01 ;
	int count02 ;
	int aux03 ;

	count01 = 0 ;
	count02 = 0 ;
	aux03 = num - 1 ;
	while (count02 < aux03) {

	    int sdff;
	    count01 = count01 + 1 ;
	    count02 = count02 + 2 ;
	}
	return count01 ;	
    }


    // This method compares two integers and
    // returns true if they are equal and false
    // otherwise
    public boolean Compare(int num1 , int num2){
	boolean retval ;
	int aux02 ;

	retval = false ;
	aux02 = num2 + 1 ;
	if (num1 < num2) retval = false ;
	else if (!(num1 < aux02)) retval = false ;
	else retval = true ;
	return retval ;
    }

    // Print the integer array
    public int Print(){
	int j ;

	j = 1 ;
	while (j < (size)) {
	    System.out.println(number[j]);
	    j = j + 1 ;
	}
	System.out.println(99999);
	return 0 ;
    }
    

    // Initialize the integer array
    public int Init(int sz){
	int j ;
	int k ;
	int aux02 ;
	int aux01 ;

	size = sz ;
	number = new int[sz] ;
	
	j = 1 ;
	k = size + 1 ;
	while (j < (size)) {
	    aux01 = 2 * (j + 1) ;
	    aux02 = k - 3 ;
	    number[j] = aux01 + aux02 ;
	    j = j + 1 ;
	    k = k - 1 ;
	}
	return 0 ;	
    }

}

```
#### Output:
```java
program start{
	Import class: sdf
	define main class: BinarySearch{
		local var: sffs/ type=int
	}
	define new interface: sf{
		field: sdfd/ type=jdshfk/ access modifier=public
		interface method: sfsf/ return type=sdf/ access modifier=public
	}
	define new class: BS/ class parents: {
		field: number/ type=int[]/ access modifier=public
		field: size/ type=int/ access modifier=public
		class method: Start/ return type=int/ access modifier=public{
			parameters list: [int sz, ]
			local var: aux01/ type=int
			local var: aux02/ type=int
		}
		class method: Search/ return type=boolean/ access modifier=private{
			parameters list: [int num, ]
			local var: bs01/ type=boolean
			local var: right/ type=int
			local var: left/ type=int
			local var: var_cont/ type=boolean
			local var: medium/ type=int
			local var: aux01/ type=int
			local var: nt/ type=int
			{
			}
		}
		class method: Div/ return type=int/ access modifier=public{
			parameters list: [int num, ]
			local var: count01/ type=int
			local var: count02/ type=int
			local var: aux03/ type=int
			{
				local var: sdff/ type=int
			}
		}
		class method: Compare/ return type=boolean/ access modifier=public{
			parameters list: [int num1, int num2, ]
			local var: retval/ type=boolean
			local var: aux02/ type=int
		}
		class method: Print/ return type=int/ access modifier=public{
			local var: j/ type=int
			{
			}
		}
		class method: Init/ return type=int/ access modifier=public{
			parameters list: [int sz, ]
			local var: j/ type=int
			local var: k/ type=int
			local var: aux02/ type=int
			local var: aux01/ type=int
			{
			}
		}
	}
}

```
<p dir="rtl">
توجه داشته باشید از شما خواسته شده است همانند مثال بالا دندانه گذاری (Indentation) بلاک های کد را در خروجی برآورده سازید. به این معنی که خطوط خروجی می بایستد با توجه جایگاهشان در ساختار کد با فاصله مناسب از ابتدای خط چاپ شوند. هر indent level چهار عدد space می باشد.
</p>

موفق باشید