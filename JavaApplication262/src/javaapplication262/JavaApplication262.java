
package javaapplication262;


public class JavaApplication262 {

    public static void main(String[] args) {
       
    }
    
}

/*
#include<stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *next;
}*x;
struct node *head=NULL;
struct node *temp=NULL;
void insert(int da){
    x=(struct node*)malloc(sizeof(struct node));
    x->data=da;
    x->next=NULL;
    if(head==NULL){
        head=x;
        temp=head;
    }else{
        temp->next=x;
        temp=temp->next;
        
    }
}

void swap(struct node* a,struct node* b){
       int tem=a->data;
     
    a->data=b->data;
    b->data=tem;
 
 
    
}
void bubblesort(struct node* hea){
    struct node *head1=NULL;
    
    while(hea->next!=head1)
do{
    if(hea->data > hea->next->data){
        swap(hea,hea->next);
       
    }
    
    
     hea=hea->next;
        t=t->next;
}while(t!=NULL);
   
  bubblesort(head,r-1);
        
    
   
    

}

int main() {
  insert(3);
  insert(9);
  insert(7);
  insert(10);
  insert(1);
  
  
  
  bubblesort(head);
  while(head->next!=NULL){
      printf("%d",head->data);
      head=head->next;
  }
  printf("%d",head->data);
}
*/