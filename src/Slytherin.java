public class Slytherin extends Hogwarts{
    private int theTrick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin (String name, int power, int transgression, int theTrick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, power, transgression);
        this.theTrick = theTrick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTheTrick() {
        return theTrick;
    }

    public void setTheTrick(int theTrick) {
        this.theTrick = theTrick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void print() {
        System.out.println("Имя: " + getName() + ". Сила магии: " + getPower() + ". Расстояние трансгресии: " + getTransgression() + ". Хитрость: " + getTheTrick() + ". Решительность: " + getDetermination() + ". Амбициозность: " + getAmbition() + ". Находчивость:" + getResourcefulness() + ". Жажда власти:" + getLustForPower() + ".");
    }

    public void theBestSlytherin(Slytherin b) {
        int summaA = this.getTheTrick() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int summaB = b.getTheTrick() + b.getDetermination() + b.getAmbition() + b.getResourcefulness() + b.getLustForPower();
        if (summaA > summaB) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + b.getName());
        } else if (summaA < summaB) {
            System.out.println(b.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println("Ученики равны по успеваемости.");
        }
    }
}
