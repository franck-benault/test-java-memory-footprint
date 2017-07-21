package memoryusage.runtime;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import memoryusage.runtime.MemoryUtil;

public class RuntimeSample {

	@Test
	public void test() {
		MemoryUtil.showMemory();
		List<String> list = new ArrayList<String>();
		
		final int MAX = 50000000;
		for(int i=1 ; i<MAX; i++) {
			list.add(""+i);
			if(i%300000==0) {
				MemoryUtil.showMemory();
				System.out.println((i*100)/MAX);
				try {
					TimeUnit.MILLISECONDS.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
