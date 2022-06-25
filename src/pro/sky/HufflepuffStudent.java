package pro.sky;

public class HufflepuffStudent extends HogwartsStudent{
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgressionPower, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionPower);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
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

    private int ability() {
        return diligence + honesty + loyalty;
    }

    public void compareHufflepuffStudent(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("HufflepuffStudent name %s: has more magic power than HufflepuffStudent name %s (%d VS %d)%n", getName(), hufflepuffStudent.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("HufflepuffStudent name %s: has more magic power than HufflepuffStudent %s (%d VS %d)%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("HufflepuffStudent name %s: have equal magic power with HufflepuffStudent name %s (%d VS %d)%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; diligence - %d; loyalty - %d; honesty - %d", super.toString(), diligence, loyalty, honesty);
    }
}
