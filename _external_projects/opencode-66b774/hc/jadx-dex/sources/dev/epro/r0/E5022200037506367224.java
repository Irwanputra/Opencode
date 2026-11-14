package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E5022200037506367224 extends dev.epro.r0.T13610764347093379131 {
    public static final /* synthetic */ long c = dev.epro.r0.T5284056093300834442.a.objectFieldOffset(dev.epro.r0.E5022200037506367224.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    public E5022200037506367224(dev.epro.r0.H7219028874700587498 h7219028874700587498, java.lang.Throwable th, boolean z) {
        if (th == null) {
            th = new java.util.concurrent.CancellationException("Continuation " + h7219028874700587498 + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
