package Assignment02;

public class SimTest {

	private static final String INPUTFILE = "resource/inputfile.txt";
	private static final String OUTPUTFILE = "resource/outputfile.txt";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name : 이정민\n" +  "Student ID : 2018008959");
		OilSim eSim = new OilSim(INPUTFILE, OUTPUTFILE);
		eSim.runSimulation();
		
	}
	
}
