package picklesjar.pickle.ut.runtime.routine.impl;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import picklesjar.pickle.ut.runtime.routine.config.ThreadConfigRoutine;

public abstract class SingleThreadConfigRoutine
	extends OnlyLockRoutine
	implements ThreadConfigRoutine {
	
	@BeforeClass
	public static void setUp() {
	
		OnlyLockRoutine.setUp();
		
		ThreadConfigRoutine.setToSingleThread();
	}
	
	@AfterClass
	public static void tearDown() {
	
		OnlyLockRoutine.tearDown();
	}
	
}
