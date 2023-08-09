package com.learningJava;

interface Camera{
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
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class myCellPhone{
    void callNumber(int number){
        System.out.println("Calling..");
    }
    void pickCall(){
        System.out.println("Picking up the call..");
    }
}
class mySmartPhone extends myCellPhone implements Wifi, Camera{
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
public class lj_defaultMethods {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        ms.record4kVideo();
        String[] ar = ms.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
