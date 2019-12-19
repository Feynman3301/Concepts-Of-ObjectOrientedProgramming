//used by the means of:private getData() setData()
class Encapsulation
{
  public String Name="alex";
  private int mm,dd,yyyy;
  private String ssn;
  private void ChangeSSN(String s)
  {
    ssn=s;
  }
  private void ChangeDOB(int a,int b,int c)
  {
    mm=a;dd=b;yyyy=c;
  }
  public int getDate(String s)
  { 
    return dd;
  }
  public int getMonth(String s)
  {
    return mm;
  }
  public int getYear(String s)
  {
    return yyyy;
  }
  public String getSSN(String s)
  {
    return ssn;
  }
  public static void main(String args[])
  {
    Encapsulation ob=new Encapsulation();
    ob.ChangeSSN("123453231");
    ob.ChangeDOB(05,09,1458);
    ob.getDate("alex");
    ob.getMonth("alex");
    ob.getYear("alex");
    ob.getSSN("alex");
  }
}
class Access extends Encapsulation
{
    Access ob=new Access();
    super.ob.ChangeSSN("123453231");
     super.ob.ChangeDOB(05,09,1458);
     super.ob.getDate("alex");
     super.ob.getMonth("alex");
     super.ob.getYear("alex");
     super.ob.getSSN("alex");
}
 
  
  
  
