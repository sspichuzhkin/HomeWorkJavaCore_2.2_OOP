package pro.sky;

import java.util.Random;

public class Main {
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Harry Potter");
        GryffindorStudent ron = generateGryffindorStudent("Ron Weasley");
        RavenclawStudent luna = generateRavenclawStudent("Luna Lovegood");
        SlytherinStudent draco = generateSlytherinStudent("Draco Malfoy");
        HufflepuffStudent cedric = generateHufflepuffStudent("Cedric Diggory");

        harry.printHogwartsStudent();
        ron.printHogwartsStudent();
        luna.printHogwartsStudent();
        draco.printHogwartsStudent();
        cedric.printHogwartsStudent();

        harry.compareGryffindorStudent(ron);
        harry.compareHogwartsStudent(draco);

        luna.compareHogwartsStudent(ron);
    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}