package dev.epro.r0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H7980640351404152884 extends Z3069203969753053913 {
    public static final /* synthetic */ long h = T5284056093300834442.a.objectFieldOffset(H7980640351404152884.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final H7219028874700587498 e;
    public U16840712152025914198 f;
    public final /* synthetic */ G8347049719017974902 g;

    public H7980640351404152884(G8347049719017974902 g8347049719017974902, H7219028874700587498 h7219028874700587498) {
        this.g = g8347049719017974902;
        this.e = h7219028874700587498;
    }

    @Override // dev.epro.r0.Z3069203969753053913
    public final void n(Throwable th) {
        H7219028874700587498 h7219028874700587498 = this.e;
        if (th != null) {
            D14731132657808549702 F = h7219028874700587498.F(new T13610764347093379131(th, false), null);
            if (F != null) {
                h7219028874700587498.x(F);
                A7414163841582707909 a7414163841582707909 = (A7414163841582707909) T5284056093300834442.a.getObjectVolatile(this, h);
                if (a7414163841582707909 != null) {
                    a7414163841582707909.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = G8347049719017974902.b;
        G8347049719017974902 g8347049719017974902 = this.g;
        if (atomicIntegerFieldUpdater.decrementAndGet(g8347049719017974902) == 0) {
            X11644140690951955496[] x11644140690951955496Arr = g8347049719017974902.a;
            ArrayList arrayList = new ArrayList(x11644140690951955496Arr.length);
            for (X11644140690951955496 x11644140690951955496 : x11644140690951955496Arr) {
                arrayList.add(x11644140690951955496.e());
            }
            h7219028874700587498.resumeWith(arrayList);
        }
    }
}
