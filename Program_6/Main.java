/*
    Problem Statement : Accept number from user and return its generic root.                    
                        
                        Input 789                    
                        Output : 6 		7+8+9	-> 24 -> 2+4	-> 6                    
                        
                        Input : 9948                    
                        Output : 3 		9+9+4+8	->	30	-> 3+0	-> 3                    
                        
                        Input : 8                    
                        Output : 8	-> 8                    
                        
                        Input :	12	                    
                        Output:  3	-> 1 + 2 -> 3
*/ 


import java.util.*;

class Digit
{
    int GenericRoot(int iNo)
    {
        int iSum = iNo;
       
        if(iNo<0)
        {
            iNo = -iNo;
        }

        while(iSum>9)
        {
            iNo = iSum;
            iSum = 0;
            while(iNo!=0)
            {
                iSum = iSum + (iNo%10);
                iNo = iNo / 10;
            }
        }
        return iSum;
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

        int iRet = dobj.GenericRoot(iNo);

        System.out.println("Generic root is : "+iRet);
    }
}