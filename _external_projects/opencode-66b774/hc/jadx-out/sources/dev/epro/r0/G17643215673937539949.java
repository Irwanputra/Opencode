package dev.epro.r0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G17643215673937539949 extends K10678596132709730734 {
    public final /* synthetic */ K10678596132709730734 a;

    public G17643215673937539949(K10678596132709730734 k10678596132709730734) {
        this.a = k10678596132709730734;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        if (d13396727227989475489.H() != 9) {
            return this.a.b(d13396727227989475489);
        }
        d13396727227989475489.D();
        return null;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        if (obj == null) {
            y14132333989764804283.p();
        } else {
            this.a.c(y14132333989764804283, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }
}
