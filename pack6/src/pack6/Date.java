package pack6;

class Date
{
int intDay, intMonth, intYear;
public Date(int day,int month,int year)
{
	this.intDay=day;
	this.intMonth=month;
	this.intYear=year;
}
void setDay(int intDay)
{
this.intDay = intDay;
}
int getDay( )
{
return this.intDay;
}
void setMonth(int intMonth)
{
this.intMonth = intMonth;
}
int getMonth( )
{
return this.intMonth;
}
void setYear(int intYear)
{
this.intYear=intYear;
}
int getYear( )
{
return this.intYear;
}
public String toString()
{
return Integer.toString(intDay)+"/"+Integer.toString(intMonth)+"/"+Integer.toString(intYear);
}
}
