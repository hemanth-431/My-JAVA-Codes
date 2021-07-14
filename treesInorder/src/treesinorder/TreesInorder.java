
package treesinorder;


public class TreesInorder {

  
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
/*#include <stdio.h>
#include <stdlib.h>
struct tnode
{
    int data;
    struct tnode *right;
    struct tnode *left;
};

struct tnode *CreateBST(struct tnode *, int);
void Inorder(struct tnode *);
void Preorder(struct tnode *);
void Postorder(struct tnode *);

int main()
{
    struct tnode *root = NULL;
    int choice, item, n, i;
   
        
            root = NULL;
           
            scanf("%d",&n);
            for(i = 1; i <= n; i++)
            {
                
                scanf("%d",&item);
                root = CreateBST(root,item);
            }
            
       Inorder(root);
    return 0;
}

struct tnode *CreateBST(struct tnode *root, int item)
{
    if(root == NULL)
    {
        root = (struct tnode *)malloc(sizeof(struct tnode));
        root->left = root->right = NULL;
        root->data = item;
        return root;
    }
    else
    {
        if(item < root->data )
            root->left = CreateBST(root->left,item);
        else if(item > root->data )
            root->right = CreateBST(root->right,item);

        return(root);
    }
}

void Inorder(struct tnode *root)
{
    if( root != NULL)
    {
        Inorder(root->left);
        printf(" %d ",root->data);
        Inorder(root->right);
    }
}

*/

/*#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *right;
    struct node *left;
}*x;
struct node *root=NULL;
struct node *tree(struct node *root,int da){
    if(root==NULL){
        x=(struct node*)malloc(sizeof(struct node));
        x->data=da;
        x->right=NULL;
        x->left=NULL;
        root=x;
        return root;
    }else {if(da > root->data){
        root->right=tree(root->right,da);
    }else{
        root->left=tree(root->left,da);
    }
    return root;
    }
}
void Inorder(struct node *root)
{
    if( root != NULL)
    {
        Inorder(root->left);
        printf(" %d ",root->data);
        Inorder(root->right);
    }
}
int main() {
    root = tree(root,7);
    
    root = tree(root,3);
    root = tree(root,8);
    root = tree(root,1);
    root = tree(root,2);
    
        Inorder(root);
    return 0;
}

*/

/*#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *right;
    struct node *left;
}*x;
struct node *root=NULL;
static struct node *add(int da,struct node *root){
  if(root==NULL){
     x=(struct node*)malloc(sizeof(struct node));
    x->data=da;
 x->right=NULL;
 x->left=NULL;
      root=x;
      return root;
  }
    else { if(root->data < da){
        root->right=add(da,root->right);
        
    }else{
        root->left=add(da,root->left);
    }
     return root;
    }
   
    }

void Inorder(struct node *root)
{
    if( root != NULL)
    {
        Inorder(root->left);
        printf(" %d ",root->data);
        Inorder(root->right);
    }
}
int main() {
    root=add(34,root);
    printf("%d",root->data);
    add(33,root);
     printf("%d",root->data);
    add(67,root);
     printf("%d",root->data);
    add(66,root);
     printf("%d",root->data);
    add(45,root);
     printf("%d",root->data);
 // Inorder(root);
}
*/


/*
#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
    struct node *prev;
}*x;
struct node* head=NULL;
void add(int da){
    x=(struct node*)malloc(sizeof(struct node));
    x->data=da;
    x->prev=NULL;
    x->next=NULL;
    if(head==NULL)
    head=x;
    else{
        x->next=head;
        head->prev=x;
        head=x;
    }
}

int main() {
    add(5);
    add(2);
    add(8);
    add(2);
    add(0);
  
    
  head=head->next;
   head=head->next;
    head=head->next;
  head=head->prev;

        printf("%d ",head->data);
   
}
*/