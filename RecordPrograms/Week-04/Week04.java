package packagecodejava;
class order{
private String date;
private  String number;

public order(String date , String number){
   this.date = date;
   this.number = number;
}
public void confirm(){
   System.out.println("order" + number + "confirm on "+ date);
}

public void close(){
   System.out.println("order " + number + "closed");
}
}
class specialorder extends order{
public specialorder(String date , String number){
   super("date"  , "number");
}
public void dispatch(){
   System.out.println("specialorder is "  +  "dispatched");
}

}
class normalorder extends order{
   public normalorder(String date , String number){
   super("date" , " number");
}
public void dispatch(){
   System.out.println("normalorder is "  +  "dispatched");
}
public void receive(){
   System.out.println("normalorder is" + "received by customer");
}
}

class customer{
private String name;
private  String location;
public customer(String name , String location){
   this.name = name;
   this.location = location;
}
  public void sendorder( order order){
       System.out.println(name + "from" + location + "sent an order");
   }

   void receiveorder(order order){
       System.out.println(name + "received order");
       order.close();
   }
}

public class Week04 {
   public static void main(String[] args) {

customer c = new customer("Seshu", "vizag");
specialorder so = new specialorder("12th august", "44");
c.sendorder(so);
so.dispatch();
c.receiveorder(so);
System.out.println();
normalorder no = new normalorder("13th august", "82");
c.receiveorder(no);
no.dispatch();
no.receive();
c.receiveorder(no);        
   }
}

