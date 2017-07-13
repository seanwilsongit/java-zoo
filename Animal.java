
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
    this("Black", 4); // Default is a black animal with 4 legs
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
  
  /**
   * What does the animal say?  Descendant classes should override this
   * method or default speak will generate "Yaba-daba-doo"
   */
  public String speak() {
    return "Yaba-daba-doo";
  }
  
  /**
   * This will return a String that describes the animal's general disposition.
   * Sample dispositions could be "mean" or "friendly".  Use different adjectives
   * in your method. The default disposition is "meh"
   */
  public String getDisposition() {
    return "meh";
  }
  
  /**
   * This will return the animal's name. What's the default name?
   */
  public String getName() {
    return "No name defined. Bummer";
  }
  
  /**
   * toString() is a method that all Java classes implement.  It's where you can 
   * generate a string that describes the object.  You should not override this
   * method unless you know what you're doing
   */
  @Override
  public String toString() {
    return "Animal: "+this.getName()+": Is "+this.getColor()+", has "+this.getLegs()+" legs, is "+this.getDisposition()+" and says "+this.speak();
  }

}
