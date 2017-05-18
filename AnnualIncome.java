//This program displays a person's name, age, and annual income to the console
public class AnnualIncome
{
	public static void main(String[]args)
	{
		//variable declarations
		String name;
		int age;
		double annualPay;

		name = "Justin Doggett"; //setting the string variable name to the value Justin Doggett
		age = 29;                //setting the int variable name age to the value of 29.
		annualPay = 41600;    //setting the double variable annualPay to the value of 41600.00

		//Display name, age, and annual income to the console.
		System.out.print("My name is " + name + "," + " my age is " + age + " and \n");
		System.out.println("I hope to earn " + annualPay + " per year.");
  }
}


