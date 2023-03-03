package HomeWork13;

public class Task3FourDifCon {
    String name;
    String color;
    int weight;
    String breed;
    int age;

    Task3FourDifCon(String cName1, String cColor1, int cWeight1) {
        name = cName1;
        color = cColor1;
        weight = cWeight1;

    }

    private Task3FourDifCon(String cColor1, int cWeight, String cBreed1, String cName1) {
        name = cName1;
        color = cColor1;
        weight = cWeight;
        breed = cBreed1;
    }

    public Task3FourDifCon(String cName1, int cWeight1, int cAge1) {
        name = cName1;
        weight = cWeight1;
        age = cAge1;
    }

    protected Task3FourDifCon(String cName1, int cAge1, String cBreed1) {
        name = cName1;
        breed = cBreed1;
        age = cAge1;

    }

    public static void main(String[] args) {
        Task3FourDifCon newCon2 = new Task3FourDifCon("White", 13, "vanCat", "Leo");
        Task3FourDifCon newCon4 = new Task3FourDifCon("Leo", 4, "vanCat");

    }


}

