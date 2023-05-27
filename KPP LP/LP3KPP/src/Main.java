import java.util.Scanner;

public class Main {
    public static void toAppend(Scanner scanner, intQueue queue){
        System.out.print("Введіть значення: ");
        int value = scanner.nextInt();
        boolean appended = queue.insert(value);
        if (appended){
            System.out.println("Додано");
        }
        else{
            System.out.println("Не вдалося додати!");
        }
    }

    public static void toPop(Scanner scanner, intQueue queue) throws Exception {
        System.out.print("Введіть номер елемента, який потрібно видалити (1, 2...): ");
        int index = scanner.nextInt();
        int value = queue.pop(index-1);
        System.out.printf("Вилучене значення %d at %d\n", index+1, value);
    }

    public static void loop(intQueue queue){
        Scanner scanner = new Scanner(System.in);
        boolean toBreak = false;
        while (!toBreak) {
            System.out.printf("Ваша черга прямо зараз: %s\n", queue.toString());
            System.out.print("Що ви хочете зробити зі своєю чергою?\n1.Додайте;\n2.Вилучення;\n3.Вихід\nВибір: ");
            int choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1 -> toAppend(scanner, queue);
                    case 2 -> toPop(scanner, queue);
                    case 3 -> toBreak = true;
                    default -> System.out.println("Спробуйте знову");
                }
            } catch (Exception E) {
                System.out.println(E);
            }
        }
    }
    public static void main(String[] args) {
        FixedQueue fixedQueue = new FixedQueue();
        System.out.println("Цикл для фіксованої черги");
        loop(fixedQueue);
        DynamicQueue dynamicQueue = new DynamicQueue();
        System.out.println("Цикл для динамічної черги");
        loop(dynamicQueue);
    }
}