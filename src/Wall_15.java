public class Wall_15 {

    double width;               // declared instance variable width in Class outside main method
    double height;              // declared instance variable height in Class outside main method

    public Wall_15() {             // constructor with no arguments/ parameters name same as Class.
                                // outside main method
    }

    public Wall_15(double width, double height) {  // constructor with parameters width & height and argument
        if (width < 0) {                        // condition for width <0
            width = 0;                          // then set width to value 0
        }
        this.width = width;                     // use this width when values less than 0.

        if (height < 0) {                       // condition for height if value less than 0
            height = 0;                         // then set height to value 0
        }
        this.height = height;                   // use this height for values less than 0
    }

    public double getWidth() {              // instance method getWidth  with no parameter
        return width;                       // this method will return value of width
    }

    public double getHeight() {               // instance method for getHeight with no parameter
        return height;                          // this method will return value for height
    }

    public void setWidth(double width) {        // instance method setWidth with parameter double width
        if (width < 0) {                             // condition when value of width is less then 0
            width = 0;                              // then setting width to 0
        }

        this.width = width;                     // then use this.width will become width.
    }

    public void setHeight(double height) {      // instance menthod setHeight with parameter as double height
        if (height < 0) {                       // condition for value less than 0
            height = 0;                         // then setting height to 0;
        }
        this.height = height;               // then this.width will become width.
    }

    public double getArea() {                   // another instance method doe getArea
        return getWidth() * getHeight();        // to return area as getWidth X getHeight
    }

    public static void main(String[] args) { // main method public static

        Wall_15 wall = new Wall_15(5, 4);  // object calling & parameters defined
        System.out.println("area = " + wall.getArea()); // getArea calculation using object wall for
        // more parameter 5,4 - getArea should generate area value 20.

        wall.setHeight(-1.5);                           // calling set Height instance method variable
        System.out.println("width = " + wall.getWidth()); // calling getWidth instance method as object.
        System.out.println("height = " + wall.getHeight()); // calling getHeight instance method
        System.out.println("area = " + wall.getArea());  // // calling getArea method as instance

    }

}

