package machine;

import java.util.Scanner;

public class CoffeeMachine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int capacityWater = 400;
		int capacityMilk = 540;
		int capacityCoffeeBeans = 120;
		int disposableCups = 9;
		int money = 550;
		Ingredients ingredients = new Ingredients(capacityWater, capacityMilk,
				capacityCoffeeBeans, disposableCups, money);

		ManagerCoffeeMachine managerCoffeeMachine = new ManagerCoffeeMachine(ingredients);
		managerCoffeeMachine.prompt();
		while (managerCoffeeMachine.isProgramRunning()) {
			managerCoffeeMachine.executeCommand(scanner.next());
		}


	}

	private static void printEnoughCoffe(int countCups, int reallyCountCups) {
		if (reallyCountCups < countCups) {
			System.out.println("No, I can make only " + reallyCountCups + " cup(s) of coffee");
		} else if (reallyCountCups == countCups) {
			System.out.println("Yes, I can make that amount of coffee");
		} else {
			System.out.println("Yes, I can make that amount of coffee (and even"
					+ (reallyCountCups - countCups) + "more than that)");
		}
	}
}

enum MachineState {
	CHOOSING_AN_ACTION,
	CHOOSING_A_COFFEE,
	FILLING_WATER,
	FILLING_MILK,
	FILLING_BEANS,
	FILLING_CUPS
}

class ManagerCoffeeMachine {
	private final Ingredients ingredients;
	MachineState machineState = MachineState.CHOOSING_AN_ACTION;
	private boolean programRunning;

	ManagerCoffeeMachine(Ingredients ingredients) {
		this.ingredients = ingredients;
		this.programRunning = true;
	}

	public void action (String commandName) {
		switch (commandName) {
			case "buy":
				System.out.println("\nWhat do you want to buy? 1 - espresso," +
						" 2 - latte, 3 - cappuccino, back - to main menu:");
				machineState = MachineState.CHOOSING_A_COFFEE;
				break;
			case "fill":
				System.out.println("\nWrite how many ml of water do you want to add:");
				machineState = MachineState.FILLING_WATER;
				break;
			case "take":
				take();
				prompt();
				break;
			case "exit":
				programRunning = false;
				break;
			case "remaining":
				ingredients.printIngredients();
				prompt();
				break;
			default:
				System.out.println("error not found command");
				break;
		}
	}

	public boolean isProgramRunning(){
		return programRunning;
	}

	public void prompt(){
		System.out.println("Write action (buy, fill, take, remaining, exit):");
	}

	public void executeCommand(String input) {
		switch (machineState) {
			case CHOOSING_AN_ACTION:
				action(input);
				break;
			case FILLING_WATER:
				modifyWater(Integer.parseInt(input));
				System.out.println("Write how many ml of milk do you want to add: ");
				machineState = MachineState.FILLING_MILK;
				break;
			case FILLING_MILK:
				modifyMilk(Integer.parseInt(input));
				System.out.println("Write how many grams of coffee beans do you want to add: ");
				machineState = MachineState.FILLING_BEANS;
				break;
			case FILLING_BEANS:
				modifyCoffeeBeans(Integer.parseInt(input));
				System.out.println("Write how many disposable cups of coffee do you want to add:");
				machineState = MachineState.FILLING_CUPS;
				break;
			case FILLING_CUPS:
				modifyCups(Integer.parseInt(input));
				System.out.println();
				machineState = MachineState.CHOOSING_AN_ACTION;
				break;
			case CHOOSING_A_COFFEE:
				buy(input);
				machineState = MachineState.CHOOSING_AN_ACTION;
				prompt();
				break;
			default:
				System.out.println("not defined state " + machineState.name());
				break;
		}
	}

	public void buy(String categoryCoffee) {
		Coffee coffee = null;
		switch (categoryCoffee) {
			case "1":
				coffee = new Espresso();
				break;

			case "2":
				coffee = new Latte();
				break;

			case "3":
				coffee = new Cappuccino();
				break;
			case "back":
				return;
		}

		ingredients.calculateAmountOfIngredients(coffee);

	}

	public void modifyCups(int capacity) {
		ingredients.setDisposableCups(ingredients.getDisposableCups() + capacity);
	}

	private void modifyWater(int capacity){
		ingredients.setCapacityWater(ingredients.getCapacityWater() + capacity);
	}

