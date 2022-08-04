package com.epam.rd.autotasks;

public class CountDownTask implements Task{
     int value;
     boolean isFinished = false;

    public CountDownTask(int value) {
        this.value = value;
        if(value <= 0) {
            isFinished = true;
            isFinished();
        }
    }

    public int getValue() {
        if(value <= 0) {
            value = 0;
        }
        return value;
    }


    @Override
    public void execute() {
            value--;
            if (value <= 0) {
                isFinished();
                isFinished = true;
                value = 0;
            }
    }

    @Override
    public boolean isFinished() {
       if (value <= 0) {
           isFinished = true;
           return true;
       }
       return false;
    }
}
