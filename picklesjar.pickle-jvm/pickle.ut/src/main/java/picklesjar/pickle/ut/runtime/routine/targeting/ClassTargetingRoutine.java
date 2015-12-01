package picklesjar.pickle.ut.runtime.routine.targeting;

import picklesjar.pickle.ut.core.PreparedTemporaryKey;
import picklesjar.pickle.ut.runtime.routine.config.ConfigureRoutine;
import picklesjar.picklerecipes.ut.sequence.ShouldBeBefore;

public interface ClassTargetingRoutine
	extends TestTargetingRoutine {
	
	/**
	 * 
	 * 
	 * 
	 * @param lockKey
	 * @param clazz
	 */
	@ShouldBeBefore( ConfigureRoutine.class )
	public static void setToTargetClass( String lockKey, Class< ? > clazz ) {
	
		String className = null;
		if( clazz != null ) {
			className = clazz.getName();
		}
		
		setToTargetClass( lockKey, className );
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param lockKey
	 * @param className
	 */
	@ShouldBeBefore( ConfigureRoutine.class )
	public static void setToTargetClass( String lockKey, String className ) {
	
		TestTargetingCommonUtil.setToTarget( lockKey,
			PreparedTemporaryKey.TEST_TARGET_CLASS_FULLNAME, className );
	}
	
}
