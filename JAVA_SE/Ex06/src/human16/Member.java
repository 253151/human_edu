package human16;

public class Member implements Comparable<Member> {
	String name;
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		// Member 객체의 정렬을 위해서는 정렬을 위한 기준이 필요한다,
		// Member 객체에서는 Member 클래스 내의 이름을 기준으로
		// 정렬하겠다
		return name.compareTo(o.name) * -1;
		// -1이면 내림차순, 1이면 오름차순
	}
}
