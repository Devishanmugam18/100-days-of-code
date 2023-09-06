#include<stdio.h>
int main(){
int P,Q;
printf("Enter number of participants");
scanf("%d",&P);
printf("Enter number of not participants");
scanf("%d",&Q);
printf("Number of contests is %d ",P-Q );
return 0;
}
