package strategy;

public class TechnicalManagementBonusStrategy implements BonusStrategy {
    @Override
    public double calculateBonus(double totalWorkload, String position) {
        switch (position) {
            case "senior technology manager":
                return totalWorkload * 25 + 100;
            case "middle technology manager":
                return totalWorkload * 25 + 70;
            case "junior technology manager":
                return totalWorkload * 25 + 50;
            default:
                return 0;
        }
    }
}
