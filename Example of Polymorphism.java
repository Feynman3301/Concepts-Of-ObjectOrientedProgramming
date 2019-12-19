/*used by the means of: methodName() or methodName(int x, float y,...) in static form 
and as parentClass.methodName() or childClass.methodName() in dynamic form*/
class Polymorphism
{
    private float Sum(float a,float b)
  {
    return a+b;
  }
  private int Sum(int a, int b)
  {
    return a+b;
  }
 public void Input()
 {
     Polymorphism ob=new Polymorphism();
    System.out.println("For accurate sum");
    float a=ob.Sum(904.45f,654.2132f);
   System.out.println("For accurate sum");
    int b=ob.Sum(904,654);
 }
}
class Multiply extends Polymorphism
{
private float Multiply(float a,float b)
  {
    return a*b;
  }
  private int Multiply(int a, int b)
  {
    return a*b;
  }
 public void Input()
 {
    Multiply x=new Multiply();
    System.out.println("For accurate multiplication");
    float a=x.Multiply(904.45f,654.2132f);
   System.out.println("For accurate multiplication");
    int b=x.Multiply(904,654);
 }
}
class Divide extends Multiply
{
private float Divide(float a,float b)
  {
    return a/b;
  }
  private int Divide(int a, int b)
  {
    return a/b;
  }
 public void Input()
 {
    Divide x=new Divide();
    System.out.println("For accurate division");
    float a=x.Divide(904.45f,654.2132f);
   System.out.println("For accurate division");
    int b=x.Divide(904,654);
}
public static void main(String args[])
{
    Polymorphism test;
    test=new Polymorphism();
    test.Input();
    test=new Multiply();
    test.Input();
    test=new Divide();
    test.Input();
}
}
