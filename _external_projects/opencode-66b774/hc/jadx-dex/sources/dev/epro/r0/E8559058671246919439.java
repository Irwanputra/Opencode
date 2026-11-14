package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E8559058671246919439 extends dev.epro.r0.K10678596132709730734 {
    public final /* synthetic */ byte a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final java.lang.Object b(dev.epro.r0.D13396727227989475489 d13396727227989475489) throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        switch (this.a) {
            case 0:
                if (d13396727227989475489.H() != 9) {
                    return java.lang.Double.valueOf(d13396727227989475489.v());
                }
                d13396727227989475489.D();
                return null;
            case 1:
                if (d13396727227989475489.H() != 9) {
                    return java.lang.Float.valueOf((float) d13396727227989475489.v());
                }
                d13396727227989475489.D();
                return null;
            default:
                d13396727227989475489.O();
                return null;
        }
    }

    public final void c(dev.epro.r0.Y14132333989764804283 y14132333989764804283, java.lang.Object obj) {
        switch (this.a) {
            case 0:
                java.lang.Number number = (java.lang.Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    dev.epro.r0.F14240031463097426304.a(dDoubleValue);
                    y14132333989764804283.z(dDoubleValue);
                } else {
                    y14132333989764804283.p();
                }
                break;
            case 1:
                java.lang.Number numberValueOf = (java.lang.Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    dev.epro.r0.F14240031463097426304.a(fFloatValue);
                    if (!(numberValueOf instanceof java.lang.Float)) {
                        numberValueOf = java.lang.Float.valueOf(fFloatValue);
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

    public java.lang.String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super/*java.lang.Object*/.toString();
        }
    }
}
