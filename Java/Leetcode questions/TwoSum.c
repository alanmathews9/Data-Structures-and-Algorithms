#include<stdio.h>
int main(){
    int a[20],n,sum=0,target,i,j;
    scanf("%d",&n);
    scanf("%d",&target);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            sum=a[i]+a[j];
            if(sum==target){
                printf("[%d,%d]",i,j);
            }
            else{
                sum=0;
            }
        }
    }
    return 0;
}