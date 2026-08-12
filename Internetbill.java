import java.util.scanner;
class Internetbill{
public static void main(string args[]){
scanner sc=new scanner(system.in);
int acc NO;
string name,plan;
double prev,curr,usage,bill=0;
system.out.println("Enter Account Number:");
acc NO=sc.next Int();
sc.nextline();
system.out.println("Enter Account Holder Name:");
name=sc.nextline();
system.out.println("Enter previous Usage:");
prev=sc.nextDouble();
system.out.println("Enter Current Usage:");
curr=sc.nextDouble();
system.out.println("Enter Plan Type (basic/permium):");
plan=sc.next();
usage=curr-prev;
if(plan.equalsIgnorCase("basic")){
if(usage<=50)
bill=(50*20)+(usage-50)*30;
}else if(plan.equalsIgnorCase("premium"))
{
if(usage<=100)
bill=usage*15;
else
bill=(100*15)+(usage-100)*25;
}
system.out.println("ln Account Number:"+accNO);
system.out.println("Account Holder:"+name);
system.out.println("Plan Type:"+Plan);
system.out.println("Data Used:"+usage+"GB");
system.out.println("Monthly Bill:Rs."+bill);
