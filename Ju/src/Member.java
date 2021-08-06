public class Member extends Person {
   

	private String id; //ȸ����ȣ
   private double weight; //������
   private double height; //Ű
   
   //������
   public Member() {
	   id = "";
	   weight = 0;
	   height=0;
   }
   public Member(String name, String id, double weight, double height) {
	  super(name);   //�Է¹��� �̸��� �θ�Ŭ������ PersonŬ������ ������
      this.id = id;
      this.weight = weight;
      this.height = height;
   }
   
   //ǥ��ü���� ����ϴ� �޼ҵ�����
   public double getStandardWeigth() {      
      return (this.height - 100)*0.9;
   }
   
   //ü���� ���¸� ���
   public String getState() {
      double diff = this.weight - this.getStandardWeigth();
      if(diff < -5)
         return "��ü��";
      else if(diff > 5)
         return "��ü��";
      else
         return "����ü��";
   }

   @Override
   public String toString() {
      return "[����] " + super.toString() + ",ǥ��ü���� " + this.getStandardWeigth()
         + " kg " + this.getState() + "�Դϴ�.";   //�޽�Ŭ������ toString ����ϰ� �״����� ����Ѵ�
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