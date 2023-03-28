package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class SleepingState extends State {
    public SleepingState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("Yoan... getting hungry!");
        return new HungryState(cat.getAwake());
    }
}
