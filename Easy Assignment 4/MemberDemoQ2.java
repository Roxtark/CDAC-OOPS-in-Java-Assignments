public class MemberDemoQ2 {

    public static void main(String[] args) {

        MemberQ2 member = new MemberQ2();

        System.out.print("Enter Name: ");
        member.setName(ConsoleInput.getString());

        System.out.print("Enter Age: ");
        member.setAge(ConsoleInput.getInt());

        System.out.print("Enter Phone Number: ");
        member.setPhoneNumber(ConsoleInput.getString());

        System.out.print("Enter Address: ");
        member.setAddress(ConsoleInput.getString());

        System.out.print("Enter Salary: ");
        member.setSalary(ConsoleInput.getFloat());

        System.out.println();

        System.out.println("Member Details");
        System.out.println("Name: " + member.getName());
        System.out.println("Age: " + member.getAge());
        System.out.println("Phone Number: " + member.getPhoneNumber());
        System.out.println("Address: " + member.getAddress());

        member.printSalary();

        System.out.println();

        PrimeMembersQ2 primeMember = new PrimeMembersQ2();

        System.out.print("Enter Prime Member Name: ");
        primeMember.setName(ConsoleInput.getString());

        System.out.print("Enter Age: ");
        primeMember.setAge(ConsoleInput.getInt());

        System.out.print("Enter Phone Number: ");
        primeMember.setPhoneNumber(ConsoleInput.getString());

        System.out.print("Enter Address: ");
        primeMember.setAddress(ConsoleInput.getString());

        System.out.print("Enter Salary: ");
        primeMember.setSalary(ConsoleInput.getFloat());

        System.out.print("Enter Joining Year: ");
        primeMember.setJoiningYear(ConsoleInput.getInt());

        System.out.print("Enter Joining Fees: ");
        primeMember.setJoiningFees(ConsoleInput.getFloat());

        System.out.print("Is Active (true/false): ");
        primeMember.setIsActive(Boolean.parseBoolean(ConsoleInput.getString()));

        System.out.println();

        System.out.println("Prime Member Details");
        primeMember.display();
    }
}