import java.util.Arrays;

public class Table {
    private int divider;
    private int[] table;

    public Table(int divider, int[] table) {
        this.divider = divider;
        this.table = table;
    }

    public int[] calculateSum() {
        int length = (int) Math.ceil(table.length / (double) divider);

        int[] sum = new int[length];
        for (int i = 0; i < sum.length; i++) {
            int count = 0;
            do {
                sum[i] += table[(i * divider) + count];
                count++;
            } while (
                    count < divider &&
                            (i == 0 || (i * divider) + count < table.length)
            );
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Table{" +
                "divider=" + divider +
                ", table=" + Arrays.toString(table) +
                '}';
    }
}



