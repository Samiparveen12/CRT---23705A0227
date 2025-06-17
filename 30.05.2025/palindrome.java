 class Palindrome{
    public static void main(String[] args) {
  int num=131;
  int rev=0;
  int copy=num;
  while(copy>0){
      int digit=copy%10;
      rev=rev*10+digit;
      copy=copy/10;
  }
  if(rev==num){
      System.out.println("number is palindrome");
  }
      else{
          System.out.println("number is not palindrome");
      }
  }
}