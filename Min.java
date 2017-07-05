package prp;

public class Min {

	public static void main(String[] args) 
		throws Exception {  
		    long time = System.currentTimeMillis();
		    DateTime time1 = new DateTime(time);
		    DateTime time2 = new DateTime(time + 120_000); 
		    Minutes minutes = Minutes.minutesBetween(time1, time2);
		    System.out.println(minutes.getMinutes()); 

	}

}
