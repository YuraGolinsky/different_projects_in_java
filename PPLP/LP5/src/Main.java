public class Main {
    public static void main(String[] args) {
        Goods goods = new Goods();
        System.out.println(goods);
        System.out.println("Форсування нової ціни 25.12");
        goods.setPrice(25.12); //set
        goods.printPrice(); //'get'
        GoodsOfSale goodsOfSale = new GoodsOfSale();
        System.out.println(goodsOfSale);
        goodsOfSale.printLeft(); //Спадкоємність
        System.out.println("Змусити нову роздрібну ціну становити 27,0");
        goodsOfSale.setSecondaryPrice(2700);
        goodsOfSale.printPrice(); //Поліморфізм
        System.out.println("Прибуток (якщо все продано): " + goodsOfSale.getProfit());
    }
}
