package les5.lesson;

 class Car {
     String color;
     String engine;
     int speed;

     int gaz(int skorost) {
         speed += skorost;
         return speed;
     }

     int tormoz(int skorost) {
         speed -= skorost;
         return speed;
     }

     void showInfo() {
         System.out.println("Cvet: " + color + " motor: " + engine + " skorost: " + speed);
     }
 }
    class Car2{
        public static void main(String[] args) {
            Car car = new Car();
            car.speed = 100;
            car.engine = "V8";
            car.color = "Black";
            car.showInfo();
            car.gaz(50);
            car.showInfo();
        }
    }

