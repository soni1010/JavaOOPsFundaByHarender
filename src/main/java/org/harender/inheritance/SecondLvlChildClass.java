package org.harender.inheritance;

public class SecondLvlChildClass extends FirstLevelChildClass{

    SecondLvlChildClass(){
        super();
        System.out.println("Default constructor of 'SecondLvlChildClass' Class");
    }

    public void func1OfSecondLevelChildClass(){
        System.out.println("Function 'func1OfSecondLevelChildClass' of SecondLvlChildClass");
    }

    public static void main(String[] args) {
        //This Class Object
        System.out.println("\n--------Methods called based of 'SecondLvlChildClass' Class Object---------------------------");
        SecondLvlChildClass secondLvlChildClass=new SecondLvlChildClass();
        secondLvlChildClass.func1OfParentClassOne();
        secondLvlChildClass.func2OfParentClassOne();
        secondLvlChildClass.func3OfParentClassOne();
        secondLvlChildClass.func4OfParentClassOne();
        secondLvlChildClass.func3OfFirstLevelChildClass();
        secondLvlChildClass.func4OfFirstLevelChildClass();
        secondLvlChildClass.func1OfSecondLevelChildClass();

        System.out.println("\n--------Methods called based of Root Parent Class Object--------------------------------------");
        //Root Parent Class Object
        ParentClassOne parentClassOne=new ParentClassOne();
        parentClassOne.func1OfParentClassOne();
        parentClassOne.func2OfParentClassOne();
        parentClassOne.func3OfParentClassOne();
        parentClassOne.func4OfParentClassOne();

        System.out.println("\n--------Methods called based of FirstLevelChildClass Class Object--------------------------------------");
        FirstLevelChildClass firstLevelChildClass=new FirstLevelChildClass();
        firstLevelChildClass.func1OfParentClassOne();
        firstLevelChildClass.func2OfParentClassOne();
        firstLevelChildClass.func3OfFirstLevelChildClass();
        firstLevelChildClass.func3OfParentClassOne();
        firstLevelChildClass.func4OfParentClassOne();
        firstLevelChildClass.func4OfFirstLevelChildClass();

        System.out.println("\n--------Methods called based of ParentClassOne Object Assigning to SecondLvlChildClass------------------");
        System.out.println("We Can not do this.");
        //SecondLvlChildClass secondLvlChildClassObj=new ParentClassOne();

        System.out.println("\n--------Methods called based of FirstLevelChildClass Class Object Assigning to SecondLvlChildClass-------");
        System.out.println("We Can not do this.");
        // We need to Cast like below ,Btw Directly or Casting both way we can not create Object Like that
//        SecondLvlChildClass firstLvlClassObjectAssgnToScndLvl= (SecondLvlChildClass) new FirstLevelChildClass();
//        firstLvlClassObjectAssgnToScndLvl.func1OfSecondLevelChildClass();
//        firstLvlClassObjectAssgnToScndLvl.func1OfParentClassOne();
//        firstLvlClassObjectAssgnToScndLvl.func2OfParentClassOne();
//        firstLvlClassObjectAssgnToScndLvl.func3OfFirstLevelChildClass();
//        firstLvlClassObjectAssgnToScndLvl.func3OfParentClassOne();
//        firstLvlClassObjectAssgnToScndLvl.func4OfParentClassOne();
//        firstLvlClassObjectAssgnToScndLvl.func4OfFirstLevelChildClass();

        System.out.println("\n--------Methods called based of FirstLevelChildClass Class Object Assigning to ParentClassOne-------------");
        ParentClassOne parentClassOne1=new FirstLevelChildClass();
        parentClassOne1.func1OfParentClassOne();
        parentClassOne1.func2OfParentClassOne();
        parentClassOne1.func3OfParentClassOne();
        parentClassOne1.func4OfParentClassOne();
        ((FirstLevelChildClass) parentClassOne1).func3OfFirstLevelChildClass();
        ((FirstLevelChildClass) parentClassOne1).func4OfFirstLevelChildClass();

        System.out.println("\n--------Methods called based of SecondLvlChildClass Class Object Assigning to ParentClassOne-------------");
        ParentClassOne parentClassOne2=new SecondLvlChildClass();
        parentClassOne2.func1OfParentClassOne();
        parentClassOne2.func2OfParentClassOne();
        parentClassOne2.func3OfParentClassOne();
        parentClassOne2.func4OfParentClassOne();
        ((SecondLvlChildClass) parentClassOne2).func1OfSecondLevelChildClass();

    }

}
