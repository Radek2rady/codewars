public class HumanReadableTime {

  public static void main(String[] args) {
    System.out.println(makeReadable(359999));
  }

  public static String makeReadable(int seconds) {
    // Do something
    int nrSeconds = 3600;

    String hours = Integer.toString(seconds / nrSeconds);
    String minutes = Integer.toString((seconds % nrSeconds) / 60);
    String sec = Integer.toString(seconds % 60);

    if (hours.length() == 1) {
      hours = "0" + hours;
    }
    if (minutes.length() == 1) {
      minutes = "0" + minutes;
    }
    if (sec.length() == 1) {
      sec = "0" + sec;
    }

    return hours + ":" + minutes + ":" + sec;
  }

}