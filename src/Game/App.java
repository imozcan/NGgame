package game;

public class App {
	public static void main(String[] args) throws InterruptedException
	{
		Text.startText();	
	}
}
class GenerateRandom {
	public static int random()
	{
		java.util.Random r = new java.util.Random();            
        int low = 1; int high = 50; int RandomNumber;
        RandomNumber = r.nextInt(high - low) + low;
        return RandomNumber;
	}
}

class Text {
	
	public static void startText() throws InterruptedException
	{
		System.out.println("Hello...");
		System.out.println();
		Thread.sleep(500);
		
		System.out.println("This is a number guessing Game in terminal.");
		System.out.println();
		Thread.sleep(500);
		
		System.out.println("I got a number in my mind, it's between 0 to 50");
		System.out.println();
		Thread.sleep(500);
		
		System.out.println( "Let's see if you can find this number in 5 times with a little help :)");
		System.out.println();
		Thread.sleep(500);
		
		System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println();
		Thread.sleep(500);
		
		Checker.controller();
	}

	public static void answerText()
	{
	int count = Counter.increase() - 1; //-1 --> two method fixes linked to one Counter.
	SuffixCounter.decrease(); //fixes two method linked to one SuffixCounter.
	String suffix = Text.suffixText();
	System.out.println("Congratulations, you got the right answer on the  " + count + suffix + ". try");
	}
		
	public static  String suffixText()
	 {
		 int count = SuffixCounter.increase();
		 String suffix;
			if ( count == 1)
				suffix = "st";
			else if (count == 2)
				suffix = "nd";
			else if (count == 3)
				suffix = "rd";
			else
				suffix = "th";
			
			return suffix;
	 }
	
	public static void starText()
	{
		System.out.println("*");
	}
}
class Request {
	
	public static int takeNumber()
	{
		System.out.println();
		int count = Counter.increase();
		String suffix = Text.suffixText();
		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Enter your "+ count + suffix +" guess : ");
		int Answer = Integer.parseInt(kb.nextLine());
		return Answer;
	}
}

class Checker {
	
	public static void controller()
	{
		int RandomNumber = GenerateRandom.random();
		int Answer = Request.takeNumber();
		int i;
		
		for (i = 1; i <= 5; i = i + 1)
			if (RandomNumber == Answer) 
			{ 
				Text.answerText();
				break;
			}
			else
			{	
				if (RandomNumber < Answer)
					System.out.println(" -> Sorry, wrong Answer, try less than " + Answer);
				else
					System.out.println(" -> Sorry, wrong Answer, try more than " + Answer);             
				if (i < 5)
					Answer = Request.takeNumber();		
			}
		if (i > 5) 
		{
			System.out.println();
			System.out.println();
			System.out.println(" * The correct answer would be " + RandomNumber);
		}
	}
}

 class Counter {
    private static int count = 0;
    public static int increase() 
    {
        count++;
        return count;
    }
}
 class SuffixCounter {
	    private static int suffixCount = 0;
	    public static int increase() 
	    {
	    	suffixCount++;
	        return suffixCount;
	    }   
	    public static int decrease() 
	    {
	    	suffixCount--;
		    return suffixCount;
	    } 
}