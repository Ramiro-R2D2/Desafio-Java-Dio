import Models.Iphone;

import java.util.Scanner;
public class AppMain {
    public static void main(String[] args) throws Exception {
        Iphone iph = new Iphone();
        Scanner scanner = new Scanner(System.in);
        String page = scanner.nextLine();
        iph.ShowPage(page);
        String song = scanner.nextLine();
        iph.SelectedMusic(song);
        iph.AddPage();
        iph.StopMusic();
        scanner.close();
    }
}
