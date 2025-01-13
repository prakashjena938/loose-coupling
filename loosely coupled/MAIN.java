public class MAIN {
      public static void main(String[] args) {
            enginefactory enginefactory =new enginefactory();
            car car = new car(enginefactory.getinstance("desel"));
          car.drive();
           

      }
}
