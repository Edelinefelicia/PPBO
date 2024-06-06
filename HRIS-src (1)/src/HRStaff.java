//public class HRStaff extends Employee {
//    public HRStaff(String name, String dob, String department, String id) {
//        super(name, dob, department, id);
//    }
//
//    @Override
//    protected double calculateSalary() {
//        return 5000000;
//    }
//}
public class HRStaff extends Employee{
    public HRStaff(String name, String tanggal_lahir) {
        super(name, tanggal_lahir);
    }
}
