package AntiElite.com;

public class Main {

    public static void main(String[] args) {

        String cars[][] = {
                {"Ford", "Porsche", "Corolla", "Jeep", "Ranger"},
                {"Chevrolette", "Audi", "Lexus", "BMW", "Ferrari"},
                {"Mahindra", "Toyota", "Isuzu", "Kia", "Haval"},
                {"Astra", "Dodge", "Volkswagen", "", "Honda"}
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + "  ");
            }
        }
    }
}


