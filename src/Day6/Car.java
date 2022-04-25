package Day6;
class Car {
    private String model;
    private String color;
    private int dateRelease = 2010;
    public void setModel (String userModel) {
        model = userModel;
    }
    public String getModel () {
        return model;
    }
    public void setColor (String userColor) {
        color = userColor;
    }
    public String getColor () {
        return color;
    }
    public void setDateRelease (int userDateRelease) {
        dateRelease = userDateRelease;
    }
    public int getDateRelease () {
        return dateRelease;
    }

    void info () {
        System.out.println("Это автомобиль!");
    }

    int yearDifference (int dateOfManufacturer) {
        int difference = Math.abs (dateOfManufacturer-dateRelease);
        return difference;
    }
}