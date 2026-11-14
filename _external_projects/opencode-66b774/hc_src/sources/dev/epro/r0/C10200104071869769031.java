package dev.epro.r0;

import ads_mobile_sdk.rf0;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C10200104071869769031 extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ byte i = 1;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10200104071869769031(B13729205492206812220 b13729205492206812220, boolean z) {
        super(1);
        this.j = z;
        this.k = b13729205492206812220;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        String str;
        byte b = this.i;
        boolean z = this.j;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                ((O16200024709371809403) obj).f(!z && ((Boolean) ((B13729205492206812220) obj2).invoke()).booleanValue());
                return O9245300239821758723.a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                if (((rf0) obj2).f.E0() && z && (str = (String) entry.getValue()) != null && str.length() > 500) {
                    return entry.getKey() + " = [Debug dialog string omitted from screen due to length limit. Please use the Share option or Copy button to retrieve it.]";
                }
                return entry.getKey() + " = " + entry.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10200104071869769031(rf0 rf0Var, boolean z) {
        super(1);
        this.k = rf0Var;
        this.j = z;
    }
}
