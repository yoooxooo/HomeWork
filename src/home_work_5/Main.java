package home_work_5;

import home_work_5.comparators.PasswordAndNickNameComparator;
import home_work_5.timer.Timer;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PasswordAndNickNameComparator cmp = new PasswordAndNickNameComparator();

        List<Person> personArrayList = new ArrayList<>();

        List<Person> personLinkedList = new LinkedList<>();

        Set<Person> personHashSet = new HashSet<>();

        Set<Person> personTreeSet = new TreeSet<>(cmp);

        home_work_5.timer.Timer timer = new Timer();

        timer.startMeasure();
        for (int i = 0; i < 100000; ++i) {
            personArrayList.add(new Person());
        }
        timer.addMeasure(System.currentTimeMillis(), "Заполнение ArrayList");
        timer.startMeasure();
        for (int i = 0; i < 100000; ++i) {
            personLinkedList.add(new Person());
        }
        timer.addMeasure(System.currentTimeMillis(), "Заполнение LinkedList");
        timer.startMeasure();
        for (int i = 0; i < 100000; ++i) {
            personHashSet.add(new Person());
        }
        timer.addMeasure(System.currentTimeMillis(), "Заполнение HashSet");
        timer.startMeasure();
        for (int i = 0; i < 100000; ++i) {
            personTreeSet.add(new Person());
        }
        timer.addMeasure(System.currentTimeMillis(), "Заполнение TreeSet");

        personArrayList.sort(cmp);
        personLinkedList.sort(cmp);

        Iterator<Person> personArrayIterator = personArrayList.iterator();
        timer.startMeasure();
        while (personArrayIterator.hasNext()) {
            Person buffer = personArrayIterator.next();
            System.out.println((buffer.getPassword()) + " - " + (buffer.getNickName()));
        }
        timer.addMeasure(System.currentTimeMillis(), "Итерация ArrayList итератором");

        Iterator<Person> personLinkedIterator = personLinkedList.iterator();
        timer.startMeasure();
        while (personLinkedIterator.hasNext()) {
            Person buffer = personLinkedIterator.next();
            System.out.println((buffer.getPassword()) + " - " + (buffer.getNickName()));
        }
        timer.addMeasure(System.currentTimeMillis(), "Итерация LinkedList итератором");

        Iterator<Person> personHashIterator = personHashSet.iterator();
        timer.startMeasure();
        while (personHashIterator.hasNext()) {
            Person buffer = personHashIterator.next();
            System.out.println((buffer.getPassword()) + " - " + (buffer.getNickName()));
        }
        timer.addMeasure(System.currentTimeMillis(), "Итерация HashSet итератором");

        Iterator<Person> personTreeIterator = personTreeSet.iterator();
        timer.startMeasure();
        while (personTreeIterator.hasNext()) {
            Person buffer = personTreeIterator.next();
            System.out.println((buffer.getPassword()) + " - " + (buffer.getNickName()));
        }
        timer.addMeasure(System.currentTimeMillis(), "Итерация TreeSet итератором");

        timer.startMeasure();
        for (int i = 0; i < personArrayList.size(); ++i) {
            Person buffer = personArrayList.get(i);
            System.out.println((buffer.getPassword()) + " - " + (buffer.getNickName()));
        }
        timer.addMeasure(System.currentTimeMillis(), "Итерация ArrayList циклом");

        timer.startMeasure();
        for (int i = 0; i < personLinkedList.size(); ++i) {
            Person buffer = personLinkedList.get(i);
            System.out.println((buffer.getPassword()) + " - " + (buffer.getNickName()));
        }
        timer.addMeasure(System.currentTimeMillis(), "Итерация LinkedList циклом");

        timer.startMeasure();
        Person[] array1 = personHashSet.toArray(new Person[0]);
        for (int i = 0; i < array1.length; ++i) {
            System.out.println((array1[i].getPassword()) + " - " + (array1[i].getNickName()));
        }
        timer.addMeasure(System.currentTimeMillis(), "Итерация HashSet циклом");

        timer.startMeasure();
        Person[] array2 = personTreeSet.toArray(new Person[0]);
        for (int i = 0; i < array2.length; ++i) {
            System.out.println((array2[i].getPassword()) + " - " + (array2[i].getNickName()));
        }
        timer.addMeasure(System.currentTimeMillis(), "Итерация TreeSet циклом");

        timer.startMeasure();
        Person[] array3 = personArrayList.toArray(new Person[0]);
        List<Person> personArrayListToDelete = new ArrayList<>(List.copyOf(personArrayList));
        System.out.println("До удаления " + personArrayListToDelete.size());
        for (Person person : array3) {
            personArrayListToDelete.remove(person);
        }
        System.out.println("После удаления " + personArrayListToDelete.size());
        timer.addMeasure(System.currentTimeMillis(), "Пошаговое удаление ArrayList своим методом");

        timer.startMeasure();
        Person[] array4 = personLinkedList.toArray(new Person[0]);
        List<Person> personLinkedListToDelete = new ArrayList<>(List.copyOf(personLinkedList));
        System.out.println("До удаления " + personLinkedListToDelete.size());
        for (Person person : array4) {
            personLinkedListToDelete.remove(person);
        }
        System.out.println("После удаления " + personLinkedListToDelete.size());
        timer.addMeasure(System.currentTimeMillis(), "Пошаговое удаление LinkedList своим методом");

        timer.startMeasure();
        Person[] array5 = personHashSet.toArray(new Person[0]);
        Set<Person> personHashSetToDelete = new HashSet<>(Set.copyOf(personHashSet));
        System.out.println("До удаления " + personHashSetToDelete.size());
        for (Person person : array5) {
            personHashSetToDelete.remove(person);
        }
        System.out.println("После удаления " + personHashSetToDelete.size());
        timer.addMeasure(System.currentTimeMillis(), "Пошаговое удаление HashSet своим методом");

        timer.startMeasure();
        Person[] array6 = personTreeSet.toArray(new Person[0]);
        Set<Person> personTreeSetToDelete = new TreeSet<>(cmp);
        personTreeSetToDelete.addAll(Set.copyOf(personTreeSet));
        System.out.println("До удаления " + personTreeSetToDelete.size());
        for (Person person : array6) {
            personTreeSetToDelete.remove(person);
        }
        System.out.println("После удаления " + personTreeSetToDelete.size());
        timer.addMeasure(System.currentTimeMillis(), "Пошаговое удаление TreeSet своим методом");

        System.out.println(timer.getListOfMeasurements());
    }
}
