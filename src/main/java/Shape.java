import java.sql.SQLOutput;


    abstract class Shape {
        public Shape() {
            double area;
            System.out.println("All figures have area");
        }
        public abstract void area();

        static class Circle extends Shape {
            int radius = 10;
            double pi = Math.PI;
            double area = pi * radius * radius;

            public Circle() {
                super();
                System.out.println("area of circle is " + area);
            }

            public void area() {
            }
        }

        static class Triangle extends Shape {
            int triAngleEdgeA = 20;
            int triAngleEdgeB = 10;
            double area = triAngleEdgeA * triAngleEdgeB / 2;

            public Triangle() {
                super();
                System.out.println("area of triangle is " + area);
            }

            public void area() {
            }
        }

        public static void main(String[] args) {
            System.out.println();
            //Shape shape = new Shape();
            Circle circle = new Circle();
            Triangle triangle = new Triangle();
            System.out.println();

            System.out.println("triangle area is: " + triangle.area + " \ncircle area is: " + circle.area);
            triangle.area();
            circle.area();
        }
    }

