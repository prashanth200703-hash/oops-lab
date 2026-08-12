import java.util.Scanner;
abstract class LibraryMember{
int memberId;
String name,email,phone;
LibraryMember(int memberId,String name,String email,String phone){
this.memberId=memberId;
this.name=name;
this.email=email;
this.phone=phone;
}
void display(){
System.out.println("Member ID:"+member);
System.out.println("Name :"+name);
System.out.println("Email :"+email);
System.out.println("Phone :"+phone);
}
abstract void generateSummary();
}
class StudentMember extends LibraryMember{
StudentMember(int id,String name,String email,String phone){
super(id,name,email,phone);
}
void generateSummary(){
System.out.println("\n-----Student Member-----");
display();
system.out.println("Borrowing Limit :5 Books");
system.out.println("Penalty Per Day :Rs.2");
system.out.println("Annual Membership Fee:Rs.200");
}
}
class FacultyMember extends LibraryMember{
FacultyMember(int id,String name,String email,String phone){
super(id,name,email,phone);
}
void generateSummary(){
System.out.println("\n-----Faculty Member-----");
display();
system.out.println("Borrowing Limit :10 Books");
system.out.println("Penalty Per Day :Rs.3");
system.out.println("Annual Membership Fee:Rs.500");
}
}
class ExternalMember extends LibraryMember{
ExternalMember(int id,String name,String email,String phone){
super(id,name,email,phone);
}
void generateSummary(){
System.out.println("\n-----External Member-----");
display();
system.out.println("Borrowing Limit :3 Books");
system.out.println("Penalty Per Day :Rs.5");
system.out.println("Annual Membership Fee:Rs.1000");
}
}
public class Main{
public static void main(String[]args){
Scannersc=new Scanner(System.in);
System.out.print("Enter Member ID:");
int id=sc.nextInt();
sc.nextLine();
System.out.print("Enter Name:");
String name=sc.nextLine();
System.out.print("Enter Email:");
String email=sc.nextLine();
System.out.print("Enter Phone:");
String phone=sc.nextLine();
system.out.println("\nSelect Member Type");
system.out.println("1. Student");
system.out.println("2. Faculty");
system.out.println("3. External");
system.out.print("Enter Choice:");
int choice=sc.nextInt();
switch(choice){
case 1:
StudentMember s=new StudentMember(id,name,email,phone);
s.generateSummary();
break;
case 2:
FacultyMember f=new FacultyMember(id,name,email,phone);
f.generateSummary();
break;
case 3:
ExternalMember e=new ExternalMember(id,name,email,phone);
e.generateSummary();
break;
default:
system.out.println("Invalid Choice");
}
sc.close();
}
}
