package pkg;

public class Snake implements Pet {
String name;
int age;
boolean trained;

    public Snake(){
        this("Medusa", 7, false);
    }
    
    public Snake(int age){
        this("Medusa", age, false);
    }
    
    public Snake(String name){
        this(name, 7, false);
    }
    
    public Snake(boolean trained){
        this("Medusa", 7, trained);
    }
    
    public Snake(String name,int age){
        this(name, age, false);
    }
    
    public Snake(String name, int age, boolean trained){
        this.name = name;
        this.age = age;
        this.trained = trained;
        
        interact();
        
    }
	
	public void setName(String name){
	    this.name = name;
	}
	
	public void setAge(int age){
	    this.age = age;
	}
	
	public void setIsTrained(boolean trained){
	    this.trained = trained;
	}
	
	public String getName(){
	    return name;
	}
	
	public int getAge(){
	    return age;
	}
	
	public boolean getIsTrained(){
	    return trained;
	}
	
	public void interact(){
	    System.out.println(name + " hisses at you!");
	}
	
	public void trick(){
	    if(trained){
	        System.out.println(name + " did a backflip!");
	    }
	    else {
	        System.out.println(name + " stuck its tongue out.");
	    }
	}


	
}
