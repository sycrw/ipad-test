public class test{
  static int one =40;
  public static void main(String[] args){
    System.out.println(one);
    System.out.println("Quersumme: " +quersumme(one));
    System.out.println("Sum: "+sum(one));
    System.out.println("Fact: "+fact(one));
  }
  public static long quersumme(long n){
     if(n>0){
        return (n%10)+quersumme(n/10);
    }
    else{
        return 0;
    }
  }
  public static long sum(long n){
    if(n == 0){
      return 0;
    }
    else{
      return n + sum(n-1);
    }
  }
  public static long fact(long n){
    if(n==1){
      return 1;
    }else if(n<=0){
      return 1;
    }
    else{
      return n * fact(n-1);
    }
  }
}
