package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class G2148642174542134274 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        if (d13396727227989475489.H() != 9) {
            return Float.valueOf((float) d13396727227989475489.v());
        }
        d13396727227989475489.D();
        return null;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            y14132333989764804283.p();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        y14132333989764804283.C(number);
    }
}
