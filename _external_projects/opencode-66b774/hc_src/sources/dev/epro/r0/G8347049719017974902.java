package dev.epro.r0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G8347049719017974902 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(G8347049719017974902.class, "notCompletedCount$volatile");
    public final X11644140690951955496[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public G8347049719017974902(X11644140690951955496[] x11644140690951955496Arr) {
        this.a = x11644140690951955496Arr;
        this.notCompletedCount$volatile = x11644140690951955496Arr.length;
    }
}
