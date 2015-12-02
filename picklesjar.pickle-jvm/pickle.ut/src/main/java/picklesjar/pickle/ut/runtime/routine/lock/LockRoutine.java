package picklesjar.pickle.ut.runtime.routine.lock;

import picklesjar.pickle.ut.runtime.UnitTestRuntimeFoundation;
import picklesjar.pickle.ut.runtime.routine.Routine;
import picklesjar.pickle.ut.runtime.routine.config.ConfigureRoutine;
import picklesjar.picklerecipes.ut.sequence.ShouldBeAfter;
import picklesjar.picklerecipes.ut.sequence.ShouldBeBefore;

public interface LockRoutine
	extends Routine {
	
	@ShouldBeAfter( ConfigureRoutine.class )
	public static String lock() {
	
		return UnitTestRuntimeFoundation.lock();
	}
	
	@ShouldBeBefore( ConfigureRoutine.class )
	public static void unlock( String key ) {
	
		UnitTestRuntimeFoundation.unlock( key );
	}
	
}
