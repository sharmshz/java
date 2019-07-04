package javaconcepts;

public class Proj3<T1,T2> {

	public static void main(String[] args) {
		
		Proj3<String,Integer> p=new Proj3<String, Integer>();
		Proj3<Integer,String> p1=new Proj3< Integer,String>();
		p.display("Shivam", 26);
		p1.display1(26, "Shivam Sharma");
	
		
	}
	
	
	public T1 display(T1 var1,T2 var2)
	{
		 
	System.out.println("Name is: " +var1 + " & Age is: "+ var2);
	return var1;
		
	}
	
	public void display1(T1 var1,T2 var2)
	{
		 
	System.out.println("Age is: " +var1 + " & Name is: "+ var2);
		
	}
	
	

}
