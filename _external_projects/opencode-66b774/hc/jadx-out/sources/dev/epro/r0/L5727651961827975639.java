package dev.epro.r0;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L5727651961827975639 implements V4446577237959483780 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ K10678596132709730734 b;

    public /* synthetic */ L5727651961827975639(K10678596132709730734 k10678596132709730734, byte b) {
        this.a = b;
        this.b = k10678596132709730734;
    }

    @Override // dev.epro.r0.V4446577237959483780
    public final K10678596132709730734 a(F14240031463097426304 f14240031463097426304, K11898134656129953686 k11898134656129953686) {
        byte b = this.a;
        K10678596132709730734 k10678596132709730734 = this.b;
        switch (b) {
            case 0:
                if (k11898134656129953686.a == Number.class) {
                    return (O1318608560032376846) k10678596132709730734;
                }
                return null;
            default:
                Class cls = k11898134656129953686.a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (K17772273892915554291) k10678596132709730734;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((K17772273892915554291) this.b) + "]";
            default:
                return super.toString();
        }
    }
}
