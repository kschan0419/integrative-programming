import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MobileDevice> phoneList = new ArrayList<MobileDevice>();
		try {
			BufferedReader file1 = new BufferedReader(new FileReader(new File("mobilephone2.dat")));
			
			String line;
			String manufacturer = null;
			String model = null;
			int batteryStatus = 0;
			String station = null;
			double frequency = 0.0;
			String audioClip = null;
			String videoClip = null;
			int lineNo = 0;													
			if (file1 != null) { // not null if file exist
				while ((line = file1.readLine()) != null) { //has more line to read
					lineNo++;
					StringTokenizer st = new StringTokenizer(line);
				    while (st.hasMoreTokens()) {
				         manufacturer = st.nextToken();
						 model = st.nextToken();
						 batteryStatus = Integer.parseInt(st.nextToken());
						 if (lineNo > 5){
							 audioClip = st.nextToken();
							 videoClip = st.nextToken();
							 SmartPhone sp = new SmartPhone(manufacturer, model, batteryStatus, new AudioPlayer(audioClip), new VideoPlayer(videoClip));
							 phoneList.add(sp);
						 } else {
							 station = st.nextToken();
							 frequency = Double.parseDouble(st.nextToken());
							 BasicPhone bp = new BasicPhone(manufacturer, model, batteryStatus, new RadioTuner(station, frequency));
						     phoneList.add(bp);
						 }
					}
				
			    }
			}
			
			for (MobileDevice p: phoneList){
				p.printDetails();
				System.out.println();
			}
			file1.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
