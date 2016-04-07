## Exercícios

### Object-Oriented Programming Concepts

1. Real-world objects contain **states** and **behavior**.
2. A software object's state is stored in **fields**.
3. A software object's behavior is exposed through **methods**.
4. Hiding internal data from the outside world and acessing it only through publicly exposed methods is know as data **encapsulation**
5. A blueprint of a software object is called **Class**
6. Commom behavior can be defined in a ~~**Parent Class**~~ **Superclass** and inherited into a ~~**Child Class**~~ **Subclass** using the **extends** keyword
7. A collection of methods with no implementation is called an **Interface**
8. A namespace that organizes classes and interfaces by functionality is called a **Package**
9. The term API stands for ~~**Application Public Interface**~~~ ** Application Program Interface**

### Variables

1. The term "instance variable" is another name for **Non-static field**
2. The term "class variable" is another name for **Static field**
3. A local variable stores temporary state; it is declared inside a **method**
4. A variable declared within the opening and closing parenthesis of a method signature is called a **local variable** or **parameter**
5. What are the eight primitive data types supported by the Java programming language? **Byte, Boolean, Char, Int, Double, Float, long**
6. Character strings are represented by the class **java.lang.String**
7. An **Array** is a container object that holds a fixed number of values of a single type

### Operators

1. Consider the following code snippet :  ```arrayOfInts[j] > arrayOfInts[j + 1]``` Which operators does the code contain? It contains **comparsion operator >** and **sum operator +**
2. Consider the following code snippet :

    ```
    int i = 10;
    int n = i++%5
    ```
    a. What are the value of **i** and **n** after the code is executed? **i equals 11 and n equals 0**
    b. What are the final values of **i** and **n** instead of using postfix increment operator (i++), you use prefix version (++i)? **i equals 11 and n equals 1**

3. To invert the value of a boolean, which operator would you use? **The ! (negation) operator**
4. Which operator is used to compare two values, = or ==? **The comparsion operator ==**
5. Explain the follow code sample: ```result = someCondition? value1 : value2```? This is the ternary operation, the boolean value of someCondition? is tested, if it's true then the value1 is assign as value of variable result, otherwise value2 is assign to result


### Expressions, Statements and Blocks

1. Operators may be used in building **Expressions**, which compute values.
2. Expressions are the core components of **Statements**
3. Statements may be grouped into **Blocks**
4. The following code snippet is an example of a **compound** expression. ```1 * 2 * 3```
5. Statements are roughly equivalent to sentences in natural languages, but instead of ending with a period, a statement ends with a **semicolon**.
6. A block is a group of zero or more statements between balanced **braces** and can be used anywhere a single statement is allowed.

### Control Flow Statements


1. The most basic control flow statement supported by the Java programming language is the **if/else** statement.
2. The **switch** statement allows for any number of possible execution paths.
3. The do/while statement is similar to the while statement, but evaluates its expression at the **end** of the loop.
4. How do you write an infinite loop using the for statement? ```for(;;)```
5. How do you write an infinite loop using the while statement? ```while(1)```

### Classes
1. Consider the following class:
    ```
    public class IdentifyMyParts {
        public static int x = 7; 
        public int y = 3; 
    }
	```
   a. What are the class variables? **x is a class variable**

   b. What are the instance variables? **y is a instance variable**

   c. What is the output from the following code:
	```
    IdentifyMyParts a = new IdentifyMyParts();
    IdentifyMyParts b = new IdentifyMyParts();
    a.y = 5;
    b.y = 6;
    a.x = 1;
    b.x = 2;
    System.out.println("a.y = " + a.y); //a.y = 5
    System.out.println("b.y = " + b.y); //b.y = 6
    System.out.println("a.x = " + a.x); //a.x = 2
    System.out.println("b.x = " + b.x); //b.x = 2
    System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x); //IdentifyMyParts.x = 2
	```


### Objects
1. What's wrong with the following program? **Only variable to store a object reference was created, a new object instance was not been created**
    ```
    public class SomethingIsWrong {
      public static void main(String[] args) {
        Rectangle myRect;
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
      }
    }
    ```
2. The following code creates one array and one string object. How many references to those objects exist after the code executes? Is either object eligible for garbage collection? **Exists two references for String object, studentName and students[0]. The object is no elegible for GC because in the end one reference for String object still exists** **
    ```
    String[] students = new String[10];
    String studentName = "Peter Parker";
    students[0] = studentName;
    studentName = null;
    ```
3. How does a program destroy an object that it creates? **After all references of that object dont exist anymore**

### Interface

1. What methods would a class that implements the java.lang.CharSequence interface have to implement?
2. What is wrong with the following interface? An Interface have to definy only methods signatures, not implementations. **Only default and static methods have implementations.**
    ```
    public interface SomethingIsWrong {
        void aMethod(int aValue){
            System.out.println("Hi Mom");
        }
    }
    ```
3. Fix the interface in question 2.
    ```
    public interface SomethingIsWrong {
         default void aMethod(int aValue){
            System.out.println("Hi Mom");
        }
    }
    ```
4. Is the following interface valid? It's not valid because not exist anyone method signature.
    ```
    public interface Marker {
    }
    ```