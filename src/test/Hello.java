package test;

	import java.lang.annotation.*;  
	import java.lang.reflect.*;  
	  
	@Retention(RetentionPolicy.RUNTIME)  
	@Target(ElementType.METHOD)  
	@interface MyAnnotation{  
	int value();  
	}  
	  
	//Applying annotation  
	class Hello{  
	@MyAnnotation(value=35)  
	public void sayHello(){
		System.out.println("hello annotation");
		}  
	}  
	  
	  
	
	



