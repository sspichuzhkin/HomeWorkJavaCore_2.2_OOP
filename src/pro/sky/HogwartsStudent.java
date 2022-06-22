package pro.sky;

public abstract class HogwartsStudent {
    private String name;
    private int magicPower;
    private int transgressionPower;

    public HogwartsStudent(String name, int magicPower, int transgressionPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionPower = transgressionPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionPower() {
        return transgressionPower;
    }

    public void setTransgressionPower(int transgressionPower) {
        this.transgressionPower = transgressionPower;
    }

    @Override
    public String toString() {
        return String.format("Student name %s: MagicPower - %d; TransgressionPower - %d", name, magicPower, transgressionPower);
    }

    private int abilityHogwartsStudent(){
        return magicPower + transgressionPower;
    }

    public void compareHogwartsStudent(HogwartsStudent hogwartsStudent){
        int ability1 = abilityHogwartsStudent();
        int ability2 = hogwartsStudent.abilityHogwartsStudent();
        if (ability1 > ability2){
            System.out.printf("Student name %s: has more magic power than student name %s (%d VS %d)%n", name, hogwartsStudent.getName(), ability1, ability2);
        } else if (ability1 < ability2){
            System.out.printf("Student name %s: has more magic power than student name %s (%d VS %d)%n", hogwartsStudent.getName(), name, ability2, ability1);
        } else {
            System.out.printf("Student name %s: have equal magic power with student name %s (%d VS %d)%n", hogwartsStudent.getName(), name, ability2, ability1);
        }
    }

    public void printHogwartsStudent(){
        System.out.println(this);
    }
}
