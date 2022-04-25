package Day6;
class Motorbike {
    private String model;
    private String color;
    private int dateRelease;
    public Motorbike(String model, String color, int dateRelease) {
        this.model = model;
        this.color = color;
        this.dateRelease = dateRelease;
    }
    public String getModel () {
        return model;
    }
    public String getColor () {
        return color;
    }
    public int getDateRelease () {
        return dateRelease;
    }

    void info () {
        System.out.println("Это мотоцикл!");
    }

    int yearDifference (int dateOfManufacturer) {
        int difference = Math.abs(dateOfManufacturer-dateRelease);
        return difference;
    }
}