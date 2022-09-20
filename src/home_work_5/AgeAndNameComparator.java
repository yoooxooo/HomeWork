package home_work_5;

public class AgeAndNameComparator {
    private final NameComparator nameComparator = new NameComparator();

    private final AgeComparator ageComparator = new AgeComparator();

    public int compare(Animal animal1, Animal animal2) {
        int age1 = animal1.getAge();
        int age2 = animal2.getAge();
        String name1 = animal1.getNick();
        String name2 = animal2.getNick();
        if (ageComparator.compare(age1, age2) > 0) {
            return 1;
        } else if (ageComparator.compare(age1, age2) < 0) {
            return -1;
        } else {
            return Integer.compare(nameComparator.compare(name1, name2), 0);
        }
    }
}
