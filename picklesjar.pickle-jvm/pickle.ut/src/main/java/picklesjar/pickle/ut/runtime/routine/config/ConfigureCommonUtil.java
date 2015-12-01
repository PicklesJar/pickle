package picklesjar.pickle.ut.runtime.routine.config;

import picklesjar.pickle.ut.runtime.UnitTestRuntimeFoundation;

interface ConfigureCommonUtil {
	
	public static void config( int flag ) {
		
		UnitTestRuntimeFoundation.switchMode( flag );
	}
	
}
