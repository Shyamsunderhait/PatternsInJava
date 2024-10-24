public class FindLargestSmallestNumber {

 public static void main(String[] args) {

  
  int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};

  
  int smallest = numbers[0];
  int largetst = numbers[0];

  for (int i = 1; i < numbers.length; i++) {
   if (numbers[i] > largetst)
    largetst = numbers[i];
   else if (numbers[i] < smallest)
    smallest = numbers[i];
  }

  System.out.println("Largest Number is : " + largetst);
  System.out.println("Smallest Number is : " + smallest);
 }
}

public class FindFactorial {

 public static void main(String[] args) {

  int number = 4;
  int factorial = number;

  for (int i = (number - 1); i > 1; i--) {
   factorial = factorial * i;
  }

  System.out.println("Factorial of " + number + " is " + factorial);
 }
}


public class PrimeNumbers {
  public static void main(String[] args) {
    int num = 20;  // Define the upper limit
    int count;  // Initialize counter for divisibility checks

    // Iterate from 1 up to 'num' to identify prime numbers
    for (int i = 1; i <= num; i++) {
      count = 0;  // Reset counter for each 'i'

      // Check for divisibility from 2 up to i/2
      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          count++;  // Increment if 'i' is divisible by 'j'
          break;  // Exit loop if a divisor is found
        }
      }

      // If the count is 0, 'i' is prime
      if (count == 0) {
        System.out.println(i);  // Output the prime number
      }
    }
  }
}

public class IsPrimeNumber {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;

    // 0 and 1 are not prime numbers
    if (num == 0 || num == 1) {
        flag = true;
    }

    for (int i = 2; i <= num / 2; ++i) {

      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest; // Update second largest
                firstLargest = num;           // Update first largest
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;          // Update second largest if it's less than firstLargest
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 5, 8, 8, 9, 9, 6, 6, 9};
        int result = findSecondLargest(array);
        System.out.println("The second largest element is: " + result);
    }
}


public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        String input = "madam"; // Change this to test other strings
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10; // Change this value to generate more Fibonacci numbers
        System.out.println("Fibonacci Series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}

public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 10; // Change this value to generate more Fibonacci numbers
        System.out.println("Fibonacci Series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}



//String Questions 


class HelloWorld {
    
    public static String reverseString(){
        String input = "shyam";
     String reversed = "";
     
     for(int i = input.length() - 1;i>=0;i--){
         reversed += input.charAt(i);
     }
     return reversed;
    
    }
    
    public static Boolean isPalindrome(){
        String input = "racecar";
        
        for(int i = 0;i<= input.length()/2;i++){
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
                return false;
            }
            
        }
        return true;
    }
    
    public static String removeDuplicates(){
        String input = "geeksforgeeks";
        
        String result = "";
        
        for(int i = 0;i<input.length();i++){
            char character = input.charAt(i);
            boolean isDub = false;
            for(int j = 0;j< result.length();j++){
                if(result.charAt(j) == character){
                    isDub = true;
                    break;
                }
            }
            
            if(!isDub){
                result += character;
                
            }
        }
        return result;
    }
    
    
    public static int countOccurrences(String input,char target){
         int count = 0;
         
         for(int i = 0;i< input.length();i++){
             if(input.charAt(i) == target){
                 count++;
             }
         }
         return count;
    }
    
    public static boolean areAnagrams(String s1, String s2)
    {
        // Sort both strings
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted strings
        return Arrays.equals(charArray1, charArray2);
    }

    
    
    
    
    public static void main(String[] args) {
     System.out.println(reverseString());
        System.out.println(isPalindrome());
        System.out.println(removeDuplicates());
        System.out.println(countOccurrences("shyamsunderhait",'a'));
    }
}