	private void modifyMilk(int capacity){
		ingredients.setCapacityMilk(ingredients.getCapacityMilk() + capacity);
	}

	private void modifyCoffeeBeans(int capacity){
		ingredients.setCapacityCoffeeBeans(ingredients.getCapacityCoffeeBeans() + capacity);
	}

	public void take() {
		System.out.println("I gave you " + ingredients.getMoney());
		ingredients.setMoney(0);
		System.out.println();
	}
}

class Coffee {
	int capacityWater, capacityMilk, capacityCoffeeBeans, cost;

	public int getCapacityWater() {
		return capacityWater;
	}

	public int getCapacityMilk() {
		return capacityMilk;
	}

	public int getCapacityCoffeeBeans() {
		return capacityCoffeeBeans;
	}

	public int getCost() {
		return cost;
	}
}

class Latte extends Coffee {
	Latte() {
		this.capacityWater = 350;
		this.capacityMilk = 75;
		this.capacityCoffeeBeans = 20;
		this.cost = 7;
	}
}

class Espresso extends Coffee {
	Espresso() {
		this.capacityWater = 250;
		this.capacityMilk = 0;
		this.capacityCoffeeBeans = 16;
		this.cost = 4;
	}
}

class Cappuccino extends Coffee {
	Cappuccino() {
		this.capacityWater = 200;
		this.capacityMilk = 100;
		this.capacityCoffeeBeans = 12;
		this.cost = 6;
	}
}

class Ingredients {
	int capacityWater, capacityMilk, capacityCoffeeBeans, disposableCups, money;

	Ingredients(int capacityWater, int capacityMilk, int capacityCoffeeBeans, int disposableCups,
				int money) {
		this.capacityWater = capacityWater;
		this.capacityMilk = capacityMilk;
		this.capacityCoffeeBeans = capacityCoffeeBeans;
		this.disposableCups = disposableCups;
		this.money = money;
	}

	public int getCapacityWater() {
		return capacityWater;
	}

	public void setCapacityWater(int capacityWater) {
		this.capacityWater = capacityWater;
	}

	public int getCapacityMilk() {
		return capacityMilk;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setCapacityMilk(int capacityMilk) {
		this.capacityMilk = capacityMilk;
	}

	public int getCapacityCoffeeBeans() {
		return capacityCoffeeBeans;
	}

	public void setCapacityCoffeeBeans(int capacityCoffeeBeans) {
		this.capacityCoffeeBeans = capacityCoffeeBeans;
	}

	public int getDisposableCups() {
		return disposableCups;
	}

	public void decrementDisposableCups() {
		disposableCups--;
	}

	public void setDisposableCups(int disposableCups) {
		this.disposableCups = disposableCups;
	}

	public int calculateAmountOfIngredients(Coffee coffee) {
		boolean success = true;
		int countCup = 0;
		if (this.capacityWater - coffee.getCapacityWater() >= 0) {
			this.setCapacityWater(this.getCapacityWater() - coffee.getCapacityWater());
		} else {
			success = false;
			System.out.println("Sorry, not enough water!");
		}

		if ((success) && (this.capacityMilk - coffee.capacityMilk >= 0)) {
			this.setCapacityMilk(this.getCapacityMilk() - coffee.getCapacityMilk());
		} else {
			success = false;
		}

		if ((success) && (this.capacityCoffeeBeans - coffee.getCapacityCoffeeBeans() >= 0)) {
			this.setCapacityCoffeeBeans(this.getCapacityCoffeeBeans() - coffee.getCapacityCoffeeBeans());
		} else {
			success = false;
		}

		if ((success) && (this.money + coffee.cost >= 0)) {
			this.setMoney(this.getMoney() + coffee.getCost());
		} else {
			success = false;
		}

		if ((success) && (this.getDisposableCups() - 1 >= 0)) {
			this.decrementDisposableCups();
		} else {
			success = false;
		}

		if (success) {
			System.out.println("I have enough resources, making you a coffee!");
			System.out.println();
		}

		return countCup;
	}

	public void printIngredients() {
		System.out.println();
		System.out.println("The coffee machine has:");
		System.out.println(this.getCapacityWater() + " of water");
		System.out.println(this.getCapacityMilk() + " of milk");
		System.out.println(this.getCapacityCoffeeBeans() + " of coffee beans");
		System.out.println(this.getDisposableCups() + " of disposable cups");
		System.out.println(this.getMoney() + " of money");
		System.out.println();
	}
}
