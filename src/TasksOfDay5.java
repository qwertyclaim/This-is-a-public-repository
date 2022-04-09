public class TasksOfDay5 {
    public static void main(String[] args){
        Car machine = new Car(); /* Создан объект класса "Car" */
        machine.setModel("Honda"); /* Задаём значение полю "Model" */
        machine.setColor("Blue"); /* Задаём значение полю "Color" */
        machine.setDateOfManufacture(2016); /* Задаём значение полю "dateOfManufacture" */
        System.out.println("Модель автомобиля: "+machine.getModel()); /* Выводим значение поля "Model" в консоль */
        System.out.println("Цвет автомобиля: "+machine.getColor()); /* Выводим значение поля "Color" в консоль */
        System.out.println("Дата производства авто: "+machine.getDateOfManufacture()); /* Выводим значение соответствующего
        поля в консоль */
    }
}
