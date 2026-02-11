import java.util.ArrayList;

public class CanAttend {

	//precondition: The arraylists are not null
	//postcondition: should print out what meetings cannot attend
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		//your implementation here
		for (MeetingInterval second : meetings)
		{
			for (MeetingInterval third : meetings)
			{
				// make sure the third.getStart() is between second.getStart and second.getEnd
				if (second.getEnd() > third.getStart() && second.getStart() < third.getStart()) 
				{
					return false;
				}
			}
		}
		return true;
		
		 //replace me with actual logic please!
	}
	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
		//please include additional testing here!
		meet.clear();
		meet.add(new MeetingInterval(0, 30));
		meet.add(new MeetingInterval(50,100));
		meet.add(new MeetingInterval(10, 40));
	}
}
