class Main{
     public static void main(String[]args){
         student s1=new student();
         System.out.println(s1.name);
         System.out.println(s1.roll);
         System.out.println(s1.attendence());
         s1.payfee(10000);
     }
 }

class student {
    
   String name="divi";
   String roll="23705A0210";
   String branch="EEE";
   byte year='3';
   char section='B';
   void payfee(int amount){
       System.out.println("paying:"+amount+"to the college");
   }
   int attendence(){
       System.out.println("sending the attendence to the student");
       return 80;
   }
   }