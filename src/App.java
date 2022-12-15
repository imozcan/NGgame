
import java.util.Random;

public class App  {
	public static void main(String[] args) throws InterruptedException {
	            Random r = new Random();            
	            int a[] = new int[5];
	            java.util.Scanner kb = new java.util.Scanner(System.in);
	            int i, low, high, result, answer, n;
	        
	            low = 1;
	            high = 50;
	            result = r.nextInt(high - low) + low;
	            

	            
	            for (i = 1; i <= 390; i = i + 1) 
	            	if (i == 15) {
	            		System.out.println();
	            		Thread.sleep(50);
	            		System.out.println("* Hoşgeldin. *"); // 15 karakter
	            	}
	            	else if (i == 30) {
	            		System.out.println();
	            		Thread.sleep(50);
	            		System.out.println();
	            	}
	            	
	            	else if (i == 70){
	            		System.out.println();
	            		Thread.sleep(50);
      	            System.out.println( "*    Bu bir sayı tahmin etme oyunu    *"); // 40 karakter
	            	}
	            
	            	else if (i == 110) {
	            		System.out.println();
	            		Thread.sleep(50);
	            		System.out.println();
	            	}
	            	
	            	else if (i == 170) {
	            		System.out.println();
	            		Thread.sleep(50);
	            		System.out.println( "*   Aklımdan bir sayı tuttum, bu sayı 0 ile 50 arasında.  *");  // 60
	            	}
	            	else if (i == 230) {
	            		System.out.println();
	            		Thread.sleep(50);
	            		System.out.println();
	            	}
	            
	            	else if (i == 310) {
	            		System.out.println();
	            		Thread.sleep(50);
	            		System.out.println( "*   Bakalım küçük tüyolarım sayesinde bu sayıyı 5 defada bulabilecek misin?   *"); //80
	            	}
	            
	            	else if (i == 390) {
	            		System.out.println();
	            		Thread.sleep(1000);
	            		System.out.println();
	            	}
	            	else {
	            	System.out.print("*");  
	            	Thread.sleep(50);
	            	}


	            System.out.print( "ilk tahminini gir bakalım : ");
	                      
	            
	            for (i = 0; i < 5; i = i + 1) {
	            	answer= kb.nextInt();
	                a[i] = answer; 
	                if (result == answer){
	                	System.out.println();
	                	System.out.println();	                	
	                    System.out.println( " ***  Tebrikler " + (i + 1) + ". denemende doğru cevabı buldun. *** "); 	              
	                    break;
	                }
	                else if (result > answer)
	                        if (i < 4){
	                        	Thread.sleep(100);
	                            System.out.println();	    	                	
	                            System.out.print( "Üzgünüm " + answer + " doğru sayı değil, daha BÜYÜK bir sayı denemelisin: ");

	                        }
	                        else {
	                        	System.out.println();      
		                        System.out.println("Üzgünüm doğru sayıyı bulamadın, cevap " + result + " olacaktı.");
		                        Thread.sleep(2000);
		                        System.out.println();
		                        System.out.print("Tekrar oynamak ister misin? (Evet: 1  Hayır: 2) :");
		                        n = kb.nextInt();
		                        if (n == 1) {
		                        	result = r.nextInt(high - low) + low;
		                        	i = 0;
		                        	System.out.print( "ilk tahminini gir bakalım : ");
		         	        	   	continue;	
		                        }
		                        else
		                        	System.out.println("Görüşmek üzere... ");
		                        
		                    }
	                else if (result < answer)
	                		if(i < 4) {
	                			Thread.sleep(100);
	                			System.out.println();       	
	                			System.out.print( "Üzgünüm " + answer + " doğru sayı değil, daha KÜÇÜK bir sayı denemelisin: ");
	                		}
	                
	                		else {
	                			System.out.println();      
	                			System.out.println("Üzgünüm doğru sayıyı bulamadın, cevap " + result + " olacaktı. ");
	                			Thread.sleep(2000);
	                			System.out.println();
	                			System.out.print("Tekrar oynamak ister misin? (Evet: 1  Hayır: 2) :");
		                        n = kb.nextInt();
		                        
		                        if (n == 1) {
		                        	result = r.nextInt(high - low) + low;
		                        	i = 0;
		                        	System.out.print( "ilk tahminini gir bakalım : ");
		         	        	    continue;   
		                        } 
		                        else 
		                        	
		                			System.out.println("Görüşmek üzere... ");		         	        	   
	                		}
           	
	            }	        	   
	}
}
