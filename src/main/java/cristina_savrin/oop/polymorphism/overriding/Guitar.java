package cristina_savrin.oop.polymorphism.overriding;

/**
 * 1. Implement a class hierarchy for different musical instruments, such as "Instrument" as the superclass and subclasses like "Guitar", "Piano", and "Violin".
 * Include a method named "play" in each subclass that produces a specific sound for the instrument.
 */
public class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("The guitar sound is produced by a vibrating string stretched between two fixed points.");
    }
}