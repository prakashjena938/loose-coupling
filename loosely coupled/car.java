 class car{
      engine engine;
      car(engine engine){
 this.engine = engine;
      }
public void drive(){
   int start = engine.start();
   if (start<=1) {
      System.out.println("engine started..................");
      
   }
   else{
      System.out.println("engine in troble..............................");
   }
}
}