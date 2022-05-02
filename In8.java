 class VehicleTypes 
{ 
  interface Vehicle 
  { 
    public int getNoOfWheels(); 
  } 
} 
 class Bus implements VehicleTypes.Vehicle 
{ 
  public int getNoOfWheels() 
  { 
      return 6; 
  } 
} 
 class FourWheeler implements VehicleTypes.Vehicle 
{ 
  public int getNoOfWheels() 
  { 
    return 4; 
  } 
} 
 class MotorCycle implements VehicleTypes.Vehicle
{ 
  public int getNoOfWheels()
  { 
     return 2; 
   } 
 } 
 class VehicleTest 
{ 
  public static void main(String[] args) 
  { 
    Bus b = new Bus(); 
    System.out.println(b.getNoOfWheels()); 

    FourWheeler c = new FourWheeler(); 
    System.out.println(c.getNoOfWheels()); 

    MotorCycle bk = new MotorCycle(); 
    System.out.println(bk.getNoOfWheels()); 
   } 
}