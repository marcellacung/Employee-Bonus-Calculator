package strategy;

public class ManagementTechnicalBonusStrategy implements BonusStrategy {
    @Override
    public double calculateBonus(double totalWorkload, String position) {
        switch (position) {
            case "senior manager technology worker":
                return totalWorkload * 20 + 80;
            case "middle manager technology worker":
                return totalWorkload * 20 + 50;
            case "junior manager technology worker":
                return totalWorkload * 20 + 30;
            default:
                return 0;
        }
    }
}
