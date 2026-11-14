package ads_mobile_sdk;

import dev.epro.r0.A7209497065939201693;
import dev.epro.r0.C7584963549263810245;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.J10770752472956524045;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P9893650590651797888;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.S2322588539201815831;
import dev.epro.r0.W17538889179347911592;
import dev.epro.r0.Y12531765857967015337;
import dev.epro.r0.Z115818233709597990;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ud2 extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ A7209497065939201693 b;
    public final /* synthetic */ A7209497065939201693 c;
    public final /* synthetic */ qw2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ pe2 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud2(ArrayList arrayList, A7209497065939201693 a7209497065939201693, A7209497065939201693 a72094970659392016932, qw2 qw2Var, String str, pe2 pe2Var, long j, boolean z) {
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

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        g1 g1Var = (g1) obj;
        g1Var.getClass();
        ArrayList arrayList2 = this.a;
        arrayList2.clear();
        A7209497065939201693 a7209497065939201693 = this.b;
        a7209497065939201693.a = null;
        A7209497065939201693 a72094970659392016932 = this.c;
        a72094970659392016932.a = null;
        String name = this.d.name();
        vr0 vr0Var = (vr0) g1Var.u().get(name);
        se2 se2Var = se2.MISS_REASON_EMPTY;
        if (vr0Var == null) {
            a72094970659392016932.a = se2Var;
            return g1Var;
        }
        Map o2 = vr0Var.o();
        String str = this.e;
        g6 g6Var = (g6) o2.get(str);
        if (g6Var == null) {
            a72094970659392016932.a = se2Var;
            return g1Var;
        }
        Map singletonMap = Collections.singletonMap(str, g6Var);
        singletonMap.getClass();
        pe2 pe2Var = this.f;
        long j = this.g;
        g6 g6Var2 = (g6) pe2Var.a(singletonMap, j, arrayList2).get(str);
        List<b6> r = g6Var2 != null ? g6Var2.r() : null;
        if (r == null) {
            r = O2161699089510411363.a;
        }
        S2322588539201815831 s2322588539201815831 = (S2322588539201815831) g1Var.n();
        if (r.isEmpty()) {
            a72094970659392016932.a = se2.MISS_REASON_EXPIRED;
            C7584963549263810245 c7584963549263810245 = (C7584963549263810245) vr0Var.n();
            c7584963549263810245.e().getClass();
            str.getClass();
            c7584963549263810245.c(str);
            vr0 vr0Var2 = (vr0) c7584963549263810245.a();
            if (vr0Var2.o().isEmpty()) {
                s2322588539201815831.e().getClass();
                name.getClass();
                s2322588539201815831.c(name);
            } else {
                s2322588539201815831.e().getClass();
                name.getClass();
                s2322588539201815831.d(name, vr0Var2);
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : r) {
                vr0 vr0Var3 = vr0Var;
                if (((b6) obj2).r$1() == 2) {
                    arrayList3.add(obj2);
                }
                vr0Var = vr0Var3;
            }
            vr0 vr0Var4 = vr0Var;
            List W0 = R9411874267597469228.W0(arrayList3, new J10770752472956524045((byte) 25));
            if (W0.isEmpty()) {
                a72094970659392016932.a = se2Var;
                s2322588539201815831.e().getClass();
                C7584963549263810245 c75849635492638102452 = (C7584963549263810245) vr0Var4.n();
                c75849635492638102452.e().getClass();
                Y12531765857967015337 y12531765857967015337 = (Y12531765857967015337) g6Var.n();
                y12531765857967015337.f().getClass();
                y12531765857967015337.e();
                y12531765857967015337.f().getClass();
                y12531765857967015337.d(r);
                y12531765857967015337.c(j);
                g6 g6Var3 = (g6) y12531765857967015337.a();
                str.getClass();
                c75849635492638102452.d(str, g6Var3);
                vr0 vr0Var5 = (vr0) c75849635492638102452.a();
                name.getClass();
                s2322588539201815831.d(name, vr0Var5);
            } else {
                b6 b6Var = (b6) R9411874267597469228.B0(W0);
                a7209497065939201693.a = b6Var;
                if (this.h) {
                    arrayList = new ArrayList();
                    for (Object obj3 : r) {
                        if (((b6) obj3) != b6Var) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = new ArrayList(Z115818233709597990.k0(r, 10));
                    for (b6 b6Var2 : r) {
                        if (b6Var2 == b6Var) {
                            b6Var2.getClass();
                            W17538889179347911592 w17538889179347911592 = (W17538889179347911592) b6Var2.n();
                            w17538889179347911592.c(3);
                            b6Var2 = (b6) w17538889179347911592.a();
                        }
                        arrayList.add(b6Var2);
                    }
                }
                C7584963549263810245 c75849635492638102453 = (C7584963549263810245) vr0Var4.n();
                if (arrayList.isEmpty()) {
                    c75849635492638102453.e().getClass();
                    str.getClass();
                    c75849635492638102453.c(str);
                } else {
                    c75849635492638102453.e().getClass();
                    Y12531765857967015337 y125317658579670153372 = (Y12531765857967015337) g6Var.n();
                    y125317658579670153372.f().getClass();
                    y125317658579670153372.e();
                    y125317658579670153372.f().getClass();
                    y125317658579670153372.d(arrayList);
                    y125317658579670153372.c(j);
                    g6 g6Var4 = (g6) y125317658579670153372.a();
                    str.getClass();
                    c75849635492638102453.d(str, g6Var4);
                }
                vr0 vr0Var6 = (vr0) c75849635492638102453.a();
                if (vr0Var6.o().isEmpty()) {
                    s2322588539201815831.e().getClass();
                    name.getClass();
                    s2322588539201815831.c(name);
                } else {
                    s2322588539201815831.e().getClass();
                    name.getClass();
                    s2322588539201815831.d(name, vr0Var6);
                }
            }
        }
        return (g1) s2322588539201815831.a();
    }
}
