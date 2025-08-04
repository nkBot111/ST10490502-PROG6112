public abstract class Staff implements iStaff {

    protected int staffNumber;
    protected String staffLocation;

    public Staff(int staffNumber, String StaffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    @Override
    public int getStaffNumber() {
        return staffNumber;
    }
    @Override
    public String getStaffLocation() {
        return staffLocation;
    }
    @Override
    public String getStaffHiringProcess() {
        return (staffNumber < 20) ? "YES" : "NO";
    }
}