/*Write a program in java to show how the capacity is changing in StringBuffer or in StringBuilder if we append the string.*/

package Core_Java_Assignment7_3; //Package declaration is mandatory
	
	class StringBuffer{  
	
			public static void main(String args[]){  
			StringBuilder sb=new StringBuilder();  
			System.out.println(sb.capacity());//default 16  
			sb.append("yeah");  
			System.out.println(sb.capacity());//now 16  
			sb.append("java is complex language");  
			System.out.println(sb.capacity());//now (16*2)+2=34  i.e. Initial_capacity*2+2
			sb.ensureCapacity(10);//now no change  
			System.out.println(sb.capacity());//now 34  
			sb.ensureCapacity(50);//now (34*2)+2  
			System.out.println(sb.capacity());//now 70  
			}  
			
	} 
	
