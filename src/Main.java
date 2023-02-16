public class Main {
    public static void main(String[] args) {
        DiscountChoiser discountChoiser = new DiscountChoiser();
        BillCalculator billCalculator = new BillCalculator();
        discountChoiser.chooseDiscount();
        System.out.println(discountChoiser.getDiscountType());
        billCalculator.calculate();

    }
}