package com.example.restaurant_vote_system;

import junit.framework.TestCase;
import org.junit.AssumptionViolatedException;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

public class StopwatchTest extends Stopwatch {

    public StopwatchTest() {
        super();
    }

    @Override
    protected void succeeded(long nanos, Description description) {
        super.succeeded(nanos, description);
    }

    @Override
    protected void failed(long nanos, Throwable e, Description description) {
        super.failed(nanos, e, description);
    }

    @Override
    protected void skipped(long nanos, AssumptionViolatedException e, Description description) {
        super.skipped(nanos, e, description);
    }

    @Override
    protected void finished(long nanos, Description description) {
        super.finished(nanos, description);
    }
}
