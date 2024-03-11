package StringBufferAndStringBuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Code");
		StringBuilder sb1 = new StringBuilder("Mind");
		sb1.append("Technology");
		sb.append(sb1);
		
		System.out.println(sb);
	}

}
