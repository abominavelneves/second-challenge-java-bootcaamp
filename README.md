## Second Challenge - [Java Boocamp](https://www.dio.me/)

### Intro
In this challenge I had to create a simple program that counts the difference between two numbers, if both are the same number or the second number is greater than the first one the program will show a Exception. So to do that I created a class for the Exception
```java
public class contadorException() extends Exception(){

}
```
After that I created a method able to count the difference.
```java
public static void Counting(int num1, int num2) throws contadorException{
        if (num1>num2){
            for (int i=1; i<=(num1-num2);i++){
                System.out.println("Número: "+i);
            }
        }
        else {
            throw new contadorException();
        }
```
### Objectives
The idea is to use what I learnt (```loops```, ```Exceptions``` and ```If-else```).
