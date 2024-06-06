//public class Developer extends Employee {
//    public Developer(String name, String job, String department, String id) {
//        super(name, job, department, id);
//    }
//
//    @Override
//    protected double calculateSalary() {
//        return 10000000;
//    }
//}
public class Developer extends Employee{
    public Developer(String name, String tanggal_lahir) {
        super(name, tanggal_lahir);
    }
}
