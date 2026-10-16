package worker.ManagerWorker;

import strategy.BonusStrategy;
import strategy.TaxStrategy;
import main.Employee;

public class LowManagerWorker extends Employee {
    public LowManagerWorker(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        super(id, name, totalWorkload, bonusStrategy, taxStrategy);
    }

    @Override
    public String getPosition() {
        return "junior manager worker";
    }
}
