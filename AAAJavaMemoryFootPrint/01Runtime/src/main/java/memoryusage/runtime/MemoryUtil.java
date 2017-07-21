package memoryusage.runtime;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class MemoryUtil {

	public static void showMemoryWithRuntime() {
		Runtime runtime = Runtime.getRuntime();
		
		final long total = runtime.totalMemory();
		final long max = runtime.maxMemory();
		final long free = runtime.freeMemory();
		
		System.out.println("max  ="+max);
		System.out.println("total="+total);
		System.out.println("free ="+free);

		final int freepc = (int)((free*100)/total);
		final int totalpc = (int)((total*100)/max);
		
		System.out.println("free percentage  "+freepc);
		System.out.println("total percentage "+totalpc);
		System.out.println("---------------------");
	}
	
	public static void showMemoryWithMxBean() {
		MemoryMXBean bean = ManagementFactory.getMemoryMXBean();
		MemoryUsage memoryUsage =bean.getHeapMemoryUsage();
		
		
		final long total = memoryUsage.getCommitted();
		final long max = memoryUsage.getMax();
		final long free = total- memoryUsage.getUsed();
		
		System.out.println("max  ="+max);
		System.out.println("total="+total);
		System.out.println("free ="+free);
		
		final int freepc = (int)((free*100)/total);
		final int totalpc = (int)((total*100)/max);
		
		System.out.println("free percentage  "+freepc);
		System.out.println("total percentage "+totalpc);
		System.out.println("---------------------");

	}
}
