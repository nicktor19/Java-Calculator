package Calculator;

import java.util.*;

public class Calculator {
    // fields
    protected int intNum1;
    protected float floatNum1;
    protected double doubleNum1;
    protected int intNum2;
    protected float floatNum2;
    protected double doubleNum2;
    protected char operator;

    //create constructs
    //skip for now

    //main
    public static void main(String[] args) {
        // instantiate the calculator.
        Calculator cal = new Calculator();

        //instantiate the scanner.

        //get first number from user:
        //use methods
        cal.getDataTypeInput();
    }

    /**
     * setting an int to intNum1
     * @param num1
     */
    protected void setNumberOne(int num1)
    {

         this.intNum1 = num1;
    }

    /**
     * setting a float to floatNum1
     * @param num1
     */
    protected void setNumberOne(float num1)
    {
        this.floatNum1 = num1;
    }

    /**
     * setting a double to doubleNum1
     * @param num1
     */
    protected void setNumberOne (double num1)
    {
        this.doubleNum1 = num1;
    }

    /**
     * setting an int to intNum2
     * @param num2
     */
    protected void setNumberTwo(int num2)
    {

        this.intNum2 = num2;
    }

    /**
     * setting a float to floatNum2
     * @param num2
     */
    protected void setNumberTwo(float num2)
    {
        this.floatNum2 = num2;
    }

    /**
     * setting a double to doubleNum2
     * @param num2
     */
    protected void setNumberTwo(double num2)
    {
        this.doubleNum2 = num2;
    }

    protected void setOperator(char c)
    {
        //take the char and match with an operator
        switch (c) {
            case '+':
                this.operator = '+';
                break;
            case '-':
                this.operator = '-';
                break;
            case '*':
                this.operator = '*';
                break;
            case '/':
                this.operator = '/';
                break;
            case '%':
                this.operator = '%';
                break;
            default:
                System.out.println("The operator \"" + c + "\" is not an option.");
        }
    }

    protected void getDataTypeInput(){

        int set = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter a Number greater than 0:");
            if (scan.hasNextInt()) {
                if (this.intNum1 == 0) {
                    this.intNum1 = scan.nextInt();
                    set = 1;
                } else if (this.intNum2 == 0) {
                    set = 1;
                }
            } else if (scan.hasNextFloat()){
                if (this.floatNum1 == 0) {
                    this.floatNum1 = scan.nextFloat();
                    set = 1;
                }else if (this.floatNum2 == 0) {
                    this.floatNum2 = scan.nextFloat();
                    set = 1;
                }
            } else if (scan.hasNextDouble()) {
                if (this.doubleNum1 == 0) {
                    this.doubleNum1 = scan.nextDouble();
                    set = 1;
                } else if (doubleNum2 == 0) {
                    this.doubleNum2 = scan.nextDouble();
                    set = 1;
                }
            }

        } while (set == 0);
    }
}
