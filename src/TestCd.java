import java.util.Scanner;

public class TestCd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title, songToRemove,songName;
        int price,size;
        CD cd1, cd2;
        System.out.println("enter title");
        title = scanner.nextLine();
        System.out.println("enter price");
        price = scanner.nextInt();
        System.out.println("enter num of songs");
        size = scanner.nextInt();
        String[] songList = new String[size];
        for (int i = 0; i < songList.length; i++) {
            System.out.println("enter song name number: "+i);
            songName = scanner.next();
            songList[i] = songName;
        }
        cd1 = new CD(title,price);
        cd2 = new CD(cd1);
        cd2.setSongList(songList);
        System.out.println("enter song name to remove");
        songToRemove = scanner.next();
        String[] newSongList =(cd2.removeSong(songToRemove));
        for (int i = 0; i < newSongList.length; i++){
            System.out.println(newSongList[i]);
        }
    }
}
