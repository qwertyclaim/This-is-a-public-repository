package Day6;
class Aircraft {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Aircraft(String manufacturer, int year, int length, int weight, int fuel) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    void info () {
        System.out.println("Изготовитель: "+manufacturer+"; год выпуска: "+year+"; длина: "+length+"; вес: "+weight+"; кол-во топлива в баке: "+fuel);
    }

    int fillUp (int n) {
        int refuel = n+fuel;
        fuel=refuel;
        return refuel;
    }
}
