import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int divider = 3;

        Table table = new Table(divider, numbers);
        System.out.println(Arrays.toString(table.calculateSum()));
    }
}

