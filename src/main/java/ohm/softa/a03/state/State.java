package ohm.softa.a03.state;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import ohm.softa.a03.Cat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class State {

    protected final Logger logger = LogManager.getLogger();

    int t;
    final int duration;

    public State(int duration) {
        this.t = 0;
        this.duration = duration;
    }

    public final State tick(Cat cat) {
        logger.info("tick()");
        t += 1;

        if (duration == t) {
            return this.successor(cat);
        } else {
            return this;
        }
    }

    abstract State successor(Cat cat);

    public int getTime() {
        return t;
    }

    public int getDuration() {
        return duration;
    }

}
