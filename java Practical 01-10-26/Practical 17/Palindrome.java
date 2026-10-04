/*17\. Write a Java program to create a `Palindrome` class with a method that accepts an integer and checks whether it is a palindrome.*/
class Palindrome{
    void palindrome(int num){
        int original = num;
        int palindrome = 0;
        while (num > 0) {
            int num2 = num % 10;
            palindrome = palindrome * 10 + num2;
            num = num/10;
        }

        if (original == palindrome) {
            System.out.println("Number is Palindrome");
        }else
            System.out.println("Number is not Palindrome");
    }

    public static void main(String[] args) {
        Palindrome pln = new Palindrome();
        pln.palindrome(151);
    }
}