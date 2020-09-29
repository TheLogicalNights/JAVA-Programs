/*
    Problem Statement : Accept number from user check whether that number is armstrong or not

                        input : 153 (1^3 + 5^3 + 3^3) -> 3 is the number of digits
                        output : True

                        input : 2145 (2^4 + 1^4 + 4^4 + 5^4) -> 4 is the number of digits
                        output : false
*/

import java.util.*;

class Digits
{
    boolean ChkArmstrong(String cNo)
    {
        int iCnt;
        int iNo = Integer.parseInt(cNo);
        int iTemp = iNo;
        int iSum = 0;
        int iDigit = 0;
        int iProduct = 1;
        while(iNo!=0)
        {
            iCnt = cNo.length();
            iDigit = iNo % 10;
            while(iCnt!=0)
            {
                iProduct = iProduct * iDigit;
                iCnt--;
            }
            iSum = iSum + iProduct;
            if(iSum>iTemp)
            {
                break;
            }
            iNo = iNo / 10;
            iProduct = 1;
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
        String cNo = cin.next();

        Digits dobj = new Digits();

        boolean bRet = dobj.ChkArmstrong(cNo);

        if(bRet==true)
        {
            System.out.println(cNo+" is an armstrong number");
        }
        else
        {
            System.out.println(cNo+" is not an armstrong number");
        }
    }
}