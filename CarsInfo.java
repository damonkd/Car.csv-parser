package systemIOAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarsInfo {
	
	public ArrayList<Car> setCarsinformation() throws FileNotFoundException{
		//location of file on C drive
		String location = "C:\\Users\\damon\\Desktop\\cars.csv";
		// new file object file called with location parameter
		File file = new File(location);
		//new scanner set to file
		Scanner input = new Scanner(file);
		// new array list of type Car class
		ArrayList<Car> data = new ArrayList<Car>();
		//loop continues while scanner has another line
		int count = 0;
		while(input.hasNext()){
			// array string line is fed results of next line split
			String[] line = input.nextLine().split(",");
			
			//array list data creates new Car object and sets elements of array using Car constructor
			
			// sends first two or null lines to string constructor
			if(count < 2 || line[0] == null) {
			data.add(new 
					Car(line[0],
					line[1],
					line[2],
					line[3],
					line[4],
					line[5],
					line[6],
					line[7],
					line[8])); } // end if statement
			
			else {
				data.add(new 
						Car(line[0],
						Double.parseDouble(line[1]),
						Integer.parseInt(line[2]),
						Double.parseDouble(line[3]),
						Double.parseDouble(line[4]),
						Double.parseDouble(line[5]),
						Double.parseDouble(line[6]),
						Integer.parseInt(line[7]),
						line[8]));
			}
			
			count++;
						
		}
		input.close();	
		return data;	
			
	}
	
	public void getCarsinforamtion() throws FileNotFoundException{
		
		// set array list carsinfo = to returned array list form setcarsinformtion method
		ArrayList<Car> carsinfo =  setCarsinformation();
		
		int counter = 0;
		for(Car cr : carsinfo) {
			
			//sends first two lines or any null lines to string constructor
			if(counter < 2 || cr.getCar() == null) {
			
			   System.out.format("%-35s | %-10s | %-10s | %-15s | %-10s | %-10s | %-15s | %-10s | %-10s\n",
					cr.getCar(),
					cr.getMpg(),
					cr.getCylinders(),
					cr.getDisplacement(),
					cr.getHorsepower(), 
					cr.getWeight(),
					cr.getAcceleration(), 
					cr.getModel(),
					cr.getOrigin());
			System.out.println();
		}//end if statement
		
			else {
				System.out.format("%-35s | %-10s | %-10s | %-15s | %-10s | %-10s | %-15s | %-10s | %-10s\n",
						cr.getCar(),
						cr.getMpgDouble(),
						cr.getCylindersInt(),
						cr.getDisplacementDouble(), 
						cr.getHorsepowerDouble(), 
						cr.getWeightDouble(),
						cr.getAccelerationDouble(),
						cr.getModelInt(),
						cr.getOrigin());
				System.out.println();
				
			}
			
			
			
			
			
			counter++;
		}
		
		
		
	}
	
	
	
}
