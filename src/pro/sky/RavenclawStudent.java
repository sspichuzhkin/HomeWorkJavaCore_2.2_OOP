package pro.sky;

public class RavenclawStudent extends HogwartsStudent {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressionPower, int cleverness, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionPower);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
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

    private int ability() {
        return cleverness + wisdom + wit + creativity;
    }

    public void compareRavenclawStudent(RavenclawStudent ravenclawStudent) {
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("RavenclawStudent name %s: has more magic power than RavenclawStudent name %s (%d VS %d)%n", getName(), ravenclawStudent.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("RavenclawStudent name %s: has more magic power than RavenclawStudent %s (%d VS %d)%n", ravenclawStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("RavenclawStudent name %s: have equal magic power with RavenclawStudent name %s (%d VS %d)%n", ravenclawStudent.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; cleverness - %d; wisdom - %d; wit - %d; creativity - %d", super.toString(), cleverness, wisdom, wit, creativity);
    }
}
