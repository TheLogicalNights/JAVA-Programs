/*
    Problem Statement : Accept one number from user and check whether it is Even or Odd
*/ 

import Helper.Helper;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        boolean bRet = false;
        int iNo = 0;
        
        System.out.println("Enter a number");
        iNo = cin.nextInt();

        Helper h = new Helper(iNo);
    
        bRet = h.ChkEvenOdd();

        if(bRet == true)
        {
            System.out.println(iNo+" is Even");
        }
        else
        {
            System.out.println(iNo+"is Odd");
        }
    }
}