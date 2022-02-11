package basicConcepts;

public class CoreConcepts //BasicConcepts.java file will be called as own file for the class BasicConcepts  
{
	static void myMethod() {
        System.out.println("You have called me! My name is: myMethod!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        int result = multiplyBytwo(2);
        System.out.println("The output is: " + result);
    }
    public static int multiplyBytwo(int number) {
        return number * 2;
    }
}


//Members: variables and functions
	//Signature of variables
	//Modifier[opt] DataType name: Declaration;-Declaration
	//Modifier[opt] DataType name= value;-Assignment
	

//Signature of method
//Modifier[opt] Return type Name(arguments) {body} -concrete function
  //Concrete function will be written inside a concrete class
  //Modifier[opt] Return type Name(arguments);-abstract function
  //Abstract function will be written inside an interface

//Signature of Class:
//Modifier Class ClassName{Members: Variables/ Function}
//Access Modifiers: Private, default, Protected, Public
//Non Access MOdifiers: static, final
