public class Member extends Person {
   

	private String id; //회원번호
   private double weight; //몸무게
   private double height; //키
   
   //생성자
   public Member() {
	   id = "";
	   weight = 0;
	   height=0;
   }
   public Member(String name, String id, double weight, double height) {
	  super(name);   //입력받은 이름은 부모클래스인 Person클래스로 보내줌
      this.id = id;
      this.weight = weight;
      this.height = height;
   }
   
   //표준체중을 계산하는 메소드정의
   public double getStandardWeigth() {      
      return (this.height - 100)*0.9;
   }
   
   //체중의 상태를 출력
   public String getState() {
      double diff = this.weight - this.getStandardWeigth();
      if(diff < -5)
         return "저체중";
      else if(diff > 5)
         return "과체중";
      else
         return "정상체중";
   }

   @Override
   public String toString() {
      return "[가입] " + super.toString() + ",표준체중은 " + this.getStandardWeigth()
         + " kg " + this.getState() + "입니다.";   //펄슨클래스의 toString 출력하고 그다음에 출력한다
   }
   
   public double getWeight(){
	   return weight;
   }
   public void setWeight(double weight){
	   this.weight = weight;
   }
   public String getId() {
       return id;
    }

    public void setId(String id) {
       this.id = id;
    }
    public double getHeight(){
 	   return height;
    }
    public void setHeight(double height){
 	   this.height = height;
    }
}