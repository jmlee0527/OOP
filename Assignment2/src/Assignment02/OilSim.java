
package Assignment02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class OilSim {

    private String outputFile;
    private int overallSales;
    private Oil[] oiltypes;
    private Region[] regions;

    public OilSim(String inputFile, String outputFile) {
        this.outputFile = outputFile;
        try {
            int tmpCandidate = 0;
            int tmpRegion = 0;

            Scanner inputStream = new Scanner(new FileInputStream(inputFile));
            while (inputStream.hasNext()) {
                String tmpToken = inputStream.next();
                switch (tmpToken) {
                    case "TOTALSALES":
                        this.overallSales = inputStream.nextInt();
                        break;
                    case "OIL":
                        int numOils = inputStream.nextInt();
                        this.oiltypes = new Oil[numOils];
                        break;
                    case "REGIONS":
                        int numRegions = inputStream.nextInt();
                        this.regions = new Region[numRegions];
                        break;
                    case "GASOLINE":
                        int gasolineCPL = inputStream.nextInt();
                        int gasolineVAT = inputStream.nextInt();
                        this.oiltypes[tmpCandidate++] = new Gasoline(tmpToken,oiltypes.length,gasolineCPL, gasolineVAT);
                        break;
                    case "DIESEL":
                        int dieselCPL = inputStream.nextInt();
                        int dieselVAT = inputStream.nextInt();
                        int dieselEnvTax = inputStream.nextInt();
                        this.oiltypes[tmpCandidate++] = new Diesel(tmpToken,oiltypes.length,dieselCPL, dieselVAT, dieselEnvTax);
                        break;
                    case "BIOFUEL":
                        int biofuelCPL = inputStream.nextInt();
                        int biofuelDiscount = inputStream.nextInt();
                        this.oiltypes[tmpCandidate++] = new Biofuel(tmpToken,oiltypes.length,biofuelCPL, biofuelDiscount);
                        break;
                    default:
                        if (inputStream.hasNextInt()) {
                        	int regionNum = inputStream.nextInt();
                        	int totalSale = inputStream.nextInt();
                            this.regions[tmpRegion++] = new Region(tmpToken,regionNum,totalSale,this.oiltypes);
                           
                        }
                        break;
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can't read the file");
        }
    }

    public void saveData() {
        Arrays.sort(oiltypes);
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFile));
            for (int i = 0; i < oiltypes.length; i++) {
                outputStream.println(oiltypes[i].toString());
                for (int j = 0; j < regions.length; j++) {
                    int RegionalSales = oiltypes[i].totalSales(regions[j].getRegionNum());
                    int totalCost = oiltypes[i].totalCost(regions[j].getRegionNum());
                    int totalQuantity = oiltypes[i].totalQuantity(regions[j].getRegionNum());
                    
                    outputStream.printf("%s:\nRegional Sales : %d\nTotal Cost : %d\nTotal Quantity : %d\n\n",
                            regions[j].getRegionName(),RegionalSales,totalCost,totalQuantity);
                                 
                }
                outputStream.println("\n=================================");
            }
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can't write to the file");
        }
    }
	
	public void runSimulation() {
		for(int i=0; i<regions.length; i++)
			regions[i].start();
		for(int j=0; j<regions.length; j++) {
			try {
				regions[j].join();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		saveData();
	}
}
