package picklesjar.pickle.ut.runtime.routine.config;

import picklesjar.pickle.ut.runtime.UnitTestRuntimeFoundation;
import picklesjar.pickle.ut.runtime.routine.lock.LockRoutine;
import picklesjar.picklerecipes.ut.sequence.ShouldBeBefore;

public interface ThreadConfigRoutine
	extends ConfigureRoutine {
	
	/**
	 * 
	 * 
	 * 
	 */
	@ShouldBeBefore( value = LockRoutine.class, queries = { "lock()" } )
	public static void setToSingleThread() {
		
		ConfigureCommonUtil.config(
			UnitTestRuntimeFoundation.SINGLE_THREAD_MODE );
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param flag
	 */
	@ShouldBeBefore( value = LockRoutine.class, queries = { "lock()" } )
	public static void setToSingleThreadWith( int flag ) {
		
		ConfigureCommonUtil.config(
			UnitTestRuntimeFoundation.SINGLE_THREAD_MODE | flag );
	}
	
	/**
	 * 
	 * 
	 * 
	 */
	@ShouldBeBefore( value = LockRoutine.class, queries = { "lock()" } )
	public static void setToMultiThread() {
		
		ConfigureCommonUtil.config(
			UnitTestRuntimeFoundation.MULTI_THREAD_MODE );
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param flag
	 */
	@ShouldBeBefore( value = LockRoutine.class, queries = { "lock()" } )
	public static void setToMultiThreadWith( int flag ) {
		
		ConfigureCommonUtil.config(
			UnitTestRuntimeFoundation.MULTI_THREAD_MODE | flag );
	}
	
}
