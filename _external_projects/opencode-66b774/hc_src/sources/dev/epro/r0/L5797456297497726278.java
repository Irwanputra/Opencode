package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L5797456297497726278 extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L5797456297497726278(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.i;
        float f = 1.0f;
        byte b2 = 1;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (b) {
            case 0:
                int ordinal = ((E2931101495752331306) obj).ordinal();
                if (ordinal == 0) {
                    N12971976141354546695 n12971976141354546695 = ((Z5580852631924387145) obj4).a.a;
                    if (n12971976141354546695 != null) {
                        f = n12971976141354546695.a;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        Z3383101362411723454.g();
                        return null;
                    }
                    N12971976141354546695 n129719761413545466952 = ((J2232875916072654838) obj3).a.a;
                    f = n129719761413545466952 != null ? n129719761413545466952.a : ((V15405126878164315789) obj2).f;
                }
                return Float.valueOf(f);
            case 1:
                int ordinal2 = ((E2931101495752331306) obj).ordinal();
                if (ordinal2 == 0) {
                    C236413207748491238 c236413207748491238 = ((Z5580852631924387145) obj4).a.d;
                    if (c236413207748491238 != null) {
                        f = c236413207748491238.a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        Z3383101362411723454.g();
                        return null;
                    }
                    C236413207748491238 c2364132077484912382 = ((J2232875916072654838) obj3).a.d;
                    f = c2364132077484912382 != null ? c2364132077484912382.a : ((V15405126878164315789) obj2).g;
                }
                return Float.valueOf(f);
            default:
                return new H3022740946908935985((R5670552972627103399) obj4, obj3, (O7205211285568135375) obj2, b2);
        }
    }
}
