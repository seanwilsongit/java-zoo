public class WilsonSean extends Animal
{
    public WilsonSean() {
    super("Wilson Sean", "Orange", 4);
  }
  
  public String getType() {
    return "Fox";
  }
  
  public String speak() {
    return "barks";
  }
  
  public String getDisposition() {
    return "Excited";
  }
    
  public String getName() {
    return "Flame";
  }
  
  @Override
  public String toString() {
    StringBuffer buffer = new StringBuffer("");
    buffer.append("It is a "+this.getType()+"\n");
    buffer.append("Its name is "+this.getName()+", it is "+this.getColor()+" with "+this.getLegs()+" legs\n");
    buffer.append("Its disposition is "+this.getDisposition()+" and it says "+this.speak()+"\n");
    return buffer.toString();
  }

  public String getClassName() {
    return this.getClass().getSimpleName();
  }

}
