package programming;

import java.util.List;

public class FP01Functional{

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        
        //printAllNumbersInListFunctional(numbers);
        //printEvenNumbersInListFunctional(numbers);
        //printOddNumbersInListFunctional(numbers);
        //printAllCoursesFunctional(courses);
        printContainWordFunctional(courses);
    }

    /**private static void print(int number) {
        System.out.println(number);
    }**/

    private static boolean isEven(int number) {
        return number%2==0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
            //.filter(FP01Functional::isEven)
            .filter(x -> x%2 == 0) //Lambda
            .forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
            .filter(x -> x%2 !=0)
            .forEach(System.out::println);
    }

    private static void printAllCoursesFunctional(List<String> courses) {
        courses.stream()
            .forEach(System.out::println);
    }

    private static void printContainWordFunctional(List<String> courses) {
        courses.stream()
            .filter(x -> x.contains("Spring"))
            .forEach(System.out::println);
    }
}