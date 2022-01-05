public class CD {

    private String title;
    public static final int MAx=20;
    private  String [] songList;
    private double price;

    public CD(String title, double price) {
        this.title = title;
        this.price = price;
        String [] songList;
    }

    public CD (CD cd){
        title = cd.getTitle();
        price = cd.getPrice();
        songList = cd.songList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getSongList() {
        return songList;
    }

    public void setSongList(String[] songList) {
        this.songList = songList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  String[] removeSong(String songName) {
        int index = 0, index2 = 0;
        int counter = 0;
        while (index < this.songList.length) {
            if (this.songList[index].equals(songName) == true) {
                this.songList[index] = null;
                counter++;
            }
            index++;
        }
        String[] newSongList = new String[this.songList.length - counter];
        index = 0;
        while (index < this.songList.length) {
            if (songList[index] != null) {
                newSongList[index2] = songList[index];
                index2++;
            }
            index++;
        }
        return newSongList;
    }
}
