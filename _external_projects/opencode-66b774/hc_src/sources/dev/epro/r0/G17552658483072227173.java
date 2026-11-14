package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G17552658483072227173 extends Z3069203969753053913 {
    public static final /* synthetic */ long f = T5284056093300834442.a.objectFieldOffset(G17552658483072227173.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final C9424689592673022017 e;

    public G17552658483072227173(C9424689592673022017 c9424689592673022017) {
        this.e = c9424689592673022017;
    }

    @Override // dev.epro.r0.Z3069203969753053913
    public final boolean m() {
        return true;
    }

    @Override // dev.epro.r0.Z3069203969753053913
    public final void n(Throwable th) {
        if (T5284056093300834442.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
