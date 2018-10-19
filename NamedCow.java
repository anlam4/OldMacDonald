class NamedCow extends Cow
{
  private String myName; 
  NamedCow(String type, String name, String sound)
  {
    myType = type;
    mySound = sound;
    myName = name;
  }
  NamedCow()
  {
    myType = "unknown";
    mySound = "unknown";
    myName = "unknown";
  }
  String getName()
  {return myName;}
}
