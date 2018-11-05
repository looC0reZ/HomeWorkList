/* class Stock.
 *
 * ver.: 0.0.1
 *
 * Информации об авторском параве нет
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/** Реализация структуры данных List.
 * @version   0.1 27 Oct 2018
 * @author    Georgiy Krasko
 */

public class Stock {

    public static void aL() {
        ArrayList<String> equipment = new ArrayList<>();
        equipment.add("Принтер");
        equipment.add("Ноутбук");
        equipment.add("Сканер");
        equipment.add("Проектор");
        Iterator<String> it = equipment.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void lL() {
        LinkedList<String> equipment = new LinkedList<>();
        equipment.add("Компьютер");
        equipment.add("Колонки");
        equipment.add("Клавиатура");
        equipment.add("Наушники");
        Iterator<String> it = equipment.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(final String[] args) {
        aL();
        lL();
    }
}


