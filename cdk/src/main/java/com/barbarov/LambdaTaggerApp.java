package com.barbarov;

import software.amazon.awscdk.core.App;

public final class LambdaTaggerApp {
    public static void main(final String[] args) {
        App app = new App();

        new LambdaTaggerStack(app, "LambdaTaggerStack");

        app.synth();
    }
}
