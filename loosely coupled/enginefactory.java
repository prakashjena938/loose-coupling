 class enginefactory {
      
      public engine getinstance(String var){
            if (var.equals("petrol") ) {
                  return new petrol(); 
            }
            else{
                  return new disel();
            }
      }
}
