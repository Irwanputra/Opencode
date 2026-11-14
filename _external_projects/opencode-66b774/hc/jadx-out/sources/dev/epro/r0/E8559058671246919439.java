package dev.epro.r0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E8559058671246919439 extends K10678596132709730734 {
    public final /* synthetic */ byte a;

    public /* synthetic */ E8559058671246919439(byte b) {
        this.a = b;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        switch (this.a) {
            case 0:
                if (d13396727227989475489.H() != 9) {
                    return Double.valueOf(d13396727227989475489.v());
                }
                d13396727227989475489.D();
                return null;
            case 1:
                if (d13396727227989475489.H() != 9) {
                    return Float.valueOf((float) d13396727227989475489.v());
                }
                d13396727227989475489.D();
                return null;
            default:
                d13396727227989475489.O();
                return null;
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    F14240031463097426304.a(dDoubleValue);
                    y14132333989764804283.z(dDoubleValue);
                } else {
                    y14132333989764804283.p();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    F14240031463097426304.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    y14132333989764804283.C(numberValueOf);
                } else {
                    y14132333989764804283.p();
                }
                break;
            default:
                y14132333989764804283.p();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
