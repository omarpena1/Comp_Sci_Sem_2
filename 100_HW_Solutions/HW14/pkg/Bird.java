package pkg;

public class Bird implements Pet {
String name;
int age;
boolean trained;

    public Bird(){
        this("Tweety", 3, false);
    }
    
    public Bird(int age){
        this("Tweety", age, false);
    }
    
    public Bird(String name){
        this(name, 3, false);
    }
    
    public Bird(boolean trained){
        this("Tweety", 3, trained);
    }
    
    public Bird(String name,int age){
        this(name, age, false);
    }
    
    public Bird(String name, int age, boolean trained){
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
	    System.out.println(name + " chirps at you!");
	}
	
	public void trick(){
	    if(trained){
	        System.out.println(name + " did a backflip!");
	    }
	    else {
	        System.out.println(name + " stared at you blankly.");
	    }
	}


	
}
