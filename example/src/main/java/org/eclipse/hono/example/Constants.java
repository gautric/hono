package org.eclipse.hono.example;

final class Constants {

    static final String CLIENT_ID_1 = "client1";
    static final String CLIENT_ID_2 = "client2";
    static final String TOPIC_1     = "topic1";
    static final String TOPIC_2     = "topic2";
    static final String AMQP_URI    = System.getenv("AMQP_URI");

    private Constants() {
    }
}
