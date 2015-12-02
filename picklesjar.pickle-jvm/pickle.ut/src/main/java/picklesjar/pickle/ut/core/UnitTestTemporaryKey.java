package picklesjar.pickle.ut.core;

import picklesjar.pickle.ut.runtime.UnitTestTemporary;

public interface UnitTestTemporaryKey {
	
	public Object getValueFrom( UnitTestTemporary temp );
	
	public < T > T valueOf( UnitTestTemporary temp );
	
	public < T > T valueOf( UnitTestTemporary temp, Class< T > castTarget );
	
	public Class< ? > getExchangeTargetClass();
	
}
