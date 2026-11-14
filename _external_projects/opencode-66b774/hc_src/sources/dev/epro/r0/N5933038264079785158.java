package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N5933038264079785158 extends Y7561558295041324700 {
    public final H7219028874700587498 c;
    public final /* synthetic */ W9286035018771293936 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N5933038264079785158(W9286035018771293936 w9286035018771293936, long j, H7219028874700587498 h7219028874700587498) {
        super(j);
        this.d = w9286035018771293936;
        this.c = h7219028874700587498;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.D(this.d);
    }

    @Override // dev.epro.r0.Y7561558295041324700
    public final String toString() {
        return super.toString() + this.c;
    }
}
