/*
    Problem Statement : Accept range from user and display all the strong numbers from that range.
*/

import java.util.*;

class Digit
{
    void ChkStrongRange(int iStart,int iEnd)
    {
        int iCnt = 0;
        int iNo = 0;
        int iDigit = 0;
        int iSum = 0;
        int iFact[] = {1,1,2,6,24,120,720,5040,40320,362880};
        if(iStart>iEnd)
        {
            System.out.println("Error : Invalid Range");
            return ;
        }
        if((iStart<=0) || (iEnd<=0))
        {
            System.out.println("Error : Invalid Range");
            return ;
        }
        for(iCnt=iStart;iCnt<=iEnd;iCnt++)
        {
            iSum = 0;
            iNo = iCnt;
            while(iNo!=0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iFact[iDigit];
                if(iSum>iCnt)
                {
                    break;
                }
                iNo = iNo / 10;
            }
            if(iSum==iCnt)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter starting number of range");
        int iStart = cin.nextInt();

        System.out.println("Enter ending number of range");
        int iEnd = cin.nextInt();

        Digit dobj = new Digit();

        dobj.ChkStrongRange(iStart,iEnd);
    }
}