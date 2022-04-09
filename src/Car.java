class Car { /* Объявляем класс "Car" */
    private String model; /* Создаём приватное поле "Model" */
    private String color; /* Создаём приватное поле "Color" */
    private int dateOfManufacture; /* Создаём приватное поле "dateOfManufacture" */
    public void setModel (String carModel) { /* Создаём метод,с помощью которого задаём значение полю "Model" */
        model = carModel;
    }
    public String getModel () { /* Создаём метод,с помощью которого возвращаем значение поля "Model" */
        return model;
    }
    public void setColor (String carColor) { /* Создаём метод,с помощью которого задаём значение полю "Color" */
        color = carColor;
    }
    public String getColor () { /* Создаём метод,с помощью которого возвращаем значение поля "Color" */
        return color;
    }
    public void setDateOfManufacture (int carDate) { /* Создаём метод,с помощью которого задаём значение соот. поля */
        dateOfManufacture = carDate;
    }
    public int getDateOfManufacture () { /* Создаём метод,с помощью которого возвращаем значение соот. поля */
        return dateOfManufacture;
    }
}
