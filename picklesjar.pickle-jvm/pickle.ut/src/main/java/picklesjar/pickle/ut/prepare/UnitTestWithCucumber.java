package picklesjar.pickle.ut.prepare;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import picklesjar.brine.autodev.annotation.DevelopmentTrigger;
import picklesjar.pickle.ut.prepare.developer.TestTargetMethodConfigurationClassDeveloper;

/**
 * 
 * 
 * 
 * @author PicklesCooker
 * 
 */
@Target( { ElementType.TYPE } )
@Retention( RetentionPolicy.RUNTIME )
@DevelopmentTrigger( TestTargetMethodConfigurationClassDeveloper.class )
public @interface UnitTestWithCucumber {
	
	/**
	 * PicklesJar package name.
	 * 
	 * @return
	 */
	public String value();
	
	/**
	 * multi thread use flag.
	 * 
	 * @return
	 */
	public boolean multiTread() default false;
	
	/**
	 * Test target class.
	 * Developer will find Class by this annotated class name if not set.
	 * 
	 * @return
	 */
	public Class< ? > targetClass() default UnitTestWithCucumber.class;
}
