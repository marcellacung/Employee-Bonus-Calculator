package worker.ManagerTechnologyWorker;

import strategy.BonusStrategy;
import strategy.TaxStrategy;
import main.Employee;

public abstract class ManagerTechnologyWorker extends Employee {
    public ManagerTechnologyWorker(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        super(id, name, totalWorkload, bonusStrategy, taxStrategy);
    }
}
