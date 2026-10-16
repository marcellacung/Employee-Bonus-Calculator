package main;

import java.util.*;
import worker.ManagerTechnologyWorker.*;
import worker.ManagerWorker.*;
import worker.TechnologyManagerWorker.*;
import worker.TechnologyWorker.*;
import strategy.*;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("Please enter employee number: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Please enter employee's name: ");
            String name = scanner.nextLine();

            System.out.println("Please enter the total workload: ");
            double totalWorkload = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.println("Please enter the employee category(technical, management, technical management, management technical): ");
            String category = scanner.nextLine();

            System.out.println("Please enter the employee's position(junior, middle, senior): ");
            String position = scanner.nextLine();

            Employee employee = null;
            BonusStrategy bonusStrategy = null;
            TaxStrategy taxStrategy = new ChineseTaxStrategy();

            switch (category) {
                case "technical":
                    bonusStrategy = new TechnicalBonusStrategy();
                    if (position.equals("senior")) {
                        employee = new HighTechnologyWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    } else if (position.equals("middle")) {
                        employee = new MiddleTechnologyWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    } else if (position.equals("junior")) {
                        employee = new LowTechnologyWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    }
                    break;
                case "management":
                    bonusStrategy = new ManagementBonusStrategy();
                    if (position.equals("senior")) {
                        employee = new HighManagerWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    } else if (position.equals("middle")) {
                        employee = new MiddleManagerWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    } else if (position.equals("junior")) {
                        employee = new LowManagerWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    }
                    break;
                case "technical management":
                    bonusStrategy = new TechnicalManagementBonusStrategy();
                    if (position.equals("senior")) {
                        employee = new HighTechnologyManagerWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    } else if (position.equals("middle")) {
                        employee = new MiddleTechnologyManagerWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    } else if (position.equals("junior")) {
                        employee = new LowTechnologyManagerWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    }
                    break;
                case "management technical":
                    bonusStrategy = new ManagementTechnicalBonusStrategy();
                    if (position.equals("senior")) {
                        employee = new HighManagerTechnologyWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    } else if (position.equals("middle")) {
                        employee = new MiddleManagerTechnologyWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    } else if (position.equals("junior")) {
                        employee = new LowManagerTechnologyWorker(id, name, totalWorkload, bonusStrategy, taxStrategy);
                    }
                    break;
            }

            if (employee != null) {
                employee.calculateBonusAndTax();
                employees.add(employee);
            }

            System.out.println("whether to continue enter employee's information? (y/n): ");
            String continueInput = scanner.nextLine();
            if (!continueInput.equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();

        for (Employee e : employees) {
            System.out.printf("employee number: %d, name: %s, position: %s, total workload: %.2f, bonus: %.2f, tax: %.2f%n", e.getId(), e.getName(), e.getPosition(), e.getTotalWorkload(), e.getBonus(), e.getTax());
        }
    }
}
