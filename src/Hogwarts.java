public class Hogwarts {
    private String name;
    private  int power;
    private int transgression;

    public Hogwarts (String name, int power, int transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void theBestHogwarts(Hogwarts b) {
        int summaA = this.getPower() + this.getTransgression();
        int summaB = b.getPower() + b.getTransgression();
        if (summaA > summaB) {
            System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем " + b.getName());
        } else if (summaA < summaB) {
            System.out.println(b.getName() + " обладает бОльшей мощностью магии, чем " + this.getName());
        } else {
            System.out.println("Ученики равны по магии.");
        }
    }
}
