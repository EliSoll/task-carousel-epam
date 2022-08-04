package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
     boolean complete = false;
     boolean flag = false;

    @Override
    public void execute() {
        if(flag) {
            complete = true;
            isFinished();
        }
    }

    @Override
    public boolean isFinished() {
      if (complete) {
          return true;
      }
      return false;
    }

    public void complete() {
        flag = true;
    }
}
