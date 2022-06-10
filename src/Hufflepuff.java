public class Hufflepuff extends Hogwarts {
    private int theyLoveWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff (String name, int power, int transgression, int theyLoveWork, int loyalty, int honesty) {
        super(name, power, transgression);
        this.theyLoveWork = theyLoveWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getTheyLoveWork() {
        return theyLoveWork;
    }

    public void setTheyLoveWork(int theyLoveWork) {
        this.theyLoveWork = theyLoveWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void print() {
        System.out.println("Имя: " + getName() + ". Сила магии: " + getPower() + ". Расстояние трансгресии: " + getTransgression() + ". Трудолюбие: " + getTheyLoveWork() + ". Верность: " + getLoyalty() + ". Честность: " + getHonesty() + ".");
    }

    public void theBestHufflepuff(Hufflepuff b) {
        int summaA = this.getTheyLoveWork() + this.getLoyalty() + this.getHonesty();
        int summaB = b.getTheyLoveWork() + b.getLoyalty() + b.getHonesty();
        if (summaA > summaB) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + b.getName());
        } else if (summaA < summaB) {
            System.out.println(b.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println("Ученики равны по успеваемости.");
        }
    }
}
