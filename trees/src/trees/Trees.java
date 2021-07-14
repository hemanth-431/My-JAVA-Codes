
package trees;

import java.util.Scanner;
class Node{
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value=value;
        right=null;
        left=null;
    }
}

class Binarytree{
    Node root;
    public void traver(Node node){
        if(node!=null){
            traver(node.left);
try{        System.out.println(node.value);
        traver(node.right);}catch(Exception e){}
    }
    }
}

public class Trees {

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    
    
    Binarytree b=new Binarytree();
    b.root=new Node(1);
   b.root.left=new Node(2);
    b.root.right=new Node(3);
    b.root.left.left=new Node(4);
    b.traver(b.root);
    }
    
}

/*#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
}*x;
struct node *head=NULL;
struct node *temp;
 void add(int a){
    x=(struct node*)malloc(sizeof(struct node));
    x->data=a;
    x->next=NULL;
    if(head==NULL){
        head=x;
        temp=head;
    }else{
        temp->next=x;
        temp=temp->next;
        
    }
}
int main() {
  int n;
  scanf("%d",&n);
  int a;
  for(int i=0;i<=n;i++){
      scanf("%d",&a);
      add(a);
  }
  while(head->next!=NULL){
      printf("%d",head->data);
      head=head->next;
  }
}
*/