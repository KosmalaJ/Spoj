#include <iostream>
using namespace std;
long long maximum(long long a, long long b)
{
    if(a>=b)
        return a;
        else return b;

}
static long long  maxSubArraySum(long long a[],int size)
    {
        long long max_so_far = a[0];
        long long curr_max = a[0];
        for (int i = 1; i < size; i++)
        {
            curr_max = maximum(a[i], curr_max+a[i]);
            max_so_far = maximum(max_so_far, curr_max);
        }
        if(max_so_far<0)
            return 0;
            else
        return max_so_far;
    }
int main()
{int size;
     cin>>size;
     long long array[size];
     for(int i=0;i<size;i++)
     {
    cin>>array[i];
     }
     cout<<maxSubArraySum(array,size);
    return 0;
}
