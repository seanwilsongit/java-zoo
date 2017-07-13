
/**
 * Abstract class Animal
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public abstract class Animal
{
  // instance variables - replace the example below with your own
  private String color;
  private int legs;

  /**
   * Constructor
   */
  public Animal()
  {
    this("Black", 4);
  }
  
  /**
   * Overloaded constructor that sets color and # of legs
   * 
   * @param color Initial color
   * @param legs Initial # of legs
   */
  public Animal(String color, int legs) {
    this.color = color;
    this.legs = legs;
  }
  
  /**
   * Getter for color
   */
  public String getColor() {
    return this.color;
  }
  
  /** 
   * Setter for color
   * 
   * @param color New color
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Getter for legs
   */
  public int getLegs() {
    return this.legs;
  }
  
  /** 
   * Setter for legs
   * 
   * @param legs New number of legs
   */
  public void setLegs(int legs) {
    this.legs = legs;
  }
}
