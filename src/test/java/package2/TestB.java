package package2;

import package1.TestA;

class TestB extends TestA {
    public void display() {
        System.out.println("Displayb");
    }


    public static void main(String[] args) {

        TestA a = new TestA();
        // a.display();
    }

}