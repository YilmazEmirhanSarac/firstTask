import java.util.Scanner;
public class BillCalculator {

    private float grandTotal;

    public BillCalculator() {
    }

    public float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public void calculate() {
        DiscountChoiser account = new DiscountChoiser();
        System.out.println("Welcome to the grand total calculator...");
        float total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your shopping price");
        total = scanner.nextFloat();
        if (account.getDiscountType().equals("Gold")) {
            setGrandTotal(((total * 7) / 10));
            System.out.println("Grand total : " + getGrandTotal());
        } else if (account.getDiscountType().equals("Silver")) {
            setGrandTotal(((total * 8) / 10));
            System.out.println("Grand total : " + getGrandTotal());
        } else if (account.getDiscountType().equals("Affiliate")) {
            setGrandTotal(((total * 9) / 10));
            System.out.println("Grand total : " + getGrandTotal());
        } else if (account.getDiscountType().equals("Loyalty")) {
            setGrandTotal(((total * 95) / 100));
            System.out.println("Grand total : " + getGrandTotal());
        }
        else if (account.getDiscountType().equals("Standard")) {
            int section = (int) (total / 200);
            setGrandTotal((total - (section * 5)));
            System.out.println("Grand total : " + getGrandTotal());
        }
    }
}

