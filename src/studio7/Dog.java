package studio7;

// AN EXAMPLE CLASS I MADE TO SHOW MY STUDENTS AS A TA
public class Dog
{
	// Attributes (private instance variables)
    private String name;
    private int age;
    
    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Methods
    public void bark() {
        System.out.println(name + " says Woof!");
    }
    
    public int humanAge() {
    	return 7*this.age;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating objects
        Dog fido = new Dog("Fido", 3);
        Dog bella = new Dog("Bella", 5);
        
        // Using methods on objects
        fido.bark();
        bella.bark();
        System.out.print(bella.humanAge());
	}

}
