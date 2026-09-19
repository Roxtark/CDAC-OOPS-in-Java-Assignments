public class PrimeMembersQ2 extends MemberQ2 {

    private int joiningYear;
    private float joiningFees;
    private boolean isActive;

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public float getJoiningFees() {
        return joiningFees;
    }

    public void setJoiningFees(float joiningFees) {
        this.joiningFees = joiningFees;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
        System.out.println("Joining Year: " + joiningYear);
        System.out.println("Joining Fees: " + joiningFees);
        System.out.println("Is Active: " + isActive);
    }
}