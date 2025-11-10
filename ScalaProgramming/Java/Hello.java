class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Create object of Greetings
        Greetings greeter = new Greetings();

        // Call the method
        String message = greeter.greet("Alice");
        System.out.println(message);
    }
}

class Greetings {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
