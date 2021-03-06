package picklesjar.pickle.ut.core;

import picklesjar.pickle.ut.core.util.ClassFunctionTarget;
import picklesjar.pickle.ut.core.util.MethodQuery;
import picklesjar.pickle.ut.prepare.design.StereotypeDesign;
import picklesjar.pickle.ut.runtime.UnitTestTemporary;

public enum PreparedTemporaryKey
	implements UnitTestTemporaryKey {
	
	/**
	 * 
	 */
	TEST_TARGET_CLASS_FULLNAME( String.class ),
	
	/**
	 * 
	 */
	TEST_TARGET_CLASS_OBJECT( Class.class ),
	
	/**
	 * 
	 */
	TEST_TARGET_CLASS_INSTANCE(),
	
	/**
	 * 
	 */
	TEST_TARGET_METHOD_QUERY( MethodQuery.class ),
	
	/**
	 * 
	 */
	TEST_TARGET_CLASS_FUNCTION( ClassFunctionTarget.class ),
	
	/**
	 * 
	 */
	TEST_TARGET_METHOD_OF_STEREOTYPE_DESIGN( StereotypeDesign.class );
	
	private Class< ? > targetClass = null;
	
	private PreparedTemporaryKey() {
	
		this( null );
	}
	
	private PreparedTemporaryKey( Class< ? > targetClass ) {
	
		this.targetClass = targetClass;
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	public synchronized Object getValueFrom( UnitTestTemporary temp )
		throws IllegalArgumentException {
	
		if( temp == null ) {
			throw new IllegalArgumentException();
		}
		
		return temp.get( name() );
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	@SuppressWarnings( "unchecked" )
	public synchronized < T > T valueOf( UnitTestTemporary temp )
		throws ClassCastException,
			IllegalArgumentException {
	
		if( temp == null ) {
			throw new IllegalArgumentException();
		}
		
		T result = null;
		if( targetClass != null ) {
			
			result = ( T )targetClass.cast( temp.get( name() ) );
		}
		
		return result;
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	public synchronized < T > T valueOf( UnitTestTemporary temp, Class< T > castTarget )
		throws ClassCastException,
			IllegalArgumentException {
	
		if( ( temp == null ) || ( castTarget == null ) ) {
			throw new IllegalArgumentException();
		}
		
		return ( T )castTarget.cast( temp.get( name() ) );
	}
	
	/**
	 * 
	 * 
	 * 
	 * @return
	 */
	@Override
	public Class< ? > getExchangeTargetClass() {
	
		return targetClass;
	}
}
