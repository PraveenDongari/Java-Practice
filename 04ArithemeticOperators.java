public class ArithemeticOperators {
    public static void main(String[] args) {
        int num1=5;
        int num2=9;

        int sum=num1+num2;
        int difference=num2-num1;
        int product=num1*num2;
        int division=num1/num2;
        int modulus=num1%num2;//remainder


        num1=num1+1;//post-incrementing num1 by 1
        num1+=1;
        num1++;

        ++num1; //pre-increment
        int result1=num1++; // assigns value to the variable and then increment the value
        int result2=++num1; // increment the value and assign it to the variable.
        System.out.println(result1);
        System.out.println(result2);

        num1=num1-1;//post-decrementing num1 by 1
        num1=1;
        num1--;

        num1=num1*2;//multiplying num1 by 2 and storing it in num1
        num1*=2;

        num1=num1/2;//dividing num1 by 2 and storing it in num1
        num1/=2;
    }
}
