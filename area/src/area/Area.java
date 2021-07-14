package area;
public class Area {
    private int x;
    private int y;
    
    public Area(){
    }
    public Area(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
     public void setY(int y){
        this.y = y;
    }
    public double distance(){
        	return  Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
     public double distance(int x, int y){
        	 return Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));
    }
     public double distance(Area p){
        	 return Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y, 2));
    }
}