package picklesjar.pickle.ut.runtime.routine.targeting;

import java.util.function.BiConsumer;

import picklesjar.pickle.ut.core.PreparedTemporaryKey;
import picklesjar.pickle.ut.core.util.MethodQuery;
import picklesjar.pickle.ut.prepare.design.StereotypeDesign;
import picklesjar.pickle.ut.runtime.UnitTestRuntimeFoundation;
import picklesjar.pickle.ut.runtime.UnitTestTemporary;

interface TestTargetingCommonUtil {
	
	/**
	 * 
	 * 
	 * 
	 * @param lockKey
	 * @param key
	 * @param className
	 */
	public static void setToTarget(
		String lockKey, PreparedTemporaryKey key, String className ) {
	
		UnitTestRuntimeFoundation.before( lockKey,
			( BiConsumer< UnitTestTemporary, String[] > )
			( temp, keyAndValue ) -> {
				
				temp.put( keyAndValue[ 0 ], keyAndValue[ 1 ] );
				
			}, new String[] {
				key.name(), className } );
		
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param lockKey
	 * @param key
	 * @param methodQuery
	 */
	public static void setToTarget(
		String lockKey, PreparedTemporaryKey key, MethodQuery methodQuery ) {
	
		UnitTestRuntimeFoundation.before( lockKey,
			( BiConsumer< UnitTestTemporary, Object[] > )
			( temp, keyAndValue ) -> {
				
				temp.put( ( String )keyAndValue[ 0 ], keyAndValue[ 1 ] );
				
			},
			new Object[] {
				key.name(), methodQuery } );
		
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param lockKey
	 * @param key
	 * @param stereotype
	 */
	public static void setToTarget(
		String lockKey, PreparedTemporaryKey key, StereotypeDesign stereotype ) {
	
		UnitTestRuntimeFoundation.before( lockKey,
			( BiConsumer< UnitTestTemporary, Object[] > )
			( temp, keyAndValue ) -> {
				
				temp.put( ( String )keyAndValue[ 0 ], keyAndValue[ 1 ] );
				
			},
			new Object[] {
				key.name(), stereotype } );
		
	}
	
}
