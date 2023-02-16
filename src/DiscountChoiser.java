import java.util.Scanner;

public class DiscountChoiser {
    private static String discountType; //static yapmazsam hesaplama yapacağım zaman indirim türüne erişemiyordum

    public DiscountChoiser(String discountType) {
        this.discountType = discountType;

    }
    public DiscountChoiser() {
    }

    public  String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }
    public void chooseDiscount(){
        Scanner scanner = new Scanner(System.in);
        String discountSelection = ("First of all, you can only use one type of discount. so if you have more than one discount type, write the one you want to use.\n" +
                "If you hava a gold card write gold\n" +
                "If you hava a silver card write silver\n" +
                "If you are in our affiliate program write affiliate\n" +
                "If you are our user for more than two years write loyalty\n" +
                "If you do not have any of this don't worry we'll give you a 5$ discount for every 200$ you spend please write standard");
        System.out.println(discountSelection);
        while (true){
            String discount = scanner.nextLine();
            if (discount.equals("standard")){
                setDiscountType("Standard");
                break;
            }
            else if (discount.equals("gold")) {
                System.out.println("you will use our gold card discount");
                setDiscountType("Gold");
                break;
            }
            else if (discount.equals("silver")) {
                System.out.println("you will use our silver card discount");
                setDiscountType("Silver");
                break;
            }
            else if (discount.equals("affiliate")) {
                System.out.println("you will use our affiliate program discount");
                setDiscountType("Affiliate");
                break;
            }
            else if (discount.equals("loyalty")) {
                System.out.println("you will use our loyalty discount");
                setDiscountType("Loyalty");
                break;
            }
            else {
                System.out.println("You entered the wrong choice, please enter again.");

            }
        }
    }

}

