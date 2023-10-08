package com.learningJava;

interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Day!");
    }
    default void record4kVideo(){                   // Default Method
        greet();
        System.out.println("Recording in 4k..");
    }
}
interface Wifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class myCellPhone2{
    void callNumber(int number){
        System.out.println("Calling..");
    }
    void pickCall(){
        System.out.println("Picking up the call..");
    }
}
class mySmartPhone2 extends myCellPhone2 implements Wifi2, Camera2{
    public void takeSnap(){
        System.out.println("Taking snap..");
    }
    public void recordVideo(){
        System.out.println("Recording video..");
    }
    public void record4kVideo(){                         // Implementing Default Methods
        System.out.println("Recording 4k video..");
    }
    public String[] getNetworks(){
        System.out.println(" Getting list of Networks");
        String[] networkList = {"Aryan", "Harry", "kanhu"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public class PolymorphismInterfaces {
    public static void main(String[] args) {
        Camera2 cam1 = new mySmartPhone2(); // using smartphone as a camera, no other features can be accessed.
//        cam1.getNetworks(); --> Not Allowed!
        cam1.takeSnap();
    }
}
