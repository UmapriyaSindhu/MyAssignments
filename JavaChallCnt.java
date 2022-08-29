package week3.day2;

public class JavaChallCnt {
	
		public static void main(String[] args)
		{
			
			String s = "Hello world";
			String s1 = "fly me in to the moon";
			String s2 = "luffy is still joyboy";		
			
			String[]  s3 = s.split(" ");
			int length1 = 0;
			for (int i=s3.length-1; i>=0 ;) {	
				length1= s3[i].length();
				break;
			}
			
			System.out.println(length1);
			
			String[]  s4 = s1.split(" ");
			for (int i=s4.length-1; i>=0 ;) {	
				length1= s4[i].length();
				break;
			}
			
			System.out.println(length1);
			
			String[]  s5 = s2.split(" ");
			for (int i=s5.length-1; i>=0 ;) {	
				length1= s5[i].length();
				break;
			}
			
			System.out.println(length1);

		}

	}
	
	
	
	
	
	
	
