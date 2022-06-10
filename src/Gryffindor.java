public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor (String name, int power, int transgression, int nobility, int honor, int bravery) {
        super(name, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void print () {
        System.out.println("Имя: " + getName() + ". Сила магии: " + getPower() + ". Расстояние трансгресии: " + getTransgression() + ". Благородство: " + getNobility() + ". Честь: " + getHonor() + ". Храбрость: " + getBravery() + ".");
    }

    public void theBestGryffindor(Gryffindor b) {
        int summaA = this.getNobility() + this.getHonor() + this.getBravery();
        int summaB = b.getNobility() + b.getHonor() + b.getBravery();
        if (summaA > summaB) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + b.getName());
        } else if (summaA < summaB) {
            System.out.println(b.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println("Ученики равны по успеваемости.");
        }
    }
}
