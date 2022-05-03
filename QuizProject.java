import java.util.*;
import java.util.concurrent.TimeUnit; // importing the TimeUnit class
//throws InterruptedException  // throws InterruptedException is used for the  timeUnit class to give time gap between the Execution of the Statements.
public class QuizProject
{
	static Scanner sc = new Scanner(System.in);
	static String str;   // str variable to used at the end and start of the Examination.
	static int marks=0; // variable for the marks
	static int attempted=0; // variable for the attempted question
	static int correct=0; // variable for the correct answers
	static int wrong=0; // variable for the wrong answers
	static String selectedOption; // variable for the selection of the option to the question.
	static String correctOption;  // variable to store the correct answer of the Question.
	
	public static void options(String correctOption) throws InterruptedException  // This is the options function and it is used to count the number of correct answers,wrong answers,total number of attempted questions and the total score of the Examination
	{
		System.out.print("\n\t\t  Type Option number otherwise type 0 to goto next Question : ");
		selectedOption=sc.next();
		if(selectedOption.equals("0"))
		{
			TimeUnit.SECONDS.sleep(2);
			System.out.println("\n\t\t  Saved Successfully");
		}
		else if(selectedOption.equals(correctOption))
		{
			marks+=2;
			correct+=1;
			attempted+=1;
			TimeUnit.SECONDS.sleep(2);
			System.out.println("\n\t\t  Saved Successfully");
		}
		else if(selectedOption.equals("1")||selectedOption.equals("2")||selectedOption.equals("3")||selectedOption.equals("4"))
		{
			marks-=1;
			wrong+=1;
			attempted+=1;
			TimeUnit.SECONDS.sleep(2);
			System.out.println("\n\t\t  Saved Successfully");
		}
		else
		{
			TimeUnit.SECONDS.sleep(2); 
			System.out.println("\n\t\t  Type the valid Option ");
			options(correctOption);
		}
	}
	public static void main(String args[]) throws InterruptedException  // throws InterruptedException is used for the  timeUnit class to give time gap between the Execution of the Statements.
	{ 	
		//Details of the Examination
		System.out.println("\n");
		System.out.println("\t\t\t\t\tTest Name     : DataStructures");
		System.out.println("\t\t\t\t\tTotal Marks   : 10");
		System.out.println("\t\t\t\t\tNegativeMarks : Enabled\n");
		
		//General Instructions for the Examination.
		System.out.println("\n\t\t  General Instructions:");
		System.out.println("\n\t\t  Please Read the below mentioned Instructions Carefully before Atempting the test\n");
		System.out.println("\t\t  1.All questions shall be compulsory.\n");
		System.out.println("\t\t  2.The marking scheme is 2 mark for a correct answer, -1 marks for a wrong answer,");
		System.out.println("\t\t    and 0 marks for questions left un-attempted.\n");
		System.out.println("\t\t  3.All questions are displayed in unidirectional order, i.e. the student will not be");
		System.out.println("\t\t    allowed to go back to previous questions, attempted or un-attempted.\n");
	    System.out.println("\t\t  4.Type yes to start the Examination.\n");
	    System.out.println("\t\t  5.Type end to Submit the Examination.\n");
	    System.out.println("\t\t  6.Type 0 to go to the next Question.\n");
	    System.out.println("\t\t  7.If you type anything insted of option nummbers you can automatically terminate out of the Examination.\n");
	    System.out.println("\t\t  8.Type 9 to continue the Examination.\n");
	    TimeUnit.SECONDS.sleep(2); // TimeUnit class sleep for the two Seconds...
		
	    // program for type yes to start the Examination...
		System.out.println("\t\t\t\t\t   Please Type YES to Start Examination\n");
		System.out.print("\t\t\t\t\t\t\t Type YES : ");
		String str = sc.next();
		while((!str.equals("yes")) && (!str.equals("YES"))  && (!str.equals("Yes")) && (!str.equals("yEs")) && (!str.equals("yeS")))
		{
			System.out.println("\n\t\t\t\t\t please type the correct Spelling of YES again\n");
			System.out.print("\t\t\t\t\t\t\t Type YES : "); 
			str=sc.next();
		}
		
		//Question-1
		TimeUnit.SECONDS.sleep(3);
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		// Question
		System.out.println("\n\t\t  Q1.Which one of the following is the size of int arr[9] assuming that int is of 4 bytes?"); // question-1
		System.out.println("\n\t\t\t1.9\n\n\t\t\t2.36\n\n\t\t\t3.34\n\n\t\t\t4.None of the above");//question-1 Options 
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t| NEXT |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~");
		options("2"); // Option function to check the Option is correct or not.
		
		//Question-2
		TimeUnit.SECONDS.sleep(3);
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		// Question
		System.out.println("\n\t\t  Q2.How can we describe an array in the best possible way?");
		System.out.println("\n\t\t\t1.The Array shows a hierarchical structure.\n\n\t\t\t2.Arrays are immutable.\n\n\t\t\t3.Container that stores the elements of similar types\n\n\t\t\t4.The Array is not a data structure");
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t| NEXT |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~");
		options("3"); // Option function to check the Option is correct or not.
		
		//Question-3
		TimeUnit.SECONDS.sleep(3);
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		// Question
		System.out.println("\n\t\t  Q3.Which of the following DataStructure is a Non-Linear Type?"); // Question -3
		System.out.println("\n\t\t\t1.Array.\n\n\t\t\t2.Queue.\n\n\t\t\t3.Stack\n\n\t\t\t4.Tree"); // Options of Question-3
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t| NEXT |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~");
		options("4"); // Option function to check the Option is correct or not.
		
		//Question-4
		TimeUnit.SECONDS.sleep(3);
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//Question
		System.out.println("\n\t\t  Q4.Which DataStructure is a LIFO Type?"); // Question-4
		System.out.println("\n\t\t\t1.Array.\n\n\t\t\t2.Queue.\n\n\t\t\t3.Stack\n\n\t\t\t4.Tree"); // Options of the Question-4
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t| NEXT |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~");
		options("3"); // Option function to check the Option is correct or not.
		
		//Question-5
		TimeUnit.SECONDS.sleep(3);
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//Question
		System.out.println("\n\t\t  Q5.Which DataStructure is a FIFO Type?"); // question-5
		System.out.println("\n\t\t\t1.Array.\n\n\t\t\t2.Queue.\n\n\t\t\t3.Stack\n\n\t\t\t4.Tree"); //Options of Question-5 
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~~~");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t| FINISH |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ~~~~~~~~");
		options("2"); // Option function to check the Option is correct or not.
		
		// program for type end to submit the Examination...
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\n\t\t\t\t\t   Type END to Submit Examination\n"); // program to type end to submit the examination.
		System.out.print("\t\t\t\t\t\t\t Type END : ");
		str = sc.next();
		while((!str.equals("end")) && (!str.equals("END")) && (!str.equals("End")) && (!str.equals("eNd")) && (!str.equals("enD"))) //  while loop will rotate until spelling of end is correct.
		{
			System.out.println("\n\t\t\t\t\t  Type the correct Spelling of END again\n");
			System.out.print("\t\t\t\t\t\t\t Type END : ");
			str=sc.next();
		}
		
		//Programm To display the Score Card
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n\t\t  Submitted Successfully");
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("\n\n\t\t\t\t\t\tSCORE CARD");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n\t\t\t\t\tTotal ATTEMPTED Questions : "+attempted);
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n\t\t\t\t\tNumber of CORRECT Answers : "+correct);
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n\t\t\t\t\tNumber of WRONGE Answers  : "+wrong);
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n\t\t\t\t\tTotal SCORE               : "+Math.max(marks,0));
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		sc.close(); //closing the Scanner class
	}
}