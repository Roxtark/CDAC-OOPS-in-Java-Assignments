class Employee {
    String name;
    int yearOfJoining;
    float salary;
    String address;

    Employee(String name, int yearOfJoining, float salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    void display() {
        System.out.println(name + "\t" + yearOfJoining + "\t" + salary + "\t" + address);
    }

    public static void main(String[] args) {

        System.out.println("Enter details of Employee 1");

        System.out.println("Enter name:");
        String name1 = ConsoleInput.getString();

        System.out.println("Enter year of joining:");
        int year1 = ConsoleInput.getInt();

        System.out.println("Enter salary:");
        float salary1 = ConsoleInput.getFloat();

        System.out.println("Enter address:");
        String address1 = ConsoleInput.getString();

        System.out.println("Enter details of Employee 2");

        System.out.println("Enter name:");
        String name2 = ConsoleInput.getString();

        System.out.println("Enter year of joining:");
        int year2 = ConsoleInput.getInt();

        System.out.println("Enter salary:");
        float salary2 = ConsoleInput.getFloat();

        System.out.println("Enter address:");
        String address2 = ConsoleInput.getString();

        System.out.println("Enter details of Employee 3");

        System.out.println("Enter name:");
        String name3 = ConsoleInput.getString();

        System.out.println("Enter year of joining:");
        int year3 = ConsoleInput.getInt();

        System.out.println("Enter salary:");
        float salary3 = ConsoleInput.getFloat();

        System.out.println("Enter address:");
        String address3 = ConsoleInput.getString();

        Employee e1 = new Employee(name1, year1, salary1, address1);
        Employee e2 = new Employee(name2, year2, salary2, address2);
        Employee e3 = new Employee(name3, year3, salary3, address3);

        System.out.println();
        System.out.println("Name\tYear of joining\tSalary\tAddress");

        e1.display();
        e2.display();
        e3.display();
    }
}

