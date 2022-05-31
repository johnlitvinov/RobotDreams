public enum Planets {

    MERCURY("MERCURY",1,10,null,0),
    VENUS("VENUS",2,20,MERCURY,20),
    EARTH("EARTH",3,30,VENUS,30),
    MARS("MARS",4,40,EARTH,40),
    JUPITER("JUPITER",5,50,MARS,50),
    SATURN("SATURN",6,60,JUPITER,60),
    URANUS("URANUS",7,70,SATURN,70),
    NEPTUNE("NEPTUNE",8,80,URANUS,80),
    PLUTO("PLUTO",9,90,NEPTUNE,90);

   String name;
   int numberFromSun;
   int radius;
   Planets previousPlanet;
   Planets nextPlanet;
   int distanceToPreviousPlanet;
   int distanceFromSun;

   private Planets(String name,
                   int numberFromSun,
                   int radius,
                   Planets previousPlanet,
                   int distanceToPreviousPlanet){
       this.name = name;
       this.numberFromSun = numberFromSun;
       this.distanceToPreviousPlanet = distanceToPreviousPlanet;
       if (previousPlanet == null) {
           this.distanceFromSun = this.distanceToPreviousPlanet;
       } else {
           this.distanceFromSun = previousPlanet.getDistanceFromSun() + this.distanceToPreviousPlanet;}
       this.radius = radius;
       this.previousPlanet = previousPlanet;
       if (previousPlanet != null) {
           previousPlanet.nextPlanet = this;
       }
   }

   public String getName(){
       return name;
   }

   public int getNumberFromSun(){
       return numberFromSun;
   }

   public int getDistanceFromSun(){
       return distanceFromSun;
   }

   public int getRadius(){
       return radius;
   }

   public Planets getPreviousPlanet(){
       return previousPlanet;
   }

   public Planets getNextPlanet(){
       return nextPlanet;
   }

   public int getDistanceToPreviousPlanet(){
       return distanceToPreviousPlanet;
   }
}// end enum class