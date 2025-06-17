class PrimeNumber{
    public static void main(String[] args) {
  int n=6;
  int count=0;
  for(int i=1;i<=n;i++){
      if(n%i==0){
          count=count+1;
      }
  }
  if(count==2){
      System.out.println("prime number:");
  }
  else{
      System.out.println("not prime number:");
  }
    }
}