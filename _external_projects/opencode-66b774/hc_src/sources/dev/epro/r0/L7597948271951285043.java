package dev.epro.r0;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class L7597948271951285043 {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final L10699316803831699764 b = new L10699316803831699764();

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        S10973172697741180971.m("Method must be call on main thread.");
    }
}
