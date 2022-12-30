package a.b.c.java_basic.object;

class Document {
	static int count = 0;
	String name;
	
	public Document() {
		this("제목없음"+ ++count);
	}
	public Document(String name) {
		this.name = name;
		System.out.println("문서 "+this.name+ " 생성완료.");
	}
	
}

public class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("java.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
}


