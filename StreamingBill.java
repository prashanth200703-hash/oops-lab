import java.util.Scanner;
class Subscriber{
private int subscriberID;
private String subscriberName;
private boolean prevMonthStatus;
private boolean currMonthStatus;
private String subscriptionType;
public Subscriber(int id,String name,boolean prevStatus,boolean currStatus,String Type){
this.subscriberID=id;
this.subscriberName=name;
this.prevMonthStatus=prevStatus;
this.currMonthStatus=currStatus;
this.subscriptionType=Type;
}
public int calculateBill(){
if(!currMonthStatus){
return 0;
}
switch(subscriptionType.toLowerCase()){
case "basci":
return 199;
case "standard":
return 499;
case "premium":
return 799;
default:
return 0;
}
}
public void displayBill(){
System.out.println("-----Monthly Subscription Bill-----");
System.out.println("Subscriber ID:"+subscriberID);
System.out.println("Subscriber Name:"+subscriberName);
System.out.println("Previous Status:"+(prevMonthStatus?"Active":"Inactive"));
System.out.println("Current Status:"+(currMonthStatus?"Active":"Inactive"));
System.out.println("Subscription Type:"+subscriptionType);
System.out.println("Monthly charge:Rs."+calculateBill());
System.out.println("-------------");
}
}
public class StreamingBill{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Subscriber ID:");
int id=sc.nextInt();
sc.nextLine();
System.out.print("Enter Subscriber Name:");
String name=sc.nextLine();
System.out.print("Was subscription active last month?(true/fales):");
boolean prevStatus=sc.nextBoolean();
System.out.print("Is subscription active this month?(true/fales):");
boolean currStatus=sc.nextBoolean();
sc.nextLine();
System.out.print("Enter Subscription Type(Basic/Standrad/Premium):");
String type=sc.nextLine();
Subscriber Sub=new Subscriber(id,name,prevStatus,currStatus,type);
Sub.displayBill();
sc.close();
}
}
