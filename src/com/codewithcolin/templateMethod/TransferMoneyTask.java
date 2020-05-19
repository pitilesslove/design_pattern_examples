package com.codewithcolin.templateMethod;

import com.codewithcolin.templateMethod.problem.AuditTrail;

public class TransferMoneyTask extends Task {

    @Override
    void doExecute() {
        System.out.println("Transfer Money");
    }
}
