import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
        int a = 125;
        int b = 24;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Input first number: 125 Input second number: 24");
        System.out.println("125 + 24 =" + sum);
        System.out.println("125 - 24 =" + sub);
        System.out.println("125 * 24 =" + mul);
        System.out.println("125 / 24 =" + div);
        System.out.println("125 mod 24 =" + mod);

        //2.Write a Java program to convert a given string into lowercase.
        String lowercase = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println(lowercase.toLowerCase());


        //3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        String name ="Java Bootcamp";
        System.out.println(name.charAt(1));

        //4.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement
        Scanner num1 = new Scanner(System.in);
        System.out.print("enter a number: ");
        int s=num1.nextInt();
        int number = 20;
        if (number % 2 == 0) {
            System.out.println("number is event 1");
        } else {
            System.out.println("number is odd 0 ");
        }

        //5.Write a program that checks the role of the user
        Scanner S=new Scanner(System.in);
        System.out.println("enter is role ");
        String role=S.nextLine();
        if(role.equals("admin")) {
            System.out.println("welcome admin");
        }
        else if (role.equals("user")){
            System.out.println("welcome user");}
        else if(role.equals("superuse")) {
            System.out.println("welcome superuse");
        }
        //6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer
        Scanner num2 = new Scanner(System.in);
        System.out.println("enter first number:  ");
        int firstNumber = num2.nextInt();
        System.out.println("enter second number:  ");
        int secondNumber = num2.nextInt();
        System.out.println("enter third number:  ");
        int thirdNumber = num2.nextInt();
        int sum2=firstNumber+secondNumber;
        if(sum2==thirdNumber){
            System.out.println("true");}
        else {
            System.out.println("false");
        }
        //7.Take three numbers from the user and print the greatest number
        Scanner greatest  = new Scanner(System.in);
        System.out.println("enter 1st:  ");
        int st = greatest.nextInt();
        System.out.println("enter 2nd:  ");
        int nd = greatest.nextInt();
        System.out.println("enter 3dr:  ");
        int rd = greatest.nextInt();
        if(rd>nd && rd>st)
            System.out.println("The greatest:"+rd);
        if (nd>st && nd>rd)
            System.out.println("The greatest:"+nd);
         if (st>nd && st>rd)
             System.out.println("The greatest:" + st);
                //8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
             Scanner day = new Scanner(System.in);
              System.out.println("enter number of day:");
                int weekday = day.nextInt();
                switch (weekday) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("none of the above");



/*
             int day1=4;
                if(day1==1){
                    System.out.println("Sunday");}
                else if (day1==2){
                    System.out.println("Monday");
                    System.out.println("Tuesday");
                }else if (day1==4){
                    System.out.println("Wednesday");
                }else if (day1==5){
                    System.out.println("Thursday");
                }else if (day1==6){
                    System.out.println("Friday");
                }else if (day1==7){
                    System.out.println("Saturday");*/
                }
            }
            }
