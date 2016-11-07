package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.doIt();
    }

    private void doIt() {

        //This array List accept all object. You can but in what ever you like. You have to check it when you use something from it.
        ArrayList shapeListBad = new ArrayList();
        //Only those Object can be in it
        ArrayList<GeometricShape> shapeListBetter = new ArrayList<>();

        LinkedList<GeometricShape> shapeListBetter2 = new LinkedList<GeometricShape>();
        //the best way. You use an interface as the list. You can change the real ArrayList usw. They all share the same implementations
        List<GeometricShape> shapeList = new ArrayList<>();

        fillList(shapeList);

        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();

        for (GeometricShape shape : shapeList) {
            if(shape instanceof Circle) {
                //(Circle) is called casting
                circleList.add((Circle)shape);
            }
        }
        System.out.println("------------------------------");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }
    }


    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,2,3.1));
        shapeList.add(new Circle(4,2,3.2));
        shapeList.add(new Circle(1,4,3.5));

        shapeList.add(new Rectangle(3, 4, 5.0, 2.0));
        shapeList.add(new Rectangle(11, 4, 33.0, 2.0));
        shapeList.add(new Rectangle(3, 14, 22.0, 1.0));
        shapeList.add(new Rectangle(3, 34, 5.0, 4.3));

        shapeList.add(new RightTriangle(55, 44, 3.3, 4.4));
    }


    public void printList(List<GeometricShape> shapeList) {
        //fori; worst solution
        System.out.println("--------- for ----------");
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));
        }

        //iter; better solution
        //you go trough all the elements in the list
        //it has an common code that works witch all different types (vector, ..)
        System.out.println("--------- for each ----------");
        for (GeometricShape geometricShape : shapeList) {
            System.out.println(geometricShape);
        }

        //high performance version
        System.out.println("--------- stream 1 ----------");
        shapeList.stream()
                .forEach(shape -> System.out.println(shape));

        //The same version like the one before
        System.out.println("--------- stream 2 ----------");
        shapeList.stream()
                .forEach(System.out::println);



    }

}
