class Foo {
    volatile int n;
    public Foo() {
        n = 0;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        n = 1;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (n != 1);
        printSecond.run();
        n = 2;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (n != 2);
        printThird.run();
        n = 3;
    }
}