package javaPractice;

public class TestString {

	public static void main(String[] args) {
	
		//declare in array
		String a[] ={"raj","thipparaj", "Priya","pavithra"};
		for(int i=0;i<a.length;i++){
			
		}
		System.out.println(a[2]);
		

	/* for each loop concepts to print all value an array */  
	for(String name:a)
	{
		System.out.print(name);
		System.out.println(a);
	}
	
	//online
	String ar[] = {"welcome","to","java","program"};
    
    for(int i=0; i<=ar.length;i++)
    {
        System.out.println(ar[0]);
       // ar[]=ar[]+1;
    }
    
    System.out.println("********************");
    for(String names:ar)
    {
        System.out.println(names);
    }
    System.out.println("********************");
    
	int i=10;
	while(i>=0)
	{
	    System.out.println(i);
	  i= i-1;
	}
	
	
}
}
