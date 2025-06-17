class SumOfDigitsEven{
    public static void main(String[] args) {
  int num=4521;
  int sum=0;
  while(num>0){
      int digit=num%10;
      sum=sum+digit;
      num=num/10;
  }
  if(sum%2==0){
  System.out.println("sum of digits is even");
    }
}
}