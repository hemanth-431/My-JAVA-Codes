
package qrcode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
public class Qrcode {

    public static void main(String[] args)throws Exception {
        String details="Hi Guys \n I,Hemanth \n Have a nice Day";
        ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
        File f=new File("E:\\Hemanth.jpg");
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
    }
    
}
