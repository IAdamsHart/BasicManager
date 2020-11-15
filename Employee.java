class Employee {

   private String name;
   private String ID;

   public Employee (String name, String ID) {
         this.name = name;
         this.ID = ID;
   }

   public Employee() {

   }

   public String toString() {
      return name + "\nID# " + ID;
   }

}
