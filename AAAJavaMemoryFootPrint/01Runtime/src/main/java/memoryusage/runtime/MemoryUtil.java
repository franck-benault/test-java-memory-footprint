package memoryusage.runtime;

public class MemoryUtil {

	public static void showMemory() {
		long total = Runtime.getRuntime().totalMemory();
		long max = Runtime.getRuntime().maxMemory();
		long free = Runtime.getRuntime().freeMemory();
		System.out.println("max  ="+max);
		System.out.println("total="+total);
		System.out.println("free ="+free);
		int freepc = (int)((free*100)/total);
		int totalpc = (int)((total*100)/max);
		
		System.out.println("free percentage  "+freepc);
		System.out.println("total percentage "+totalpc);
		System.out.println("---------------------");
	}
}
