package worker.TechnologyManagerWorker;

import strategy.BonusStrategy;
import strategy.TaxStrategy;
import main.Employee;

public class LowTechnologyManagerWorker extends Employee {
    public LowTechnologyManagerWorker(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        super(id, name, totalWorkload, bonusStrategy, taxStrategy);
    }

    @Override
    public String getPosition() {
        return "junior technology manager";
    }
}
