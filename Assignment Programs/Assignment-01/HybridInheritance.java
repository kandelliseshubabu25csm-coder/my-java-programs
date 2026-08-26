package javaproject;

class fir{
 int a =10, b=90;
 void rif(){
     System.out.println(" addition is " + (a+b));
 }
}
class sec extends fir{
 double c = 2.34f,d = 4.56f;
 void ces(){
     System.out.println(" th eresult is " + (c+d));
 }
}
//multi inheritance are starting 
class thi extends sec{
 String name ="seshu, phk";
 
 void hit(){
     System.out.println(" name is" + name);
 }
}
class four extends sec{
 int f =32,g=34;
 void rouf(){
     System.out.println(" result is " + (f*g));
 }
}

public class HybridInheritance {
 public static void main(String[] args) {
//we can create object for 4 th sub class 
     four oj = new four();
     oj.rouf();
 oj.ces();
 oj.ces();
 sec jo = new sec();
 jo.rif();
 jo.ces();
thi joj = new thi();
joj.hit();
joj.ces();



 }
}

