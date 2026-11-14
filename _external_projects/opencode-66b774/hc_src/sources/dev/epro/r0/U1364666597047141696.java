package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U1364666597047141696 extends P9674367971006745590 implements Runnable {
    public D16915945238461757356 h;

    @Override // dev.epro.r0.R4225980552687347745
    public final void c() {
        this.h = null;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final String i() {
        D16915945238461757356 d16915945238461757356 = this.h;
        if (d16915945238461757356 == null) {
            return null;
        }
        return "delegate=[" + d16915945238461757356 + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        D16915945238461757356 d16915945238461757356 = this.h;
        if (d16915945238461757356 != null) {
            m(d16915945238461757356);
        }
    }
}
