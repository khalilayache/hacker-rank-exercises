package days_of_code_30.day21;

public class Printer <T> {
    public void printArray(T[] array){
        for (Object o: array) {
            System.out.println(o.toString());
        }
    }
}
