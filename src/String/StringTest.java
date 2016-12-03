package String;

public class StringTest {
	public static void main(String[] args){
		String st = "I am a Java Programmer";
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		System.out.println(st.length());
		System.out.println(st.charAt(2));
		System.out.println(st.contains(st));
		System.out.println(st.endsWith("m"));
		System.out.println(st.concat(st));
		System.out.println(st.contentEquals(st));
		System.out.println(st.equalsIgnoreCase("I am a Java Programmer"));
		System.out.println(st.indexOf("Java"));
		System.out.println(st.isEmpty());
		System.out.println(st.lastIndexOf("a"));
		System.out.println(st.startsWith("I"));
		System.out.println(st.getClass());
		System.out.println(st.substring(2, 6));
		System.out.println(st.valueOf("java"));
		System.out.println(st.toCharArray());
		System.out.println(st.replaceAll(st, st));
		System.out.println(st.equals(st));
		System.out.println(st.trim());
		System.out.println(st.codePointAt(0));
		System.out.println(st.contentEquals("Java"));
		System.out.println(st.compareTo(st));
		System.out.println(st.intern());
		System.out.println(st.replaceFirst(st, "java"));
		System.out.println(st.join(st, st));
		System.out.println(st.regionMatches(0, st, 0, 0));
		System.out.println(st.lastIndexOf(st, 0));
		System.out.println(st.contains(st));
		System.out.println(st.hashCode());
	}

}
