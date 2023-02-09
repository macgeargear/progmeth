public class Car {
    int serial;
    String brand;

    public boolean equels(Object o) {
        return ((Car) o).serial == this.serial & ((Car) o).brand == this.brand;
    }

}
