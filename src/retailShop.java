
public class retailShop {
    public static void main(String[] args) {
//        char A, B, C;
        int quantityOfA=2, quantityOfB=1, quantityOfC=3;
        double costOfA=200.00, costOfB=75.00, costOfC=500.00, totalCost, sellingPrice, discount=0.1;

        costOfA *= quantityOfA;
        costOfB *= quantityOfB;
        costOfC *= quantityOfC;

        totalCost = (costOfA + costOfB + costOfC);
        totalCost = totalCost - (0.1*totalCost);
        totalCost +=  (0.05*totalCost);


        System.out.println(totalCost);

        
    }
}
