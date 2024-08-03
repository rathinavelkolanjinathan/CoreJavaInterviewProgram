package org.threadprogram;

public class Institute {

    synchronized public void classRoom(String facultyName) {

        for (int i = 0; i < 10; i++) {

            System.out.println(i + "Taking for" + facultyName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
	Institute ins;
	String facultyName;

	public void run() {
		ins.classRoom(facultyName);
	}

	MyThread(Institute inst, String facutyName) {

		this.ins = inst;
		this.facultyName = facutyName;
	}

}