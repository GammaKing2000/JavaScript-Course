import java.util.ArrayList;

class CalculateTotal {

    public static void main(String[] args) {

        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        // Iterate over expenses
        for (Double expens : expenses) total += expens;

        System.out.println(total);

    }

}