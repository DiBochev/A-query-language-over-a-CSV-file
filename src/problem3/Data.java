package problem3;
import java.util.ArrayList;


public class Data {

	private ArrayList<Member> members;
	
	public Data(){
		this.members = new ArrayList<Data.Member>();
	}
	
	public void addMember(String id, String name, String course){
		members.add(new Member(id, name, course));
	}
	
	public void addMember(String member){
		String[] array = member.split(",");
		members.add(new Member(array[0], array[1], array[2]));
	}
	
	public void select(String[] column){
		select(column, members.size() - 1);
	}
	
	public void select(String[] column, int limit){
		if (limit > members.size() - 1) {
			limit = members.size() - 1;
		}
		
	}
	
	
	
	private class Member{
		private String id;
		private String name;
		private String course;
		
		private Member(String id, String name, String course){
			this.id = id;
			this.name = name;
			this.course = course;
		}
		
		private String getId(){
			return this.id;
		}
		
		private String getName(){
			return this.name;
		}
		
		private String getCourse(){
			return this.course;
		}
	}
	
}
