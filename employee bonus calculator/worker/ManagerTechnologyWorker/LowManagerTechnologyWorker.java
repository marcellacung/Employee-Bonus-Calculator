package worker.ManagerTechnologyWorker;

import strategy.BonusStrategy;
import strategy.TaxStrategy;
import main.Employee;

public class LowManagerTechnologyWorker extends Employee {
    public LowManagerTechnologyWorker(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        super(id, name, totalWorkload, bonusStrategy, taxStrategy);
    }

    @Override
    public String getPosition() {
        return "junior manager technology worker";
    }
}
