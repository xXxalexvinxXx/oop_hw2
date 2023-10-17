import java.util.ArrayList;
import java.util.List;
class Market implements QueueBehaviour, MarketBehaviour, UpdateMarket {
    private List<Client> queue; // Список людей в очереди
    private List<Client> servedClients; // Список обслуженных покупателей

    public Market() {
        this.queue = new ArrayList<>();
        this.servedClients = new ArrayList<>();
    }



    // Методы из интерфейса QueueBehaviour

    @Override
    public void addToQueue(Client client) {
        queue.add(client);
    }

    @Override
    public Client removeFromQueue() {
        if (!queue.isEmpty()) {
            Client client = queue.get(0);
            queue.remove(0);
            return client;
        }
        return null;
    }
    // Методы из интерфейса MarketBehaviour

    @Override
    public void clientArrived(Client client) {
        addToQueue(client);
    } //Переопределение добавление в очередь

    @Override
    public void clientLeft(Client client) {
        queue.remove(client);
    }//Переопределение удаление из очереди

    @Override
    public void update() {
        if (!queue.isEmpty()) {
            Client client = removeFromQueue();//Удаление клиента из очереди
            servedClients.add(client);//Добавить в обслуженных клиентов
            System.out.println("Заказ принят и выдан:"  + client.getName());
        } else {
            System.out.println("Нет клиентов в очереди");
        }
    }
}