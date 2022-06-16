int findNumbers(int* nums, int numsSize)
{
    int count=0,i,evenDigits=0;
    for(i=0;i<numsSize;i++)
    {
        while(nums[i]>0)
        {
            nums[i]=nums[i]/10;
            count++;
        }
        if(count%2==0)
        evenDigits++;
    }
    return evenDigits;
}
