class Employeesalary {
    float salary;
    int hours;

    void getInfo(float salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    void addSal() {
        if (salary < 500) {
            salary = salary + 10;
        }
    }

    void addWork() {
        if (hours > 6) {
            salary = salary + 5;
        }
    }

    void displaySalary() {
        System.out.println("Final Salary: $" + salary);
    }

    public static void main(String[] args) {

        System.out.println("Enter salary:");
        float salary = ConsoleInput.getFloat();

        System.out.println("Enter number of hours of work per day:");
        int hours = ConsoleInput.getInt();

        Employeesalary e = new Employeesalary();

        e.getInfo(salary, hours);
        e.addSal();
        e.addWork();
        e.displaySalary();
    }
}

