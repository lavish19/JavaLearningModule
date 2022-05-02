 interface Continent 
{ 
  void showContinent(); 
 } 
 interface Country 
{ 
  void showCountry(); 
 } 
 interface State 
{ 
  void showState(); 
} 
 class City implements State
{ 
  public void showContinent()
  { 
    System.out.println("Asia"); 
  } 
public void showCountry()
{ 
  System.out.println("India"); 
 } 
public void showState()
{ 
   System.out.println("Jharkhand"); 
 } 
void showCity()
{ 
  System.out.println("Dhanbad"); 
 } 
public static void main(String[] args) 
{ 
  City c = new City(); 
   c.showContinent(); 
   c.showCountry(); 
   c.showState(); 
   c.showCity(); 
  } }