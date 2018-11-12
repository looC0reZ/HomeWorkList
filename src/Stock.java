/* class Stock.
 *
 * ver.: 0.0.2
 *
 * Информации об авторском параве нет
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/** Реализация структуры данных List.
 * @version   0.2 12 Nov 2018
 * @author    Georgiy Krasko
 */

public class Stock<T> implements Iterable<T> {

    private List<T> product;

    public Stock() {
        this.product = new ArrayList<>();
   }

    public void add(final T prod) {
        product.add(prod);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;
            private T current = product.get(currentIndex);

            @Override
            public boolean hasNext() {
                return currentIndex < product.size() && current != null;
            }

            @Override
            public T next() {
                return product.get(currentIndex++);
            }

        };
    }

    public static void main(final String[] args) {
        Stock<String> equipment = new Stock<>();
        equipment.add("Принтер");
        equipment.add("Ноутбук");
        equipment.add("Сканер");
        equipment.add("Проектор");
        equipment.add("Жеский диск");
        equipment.add("Видеокарта");
        equipment.add("МФУ");
        equipment.add("Монитор");
        equipment.add("DVD");
        equipment.add("Процессор");
        equipment.add("Системный блок");
        equipment.add("Оперативная память");
        for (String name: equipment) {
            System.out.println(name);
        }

    }
}



