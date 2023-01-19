import java.util.Random;

public class MagicBox<T> {
    public T[] items;
    protected int size;
//protected Random random= new Random();

    public MagicBox(int size) {
        this.size = size;
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T getItem(int itemNumber) {
        return items[itemNumber];
    }

    public T pick() {
        int x;
        for (int i = 0; i < items.length; ++i) {
            if (items[i] == null) {
                x = items.length - i;
                throw new RuntimeException("Коробка не заполнена, осталось свободных мест: " + x);

            }
        }

        Random random = new Random();
        x = random.nextInt(items.length);
        System.out.println("Result");
        return items[x];
    }

}

