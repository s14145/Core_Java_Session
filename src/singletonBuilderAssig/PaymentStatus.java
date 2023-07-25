package singletonBuilderAssig;

/**
 * This is a PaymentStatus enum
 * Reflection API violates Singleton design pattern as private constructor can be accessed using Reflection API and create multiple instances
 * so we can create Enum to overcome it. Enum's constructor is invoked by JVM not by user so it is safe to use.
 * By default, enum is thread safe.
 */
public enum PaymentStatus {

    PENDING(1), COMPLETED(2);

    private int label;

    PaymentStatus(int label) {
        this.label = label;
    }

    public int getLabel() {
        return label;
    }
}
