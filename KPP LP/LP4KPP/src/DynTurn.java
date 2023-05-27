class DynTurn implements Filter {
    private int turn[];
    private int tail;

    public DynTurn(int size) {
        turn = new int[size];
        tail = -1;
    }

    public void place(int el) {
        if (filt(el) && exept(el)) {
            if (tail == turn.length - 1) {
                int mas[] = new int[turn.length + 1];
                for (int i = 0; i <= turn.length - 1; i++)
                    mas[i] = turn[i];
                turn = mas;
            }
            turn[++tail] = el;
        }
    }

    public int goOut() {
        int i, k;
        if (tail < 0) {
            System.out.println("Черга порожня!");
            return 0;
        } else {
            k = turn[0];
            for (i = 1; i <= tail; i++)
                turn[i - 1] = turn[i];
            tail--;
            return k;
        }
    }

    public boolean filt(int el) {
        if (el > 99 && el < 1000)
            return true;
        else {
            System.out.println("Елемент не може бути доданий в чергу!");
            System.out.println("Елемент " + el + " виходить за межі припустимого диапазону значень");
            return false;
        }
    }

    public boolean exept(int el) {
        if (el == EXCEPT1 || el == EXCEPT2) {
            System.out.println("Елемент не може бути доданий в чергу!");
            System.out.println("Едемент " + el + " співпадає з неприпустимим значенням");
            return false;
        }
        return true;
    }
}
