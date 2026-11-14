package dev.epro.r0;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O10864648295946509064 extends K10678596132709730734 {
    public static final S14615174310940763483 b = new S14615174310940763483();
    public final K10678596132709730734 a;

    public O10864648295946509064(K10678596132709730734 k10678596132709730734) {
        this.a = k10678596132709730734;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        Date date = (Date) this.a.b(d13396727227989475489);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        this.a.c(y14132333989764804283, (Timestamp) obj);
    }
}
