package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A8827556657263063407 extends K14749510448791472029 implements S7864201625552763331 {
    public final S7864201625552763331 t;
    public final G8001132634698687269 u;
    public final int v;
    public G8001132634698687269 w;
    public R4833348786910499294 x;

    public A8827556657263063407(S7864201625552763331 s7864201625552763331, G8001132634698687269 g8001132634698687269) {
        super(G18334750097515131787.c, I3826119971291161142.a);
        this.t = s7864201625552763331;
        this.u = g8001132634698687269;
        this.v = ((Number) g8001132634698687269.fold(new T10658432029677253838((byte) 14), 0)).intValue();
    }

    @Override // dev.epro.r0.S7864201625552763331
    public final Object emit(Object obj, R4833348786910499294 r4833348786910499294) {
        try {
            Object objJ = j(r4833348786910499294, obj);
            return objJ == Z3437138737604933638.a ? objJ : O9245300239821758723.a;
        } catch (Throwable th) {
            this.w = new Y165720174180025865(r4833348786910499294.getContext(), th);
            throw th;
        }
    }

    @Override // dev.epro.r0.B401944902727389462, dev.epro.r0.B10350247327218861320
    public final B10350247327218861320 getCallerFrame() {
        R4833348786910499294 r4833348786910499294 = this.x;
        if (r4833348786910499294 instanceof B10350247327218861320) {
            return (B10350247327218861320) r4833348786910499294;
        }
        return null;
    }

    @Override // dev.epro.r0.K14749510448791472029, dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        G8001132634698687269 g8001132634698687269 = this.w;
        return g8001132634698687269 == null ? I3826119971291161142.a : g8001132634698687269;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Throwable thA = I11772848013184437928.a(obj);
        if (thA != null) {
            this.w = new Y165720174180025865(getContext(), thA);
        }
        R4833348786910499294 r4833348786910499294 = this.x;
        if (r4833348786910499294 != null) {
            r4833348786910499294.resumeWith(obj);
        }
        return Z3437138737604933638.a;
    }

    public final Object j(R4833348786910499294 r4833348786910499294, Object obj) {
        G8001132634698687269 context = r4833348786910499294.getContext();
        J8045362843799184672.K(context);
        G8001132634698687269 g8001132634698687269 = this.w;
        if (g8001132634698687269 != context) {
            if (g8001132634698687269 instanceof Y165720174180025865) {
                throw new IllegalStateException(G5759126466240281083.t("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((Y165720174180025865) g8001132634698687269).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(new Q15027034467569330017(this, (byte) 23), 0)).intValue() != this.v) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.u + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.w = context;
        }
        this.x = r4833348786910499294;
        J12078565427869724451 j12078565427869724451 = V3540496570764294862.a;
        S7864201625552763331 s7864201625552763331 = this.t;
        s7864201625552763331.getClass();
        Object objInvoke = j12078565427869724451.invoke(s7864201625552763331, obj, this);
        if (!S10823041268949770285.t(objInvoke, Z3437138737604933638.a)) {
            this.x = null;
        }
        return objInvoke;
    }
}
