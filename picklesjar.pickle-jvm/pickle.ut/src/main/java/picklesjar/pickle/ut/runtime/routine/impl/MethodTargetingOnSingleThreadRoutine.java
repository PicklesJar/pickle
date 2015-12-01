package picklesjar.pickle.ut.runtime.routine.impl;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import picklesjar.pickle.ut.core.util.MethodQuery;
import picklesjar.pickle.ut.prepare.design.StereotypeDesign;
import picklesjar.pickle.ut.runtime.routine.targeting.MethodTargetingRoutine;
import picklesjar.picklerecipes.ut.restrain.ShouldBeCalledInAnnotatedBy;

public abstract class MethodTargetingOnSingleThreadRoutine
	extends SingleThreadConfigRoutine
	implements MethodTargetingRoutine {
	
	@ShouldBeCalledInAnnotatedBy( BeforeClass.class )
	protected static void setUp( Class< ? > clazz, MethodQuery methodQuery ) {
	
		SingleThreadConfigRoutine.setUp();
		
		MethodTargetingRoutine.setToTargetMethod( lockKey, clazz, methodQuery );
	}
	
	@ShouldBeCalledInAnnotatedBy( BeforeClass.class )
	protected static void setUp( Class< ? > clazz, MethodQuery methodQuery, StereotypeDesign stereotype ) {
	
		SingleThreadConfigRoutine.setUp();
		
		MethodTargetingRoutine.setToTargetMethod( lockKey, clazz, methodQuery, stereotype );
	}
	
	@ShouldBeCalledInAnnotatedBy( BeforeClass.class )
	protected static void setUp( String className, MethodQuery methodQuery ) {
	
		SingleThreadConfigRoutine.setUp();
		
		MethodTargetingRoutine.setToTargetMethod( lockKey, className, methodQuery );
	}
	
	@ShouldBeCalledInAnnotatedBy( BeforeClass.class )
	protected static void setUp( String className, MethodQuery methodQuery, StereotypeDesign stereotype ) {
	
		SingleThreadConfigRoutine.setUp();
		
		MethodTargetingRoutine.setToTargetMethod( lockKey, className, methodQuery, stereotype );
	}
	
	@AfterClass
	public static void tearDown() {
	
		SingleThreadConfigRoutine.tearDown();
	}
	
}
