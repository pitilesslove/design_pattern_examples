package com.codewithcolin.templateMethod;

import com.codewithcolin.templateMethod.problem.AuditTrail;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

    public void execute() {
        auditTrail.record();

        doExecute();
    }

    abstract void doExecute() ;

}
