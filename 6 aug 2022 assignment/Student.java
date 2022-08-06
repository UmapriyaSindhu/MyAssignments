package week1.day1;

public class Student {
	
		String studName;
		int rollnum;
	    String collegename;
		int markscored;
		float cgpa;
		
		public void print()
		{
			System.out.println("Student name:"+studName);
			System.out.println("Student rollnum:"+rollnum);
			System.out.println("Student collegeName:"+collegename);
			System.out.println("Student marksscored:"+markscored);
			System.out.println("student cgpa:"+cgpa);
	    }
		
		public static void main(String[] args) {
			
			
			Student obj=new Student();
			obj.studName="Ragavi";
			obj.rollnum=28;
			obj.collegename="PMCTW";
			obj.markscored=98;
			obj.cgpa=9.5F;
			obj.print();
			
			
		}
	
	
	
	

}
