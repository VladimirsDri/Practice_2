package lv.tsi.practice2.exercise5;

import java.util.LinkedList;
import java.util.List;

public class PersonProcessingWithStreams {

    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();

        personList.add(new Person("Romeo", 28));
        personList.add(new Person("John", 22));
        personList.add(new Person("Kate", 28));
        personList.add(new Person("Anna", 16));
        personList.add(new Person("Vladimir", 13));
        personList.add(new Person("Tim", 22));

        PersonEvaluator personEvaluator = new PersonEvaluator(personList);

        personEvaluator.findAndPrint("P");

        System.out.println();
        personEvaluator.findAndPrint(18);

        System.out.println();
        System.out.println(personEvaluator.getAverageAge());

        System.out.println();
        personEvaluator.groupAndPrint();
    }
}
