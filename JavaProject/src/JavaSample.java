import java.io.*; 
  
class JavaSample
{ 
    static JavaSample instance = null; 
    public String name ; 
    
    private JavaSample() { name = "Bala"; } 

    private JavaSample(String val) { name = val; } 
    
    static public JavaSample getInstance() 
    { 
        if (instance == null)         
             instance = new JavaSample(); 
   
        return instance; 
    } 
    static public JavaSample getInstance(String value) 
    { 
        if (instance == null)         
             instance = new JavaSample(value); 
   
        return instance; 
    } 
} 
  
// Driver Class 
class Main 
{ 
   public static void main(String args[])     
   { 
//	   JavaSample obj = new JavaSample();
       JavaSample obj1 = JavaSample.getInstance(); 
       JavaSample obj2 = JavaSample.getInstance("sutherson"); 
      
       System.out.println("name = " + obj1.name); 
       System.out.println("name = " + obj2.name);  
   }     
} 