class NamedCow extends Cow
{
  private String myName; 
  NamedCow(String type, String name, String sound)
  {
    myType = type;
    mySound = sound;
    myName = name;
  }
  public String getName()
  {return myName;}
}
