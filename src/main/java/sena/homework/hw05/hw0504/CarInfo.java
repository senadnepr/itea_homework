package sena.homework.hw05.hw0504;

/**
 * @author Sergej Chumakov on 04.10.2023
 */
public class CarInfo {

    private SomeCar[] carsArray = new SomeCar[0]; // тому що ArrayList ми ще не вивчали

    public void addCar(SomeCar someCar){
        int oldArrayLenght = carsArray.length;
        SomeCar[] newArrayOfCars = new SomeCar[oldArrayLenght + 1];
        for (int i = 0; i < oldArrayLenght; i++) {
            newArrayOfCars[i] = carsArray[i];
        }
        newArrayOfCars[oldArrayLenght] = someCar;
        carsArray = newArrayOfCars;
    }

    public SomeCar maxSpeedCar(){
        SomeCar maxSpeedCar = carsArray[0];
        for (int i = 1; i < carsArray.length; i++) {
            if (maxSpeedCar.getSpeed() < carsArray[i].getSpeed()){
                maxSpeedCar = carsArray[i];
            }
        }
        return maxSpeedCar;
    }

    public SomeCar maxExpensiveCar(){
        SomeCar maxExpensiveCar = carsArray[0];
        for (int i = 1; i < carsArray.length; i++) {
            if (maxExpensiveCar.getPrice() < carsArray[i].getPrice()){
                maxExpensiveCar = carsArray[i];
            }
        }
        return maxExpensiveCar;
    }

    public SomeCar maxPowerCar(){
        SomeCar maxPowerCar = carsArray[0];
        for (int i = 1; i < carsArray.length; i++) {
            if (maxPowerCar.getPower() < carsArray[i].getPower()){
                maxPowerCar = carsArray[i];
            }
        }
        return maxPowerCar;
    }

    public SomeCar[] getCarsArray() {
        return carsArray;
    }
}
