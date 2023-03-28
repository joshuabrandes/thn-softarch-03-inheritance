package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class DigestingState extends State {
    private final int remainingWakeTime;

    DigestingState(int duration, int remainingWakeTime) {
        super(duration);
        this.remainingWakeTime = remainingWakeTime;
    }

    @Override
    public State successor(Cat cat) {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(remainingWakeTime - cat.getDigest());
    }

}
