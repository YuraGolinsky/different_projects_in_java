import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Класс для хранения ребра Graph
class Edge
{
    int source, dest;

    public Edge(int source, int dest)
    {
        this.source = source;
        this.dest = dest;
    }
}

// Класс для представления graphического объекта
class Graph
{
    // Список списков для представления списка смежности
    List<List<Integer>> adjList = null;

    // Конструктор
    Graph(List<Edge> edges, int n)
    {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // добавляем ребра в неориентированный graph
        for (Edge edge: edges)
        {
            int src = edge.source;
            int dest = edge.dest;

            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}

class Main
{
    // Функция для обхода DFS на Graphе на Graphе
    public static void DFS(Graph graph, int v, boolean[] discovered)
    {
        // помечаем текущий узел как обнаруженный
        discovered[v] = true;

        // печатаем текущий узел
        System.out.print(v + " ");

        // делаем для каждого ребра (v, u)
        for (int u: graph.adjList.get(v))
        {
            // если `u` еще не обнаружен
            if (!discovered[u]) {
                DFS(graph, u, discovered);
            }
        }
    }

    public static void main(String[] args)
    {
        // Список ребер Graph согласно приведенной выше диаграмме
        List<Edge> edges = Arrays.asList(
                // Обратите внимание, что узел 0 не подключен
                new Edge(1, 2), new Edge(1, 7), new Edge(1, 8), new Edge(2, 3),
                new Edge(2, 6), new Edge(3, 4), new Edge(3, 5), new Edge(8, 9),
                new Edge(8, 12), new Edge(9, 10), new Edge(9, 11)
        );

        // общее количество узлов в Graph (от 0 до 12)
        int n = 13;

        // строим graph из заданных ребер
        Graph graph = new Graph(edges, n);

        // чтобы отслеживать, открыта вершина или нет
        boolean[] discovered = new boolean[n];

        // Выполняем обход DFS от всех необнаруженных узлов к
        // покрываем все связные компоненты Graph
        for (int i = 0; i < n; i++)
        {
            if (!discovered[i]) {
                DFS(graph, i, discovered);
            }
        }
    }
}
