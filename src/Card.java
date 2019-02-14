// fields
public class Card {
  private String suite;
  private int number;
  
// gets the info out of the private fields, is methods
  public String getSuite() {
    return suite;
  }
  
  public void setSuite(String suiteToBeSet) {
    suite = suiteToBeSet;
  }
  
  public void draw() {
    suite = "Diamonds";  //random suite
    number = 4;
  }
}
