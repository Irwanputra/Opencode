package ads_mobile_sdk;

import android.os.Handler;
import android.os.Looper;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.Q16850748603044648552;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class p72 implements Q16850748603044648552 {
    public static p72 f;
    public float a;
    public si0 d;
    public n6 e;

    @Override // dev.epro.r0.Q16850748603044648552
    public final void a(boolean z) {
        if (!z) {
            tj3.g.getClass();
            Handler handler = tj3.i;
            if (handler != null) {
                handler.removeCallbacks(tj3.k);
                tj3.i = null;
                return;
            }
            return;
        }
        tj3.g.getClass();
        if (tj3.i == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            tj3.i = handler2;
            handler2.post(tj3.j);
            tj3.i.postDelayed(tj3.k, 200L);
        }
    }

    public static p72 a() {
        p72 p72Var = f;
        if (p72Var != null) {
            return p72Var;
        }
        new P5733283974459951585((byte) 10);
        new P5733283974459951585((byte) 13);
        p72 p72Var2 = new p72();
        p72Var2.a = 0.0f;
        f = p72Var2;
        return p72Var2;
    }
}
