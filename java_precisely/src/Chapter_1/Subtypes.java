package Chapter_1;
//INHERITANCE
//all types are subtypes of themselves
//t1 is sub of t2 which is sub of t3 so t1 is sub of t3
//if t1 is class and t2 is class then t1 is subclass of t2
//same with interfaces ^

public class Subtypes {
    Number n = new Integer(9);
    //inheritance here is that integer is a subclass of number

    class Glass<T> {
        private T liquid;  //class Juice,   Interface Liquid --- class OrageJuice extends Juice and implements Liquid
    }

    interface Liquid{}

    class Juice {}

    class OrangeJuice extends Juice implements Liquid {}

    Juice j = new OrangeJuice();

    //Glass<Juice> juiceGlass = new Glass<OrangeJuice>();  // not valid glass juice is different type than glass orange juice glass juice becomes different type from glass orange juice.

    class WineGlass<T> extends Glass<T>{}  //Glass<Wine> extends WineGlass<Wine>

    Glass<Juice> juiceGlass = new WineGlass<Juice>();
    //Glass<Liquid>liquidGlass = new WineGlass<Juice>();  this cannot be instantiated because two subtypes must be the same
    Glass<Liquid>liquidGlass = new WineGlass<Liquid>();  //this works because liquid = liquid

    //SUPERTYPE MUST ALWAYS BE ON THE LEFT SIDE OF = IN INSTANTIATION


}

