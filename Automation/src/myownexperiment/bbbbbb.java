package myownexperiment;
import java.util.Arrays;
import org.testng.Assert;

public class bbbbbb {

	public static void main(String[] args) {
		
		//pallendrom
		
		int num= 1441;
		int check= num;
		int add= 0;
		
		while(check>0) {
			
			int a= check%10;
			add= add*10+ a;
			
			check= check/10;
				
		}
		if(add== num)
			System.out.println(num + " pallendrom number");
		else
			System.out.println(num + " is not a pallendrom number");
	    

	    //sort an array
	
	   int[] ar = {8, 7, 0, 3, 94, 67, 20, -3, -7, 9, 1};{
     
	   Arrays.sort(ar);
   
       for (int sr : ar) 
        System.out.print(" " + sr);
       }
	   
	System.out.println("..................");
	
	
	 //last word reverse
	
	  String line= "my name is loren";
	  
	  String[] words= line.split(" ");
	   int lastwordindex= words.length-1;
	   
	   String lastword = words[lastwordindex];
	   String reverse= new StringBuilder(lastword).reverse().toString();
	   
	   words[lastwordindex]=reverse;
	   
	   System.out.println(String.join(" ", words));
	  
	  //longest word
	   
	  String z= " ";
	  
	  for(int c= 0;c<words.length;c++)
		  
	  {
		 if(z.length()<words[c].length()) 
			 
			 z=words[c];
		  
	  }
	  System.out.println(z);
	
	
	}
}