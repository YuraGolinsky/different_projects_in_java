public abstract class Builing {
    protected String addr = "";// Адрес
    protected double area = 0;// Занимаемая площадь
    protected double price = 0;// Цена
    protected String owner = "";// Собственник

    public Builing(String addr, double area, double price, String owner) {
        this.addr = addr;
        this.area = area;
        this.price = price;
        this.owner = owner;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    public String GetAddr() {
        return addr;
    }

    public abstract void getDescription();
}
