package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {
    Car car = new Car("Audi", "RS7", 2021);
    Motorcycle moto = new Motorcycle("BMW", "M1000RR", 2023);

    // Проверка, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void instanceOf() {
        assertTrue(car instanceof Vehicle, "Incorrect example of class Vehicle");
    }

    // Проверка, что объект Car создается с 4-мя колесами.
    @Test
    void WheelsCar() {
        int wheelNumber = 4;
        assertEquals(car.getNumWheels(), wheelNumber, "Incorrect number of wheels in the car");
    }

    // Проверка, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void MotorcycleWheels() {
        int wheelNumber = 2;
        assertEquals(moto.getNumWheels(), wheelNumber, "Incorrect number of wheels in the motorcycle");
    }

    //Проверка, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testDriveCar() {
        int expectedTestDriveSpeed = 60;
        car.testDrive();
        int factTestDriveSpeed = car.getSpeed();
        assertEquals(factTestDriveSpeed, expectedTestDriveSpeed, "Incorrect speed of the car in test drive mode");
    }

    //Проверка, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testDriveMotorcycle() {
        int expectedTestDriveSpeed = 75;
        moto.testDrive();
        int factTestDriveSpeed = moto.getSpeed();
        assertEquals(factTestDriveSpeed, expectedTestDriveSpeed,"Incorrect speed of the motorcycle in test drive mode");
    }

    // Проверка, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // машина останавливается (speed = 0).
    @Test
    void parkCar() {
        int expectedParkingSpeed = 0;
        car.testDrive();
        car.park();
        int factTestParkingSpeed = car.getSpeed();
        assertEquals(factTestParkingSpeed, expectedParkingSpeed, "Incorrect speed of the car in park mode");
    }

    // Проверка, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // мотоцикл останавливается (speed = 0).
    @Test
    void parkMotorcycle() {
        int expectedParkingSpeed = 0;
        moto.testDrive();
        moto.park();
        int factTestParkingSpeed = moto.getSpeed();
        assertEquals(factTestParkingSpeed, expectedParkingSpeed, "Incorrect speed of the motorcycle in park mode");
    }

}
