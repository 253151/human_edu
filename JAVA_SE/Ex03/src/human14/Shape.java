package human14;

public abstract class Shape {
	// 설계자가 원하는 기능은 면적을 구하는 것임.
	// 어떤 도형이 올지 모르기 때문에 도형별로 클래스를 만들고
	// 각 도형은 Shape를 상속받아서 면적을 구하는 클래스를 완성해야함.
	// 설계자 입장에서 꼭 면적을 구하는 메서드는 각 도형에서 해야 한다는 것을
	// 명시하기 위해서느 추상메서드가 필요함

	public abstract double calcArea();
}
