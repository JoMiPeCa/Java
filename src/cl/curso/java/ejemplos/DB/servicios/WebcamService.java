/**
 * 
 */
package cl.curso.java.ejemplos.DB.servicios;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

/**
 * @author Joseph Perez Carmona
 *
 */
public class WebcamService {

	/**
	 * Constructor que recibe parametros
	 */
	public WebcamService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void webcamCapture() throws IOException {

		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(WebcamResolution.VGA.getSize());
		// webcam.setViewSize(new Dimension(1024, 768));
//		webcam.setViewSize(WebcamResolution.HD720.getSize());
		webcam.open();
		for (int i = 0; i < 5; i++) {
			ImageIO.write(webcam.getImage(), "JPEG", new File("/Users/Joseph/WebcamError/" + new Date().getTime() + ".jpg"));
		}
		webcam.close();
	}

}
