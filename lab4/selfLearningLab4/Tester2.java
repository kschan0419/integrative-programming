import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Plant> plantList = new ArrayList<Plant>();
		try {
			BufferedReader filein = new BufferedReader(new FileReader(new File("plants.dat")));
			
			String line;
			String name = null;
			String climate = null;
			String type = null;
			double initHeight = 0;
			String propagationMethod = null;
			boolean hasSeeds = false;
			String pollinationAgent = null;
			int lineNo = 0;
			if (filein != null) { // not null if file exist
				while ((line = filein.readLine()) != null) { //has more line to read
					
					StringTokenizer st = new StringTokenizer(line);
				    while (st.hasMoreTokens()) {
				    	name = st.nextToken();
				    	climate = st.nextToken();
				    	type = st.nextToken();
				    	if (lineNo < 5){
				    		initHeight = Double.parseDouble(st.nextToken());
				    		propagationMethod = st.nextToken();
							AsexualPlant ap = new AsexualPlant(name, climate, type, initHeight, propagationMethod);
							plantList.add(ap);
						} else {
							if (st.nextToken().equals("true"))
								hasSeeds = true;
							else 
								hasSeeds = false;
							pollinationAgent = st.nextToken();
							SexualPlant sp = new SexualPlant(name, climate, type, hasSeeds, pollinationAgent);
							plantList.add(sp);
						}
				    }
				    lineNo++;
			    }
			}
			
			for (Plant p: plantList){
				if (p instanceof AsexualPlant)
					((AsexualPlant) p).determineGrowth(10);
				else if (p instanceof SexualPlant)
					((SexualPlant) p).determineGrowth(10);
				p.printDetails();
				//System.out.println();
			}
			filein.close();
			
		} catch (IOException e){
			e.printStackTrace();
		} 
	}

}
