public class Main {
    public static void main(String[] args) {

        Gryffindor harri = new Gryffindor("Гарри Поттер", 55, 44, 39, 24, 48);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 47, 59, 62, 22, 35);
        Gryffindor ron = new Gryffindor("Рон Уизли", 64, 31, 33, 47, 59);

        Slytherin draco = new Slytherin("Драко Малфой", 64, 31, 69, 29, 88, 55, 49);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 39, 49, 55, 71, 62, 24, 33);
        Slytherin gregory = new Slytherin("Грегори Гойл", 44, 58, 68, 21, 44, 33, 88);

        Hufflepuff zachariah = new Hufflepuff("Захария Смит", 38, 44, 84, 33, 63);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 55, 20, 39, 66, 77);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 77, 10, 47, 73, 28);

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 30, 94, 48, 29, 33, 22);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 44, 20, 72, 43, 44, 62);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 55, 12, 72, 38, 62, 55);

        harri.printGryffindor(harri);
        cedric.printHufflepuff(cedric);
        marcus.printRavenclaw(marcus);
        draco.printSlytherin(draco);
        harri.theBestGryffindor(ron, hermione);
        zachariah.theBestHufflepuff(zachariah, justin);
        zhou.theBestRavenclaw(zhou, padma);
        graham.theBestSlytherin(graham,gregory);
        harri.theBestHogwarts(harri,draco);
    }
}