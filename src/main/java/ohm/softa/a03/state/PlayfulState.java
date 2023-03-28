package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class PlayfulState extends State {
    public PlayfulState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("Yoan... getting tired!");
        return new SleepingState(cat.getSleep());
    }
}
