package homework_30_03_2019;

import java.util.Scanner;

public class Wall_17 {

    /**
     * This programme is correct but you did't check condition in constructor
     * See bellow example programme. for your knowledge purpose
     */

        double width;
        double height;

        public Wall_17(){
            width =40;
            height=50;
        }


        Wall_17(double width, double height){
            this.width=width;
            this.height=height;
        }

        double getWidth(){
            return width;
        }

        double getHeight(){
            return height;
        }
        void setWidth(double w){
            width=w;
            if (width<=0) {
                width = 0;
            }
        }
        void setHeight(double h){
            height=h;
            if (height<=0){
                height =0;
            }
        }

        double getArea(){
            return (width * height);
        }

        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            Wall_17 wall =new Wall_17(5,4);

            System.out.println("area=" +wall.getArea());

            wall.setHeight(-1.5);

            System.out.println("width=" +wall.getWidth());
            System.out.println("height=" +wall.getHeight());
            System.out.println("area=" +wall.getArea());
    }

      /*
    * private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }*/
}

