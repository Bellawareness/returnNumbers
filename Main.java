// This is an example of different scopes uncomment the commented code and see what it returns. Answer the questions at the bottom. 

class Main {

  // Class scope variable
  static int num = 5; 
  // Class scope without initialization
  static int num2;
  // Class scope reference variable. 
  static Main num3; //This is set to null since a value is not instantiated.

  /*Object scoped variable. Every Main object will have its own copy of this variable
  * that it can work with independently.
  * object scopes don't have the static keyword.
  */
  double num4 = 1.23;

  void blockScope(){
    // Method scope variable. Meaning that it is only accessable within this block of code. Block being anything between { }
    int methodInt = 10;

    Main main2 = new Main();
    this.num = 15;

    num2 = 25;
    num4 = 55;
    main2.num4 = 105;

    System.out.println("Method starting");

    //Slowly uncomment these and see what happens. 

    System.out.println("Main.num = " + Main.num);
    System.out.println("main2.num = " + main2.num);
    System.out.println("main2.num2 = " + main2.num2);
    System.out.println("num2 = " + num2);
    System.out.println("num4 = " + num4);
    System.out.println("main2.num4 = " + main2.num4);

    System.out.println("Method ending");
  }

  public static void main(String[] args) {
  
    System.out.println(num);
  
    //Did it change from when we printed the num2 in the method() method? Why do you think this is. Provide your explaination in the comments. 


    num2 = 10;
    System.out.println(num2);

    //Create an object from our Main class and name it main. Then use it to print out num4. What does it return and why?



    Main main = new Main();
    System.out.println(main.num4);

    main.blockScope();

    // Why did this change?

    //ANSWER:

    System.out.println(main.num4);

  }
}