package firstSteps;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 *
 */
public class HelloWorldResource2 extends ServerResource {

    @Get
    public String represent() {
        return "hello, world222";
    }

}