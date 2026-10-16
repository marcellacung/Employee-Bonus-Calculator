package worker.TechnologyWorker;

import strategy.BonusStrategy;
import strategy.TaxStrategy;
import main.Employee;

public class MiddleTechnologyWorker extends Employee {
    public MiddleTechnologyWorker(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        super(id, name, totalWorkload, bonusStrategy, taxStrategy);
    }

    @Override
    public String getPosition() {
        return "middle technology worker";
    }
}
