#include< stdio.h>
#include< conio.h>

struct poly
{
 int expo;
 int coeff;
};

void main()
{
 struct poly poly1[10],poly2[10],product[100];
 int noOfTerms1,noOfTerms2,count=-1;
 int i,j;
 clrscr();
 printf("\nEnter Number Of Terms Of 1st Polynomial: ");
 scanf("%d",&noOfTerms1);
 for(i=0;i< noOfTerms1;i++)
 {
  printf("\nEnter expo: ");
  scanf("%d",&poly1[i].expo);
  printf("\nEnter Coefficient: ");
  scanf("%d",&poly1[i].coeff);
 }
 printf("\nEnter Number Of Terms Of 2nd Polynomial: ");
 scanf("%d",&noOfTerms2);
 for(i=0;i< noOfTerms2;i++)
 {
  printf("\nEnter expo: ");
  scanf("%d",&poly2[i].expo);
  printf("\nEnter Coefficient: ");
  scanf("%d",&poly2[i].coeff);
 } 
 for(i=0;i< noOfTerms1;i++)
 {
  for (j=0;j< noOfTerms2;j++)
  {
   product[++count].expo=poly1[i].expo+poly2[j].expo;
   product[count].coeff=poly1[i].coeff*poly2[j].coeff;
  }
 }
 printf("\nThe Product Of Two Polynomials Is: \n");
 for(i=0;i<=count;i++)
 {
  if(product[i].expo==0)
   printf("%d ",product[i].coeff);
  else if(product[i].expo==1)
   printf("%dx ",product[i].coeff);
  else
  {
   printf("%dx^%d ",product[i].coeff,product[i].expo);
  }
  if(i!=count)
  printf("+ ");
  }
 getch();
 }
}