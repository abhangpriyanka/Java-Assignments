package practicalPractice;

public class date 
{
int dd;
int yy;
int mm;
date()
{
	dd=0;
	yy=0;
	mm=0;
}
date(int dd,int mm,int yy)
{
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
}
public String toString()
{
	return dd+"/"+mm+"/"+yy;
}
}
