

public class PersonGenerator{

    public static void main(String[] args) {
	ArrayList<Person> persons=new ArrayList<Person>();
	Scanner sc = new Scanner(System.in);
	String id,fn,ln,title,choice;
	int yob;
	do {
        System.out.println("Add Person\n");
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter First Name  ");
        fn = sc.nextLine();
        System.out.print("Enter Last Name  ");
        ln = sc.nextLine();
        System.out.print("Enter Title ");
        title = sc.nextLine();
        System.out.print("Enter YOB ");
        yob = sc.nextLine();
        persons.add(new Person(id, fn, ln, title, yob));
        System.out.println("Want to add another person?(Y/N");
        sc.nextLine();
        choice = sc.nextLine();
    } while ("Y".equals(choice)) ;  choice.equals("Y");
try  {FileWriter myWriter = new FileWriter ("Persons.txt");
    for (int i = 0; i < persons.size(); i++) myWriter.write(persons.get(i).toCSVDataRecord() + "\n");

      myWriter.close();
    }  catch (IOException e) {
    System.out.println("An error occurred.");
    e.printstackTrace();
}



















    }
}
