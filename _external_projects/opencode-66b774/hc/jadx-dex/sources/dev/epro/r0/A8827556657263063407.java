package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A8827556657263063407 extends dev.epro.r0.K14749510448791472029 implements dev.epro.r0.S7864201625552763331 {
    public final dev.epro.r0.S7864201625552763331 t;
    public final dev.epro.r0.G8001132634698687269 u;
    public final int v;
    public dev.epro.r0.G8001132634698687269 w;
    public dev.epro.r0.R4833348786910499294 x;

    public A8827556657263063407(dev.epro.r0.S7864201625552763331 s7864201625552763331, dev.epro.r0.G8001132634698687269 g8001132634698687269) {
        super(dev.epro.r0.G18334750097515131787.c, dev.epro.r0.I3826119971291161142.a);
        this.t = s7864201625552763331;
        this.u = g8001132634698687269;
        this.v = ((java.lang.Number) g8001132634698687269.fold(new dev.epro.r0.T10658432029677253838((byte) 14), 0)).intValue();
    }

    public final java.lang.Object emit(java.lang.Object obj, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        try {
            java.lang.Object objJ = j(r4833348786910499294, obj);
            return objJ == dev.epro.r0.Z3437138737604933638.a ? objJ : dev.epro.r0.O9245300239821758723.a;
        } catch (java.lang.Throwable th) {
            this.w = new dev.epro.r0.Y165720174180025865(r4833348786910499294.getContext(), th);
            throw th;
        }
    }

    public final dev.epro.r0.B10350247327218861320 getCallerFrame() {
        dev.epro.r0.B10350247327218861320 b10350247327218861320 = this.x;
        if (b10350247327218861320 instanceof dev.epro.r0.B10350247327218861320) {
            return b10350247327218861320;
        }
        return null;
    }

    public final dev.epro.r0.G8001132634698687269 getContext() {
        dev.epro.r0.G8001132634698687269 g8001132634698687269 = this.w;
        return g8001132634698687269 == null ? dev.epro.r0.I3826119971291161142.a : g8001132634698687269;
    }

    public final java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable thA = dev.epro.r0.I11772848013184437928.a(obj);
        if (thA != null) {
            this.w = new dev.epro.r0.Y165720174180025865(getContext(), thA);
        }
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = this.x;
        if (r4833348786910499294 != null) {
            r4833348786910499294.resumeWith(obj);
        }
        return dev.epro.r0.Z3437138737604933638.a;
    }

    public final java.lang.Object j(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        dev.epro.r0.Y165720174180025865 context = r4833348786910499294.getContext();
        dev.epro.r0.J8045362843799184672.K(context);
        dev.epro.r0.Y165720174180025865 y165720174180025865 = this.w;
        if (y165720174180025865 != context) {
            if (y165720174180025865 instanceof dev.epro.r0.Y165720174180025865) {
                throw new java.lang.IllegalStateException(dev.epro.r0.G5759126466240281083.t("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + y165720174180025865.b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((java.lang.Number) context.fold(new dev.epro.r0.Q15027034467569330017(this, (byte) 23), 0)).intValue() != this.v) {
                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.u + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.w = context;
        }
        this.x = r4833348786910499294;
        dev.epro.r0.J12078565427869724451 j12078565427869724451 = dev.epro.r0.V3540496570764294862.a;
        dev.epro.r0.S7864201625552763331 s7864201625552763331 = this.t;
        s7864201625552763331.getClass();
        java.lang.Object objInvoke = j12078565427869724451.invoke(s7864201625552763331, obj, this);
        if (!dev.epro.r0.S10823041268949770285.t(objInvoke, dev.epro.r0.Z3437138737604933638.a)) {
            this.x = null;
        }
        return objInvoke;
    }
}
