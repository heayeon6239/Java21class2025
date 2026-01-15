package abstractTest;

public class MyNoteBook extends NoteBook{ // NoteBook 이 추상클래스이기 때문에 상속받을 수 있음

	@Override
	public void typing() {
		System.out.println("MyNoteBook typing");
		
	}
	
}
