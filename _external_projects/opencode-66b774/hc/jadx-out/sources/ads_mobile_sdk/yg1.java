package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.C1290752467339106930;
import dev.epro.r0.C1776986987521524339;
import dev.epro.r0.Q1304841290039450495;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.Z14316276734425062790;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class yg1 implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ yg1(V2597580950516131749 v2597580950516131749, byte b) {
        this.b = b;
        this.a = v2597580950516131749;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.b;
        V2597580950516131749 v2597580950516131749 = this.a;
        switch (b) {
            case 0:
                ((Q1304841290039450495) v2597580950516131749.get()).getClass();
                String strValueOf = String.valueOf(C1290752467339106930.b.k(Integer.MAX_VALUE));
                Z14316276734425062790.e(strValueOf);
                return strValueOf;
            case 1:
                gr grVar = (gr) v2597580950516131749.get();
                grVar.getClass();
                return new a91(grVar, (byte) 7);
            case 2:
                v2597580950516131749.getClass();
                return new C1776986987521524339(v2597580950516131749, false);
            case 3:
                o12 o12Var = (o12) v2597580950516131749.get();
                o12Var.getClass();
                return o12Var;
            default:
                return new yp1((rr1) v2597580950516131749.get());
        }
    }
}
