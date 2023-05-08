
1. What is polymorphism? How is this done in Java?
> Polymorphism is the greek word which means "many forms", in progrmaming polymorphism is used on funcitons or variables. These functions are variables can be overwritten and overrided in certain context of the code. Here's an example of it:
```java  
         Example:
            Class Animal
            {
               int numberOfLegs;
               int numberOfEyes;

               public void makeSound()
               {
                  System.out.println("The animal is making a sound!");
               }
            }

            class Spider Extends Animal
            {
               @Override
               public void makeSound()
               {
                  System.out.println("The SPIDER is making a sound!");
               }

               public void go()
               {
                  System.out.println("The spider is moving");
               }
            }

            class Frog Extends Animal
            {
               public void go()
               {
                  System.out.println("The frog is moving");
               }
            }
```         
2. What is class inheritance? How is this done in Java?      
> Class inheritance is when a sub class branches from a super class, and inherits certain attributes and functions. We can do in java by using the "extend" keyword.
```java
        class Animal
            {
               int numberOfLegs;
               int numberOfEyes;
               
               public void run()
               {
                  System.out.println("The animal is running!");
               }
            }

            class Spider extends Animal
            {
               public void go()
               {
                  System.out.println("The spider is moving");
               }
            }

            class Frog extends Animal
            {
               public void go()
               {
                  System.out.println("The frog is moving");
               }
            }
```
 >All the subclases {Spider, Frog}, will have access to the run function within the Animal superclass.

3. Know how the JOptionPane was used to solve the class exercises. 

The following will prompt a message box with the message "hello world".
```Java

    public class main
    {
        public static void main(String[] args)
        {
            JOptionPane.showMessageDialog(null, "hello world");
        }
    }
```

     