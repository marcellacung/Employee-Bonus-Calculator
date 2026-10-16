package strategy;

public class ChineseTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double bonus) {
        // Simplified Chinese tax calculation for demonstration purposes
        double tax = 0;
        if (bonus <= 5000) {
            tax = bonus * 0.03;
        } else if (bonus <= 12000) {
            tax = 5000 * 0.03 + (bonus - 5000) * 0.10;
        } else if (bonus <= 25000) {
            tax = 5000 * 0.03 + 7000 * 0.10 + (bonus - 12000) * 0.20;
        } else if (bonus <= 35000) {
            tax = 5000 * 0.03 + 7000 * 0.10 + 13000 * 0.20 + (bonus - 25000) * 0.25;
        } else if (bonus <= 55000) {
            tax = 5000 * 0.03 + 7000 * 0.10 + 13000 * 0.20 + 10000 * 0.25 + (bonus - 35000) * 0.30;
        } else if (bonus <= 80000) {
            tax = 5000 * 0.03 + 7000 * 0.10 + 13000 * 0.20 + 10000 * 0.25 + 20000 * 0.30 + (bonus - 55000) * 0.35;
        } else {
            tax = 5000 * 0.03 + 7000 * 0.10 + 13000 * 0.20 + 10000 * 0.25 + 20000 * 0.30 + 25000 * 0.35 + (bonus - 80000) * 0.45;
        }
        return tax;
    }
}
