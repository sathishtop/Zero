package modules;

import javax.inject.Named;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * 
 * @author Sathish
 *
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {

    }

    @Provides
    @Named("zeroUser")
    private String userId() {
        return null;
    }

    @Provides
    @Named("zeroAppId")
    private String appId() {
        return null;
    }
}
