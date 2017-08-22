class classperson {
    public static class person {
        int age, salary;
        String name;

        person(){

        }
    
        public void setName(String newName) {
            name = newName;
        }
        public void setAge(int arg) {
            age = arg;
        }
        public void setSalary(int sal) {
            sal = salary;
        }
    
        public void getAll() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Salary: " + this.salary);
        }
    }
    public static void main(String args[]) {
        person p1 = new person();
        p1.setName("Mohit");
        p1.setAge(19);
        p1.setSalary(20000);
        p1.getAll();
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}