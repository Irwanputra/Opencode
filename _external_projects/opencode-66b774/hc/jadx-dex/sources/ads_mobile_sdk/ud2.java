package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ud2 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ java.util.ArrayList a;
    public final /* synthetic */ dev.epro.r0.A7209497065939201693 b;
    public final /* synthetic */ dev.epro.r0.A7209497065939201693 c;
    public final /* synthetic */ ads_mobile_sdk.qw2 d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ ads_mobile_sdk.pe2 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud2(java.util.ArrayList arrayList, dev.epro.r0.A7209497065939201693 a7209497065939201693, dev.epro.r0.A7209497065939201693 a72094970659392016932, ads_mobile_sdk.qw2 qw2Var, java.lang.String str, ads_mobile_sdk.pe2 pe2Var, long j, boolean z) {
        super(1);
        this.a = arrayList;
        this.b = a7209497065939201693;
        this.c = a72094970659392016932;
        this.d = qw2Var;
        this.e = str;
        this.f = pe2Var;
        this.g = j;
        this.h = z;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        ads_mobile_sdk.g1 g1Var = (ads_mobile_sdk.g1) obj;
        g1Var.getClass();
        java.util.ArrayList arrayList2 = this.a;
        arrayList2.clear();
        dev.epro.r0.A7209497065939201693 a7209497065939201693 = this.b;
        a7209497065939201693.a = null;
        dev.epro.r0.A7209497065939201693 a72094970659392016932 = this.c;
        a72094970659392016932.a = null;
        java.lang.String strName = this.d.name();
        ads_mobile_sdk.vr0 vr0Var = (ads_mobile_sdk.vr0) g1Var.u().get(strName);
        ads_mobile_sdk.se2 se2Var = ads_mobile_sdk.se2.MISS_REASON_EMPTY;
        if (vr0Var == null) {
            a72094970659392016932.a = se2Var;
            return g1Var;
        }
        java.util.Map mapO = vr0Var.o();
        java.lang.String str = this.e;
        ads_mobile_sdk.g6 g6Var = (ads_mobile_sdk.g6) mapO.get(str);
        if (g6Var == null) {
            a72094970659392016932.a = se2Var;
            return g1Var;
        }
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(str, g6Var);
        mapSingletonMap.getClass();
        ads_mobile_sdk.pe2 pe2Var = this.f;
        long j = this.g;
        ads_mobile_sdk.g6 g6Var2 = (ads_mobile_sdk.g6) pe2Var.a(mapSingletonMap, j, arrayList2).get(str);
        dev.epro.r0.O6641393078261985068<ads_mobile_sdk.b6> o6641393078261985068R = g6Var2 != null ? g6Var2.r() : null;
        if (o6641393078261985068R == null) {
            o6641393078261985068R = dev.epro.r0.O2161699089510411363.a;
        }
        dev.epro.r0.S2322588539201815831 s2322588539201815831N = g1Var.n();
        if (o6641393078261985068R.isEmpty()) {
            a72094970659392016932.a = ads_mobile_sdk.se2.MISS_REASON_EXPIRED;
            dev.epro.r0.C7584963549263810245 c7584963549263810245 = (dev.epro.r0.C7584963549263810245) vr0Var.n();
            c7584963549263810245.e().getClass();
            str.getClass();
            c7584963549263810245.c(str);
            ads_mobile_sdk.vr0 vr0Var2 = (ads_mobile_sdk.vr0) c7584963549263810245.a();
            if (vr0Var2.o().isEmpty()) {
                s2322588539201815831N.e().getClass();
                strName.getClass();
                s2322588539201815831N.c(strName);
            } else {
                s2322588539201815831N.e().getClass();
                strName.getClass();
                s2322588539201815831N.d(strName, vr0Var2);
            }
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : o6641393078261985068R) {
                ads_mobile_sdk.vr0 vr0Var3 = vr0Var;
                if (((ads_mobile_sdk.b6) obj2).r$1() == 2) {
                    arrayList3.add(obj2);
                }
                vr0Var = vr0Var3;
            }
            ads_mobile_sdk.vr0 vr0Var4 = vr0Var;
            java.util.List listW0 = dev.epro.r0.R9411874267597469228.W0(arrayList3, new dev.epro.r0.J10770752472956524045((byte) 25));
            if (listW0.isEmpty()) {
                a72094970659392016932.a = se2Var;
                s2322588539201815831N.e().getClass();
                dev.epro.r0.C7584963549263810245 c75849635492638102452 = (dev.epro.r0.C7584963549263810245) vr0Var4.n();
                c75849635492638102452.e().getClass();
                dev.epro.r0.Y12531765857967015337 y12531765857967015337N = g6Var.n();
                y12531765857967015337N.f().getClass();
                y12531765857967015337N.e();
                y12531765857967015337N.f().getClass();
                y12531765857967015337N.d(o6641393078261985068R);
                y12531765857967015337N.c(j);
                ads_mobile_sdk.g6 g6Var3 = (ads_mobile_sdk.g6) y12531765857967015337N.a();
                str.getClass();
                c75849635492638102452.d(str, g6Var3);
                ads_mobile_sdk.vr0 vr0Var5 = (ads_mobile_sdk.vr0) c75849635492638102452.a();
                strName.getClass();
                s2322588539201815831N.d(strName, vr0Var5);
            } else {
                ads_mobile_sdk.b6 b6Var = (ads_mobile_sdk.b6) dev.epro.r0.R9411874267597469228.B0(listW0);
                a7209497065939201693.a = b6Var;
                if (this.h) {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj3 : o6641393078261985068R) {
                        if (((ads_mobile_sdk.b6) obj3) != b6Var) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(o6641393078261985068R, 10));
                    for (ads_mobile_sdk.b6 b6Var2 : o6641393078261985068R) {
                        if (b6Var2 == b6Var) {
                            b6Var2.getClass();
                            dev.epro.r0.W17538889179347911592 w17538889179347911592N = b6Var2.n();
                            w17538889179347911592N.c(3);
                            b6Var2 = (ads_mobile_sdk.b6) w17538889179347911592N.a();
                        }
                        arrayList.add(b6Var2);
                    }
                }
                dev.epro.r0.C7584963549263810245 c75849635492638102453 = (dev.epro.r0.C7584963549263810245) vr0Var4.n();
                if (arrayList.isEmpty()) {
                    c75849635492638102453.e().getClass();
                    str.getClass();
                    c75849635492638102453.c(str);
                } else {
                    c75849635492638102453.e().getClass();
                    dev.epro.r0.Y12531765857967015337 y12531765857967015337N2 = g6Var.n();
                    y12531765857967015337N2.f().getClass();
                    y12531765857967015337N2.e();
                    y12531765857967015337N2.f().getClass();
                    y12531765857967015337N2.d(arrayList);
                    y12531765857967015337N2.c(j);
                    ads_mobile_sdk.g6 g6Var4 = (ads_mobile_sdk.g6) y12531765857967015337N2.a();
                    str.getClass();
                    c75849635492638102453.d(str, g6Var4);
                }
                ads_mobile_sdk.vr0 vr0Var6 = (ads_mobile_sdk.vr0) c75849635492638102453.a();
                if (vr0Var6.o().isEmpty()) {
                    s2322588539201815831N.e().getClass();
                    strName.getClass();
                    s2322588539201815831N.c(strName);
                } else {
                    s2322588539201815831N.e().getClass();
                    strName.getClass();
                    s2322588539201815831N.d(strName, vr0Var6);
                }
            }
        }
        return (ads_mobile_sdk.g1) s2322588539201815831N.a();
    }
}
