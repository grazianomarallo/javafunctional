package streams;


import imperative.Main;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

/**
 * @author grazianomarallo
 * @project: javafunctional
 * @package: streams
 * @date: 09/03/2020
 */
public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        /*
         people.stream()
                 .map(person -> person.name)
                 .mapToInt(String::length)
                 .forEach(System.out::println);
         */

        boolean onlyFemale = people.stream()
                .allMatch(person -> person.gender.equals(FEMALE));
        System.out.println(onlyFemale);



    }

    static class Person{
        private final String name;
        private final Gender gender;



        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", geneder=" + gender +
                    '}';
        }
    }

    enum  Gender{
        MALE,FEMALE, PREFER_NOT_TO_SAY
    }

}


