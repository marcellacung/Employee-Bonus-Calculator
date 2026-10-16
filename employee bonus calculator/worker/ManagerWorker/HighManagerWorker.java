package worker.ManagerWorker;

import strategy.BonusStrategy;
import strategy.TaxStrategy;
import main.Employee;

public class HighManagerWorker extends Employee {
    public HighManagerWorker(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        super(id, name, totalWorkload, bonusStrategy, taxStrategy);
    }

    @Override
    public String getPosition() {
        return "senior manager worker";
    }
}
