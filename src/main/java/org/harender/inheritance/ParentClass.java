package org.harender.inheritance;

public class ParentClass {


    /*
    Constructor in java is used to create the instance of the class.
    Constructors are almost similar to methods except for two things -
    its name is the same as the class name and it has no return type

    constructors can have any of the access modifiers: public, protected, private, or none
    (often called package or friendly). Unlike methods, constructors can take only access modifiers.
    Therefore, constructors cannot be abstract , final , native , static , or synchronized .

    No, you cannot have two default constructors in a Java class with different access modifiers.
    if a Private constructor in parent class use below point to extend class

    Here is an example of a workaround that uses a factory method to create instances of the superclass:
     */

    private static final ParentClass instance = new ParentClass();

    private ParentClass(){
        System.out.println("'private' Default Constructor in java and now we can not have more " +
                "than one default constructor with different access modifiers");
    }

    public static ParentClass getInstance() {
        return instance;
    }

    public void methodInParentClass() {
        System.out.println("'public' method in 'methodInParentClass'");
    }

}
