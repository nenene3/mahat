package mahat_2022_summer_b.Random;

public class Table {

    private String name;
    private String kind;
    private char system;
    private double size;
    private double price;

    public Table(String name, String kind, char system, double size, double price) {
        this.name = name;
        this.kind = kind;
        this.system = system;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public char getSystem() {
        return system;
    }

    public void setSystem(char system) {
        this.system = system;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", system=" + system +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
    public boolean isSame(Table other){
        return (other.kind.equals(this.kind) &&this.name.equals(other.name)) &&this.size== other.size;
    }
    public int index(){
        if(this.system=='W'){
            
        }



        return 2;
    }
}
