package Game;

public class App {
	public static void main(String[] args) throws InterruptedException
	{
		Text.startText();
		Checker.controller();
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
	private static final String th = null;

	public static void startText() throws InterruptedException
	{
		System.out.println("Hello...");
		System.out.println();
		Thread.sleep(500);
		
		System.out.println("This is a number guessing game in terminal.");
		System.out.println();
		Thread.sleep(500);
		
		System.out.println("I got a number in my mind, it's between 0 to 50");
		System.out.println();
		Thread.sleep(500);
		
		System.out.println( "Let's see if you can find this number in 5 times with a little help :)");
		System.out.println();
		Thread.sleep(500);
	}

	public static void answerText()
	{
	int count = Counter.increase() - 1;
	
	String suffix;
	if (count == 1)
		suffix = "st";
	else if (count == 2)
		suffix = "nd";
	else if (count == 3)
		suffix = "rd";
	else
		suffix = "th";
	
	System.out.println("Congratulations, you got the right answer on the  " + count + suffix + ". try");	
	}
}
class Request {
	
	public static int takeNumber()
	{
		int count = Counter.increase();
		
		String suffix;
		if (count == 1)
			suffix = "st";
		else if (count == 2)
			suffix = "nd";
		else if (count == 3)
			suffix = "rd";
		else
			suffix = "th";
		
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
		
		
		for (int i = 1; i <= 4; i = i + 1)
			if (RandomNumber == Answer) {
				i = 4;
				Text.answerText();
			}
			else
			{
				System.out.println("Sorry, wrong Answer ");
				Answer = Request.takeNumber();		
			}
		System.out.println("The correct answer would be " + RandomNumber);
	}
}

 class Counter {
    private static int count = 0;
    public static int increase() {
        count++;
        return count;
    }
   
}