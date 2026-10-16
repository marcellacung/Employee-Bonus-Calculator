package worker.ManagerWorker;

import strategy.BonusStrategy;
import strategy.TaxStrategy;
import main.Employee;

public class MiddleManagerWorker extends Employee {
    public MiddleManagerWorker(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        super(id, name, totalWorkload, bonusStrategy, taxStrategy);
    }

    @Override
    public String getPosition() {
        return "middle manager worker";
    }
}
