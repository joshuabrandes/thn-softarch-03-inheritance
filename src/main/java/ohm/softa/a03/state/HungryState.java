package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class HungryState extends State {
    public HungryState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("I've starved for a too long time...good bye...");
        return new DeathState();
    }

    public State feed(Cat cat) {
        logger.info("You feed the cat...");
        return new DigestingState(
                cat.getDigest(),
                getDuration() - getTime());
    }
}
