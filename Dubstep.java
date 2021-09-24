public class Dubstep {

  public static void main(String[] args) {
    System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
  }


  public static String SongDecoder(String song) {
    // Your code is here...
    String result = song.replaceAll("WUB", " ");
    result = result.trim().replaceAll(" +", " ");
    return result;
  }
}