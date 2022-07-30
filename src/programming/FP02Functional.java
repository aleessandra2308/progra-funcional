package programming;

import java.util.List;

public class FP02Functional {
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        int sum = addListFunctional(numbers);
        System.out.println(sum);
        System.out.println(printSumSquares(numbers));
        System.out.println(printSumCubes(numbers));
        System.out.println(printSumOdd(numbers));
    }

    private static int sum(int a, int b){
        System.out.println(a + " - " + b);
        return a+b;
    }

    public static int addListFunctional(List<Integer> numbers) {
        //return numbers.stream().reduce(0, FP02Functional::sum);
        //con lambda
        //return numbers.stream().reduce(0, (x,y) -> x+y);
        return numbers.stream().reduce(0, Integer::sum);
    }

    //ejercicio 7: 
    //elevar los nros de la lista al cuadrado y mostrar la suma de los cuadrados
    public static int printSumSquares(List<Integer> numbers) {
        return numbers.stream()
            .map(x -> x*x)
            .reduce(0, Integer::sum);
    }

    //ejercicio 8
    public static int printSumCubes(List<Integer> numbers) {
        return numbers.stream()
            .map(x -> x*x*x)
            .reduce(0, Integer::sum);
    }

    //ejercicio 9
    //find sum of odd numbers in a list
    public static int printSumOdd(List<Integer> numbers) {
        return numbers.stream()
            .filter(x -> x%2 !=0)
            .reduce(0, Integer::sum);
    }
}
