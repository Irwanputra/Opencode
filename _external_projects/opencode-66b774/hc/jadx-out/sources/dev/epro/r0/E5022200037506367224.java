package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E5022200037506367224 extends T13610764347093379131 {
    public static final /* synthetic */ long c = T5284056093300834442.a.objectFieldOffset(E5022200037506367224.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    public E5022200037506367224(H7219028874700587498 h7219028874700587498, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + h7219028874700587498 + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
