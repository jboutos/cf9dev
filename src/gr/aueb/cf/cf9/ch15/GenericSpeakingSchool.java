package gr.aueb.cf.cf9.ch15;

/**
 * Loosely coupled
 */
public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable;

    //Dependency injection
    //IoC - Inversion of control
    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void speak() {
        iSpeakable.speak();
    }
}
