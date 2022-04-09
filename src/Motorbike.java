class Motorbike {
    private String model;
    private String color;
    private int date;
    public Motorbike (String model, String color, int date) {
        this.model = model;
        this.color = color;
        this.date = date;
    }
    public String getModel () {
        return model;
    }
    public String getColor () {
        return color;
    }
    public int getDate () {
        return date;
    }
}
