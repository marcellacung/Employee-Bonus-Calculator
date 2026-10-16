package strategy;

public class TechnicalBonusStrategy implements BonusStrategy {
    @Override
    public double calculateBonus(double totalWorkload, String position) {
        switch (position) {
            case "senior technology worker":
                return totalWorkload * 30;
            case "middle technology worker":
                return totalWorkload * 25;
            case "junior technology worker":
                return totalWorkload * 20;
            default:
                return 0;
        }
    }
}
