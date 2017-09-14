package objectClonning;

public class Student implements Cloneable{
	int rollno;
	String name;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		}

	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try{
    	   Student s1=new Student(101,"Renu");
    	   Student s2=(Student)s1.clone();
    	   System.out.println(s1.rollno+" "+s1.name);
    	   System.out.println(s2.rollno+" "+s1.name);

    	   Student s3=new Student(102,"priya");
    	   Student s4=(Student)s3.clone();
    	   System.out.println(s3.rollno+" "+s3.name);
    	   System.out.println(s4.rollno+" "+s3.name);
    	   
    	   Student s7=new Student(103,"pradnya");
    	   Student s8=(Student)s7.clone();
    	   System.out.println(s7.rollno+" "+s7.name);
    	   System.out.println(s8.rollno+" "+s7.name);

          }catch(CloneNotSupportedException c){}
       }
}
