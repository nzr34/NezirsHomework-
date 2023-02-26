package HomeWork18;

import java.util.ArrayList;

public class Task6TesterInsurenace {
    public static void main(String[] args) {
        ArrayList<Task6ArrayAndClasses.Insurance>insurance=new ArrayList<>();
        insurance.add(new Task6ArrayAndClasses.Car("BMW"));
        insurance.add(new Task6ArrayAndClasses.Pet("Dog"));
        insurance.add(new Task6ArrayAndClasses.Health());
        for (Task6ArrayAndClasses.Insurance value : insurance) {
            value.getQuote();
            value.cancelInsurance();
        }
        for (int i = 0; i < insurance.size(); i++) {
            insurance.get(i).getQuote();
            insurance.get(i).cancelInsurance();
        }

    }
}
