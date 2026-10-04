/*18. Write a Java program to create a `VotingSystem` class with a method to check voting eligibility based on age*/

class VotingSystem{

    void eligibility(int age){
        if (age >= 18) {
            System.out.println("You are eligible for voting");
        }else
            System.out.println("You are not eligible for voting");
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.eligibility(18);
    }
}