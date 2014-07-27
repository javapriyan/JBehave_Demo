import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.owler.ui.steps.HomePageSteps;

/**
 * Created by kumaran on 7/26/14.
 */
public class Runner extends JUnitStory {

    /*@Override
    public Configuration configuration() {
        return super.configuration()
                .useStoryReporterBuilder(
                        new StoryReporterBuilder()
                                .withDefaultFormats()
                                .withFormats(Format.CONSOLE));
    }
*/


    // Here we specify the steps classes
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new HomePageSteps());
    }

   /* @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(org.jbehave.core.io.CodeLocations.codeLocationFromPath("src/test/resources/stories"), "**//*owler_homepage.story", "");
    }*/
}

