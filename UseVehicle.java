import mypack.*;

public class UseVehicle {
  public static void main(String[] args) {
    Vehicle[] v = new Vehicle[3];
    v[0] = new NewTaxi03(4);
    v[1] = new NewTrain(160);
    v[2] = new NewBus(80);

    for(int i = 0; i < v.length; i++) {
      v[i].showCrewNum();
      if(v[i] instanceof Stopable) {
        Stopable s = (Stopable)v[i];
        s.stop();
      }
    }
  }
}