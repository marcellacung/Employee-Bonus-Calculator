package main;

import strategy.BonusStrategy;
import strategy.TaxStrategy;

public abstract class Employee {
    private int id;
    private String name;
    private double totalWorkload;
    private double bonus;
    private double tax;

    private BonusStrategy bonusStrategy;
    private TaxStrategy taxStrategy;

    public Employee(int id, String name, double totalWorkload, BonusStrategy bonusStrategy, TaxStrategy taxStrategy) {
        this.id = id;
        this.name = name;
        this.totalWorkload = totalWorkload;
        this.bonusStrategy = bonusStrategy;
        this.taxStrategy = taxStrategy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTotalWorkload() {
        return totalWorkload;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTax() {
        return tax;
    }

    protected void setBonus(double bonus) {
        this.bonus = bonus;
    }

    protected void setTax(double tax) {
        this.tax = tax;
    }

    public void calculateBonusAndTax() {
        this.bonus = bonusStrategy.calculateBonus(totalWorkload, getPosition());
        this.tax = taxStrategy.calculateTax(bonus);
    }

    public abstract String getPosition();
}
