package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.g6;
import ads_mobile_sdk.in2;
import ads_mobile_sdk.j;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y12531765857967015337 extends au0 {
    public final void c(long j) {
        b();
        g6 g6Var = (g6) this.b;
        g6Var.bitField0_ |= 1;
        g6Var.lastAccessTimeMs_ = j;
    }

    public final void d(List list) {
        b();
        g6 g6Var = (g6) this.b;
        O6641393078261985068 o6641393078261985068 = g6Var.responses_;
        if (!((j) o6641393078261985068).a) {
            g6Var.responses_ = T8598786036980488824.b(o6641393078261985068);
        }
        au0.a(list, g6Var.responses_);
    }

    public final void e() {
        b();
        g6 g6Var = (g6) this.b;
        g6Var.getClass();
        g6Var.responses_ = in2.e;
    }

    public final List f() {
        return Collections.unmodifiableList(((g6) this.b).responses_);
    }
}
