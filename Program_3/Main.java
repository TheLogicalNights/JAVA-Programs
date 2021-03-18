/*
    Problem Statement : Accept two numbers from user and return addition of that numbers
*/

import java.util.Scanner;

class Numbers
{
    int Add(int iNo1,int iNo2)
    {
        return iNo1+iNo2;
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter first number");
        int iNo1 = cin.nextInt();

        System.out.println("Enter second number");
        int iNo2 = cin.nextInt();

        Numbers nobj = new Numbers();

        int iRet =  nobj.Add(iNo1,iNo2);

        System.out.println("Addition is : "+iRet);
    }
}
