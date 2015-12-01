package picklesjar.pickle.ut.runtime.routine.impl;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import picklesjar.pickle.ut.runtime.routine.targeting.ClassTargetingRoutine;
import picklesjar.picklerecipes.ut.restrain.ShouldBeCalledInAnnotatedBy;

public abstract class ClassTargetingOnSingleThreadRoutine
	extends SingleThreadConfigRoutine
	implements ClassTargetingRoutine {
	
	@ShouldBeCalledInAnnotatedBy( BeforeClass.class )
	protected static void setUp( Class< ? > clazz ) {
	
		SingleThreadConfigRoutine.setUp();
		
		ClassTargetingRoutine.setToTargetClass( lockKey, clazz );
	}
	
	@ShouldBeCalledInAnnotatedBy( BeforeClass.class )
	protected static void setUp( String className ) {
	
		SingleThreadConfigRoutine.setUp();
		
		ClassTargetingRoutine.setToTargetClass( lockKey, className );
	}
	
	@AfterClass
	public static void tearDown() {
	
		SingleThreadConfigRoutine.tearDown();
	}
	
}
