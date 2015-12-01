package picklesjar.pickle.ut.runtime.routine.impl;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import picklesjar.pickle.ut.core.util.MethodQuery;
import picklesjar.pickle.ut.runtime.routine.targeting.MethodTargetingRoutine;
import picklesjar.picklerecipes.ut.restrain.ShouldBeCalledInAnnotatedBy;

public abstract class MethodTargetingOnMultiThreadRoutine
	extends MultiThreadConfigRoutine
	implements MethodTargetingRoutine {
	
	@ShouldBeCalledInAnnotatedBy( BeforeClass.class )
	protected static void setUp( Class< ? > clazz, MethodQuery methodQuery ) {
	
		MultiThreadConfigRoutine.setUp();
		
		MethodTargetingRoutine.setToTargetMethod( lockKey, clazz, methodQuery );
	}
	
	@ShouldBeCalledInAnnotatedBy( BeforeClass.class )
	protected static void setUp( String className, MethodQuery methodQuery ) {
	
		MultiThreadConfigRoutine.setUp();
		
		MethodTargetingRoutine.setToTargetMethod( lockKey, className, methodQuery );
	}
	
	@AfterClass
	public static void tearDown() {
	
		MultiThreadConfigRoutine.tearDown();
	}
	
}
