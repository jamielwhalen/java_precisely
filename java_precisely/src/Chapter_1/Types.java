package Chapter_1;
/*A type is a set of values and operations on them.  primative or reference.
Primitive - boolean or numeric types (char, byte, short, int, long, float or double)
Reference - class delcaration, interface delcaration, array type enum type -- when not set then the value is null
array t[]
boxing - going from primitive type to wrapper class
Wrapper class - java class that wraps the functionality of the primitive type

why have classes for numbers?
other methods like array only hold classes - number classes of other methods like max min

java converts between numbers and primitives automatiocally
 */



public class Types {

    public static void main(String[] args) {
        //main method is used to start the program.  You must always be in a method to perform an action so this initiates the program.
        //you should but all your called functions here?
        Integer myInt = new Integer(42);
        Integer myInt2 = 47; //defining how you would create a primitive
        //compilier replaced ^ to look like this automatically -- autoboxing:
        Integer myInt3 = Integer.valueOf(43);

        // you have to convert integers to stirngs in order to print multiple numbers
        System.out.println(Integer.toString(myInt2) + "  " + myInt3);

        someMethod(25);
        someMethod2(80);

    }

    //cannot create method in a method.  cannot create someMethod in the main method ^
    //need the static void to print the someMethod above in the main method.
    //the int primitive type below will automatically get changed to the Integer type when compiled.
    public static void someMethod(int i) {
        System.out.println(i);
    }

    public static void someMethod2(Integer x) {
        //unboxing when Java wants to use primitive type
        //java automatically turns integer type into int type which can be used in the if statement.  Only use primitive types in if statement?


        if (x > 40) {
            System.out.println("i > 40");
        }

        //always prefer primitives if you can get away with it because it can cause performace issues.

    }
}