import java.util.*;
class PersonDetails
{
protected static ArrayList<String>fullName = new ArrayList<String>();
protected static ArrayList<String>phoneNumber = new ArrayList<String>();
protected static ArrayList<String>time = new ArrayList<String>();
protected static ArrayList<String>day = new ArrayList<String>();
}
public class Appointment extends PersonDetails
{
//Choose Differnt option for fill Details
public static void appointment()
{
Scanner user = new Scanner(System.in);
System.out.println("choose the option from below");
while(true)
{
//display the menu
System.out.println();
System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("----------------------------------------------------Main Menu---------------------------------------------------------------------------");
System.out.println("------------------------------------------------Maya Home Cleaning----------------------------------------------------------------------");
System.out.println("---------------------------------------Welcone to our online Appointment setup----------------------------------------------------------\n");
System.out.println("----------------------------------------------------------------------------------------------------------------------------------------\n");
System.out.println("Select the option in bellow");
System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

//ask for option
System.out.println(" 1)SetAppointment \n 2)Update Appointment \n 3)Cancel the Appointment\n 4)Show Appinments Details\n 5) Exit");
int select = user.nextInt();
switch(select)// make selection for the operation
{
case 1:
setAppointment(); //set new appointment
break;
case 2:
updateAppointment(); //update appointment
break;
case 3:
cancelAppointment(); //cancel the appointment
break;
case 4:
showAppointment(); //show the appointment report
break;
case 5:
System.exit(0);// end the program
break;
default:
System.out.println("Invalid Input"); //fir user not select the write option
}
}
}
//this function is to make appointment
public static void setAppointment()
{
Scanner sc = new Scanner(System.in);

while(true)//if want another appointment
{
System.out.println("---------------------------Make an Appointment---------------------------");
//get the information of the user
System.out.println("Street Address: 13325 Heacock st");
System.out.println("Opposite heigh school Walk");
System.out.println("Contact:(951)-455-9913");
System.out.println();System.out.println();
System.out.println("Set new Appointment");
System.out.println("Enter the Full Name of person: ");
fullName.add(sc.nextLine());
System.out.println("Enter the Phone Number:");
phoneNumber.add(sc.nextLine());
System.out.println("Enter the time of Appintment: ");
time.add(sc.nextLine());
System.out.println("Enter the day of Appintment: ");
day.add(sc.nextLine());

System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
//ask if they want another appointment
System.out.println( "Do you want to set another Apointment details select y/n");
String choose = sc.nextLine();
if(choose.equalsIgnoreCase("y"))
{
continue;
}
else if(choose.equalsIgnoreCase("n"))
{
System.out.println("Thank you");
break;
}
else
System.out.println("Invalide input");

}
}
//this function will update the your appointment
public static void updateAppointment() 
{
Scanner edit = new Scanner(System.in);
System.out.println( "Enter the Full name of person whose details want to edit"); //get the name of person
String editDetails = edit.next();
int pos = fullName.indexOf(editDetails);
if(fullName.contains(editDetails)) //check if the person exist
{
System.out.println();

//geting new information
System.out.println("");
fullName.set(pos,edit.nextLine());
System.out.println("Enter the Full Name of person: ");
fullName.set(pos,edit.nextLine());
System.out.println("Enter the Phone Number:");
phoneNumber.set(pos,edit.nextLine());
System.out.println("Enter the time of Appintment: ");
time.set(pos,edit.nextLine());
System.out.println("Enter the day of Appintment: ");
day.set(pos,edit.nextLine());
}
else //if the use enter wrong number
System.out.println("inavalid Person name");
}

//this for if you want to cancel the appointment
public static void cancelAppointment(){
Scanner delete = new Scanner(System.in);
System.out.println("-----------------------------------------------------Cancel Appointment-----------------------------------------------------------------");

System.out.print("Enter the Full name of person whose Appointment want to cancel");
String deleteName = delete.next();
int position = fullName.indexOf(deleteName);
if(fullName.contains(deleteName))
{
Scanner SC = new Scanner(System.in);
System.out.println("Do you want to delete the details? select y/n");
String check = SC.next();
if(check.equalsIgnoreCase("y")){
fullName.remove(position);
phoneNumber.remove(position);

}
else if(check.equalsIgnoreCase("n"))
System.out.println("you Selected 'NO'");
}
else //if the use enter wrong number
System.out.println("inavalid Person name");
}

//show the appointment that you made
public static void showAppointment()
{
Scanner shows = new Scanner(System.in);
System.out.println();
//geting the name of person that you want to see
System.out.println("-----------------------------------------------------Record Appointment-----------------------------------------------------------------");
System.out.println("Enter the Full name of person whose Appointment details want to show");
String showName = shows.next();
int position =fullName.indexOf(showName);
if(fullName.contains(showName))
{
System.out.println();
System.out.println("-----------------------------------------------------Your Appointment Information-----------------------------------------------------------------");
System.out.println("Coustomer number is\t\tTime of appointment is\t\tDay of the Appointment is\n");
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
//show the result here

System.out.print(phoneNumber.get(position));
System.out.print("\t\t\t");
System.out.print(time.get(position));
System.out.print("\t\t\t\t");
System.out.print(day.get(position));


}
else
System.out.println("This Person Appointment is not set ");
}
public static void main(String[] args)
{
Appointment makeAppoinment = new
Appointment();
makeAppoinment.appointment();

}
}
