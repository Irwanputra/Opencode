package dev.epro.r0;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U8000365519789522238 {
    public final F18341548724281518495 a;
    public final N8306548196372912291 b;
    public final Y2677586711477821327 c = new Y2677586711477821327((byte) 1);
    public final A4559761392562572984 d;
    public boolean e;
    public Bundle f;
    public boolean g;
    public boolean h;

    public U8000365519789522238(F18341548724281518495 f18341548724281518495, N8306548196372912291 n8306548196372912291) {
        this.a = f18341548724281518495;
        this.b = n8306548196372912291;
        long[] jArr = X4026756943680612204.a;
        this.d = new A4559761392562572984();
        this.h = true;
    }

    public final void a() {
        F18341548724281518495 f18341548724281518495 = this.a;
        if (((I1283052979100930176) f18341548724281518495.j()).h != Q14196755420833223976.b) {
            S10973172697741180971.m("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                S10973172697741180971.m("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            f18341548724281518495.j().a(new F10239625753091103224(this, (byte) 8));
            this.e = true;
        }
    }
}
