

// Java-реализация алгоритма A*
// использование приоритетной очереди
import java.util.*;
class DPQ {
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<City> pq;
    private int V; // Количество вершин
    List<List<City> > adj;

    public DPQ(int V)
    {
        this.V = V;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<City>(V, new City());
    }

    // Функция для алгоритма A*
    public void ALGORITHM_A (List<List<City> > adj, int src)
    {
        this.adj = adj;

        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;
// Добавляем исходный узел в приоритетную очередь
        pq.add(new City(src, 0));
        // Расстояние до источника равно 0 ,оно всегда 0
        dist[src] = 0;
        while (settled.size() != V) {
            //когда приоритетная очередь пуста, возвращаем
            if(pq.isEmpty())
                return ;
            // удаляем узел минимального расстояния
            // из приоритетной очереди
            int u = pq.remove().City;

            // добавляем узел, расстояние которого равно
            // завершено
            settled.add(u);

            e_Neighbours(u);
        }
    }

    // Функция для обработки всех соседей
    // переданного узла
    private void e_Neighbours(int u)
    {
        int edgeDistance = -1;
        int newDistance = -1;

        // Все соседи v
        for (int i = 0; i < adj.get(u).size(); i++) {
            City v = adj.get(u).get(i);

            // Если текущий узел еще не обработан
            if (!settled.contains(v.City)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;
// Если новое расстояние дешевле по стоимости
                if (newDistance < dist[v.City])
                    dist[v.City] = newDistance;
// Добавляем текущий узел в очередь
                pq.add(new City(v.City, dist[v.City]));
            }
        }
    }

    // Driver code
    public static void main(String arg[])
    {
        int V = 10;
        int source = 0;

        // Представление списка смежности
        // соединенные ребра
        List<List<City> > adj = new ArrayList<List<City> >();
// Инициализировать список для каждого узла
        for (int i = 0; i < V; i++) {
            List<City> item = new ArrayList<City>();
            adj.add(item);
        }
// Входные данные для графика
        adj.get(0).add(new City(1, 8)); //1
        adj.get(0).add(new City(2, 6));//2
        adj.get(0).add(new City(3, 9));//3
        adj.get(0).add(new City(4, 3));//4

        adj.get(0).add(new City(5, 1));//5
        adj.get(0).add(new City(6, 9));//6
        adj.get(0).add(new City(7, 3));//7
        adj.get(0).add(new City(8, 2));//8
        adj.get(0).add(new City(9, 4));//9


        adj.get(2).add(new City(1, 2));//10
        adj.get(2).add(new City(3, 4));

        adj.get(2).add(new City(4, 2));
        adj.get(2).add(new City(5, 4));

        adj.get(2).add(new City(6, 8));


// Рассчитываем кратчайший путь из одного источника
        DPQ dpq = new DPQ(V);
        dpq.ALGORITHM_A(adj, source);
     //Вывести кратчайший путь ко всем узлам
        // из исходного узла
        System.out.println("Кратчайший путь от узла:");
        for (int i = 0; i < dpq.dist.length; i++)
            System.out.println(source + " К " + i + " ДО "
                    + dpq.dist[i]);
    }
}
// Класс для представления узла в графе
class City implements Comparator<City> {
    public int City;
    public int cost;

    public City()
    {
    }

    public City(int City, int cost)
    {
        this.City = City;
        this.cost = cost;
    }

    @Override
    public int compare(City node1, City node2)
    {
        if (node1.cost < node2.cost)
            return -1;
        if (node1.cost > node2.cost)
            return 1;
        return 0;
    }
}