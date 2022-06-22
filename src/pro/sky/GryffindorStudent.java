package pro.sky;

public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int magicPower, int transgressionPower, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionPower);
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

    private int ability() {
        return nobility + honor + bravery;
    }
    public void compareGryffindorStudent(GryffindorStudent gryffindorStudent){
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2){
            System.out.printf("GryffindorStudent name %s: has more magic power than GryffindorStudent name %s (%d VS %d)%n", getName(), gryffindorStudent.getName(), ability1, ability2);
        } else if (ability1 < ability2){
            System.out.printf("GryffindorStudent name %s: has more magic power than GryffindorStudent %s (%d VS %d)%n", gryffindorStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("GryffindorStudent name %s: have equal magic power with GryffindorStudent name %s (%d VS %d)%n", gryffindorStudent.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; nobility - %d; honor - %d; bravery - %d", super.toString(), nobility, honor, bravery);
    }
}
