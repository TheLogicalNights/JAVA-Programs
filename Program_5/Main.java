/*
    Problem Statement : Accept number from and check whether that number is strong number or not.
                        Strong number is such anumber whose summation of factorial of digits is same as that number.
                        Example : 145  1! + 4! + 5! = 145	true
                        Example : 190  1! + 9! + 0! != 190	false
*/

import java.util.*;

class Digit
{
    boolean ChkStrong(int iNo)
    {
        int iSum = 0;
        int iTemp = iNo;
        int iFact[] = {1,1,2,6,24,120,720,5040,40320,362880};
        while(iNo!=0)
        {
            iSum = iSum + iFact[iNo % 10];
            if(iSum>iTemp)
            {
                break;
            }
            iNo = iNo / 10;
        }
        if(iSum==iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter a number");
        int iNo = cin.nextInt();

        Digit dobj = new Digit();

        boolean bRet = dobj.ChkStrong(iNo);

        if(bRet==true)
        {
            System.out.println(iNo+" is strong number");
        }
        else
        {
            System.out.println(iNo+" is not strong number");
        }     
    }
}
