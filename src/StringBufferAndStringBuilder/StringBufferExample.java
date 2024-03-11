package StringBufferAndStringBuilder;

public class StringBufferExample {


public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Code");
	StringBuffer sb1 = new StringBuffer("Mind");
	sb.append(sb1);
	sb.append("Technology");
	System.out.println(sb);
	
}


}
