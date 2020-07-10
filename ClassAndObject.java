
class Student
{
	private int roll;
	private String name;
	private int age;
	private String collegeName;
	private String address;

   public void setRoll(int roll)
   {
   	  this.roll=roll;
   }
   public void setName(String name)
   {
   	this.name=name;
   }
   public void setAge(int age)
   {
   	this.age=age;
   }
   public void setCollegeName(String collegeName)
   {
   	this.collegeName=collegeName;
   }
   public void setAddress(String address)
   {
   	this.address=address;
   }


	public void displayStudentrecord()
	{
		System.out.println("Student Roll Number : "+roll);
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("Student College Name : "+collegeName);
		System.out.println("Student Address : "+address);
	}
}


class ClassAndObject
{
	public static void main(String[] args) {

        Student student=new Student();
        student.setRoll(105);
        student.setName("Mohit Parmar");
        student.setAge(21);
        student.setCollegeName("IPS Academy Indore");
        student.setAddress("Indore");

        student.displayStudentrecord();
	}
}