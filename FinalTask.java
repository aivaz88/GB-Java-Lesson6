import java.util.ArrayList;
import java.util.Scanner;

/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class FinalTask {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook(1, "HD", 8, 250, "win11", "black");
        NoteBook notebook2 = new NoteBook(2, "HD", 16, 125, "win11", "white");
        NoteBook notebook3 = new NoteBook(3, "HD", 4, 500, "win10", "red");
        NoteBook notebook4 = new NoteBook(4, "HD", 8, 500, "win10", "black");
        NoteBook notebook5 = new NoteBook(5, "HD", 8, 125, "win11", "white");
        NoteBook notebook6 = new NoteBook(6, "HD", 16, 250, "win10", "red");
        NoteBook notebook7 = new NoteBook(7, "HD", 16, 250, "win11", "black");
        NoteBook notebook8 = new NoteBook(8, "HD", 4, 125, "win10", "white");
        NoteBook notebook9 = new NoteBook(9, "HD", 4, 125, "win10", "red");
        NoteBook notebook10 = new NoteBook(10, "HD", 8, 500, "win10", "black");
        ArrayList<NoteBook> arr = new ArrayList<>();
        arr.add(notebook1);
        arr.add(notebook2);
        arr.add(notebook3);
        arr.add(notebook4);
        arr.add(notebook5);
        arr.add(notebook6);
        arr.add(notebook7);
        arr.add(notebook8);
        arr.add(notebook9);
        arr.add(notebook10);
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите критерий фильтрации:\n 1 - ОЗУ\n 2 - Объем ЖД\n 3 - Операционная система\n 4 - Цвет");
        String filter = scan.nextLine();
        if (filter.equals("1")){
            System.out.print("Выберите объем ОЗУ (4, 8 или 16): ");
            filter = scan.nextLine();
            for (NoteBook noteBook : arr) {
                if (noteBook.ozu.equals(Integer.parseInt(filter.trim()))){
                    NoteBook.toPrint(noteBook);
                }
                
            }
        }
        else if (filter.equals("2")){
            System.out.print("Выберите объем памяти жесткого диска (125, 250 или 500): ");
            filter = scan.nextLine();
            for (NoteBook noteBook : arr) {
                if (noteBook.disk.equals(Integer.parseInt(filter.trim()))){
                    NoteBook.toPrint(noteBook);
                }
                
            }
        }
        else if (filter.equals("3")){
            System.out.print("Выберите необходимую операционную систему (win10 или win11): ");
            filter = scan.nextLine();
            for (NoteBook noteBook : arr) {
                if (noteBook.os.equals(filter)){
                    NoteBook.toPrint(noteBook);
                }
                
            }
        }
        else if (filter.equals("4")){
            System.out.print("Выберите необходимый цвет (black, white или red): ");
            filter = scan.nextLine();
            for (NoteBook noteBook : arr) {
                if (noteBook.colour.equals(filter)){
                    NoteBook.toPrint(noteBook);
                }   
            }
        }
        scan.close();
    }
}
