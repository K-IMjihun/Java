public class Person {
      private String name;  //이름

      //생성자
      public Person() {
    	  name="";
      }
      public Person(String name) {
         this.setName(name);
      }

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }
      
      @Override
      public String toString() {
         return this.getName();
      }
}