public class Main {
    public static void main(String[] args) {

       for (Planets planets : Planets.values()){
           System.out.println("-------PLANET info__________\n"+
                   "Planet Name: "+planets.getName() +"\n" +
                   "Planet Radius: "+planets.getRadius() +"\n"+
                   "NumberFromSun: "+planets.getNumberFromSun() +"\n"+
                   "DistanceFromSun: "+planets.getDistanceFromSun() +"\n"+
                   "NextPlanet: "+planets.getNextPlanet() +"\n"+
                   "PreviousPlanet: "+planets.getPreviousPlanet() +"\n"+
                   "DistanceToPreviousPlanet: "+planets.getDistanceToPreviousPlanet() +"\n"+
                   "-----------------------------");
       }
   }
}//end class
