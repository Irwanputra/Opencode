package ads_mobile_sdk;

import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.P16422848101170923038;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class js implements R16693852608535438299 {
    public final String a;
    public final String b;
    public final I16631908410500040363 c;
    public final long d;

    public js(String str, String str2, I16631908410500040363 i16631908410500040363, long j) {
        this.a = str;
        this.b = str2;
        this.c = i16631908410500040363;
        this.d = j;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        P16422848101170923038 p16422848101170923038;
        p3477296814990354048.getClass();
        String str = this.a;
        p3477296814990354048.i0 = str;
        p3477296814990354048.k0 = this.b;
        p3477296814990354048.l0 = this.c;
        p3477296814990354048.h0 = this.d;
        if (str != null) {
            try {
                I16631908410500040363 i16631908410500040363 = (I16631908410500040363) new F14240031463097426304().b(I16631908410500040363.class, str);
                p16422848101170923038 = new P16422848101170923038();
                p16422848101170923038.q(i16631908410500040363);
            } catch (Exception e) {
                ArrayList arrayList = G6547577305291411977.l(e).s;
                String message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                arrayList.add(message);
                p16422848101170923038 = null;
            }
            p3477296814990354048.j0 = p16422848101170923038;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js)) {
            return false;
        }
        js jsVar = (js) obj;
        return S10823041268949770285.t(this.a, jsVar.a) && S10823041268949770285.t(this.b, jsVar.b) && S10823041268949770285.t(this.c, jsVar.c) && this.d == jsVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        I16631908410500040363 i16631908410500040363 = this.c;
        return Long.hashCode(this.d) + ((hashCode2 + (i16631908410500040363 != null ? i16631908410500040363.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder y = G6547577305291411977.y("CldSignal(adUnitRequestSignals=", this.a, ", commonCldSignals=", this.b, ", commonCldObject=");
        y.append(this.c);
        y.append(", timeSinceCldUpdateInMs=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
