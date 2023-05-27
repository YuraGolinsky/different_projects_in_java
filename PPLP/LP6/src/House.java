public class House extends Builing {
    protected int floors = 0;
    protected int apart = 0;
    protected int occup = 0;
    protected int lodger = 0;

    public House(String addr, double area, double price, String owner, int floors, int apart, int occup, int lodger) {
        super(addr, area, price, owner);
        this.floors = floors;
        this.apart = apart;
        this.occup = occup;
        this.lodger = lodger;

    }

    public void getDescription() {
        System.out.println(
                String.format(
                        "Общая характеристика зданий:\nЗдание по адресу: %s \nЗанимаемая площадь: %.2f \nЦена: %.2f \nСобственник: %s \n",
                        addr, area, price, owner));
        System.out.println(String.format(
                "Общая характеристка дома: \nКоличество этажай: %d \nКоличество квартир: %d \nКвартир в эксплуатаии: %d \nКоличество жителей: %d \n",
                floors, apart, occup, lodger));
    }
}
