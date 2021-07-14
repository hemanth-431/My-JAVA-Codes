
package udemy;

public class animal {
    String name;
    String bones;
    int teeth;
    String coat;

    public animal(String name, String bones, int teeth, String coat) {
        this.name = name;
        this.bones = bones;
        this.teeth = teeth;
        this.coat = coat;
    }

    public String getName() {
       
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getBones() {
        return bones;
    }

    public void setBones(String bones) {
        this.bones = bones;
        System.out.println(bones);
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
        System.out.println(teeth);
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
        System.out.println(coat);
    }

    void bones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
