package dev.epro.r0;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S2951061432333024323 {
    public final HashSet a = new HashSet();

    public final void a() {
        if (G7713175901684004489.c == null) {
            G7713175901684004489.c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != G7713175901684004489.c) {
            S10973172697741180971.m("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            Z3383101362411723454.s();
        }
    }
}
