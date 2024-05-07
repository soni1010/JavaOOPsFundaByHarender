package org.harender;

public class Objects {

    int x=10;
    int y=5;

    public static void main (String args []) {
        // A new object is created, and it returns the value of x
        Objects ObjectsObj = new Objects();
        System.out.println(ObjectsObj.x);

        // Multiple objects are created in the same class and how they are accessed from another class
        Count myobj1 = new Count();
        Count myobj2 = new Count();
        System.out.println (myobj1.x);
        System.out.println (myobj2.y);
    }
}

