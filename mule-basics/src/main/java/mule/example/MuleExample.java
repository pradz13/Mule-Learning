package mule.example;

public class MuleExample {
	
	public static String invokeStaticExample(String name) {
		return "Invoked Static Method from Mule Flow :  " + name;
	}
	
	public String invokeNonStaticExample(String name) {
		return "Invoked Non Static Method from Mule Flow :  " + name;
	}

}
