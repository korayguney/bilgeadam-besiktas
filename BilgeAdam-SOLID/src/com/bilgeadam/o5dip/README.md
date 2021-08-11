# Dependency Inversion Principle

The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.

To demonstrate this, let's go old-school and bring to life a Windows 98 computer with code:

    public class Windows98Machine {}
But what good is a computer without a monitor and keyboard? Let's add one of each to our constructor so that every Windows98Computer we instantiate comes prepacked with a Monitor and a StandardKeyboard:

    public class Windows98Machine {
    
        private final StandardKeyboard keyboard;
        private final Monitor monitor;
    
        public Windows98Machine() {
            monitor = new Monitor();
            keyboard = new StandardKeyboard();
        }
    
    }
This code will work, and we'll be able to use the StandardKeyboard and Monitor freely within our Windows98Computer class.

Problem solved? Not quite. By declaring the StandardKeyboard and Monitor with the new keyword, we've tightly coupled these three classes together.

Not only does this make our Windows98Computer hard to test, but we've also lost the ability to switch out our StandardKeyboard class with a different one should the need arise. And we're stuck with our Monitor class too.

Let's decouple our machine from the StandardKeyboard by adding a more general Keyboard interface and using this in our class:

    public interface Keyboard { }

    public class Windows98Machine{
    
        private final Keyboard keyboard;
        private final Monitor monitor;
    
        public Windows98Machine(Keyboard keyboard, Monitor monitor) {
            this.keyboard = keyboard;
            this.monitor = monitor;
        }
    }
Here, we're using the dependency injection pattern to facilitate adding the Keyboard dependency into the Windows98Machine class.

Let's also modify our StandardKeyboard class to implement the Keyboard interface so that it's suitable for injecting into the Windows98Machine class:

    public class StandardKeyboard implements Keyboard { }
Now our classes are decoupled and communicate through the Keyboard abstraction. If we want, we can easily switch out the type of keyboard in our machine with a different implementation of the interface. We can follow the same principle for the Monitor class.

Excellent! We've decoupled the dependencies and are free to test our Windows98Machine with whichever testing framework we choose.