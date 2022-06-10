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

    public void print() {
        System.out.println("Имя: " + getName() + ". Сила магии: " + getPower() + ". Расстояние трансгресии: " + getTransgression() + ". Ум: " + getMind() + ". Мудрость: " + getWisdom() + ". Остроумие: " + getWit() + ". Творчество:" + getCreativity() + ".");
    }

    public void theBestRavenclaw(Ravenclaw b) {
        int summaA = this.getMind() + this.getWisdom() + this.getWit() + this.getCreativity();
        int summaB = b.getMind() + b.getWisdom() + b.getWit() + b.getCreativity();;
        if (summaA > summaB) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + b.getName());
        } else if (summaA < summaB) {
            System.out.println(b.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println("Ученики равны по успеваемости.");
        }
    }
}
