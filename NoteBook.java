public class NoteBook {
    Integer id;
    String name;
    Integer ozu;
    Integer disk;
    String os;
    String colour;

    public NoteBook(Integer id, String name, Integer ozu, Integer disk, String os, String colour){
        this.id = id;
        this.name = name;
        this.ozu = ozu;
        this.disk = disk;
        this.os = os;
        this.colour = colour;
    }
    
    public static void toPrint(NoteBook noteBook){
        System.out.println("Модель: " + noteBook.name);
        System.out.println("Оперативная память: " + noteBook.ozu + "ГБ");
        System.out.println("Объем памяти: " + noteBook.disk + "ГБ");
        System.out.println("Операционная система: " + noteBook.os);
        System.out.println("Цвет: " + noteBook.colour);
        System.out.println();
    }
}
