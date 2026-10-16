package worker.TechnologyWorker;

import strategy.BonusStrategy;
import strategy.TaxStrategy;
import main.Employee;

public abstract class TechnologyWorker extends Employee {
    public TechnologyWorker(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        super(id, name, totalWorkload, bonusStrategy, taxStrategy);
    }
}
