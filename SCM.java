import java.util.Arrays;
import java.util.Scanner;

public class SCM{
    public static void ascen(int[] arr){
        Arrays.sort(arr);
    }

    public static void palindrome(int[] arr){
        int a = arr[4];
        int b = a;
        int rev = 0;
        while(b>0){
            rev = (rev*10)+(b%10);
            b = b/10;
        }
        System.out.println(a + (a==rev? " is a palindrome": " isn't a palindrome"));
    }

    public static void isEven(int[] arr){
        int iseven = arr[3];
        System.out.println(iseven + (iseven%2==0 ? " is an even number":" is not an even number"));
    }

    public static void fact(int[] arr){
        int fact = arr[2];
        int factorial = fact;
        for(int i=fact;i>1;i--){
            factorial = factorial * (i-1);
        }
        System.out.println(fact +" factorial is: " + factorial);
    }

    public static void fibonacci(int[] arr){
        int n = arr[1];
        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci series for "+n+" is: ");
        for(int i=0; i<n; i++){
            System.out.print(num1 + " ");
            num1 = num2;
            num2 = num1 + num2;
        }
    }

    public static int isPrime(int[] arr){
        int isPrime = arr[0];
        for(int i=2; i<isPrime/2; i++){
            if(isPrime==2) return 0;
            if(isPrime%i==0) return 1;
            if(isPrime%i!=0) return 0;
        }
        return 2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements: ");
        int[] arr = new int[5];
        for(int i=0; i<5; i++)
        arr[i] = sc.nextInt();
        sc.close();
        ascen(arr);
        palindrome(arr);
        isEven(arr);
        fact(arr);
        fibonacci(arr);
        System.out.println();
        int isPrime = isPrime(arr);
        if(isPrime==1) System.out.println(arr[0] + " is a composite number");
        else if(isPrime==0) System.out.println(arr[0] + " is a prime number");
        else System.out.println(arr[0] + " is neither a prime nor composite number");
    }
}