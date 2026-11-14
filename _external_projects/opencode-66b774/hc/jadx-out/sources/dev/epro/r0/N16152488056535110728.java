package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N16152488056535110728 extends H14047115090875094711 implements B10350247327218861320, R4833348786910499294 {
    public static final /* synthetic */ long h = T5284056093300834442.a.objectFieldOffset(N16152488056535110728.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final D11883231851729262595 d;
    public final K14749510448791472029 e;
    public Object f;
    public final Object g;

    public N16152488056535110728(D11883231851729262595 d11883231851729262595, K14749510448791472029 k14749510448791472029) {
        super(-1);
        this.d = d11883231851729262595;
        this.e = k14749510448791472029;
        this.f = J8045362843799184672.b;
        this.g = S10823041268949770285.a0(k14749510448791472029.getContext());
    }

    @Override // dev.epro.r0.B10350247327218861320
    public final B10350247327218861320 getCallerFrame() {
        return this.e;
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        return this.e.getContext();
    }

    @Override // dev.epro.r0.H14047115090875094711
    public final Object j() {
        Object obj = this.f;
        this.f = J8045362843799184672.b;
        return obj;
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final void resumeWith(Object obj) {
        Throwable thA = I11772848013184437928.a(obj);
        Object t13610764347093379131 = thA == null ? obj : new T13610764347093379131(thA, false);
        K14749510448791472029 k14749510448791472029 = this.e;
        G8001132634698687269 context = k14749510448791472029.getContext();
        D11883231851729262595 d11883231851729262595 = this.d;
        if (d11883231851729262595.B(context)) {
            this.f = t13610764347093379131;
            this.c = 0;
            d11883231851729262595.z(k14749510448791472029.getContext(), this);
            return;
        }
        I17129535152515035455 i17129535152515035455A = P13752028179861838617.a();
        if (i17129535152515035455A.c >= 4294967296L) {
            this.f = t13610764347093379131;
            this.c = 0;
            i17129535152515035455A.E(this);
            return;
        }
        i17129535152515035455A.F(true);
        try {
            G8001132634698687269 context2 = k14749510448791472029.getContext();
            Object objC0 = S10823041268949770285.c0(context2, this.g);
            try {
                k14749510448791472029.resumeWith(obj);
                while (i17129535152515035455A.H()) {
                }
            } finally {
                S10823041268949770285.X(context2, objC0);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + D15445857918358799638.g0(this.e) + ']';
    }

    @Override // dev.epro.r0.H14047115090875094711
    public final R4833348786910499294 e() {
        return this;
    }
}
