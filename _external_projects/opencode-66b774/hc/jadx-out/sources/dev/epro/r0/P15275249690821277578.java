package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P15275249690821277578 extends CancellationException {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P15275249690821277578(String str, byte b) {
        super(str);
        this.a = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.a) {
            case 0:
                setStackTrace(V12319504402545346730.j);
                break;
            case 1:
                setStackTrace(O4077903568229246.s);
                break;
            default:
                setStackTrace(B11964701839924937722.f);
                break;
        }
        return this;
    }
}
