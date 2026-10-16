package worker.TechnologyManagerWorker;

import strategy.BonusStrategy;
import strategy.TaxStrategy;
import main.Employee;

public abstract class TechnologyManagerWorker extends Employee {
    public TechnologyManagerWorker(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        super(id, name, totalWorkload, bonusStrategy, taxStrategy);
    }
}
