class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     private String mySoundChild;
     public Chick(String type, String sound)
     {
        myType = type;
        mySound = sound;
     }
     public Chick(String type, String soundChild, String sound)
     {
       myType = type;
       mySoundChild = soundChild;
       mySound = sound;
     }
     public Chick()
     {
        myType = "unknown";
        mySound = "unknown";
     }
     public String getSound()
     {
       if(Math.random() < 0.5)
         return mySound;
       else
         return mySoundChild;
     }
     public String getType()
     {return myType;}
}
