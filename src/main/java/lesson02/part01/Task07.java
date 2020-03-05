package lesson02.part01;

/**
 * Создать 5 зергов, 3 протосса и 4 террана.
 * Дать им всем уникальные имена.
 * <p>
 * <p>
 * Требования:
 * 1.	Нельзя изменять классы Zerg, Protoss и Terran.
 * 2.	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
 * 3.	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
 * 4.	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.
 */

public class Task07 {
    public static void main(String[] args) {
        Zerg zerg = new Zerg();
        zerg.name = "Рома";
        Zerg zerg1 = new Zerg();
        zerg1.name = "Никита";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Валя";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Катя";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Гоша";
        Protoss рro = new Protoss();
        рro.name = "Маша";
        Protoss рro2 = new Protoss();
        рro2.name = "Жора";
        Protoss рro3 = new Protoss();
        рro3.name = "Коля";
        Terran Ter = new Terran();
        Ter.name = "Настя";
        Terran Ter2 = new Terran();
        Ter2.name = "Вика";
        Terran Ter3 = new Terran();
        Ter3.name = "Ростик";
        Terran Ter4 = new Terran();
        Ter4.name = "Вова";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
