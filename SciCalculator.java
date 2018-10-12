import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args) {
        Scanner TI = new Scanner(System.in);
        double calcOutput = 0.00;
        String firstOperandInput;  // These strings allow for these operand values to then be added to the result
        String secondOperandInput;
        double firstOperand;
        double secondOperand;
        double sumCalcOutput = 0.00;
        int numOfCalcOutput = 0;
        double avgCalcOutput = 0.00;


        System.out.println("Current Result: " + calcOutput);

        System.out.println("\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n" +
                "3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");
        System.out.print("Enter Menu Selection: ");

        int userInput = TI.nextInt(); // this allows for the user to input a selection

        while (userInput != 0) {

            if (userInput >= 1 && userInput <= 6) {
                System.out.print("Enter first operand: ");
                firstOperandInput = TI.next();
                if (firstOperandInput.equals("RESULT")) {
                    firstOperand = calcOutput;
                } else firstOperand = (Double.parseDouble(firstOperandInput)); //credit goes to wikihow

                System.out.print("Enter second operand: ");
                secondOperandInput = TI.next();
                if (secondOperandInput.equals("RESULT")) { //follows up with the string action earlier in the code
                    secondOperand = calcOutput;
                } else secondOperand = (Double.parseDouble(secondOperandInput)); //credit goes to wikihow

                switch (userInput) {
                    case 1:
                        calcOutput = firstOperand + secondOperand;
                        System.out.println("\nCurrent Result: " + calcOutput); //Addition
                        break;
                    case 2:
                        calcOutput = firstOperand - secondOperand;
                        System.out.println("\nCurrent Result: " + calcOutput); //Subtraction
                        break;
                    case 3:
                        calcOutput = firstOperand * secondOperand;
                        System.out.println("\nCurrent Result: " + calcOutput); //Multiplication
                        break;
                    case 4:
                        calcOutput = firstOperand / secondOperand;
                        System.out.println("\nCurrent Result: " + calcOutput); //Division
                        break;
                    case 5:
                        calcOutput = Math.pow(firstOperand, secondOperand);
                        System.out.println("\nCurrent Result: " + calcOutput); //Exponential function (credit for math functions goes to Oracle)
                        break;
                    case 6:
                        calcOutput = Math.log(secondOperand) / Math.log(firstOperand);
                        System.out.println("\nCurrent Result: " + calcOutput); //represents the log change of base formula
                        break;
                }

                sumCalcOutput = sumCalcOutput + calcOutput;
                numOfCalcOutput++;
                avgCalcOutput = Math.round(sumCalcOutput * 100 / numOfCalcOutput) / 100.0;

                System.out.println("\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n" +
                        "3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");
                System.out.print("Enter Menu Selection: ");

                userInput = TI.nextInt();
            } else if (userInput == 7) {

                if (numOfCalcOutput == 0) {
                    System.out.println("\nError: No calculations yet to average!");
                } else System.out.println("\nSum of calculations: " + sumCalcOutput + "\nNumber of calculations: "
                        + numOfCalcOutput + "\nAverage of calculations: " + avgCalcOutput);

                System.out.print("Enter Menu Selection: ");

                userInput = TI.nextInt();
            } else {

                System.out.println("\nError: Invalid selection!");
                System.out.print("\nEnter Menu Selection: ");
                userInput = TI.nextInt();

            }

        }

        System.out.println("\nThanks for using this calculator. Goodbye!");

    }
}