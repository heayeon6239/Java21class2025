package polymor;

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest ates = new AnimalTest();
		// 현재 moveAnimal()메서드는 매개변수로 Animal을 데이터타입으로 가짐
		ates.moveAnimal(new Human());
		ates.moveAnimal(new Tiger());
		ates.moveAnimal(new Eagle());
		
	}
	
	// 데이터 타입이 Animal
	public void moveAnimal(Animal animal) {
		animal.move();
		}


}
