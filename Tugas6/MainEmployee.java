public class MainEmployee {
    public static void main(String[] args) {
        Manager boss = new Manager("Steven", 80000, 1987, 12, 15);

        boss.setBonus(5000);
        Employee staff = new Employee("Donni", 50_000, 1989, 10, 1);

        System.out.println("Nama boss   : "+boss.getName()+" Salary = "+boss.getSalary());
        System.out.println("Nama Staff  : "+ staff.getName()+" Salary = "+staff.getSalary());
    }
}
