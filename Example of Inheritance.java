class SuperClass 
{
private int var1=10;
protected int var2=32;
public float var3=20.1f;
private int Sum(int a, int b)
{ 
return a+b;
}
private float Sum(float a, float b)
{
return a+b;
}
public void Display()
{
System.out.println("To get precise outputs consider entering the values with a decimal point");
SuperClass ob=new SuperClass();
int x=ob.Sum(5,6);
float y=ob.Sum(5.32f,6.12f);
System.out.println(x+"when added via integer");
System.out.println(y+"when added via floating integer");
}
}
class SubClass extends SuperClass
{
void accessTest()
{
    SubClass ob1=new SubClass();
//System.out.println(var1);
//System.out.println(var2);
System.out.println(var3);
//System.out.println(Sum(var1,var2));
//System.out.println(ob1.Sum(var3,var3));
super.Display();
}
}
