//abstract class Employee {
//    private String name;
//    private int salary;
//    private double bonus;
//    private String dob;
//
//    public Employee(String name, int salary, double bonus, String dob) {
//        this.name = name;
//        this.salary = salary;
//        this.bonus = bonus;
//        this.dob = dob;
//    }
//
//
//    public static String[] getDepartment() {
//        return new String[]{"Product", "Human Resources"};
//    }
//    public String[] getJob() {
//        return new String[]{this.dob};
//    }
//
//}
abstract class Employee {
    private String name;
    private String tanggal_lahir;
    private String[] posisi;

    public Employee(String name, String tanggal_lahir) {
        this.name = name;
        this.tanggal_lahir = tanggal_lahir;
    }

    public static String[] getJobs() {
        return new String[]{"Manager", "Developer", "HR Staff"};
    }

    public static String[] getDepartment() {
        return new String[]{"Product", "Human Resources"};
    }

}

