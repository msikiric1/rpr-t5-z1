package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop.LaptopBuilder("HP", "neki")
                .setCijena(400.).setProcesor("i6").setRam(16).build();
        System.out.println(laptop);
    }
}