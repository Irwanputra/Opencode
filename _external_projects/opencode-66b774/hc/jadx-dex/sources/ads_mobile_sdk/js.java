package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class js implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final dev.epro.r0.I16631908410500040363 c;
    public final long d;

    public js(java.lang.String str, java.lang.String str2, dev.epro.r0.I16631908410500040363 i16631908410500040363, long j) {
        this.a = str;
        this.b = str2;
        this.c = i16631908410500040363;
        this.d = j;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        dev.epro.r0.P16422848101170923038 p16422848101170923038;
        p3477296814990354048.getClass();
        java.lang.String str = this.a;
        p3477296814990354048.i0 = str;
        p3477296814990354048.k0 = this.b;
        p3477296814990354048.l0 = this.c;
        p3477296814990354048.h0 = this.d;
        if (str != null) {
            try {
                dev.epro.r0.I16631908410500040363 i16631908410500040363 = (dev.epro.r0.I16631908410500040363) new dev.epro.r0.F14240031463097426304().b(dev.epro.r0.I16631908410500040363.class, str);
                p16422848101170923038 = new dev.epro.r0.P16422848101170923038();
                p16422848101170923038.q(i16631908410500040363);
            } catch (java.lang.Exception e) {
                java.util.ArrayList arrayList = dev.epro.r0.G6547577305291411977.l(e).s;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                arrayList.add(message);
                p16422848101170923038 = null;
            }
            p3477296814990354048.j0 = p16422848101170923038;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.js)) {
            return false;
        }
        ads_mobile_sdk.js jsVar = (ads_mobile_sdk.js) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, jsVar.a) && dev.epro.r0.S10823041268949770285.t(this.b, jsVar.b) && dev.epro.r0.S10823041268949770285.t(this.c, jsVar.c) && this.d == jsVar.d;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.c;
        return java.lang.Long.hashCode(this.d) + ((iHashCode2 + (i16631908410500040363 != null ? i16631908410500040363.a.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("CldSignal(adUnitRequestSignals=", this.a, ", commonCldSignals=", this.b, ", commonCldObject=");
        sbY.append(this.c);
        sbY.append(", timeSinceCldUpdateInMs=");
        sbY.append(this.d);
        sbY.append(")");
        return sbY.toString();
    }
}
