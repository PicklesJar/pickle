package picklesjar.pickle.ut.prepare.developer;

import java.util.Set;

import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import picklesjar.brine.autodev.DevelopmentPhase;
import picklesjar.brine.autodev.annotation.Developer;
import picklesjar.brine.autodev.annotation.DevelopmentMethod;
import picklesjar.brine.autodev.annotation.InjectDevTool;
import picklesjar.brine.autodev.annotation.InjectEnvironment;
import picklesjar.brine.autodev.tools.VelocitySupportTool;
import picklesjar.pickle.ut.prepare.UnitTestWithCucumber;

@Developer( priority = 1 )
public class TestTargetMethodConfigurationClassDeveloper {
	
	protected static final String CONFIGURATION_FILE = "META-INF/picklesjar.pickle.ut.prepare.developer/TestTargetMethodConfigurationClassDeveloper/config.properties";
	
	private static final Logger log = LoggerFactory.getLogger( TestTargetMethodConfigurationClassDeveloper.class );
	
	@InjectEnvironment
	private ProcessingEnvironment processingEnv;
	
	@InjectEnvironment
	private RoundEnvironment roundEnv;
	
	@InjectDevTool
	private VelocitySupportTool velocityTool;
	
	private String generatorClassName = null;
	
	private StringBuilder builder = null;
	
	private PropertiesConfiguration config = null;
	
	/**
	 * 
	 * 
	 * 
	 */
	@DevelopmentMethod( phase = DevelopmentPhase.INITIALIZE )
	public void init() {
	
		generatorClassName = this.getClass().getName();
		builder = new StringBuilder();
		
		try {
			ClassLoader loader = this.getClass().getClassLoader();
			config = new PropertiesConfiguration( loader.getResource( CONFIGURATION_FILE ) );
		} catch( ConfigurationException exp ) {
			log.error( "Failed load configure file.", exp );
			throw new IllegalStateException( exp );
		}
	}
	
	/**
	 * 
	 * 
	 * 
	 */
	@DevelopmentMethod
	public void main() {
	
		Elements elmUtil = processingEnv.getElementUtils();
		Set< ? extends Element > utWithCucumbers = roundEnv.getElementsAnnotatedWith( UnitTestWithCucumber.class );
		if( utWithCucumbers != null ) {
			
			// FIXME
			
		}
	}
	
}
