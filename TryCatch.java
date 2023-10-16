package Exception;

public class TryCatch {  
	  
    public static void main(String[] args) {  
        int i=50;  
        int j=0;  
        int data;  
        try  
        {  
        data=i/j;  
        }  
              
        catch(Exception e)  
        {  
            
            System.out.println(e);
            System.out.println("Cant divide by zero");
        }  
    }
}

public class TryCatchExample2 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0;   
        }  
         
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
