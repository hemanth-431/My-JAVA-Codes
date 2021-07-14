
package crt.get;


public class CrtGet extends Author{

    
      String name, author;double price;int qty;
      

    public CrtGet(String name, String author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
      
       
      

    public static void main(String[] args) {
        String n,au;
        double p;
        int q;
       CrtGet a=new CrtGet("hemanth","@gmail",9.6,5);
      try{
          //super.Author("hemanth","@gmail",'M');
          a.Author("hemanth","@gmail",'M');}catch(Exception e){
          
      }
          
       
       
    }

    private void Author(String hemanth, String gmail, char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
