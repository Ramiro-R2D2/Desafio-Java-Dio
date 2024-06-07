package Models;

import Interface.MusicPlayer;
import Interface.NavigatorInternet;
import Interface.Telephone;

public class Iphone implements MusicPlayer, NavigatorInternet, Telephone{
    public void PlayMusic(){
        System.out.println("Start a random song on my iphone");
    }
    public void StopMusic(){
        System.out.println("Stop song on my iphone");
    }
    public void SelectedMusic(String music){
        System.out.println("Playing the song " + music + " on:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }
// 
    public void Call(){
        System.out.println("Call for my contact");
    }
    public void startCallVoice(){
        System.out.println("Stating Call in:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println("The call was initiated");
    }
    public void answer(){
        System.out.println("Your contact is calling");
    }
//
    public void ShowPage(String Url){
        System.out.println("Redirect to: "+ Url);
        System.out.println("You're on the : " + Url);
    }
    public void AddPage(){
        System.out.println("Page added successfully");
    }
    public void RefreshPage(){
        System.out.println("Refreshing the page");
        for (int i = 1; i <= 3; i++) {
            System.out.print(".");
        }
    }
}
