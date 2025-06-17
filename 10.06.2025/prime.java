import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=scan.nextInt();
        int factors=0;
        for(int i=1;i<=n;i++){
        if(n%i==0){
            factors++;
        }
        }
        
        
    if(factors==2){
        System.out.println("prime");
        }
        else{
             System.out.println("not a prime");
             }