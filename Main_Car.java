package Building;

public class Main_Car {
    public static void main(String[] args) {
        Car car=new Car("ezz-22e",2007); //instancia
        Car car1=new Car("28cf31",2023);
        car.setPlate("is2023c"); //se modifica la placa del objeto ya no es ezz-22e si no is2023c
        System.out.println(car.getPlate());
    }
}
