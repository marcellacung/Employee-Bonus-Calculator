package strategy;

public class ManagementBonusStrategy implements BonusStrategy {
    @Override
    public double calculateBonus(double totalWorkload, String position) {
        switch (position) {
            case "senior manager worker":
                return totalWorkload * 15;
            case "middle manager worker":
                return (totalWorkload - 50) * 10;
            case "junior manager worker":
                return (totalWorkload - 100) * 5;
            default:
                return 0;
        }
    }
}
