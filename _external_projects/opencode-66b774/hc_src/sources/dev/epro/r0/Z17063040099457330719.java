package dev.epro.r0;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z17063040099457330719 extends R4239627874707364917 implements J8590556930419069179 {
    @Override // dev.epro.r0.J8590556930419069179
    public final Object a(Bundle bundle, R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            Bundle bundle2 = bundle;
            H4546125934900659656 h4546125934900659656 = new H4546125934900659656(str, value, (R4833348786910499294) null, bundle2, (byte) 19);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(h4546125934900659656, null, (byte) 1), 2);
            bundle = bundle2;
        }
        return O9245300239821758723.a;
    }
}
