int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int *ans = malloc(sizeof(int)*numsSize);
    int i=0,j=n,k=0;
    while(1){
        if(i%2==0){
            ans[i]=nums[k];
            k++;
        }
        else{
            ans[i]=nums[j];
            j++;
        }
        i++;
        if(i==numsSize){
            break;
        }
    }
    *returnSize = numsSize;
    return ans;
}