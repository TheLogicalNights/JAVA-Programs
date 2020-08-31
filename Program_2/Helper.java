///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : ChkEvenOdd
// Parameters    : Integer
// Return Value  : BOOLEAN
// Description   : It takes one integer as input and check whether it is even or odd
// Author        : Swapnil Ramesh Adhav
// Date          : 31th August 2020
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Helper;

public class Helper
{
    int iValue = 0;
    public Helper(int iNo)
    {
        iValue = iNo;
    }
    public boolean ChkEvenOdd()
    {
        if((iValue%2)==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}