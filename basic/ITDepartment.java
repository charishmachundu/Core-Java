public class ITDepartment extends Department{

    private int departmentSize;


    public ITDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }


    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }

    public static void main(String[] args) {

        ITDepartment csDep = new ITDepartment(10);

        System.out.println("Department Size: " + csDep.getDepartmentSize());
    }
}
