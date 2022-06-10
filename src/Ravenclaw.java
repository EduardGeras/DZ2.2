public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw (String name, int power, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, power, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void printRavenclaw(Ravenclaw a) {
        System.out.println("Имя: " + getName() + ". Сила магии: " + getPower() + ". Расстояние трансгресии: " + getTransgression() + ". Ум: " + getMind() + ". Мудрость: " + getWisdom() + ". Остроумие: " + getWit() + ". Творчество:" + getCreativity() + ".");
    }

    public void theBestRavenclaw(Ravenclaw a, Ravenclaw b) {
        int summaA = a.getMind() + a.getWisdom() + a.getWit() + a.getCreativity();
        int summaB = b.getMind() + b.getWisdom() + b.getWit() + b.getCreativity();;
        if (summaA > summaB) {
            System.out.println(a.getName() + " лучший Когтевранец, чем " + b.getName());
        } else if (summaA < summaB) {
            System.out.println(b.getName() + " лучший Когтевранец, чем " + a.getName());
        } else {
            System.out.println("Ученики равны по успеваемости.");
        }
    }
}
