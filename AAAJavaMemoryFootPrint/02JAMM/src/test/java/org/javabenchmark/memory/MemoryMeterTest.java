package org.javabenchmark.memory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.github.jamm.MemoryMeter;
import org.junit.Test;
 
public class MemoryMeterTest {
 
    private MemoryMeter meter = new MemoryMeter();
     
    @SuppressWarnings("restriction")
	@Test
    public void shouldMeasureMemoryUsage() {
    	System.out.println("Array list");
        String st1 = "This is the string #1";
        //measure(st1);
         
        String st2 = "This is the string #2 and it has more chars.";
        //measure(st2);
         
        List<String> aList = new ArrayList<String>(0);
        //measure(aList);
         
        aList.add(st1);
        //measure(aList);
         
        aList.add(st2);
        measure(aList);
         
        System.out.println(
        		jdk.nashorn.internal.ir.debug.ObjectSizeCalculator.getObjectSize(aList));
    }
    
    @SuppressWarnings("restriction")
	@Test
    public void shouldMeasureMemoryUsageLinkedList() {
    	System.out.println("linked list");
        String st1 = "This is the string #1";
        //measure(st1);
         
        String st2 = "This is the string #2 and it has more chars.";
        //measure(st2);
         
        List<String> aList = new  LinkedList<String>();
        //measure(aList);
         
        aList.add(st1);
        //measure(aList);
         
        aList.add(st2);
        measure(aList);
         
        System.out.println(
        		jdk.nashorn.internal.ir.debug.ObjectSizeCalculator.getObjectSize(aList));
    }
 
    private void measure(Object anObject) {
         
        System.out.println("-----------------------------------");
        System.out.printf("size: %d bytes\n", meter.measure(anObject));
        System.out.printf("retained size: %d bytes\n", meter.measureDeep(anObject));
        System.out.printf("inner object count: %d\n", meter.countChildren(anObject));
    }
}
