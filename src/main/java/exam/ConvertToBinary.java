package exam;

public class ConvertToBinary{

  public String toBinary(final int n) {
    int m;
    String x="";
    while(n>0)
    {
      int a=n%2;
      x=a+x;
      n=n/2;
    
  }
    return "x";
}
  public static void main(String[] args)
  {
    
    Scanner s= new Scanner(System.in);
    System.out.print("Enter the no:");
    n=s.nextInt();
    System.out.println(toBinary(n));
   }
}
