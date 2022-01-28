package accessmodifier;

public class am1 {
	public static void main(String[] args) {
		
		System.out.println("Dafault Access Specifier");
		am obj = new am(); 		  
        obj.display(); 

	}

}
class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

