
public class Main {

    public static void main(String[] args) {
        Market market = new Market();
        Client client1 = new Client("Иван");
        Client client2 = new Client("Петр");
        Client client3 = new Client("Федор");

        market.clientArrived(client1); // Покупатель Ivan пришел в магазин
        market.clientArrived(client2); // Покупатель Peter пришла в магазин
        market.clientArrived(client3); // Покупатель Sidor пришел в магазин

        market.update(); // Принимаем заказ после обновления состояния магазина
        market.update();
        market.update();

        market.clientLeft(client2); // Покупатель Alice ушел из магазина
        market.update(); // Принимаем заказ после обновления состояния магазина
    }

}