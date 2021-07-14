
package udemy;

public class dog extends animal{

    private int tail;
    private int mouth;
    
    public dog(String name, String bones, int teeth, String coat) {
        super(name, bones, teeth, coat);
        this.name=name;
        this.bones=bones;
        this.teeth=teeth;
        this.coat=coat;
        
    }

    public dog(int tail, int mouth, String name, String bones, int teeth, String coat) {
        super(name, bones, teeth, coat);
        this.tail = tail;
        this.mouth = mouth;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }
    
    
}
