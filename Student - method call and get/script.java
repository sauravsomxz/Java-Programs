class setStudent
{
    int PRN;
    String name;
    String course;
    public void setPRN(int PRN)
	{
         PRN = PRN;
    }
    public void setName(String name)
	{
         name = name;
     }
    public void setCourse(String course)
	{
         course = course;
     }
    public void getPRN()
	{
         System.out.println(PRN);
    }
    public void getName()
	{
         System.out.println(name);
	}
    public void getCourse()
	{
         System.out.println(course);
	}
}
 
public class Student 
{
     public static void main(String[] args)
	 {
         setStudent stud = new setStudent();
         stud.setPRN(71);
         stud.setName("Pulkit");
         stud.setCourse("BCA");
         stud.getPRN();
         stud.getName();
         stud.getCourse();
     }
 }