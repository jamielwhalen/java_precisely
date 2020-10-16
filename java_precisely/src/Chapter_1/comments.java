package Chapter_1;

public class comments {
    public static void main(String[] args) {
        System.out.println("hello world, itellij sucks!");
        int x;
        x = 5;
        //this is a one line comment
        /*this is a delimited comment,
        extending over several lines.

         */
        int /* this is a delimeted comment extends over part of a line */ y = 117;
    }
}

class Layout {      //Class declaration
    int x;

    Layout(int x) {
        this.x = x;
    }

}