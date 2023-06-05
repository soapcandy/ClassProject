import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://postfiles.pstatic.net/MjAyMzA2MDVfMTA3/MDAxNjg1OTE0MzAzNDY0.bfZ-npYlzAsAd9b_7V3uwaqEvKCzq778Q2YRvUdHq9gg.Lz2_vzDjIc1uURXG_rUAT6QIAzgBSiTON42-1Az88aYg.JPEG.pop7829/1.JPG?type=w773");
        InputStream fin = url.openStream();

        // 1단계 - 빨대 준비
//        FileInputStream fin = new FileInputStream("C:\\zzz\\test.jpg");

        FileOutputStream fos = new FileOutputStream("C:\\zzz\\test.jpg");

        System.out.println(fin);

        // 2단계 - 읽고 쓰기
        while(true) {
            int data = fin.read();
            if(data == -1) {
                break;
            }
            fos.write(data);
        } // end while
    }
}