public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double INTREST_RATE = .17;
        double monthlyRate = INTREST_RATE / 12;
        double intrestAfterOneMonth = balance * monthlyRate;
        balance = intrestAfterOneMonth;
        double intrestAfterTwoMonths = balance * monthlyRate;

        System.out.println("The interest due after one month: " + intrestAfterOneMonth);
        System.out.println("The interest due after two months: " + intrestAfterTwoMonths);

        









    }
}