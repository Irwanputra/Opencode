package dev.epro.r0;

import ads_mobile_sdk.b6;
import ads_mobile_sdk.g1;
import ads_mobile_sdk.g6;
import ads_mobile_sdk.ih0;
import ads_mobile_sdk.pr;
import ads_mobile_sdk.qw2;
import ads_mobile_sdk.ue2;
import ads_mobile_sdk.vr0;
import ads_mobile_sdk.xh1;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J3227772737003951788 extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J3227772737003951788(Object obj, byte b) {
        super(1);
        this.i = b;
        this.j = obj;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        g6 g6Var;
        int i = 0;
        switch (this.i) {
            case 0:
                return Boolean.valueOf(S10823041268949770285.t(obj, this.j));
            case 1:
                ((UrlRequest) this.j).cancel();
                return O9245300239821758723.a;
            case 2:
                g1 g1Var = (g1) obj;
                g1Var.getClass();
                ue2 ue2Var = (ue2) this.j;
                qw2 qw2Var = ue2Var.b;
                String str = ue2Var.c;
                String name = qw2Var.name();
                vr0 vr0Var = (vr0) g1Var.u().get(name);
                if (vr0Var == null || (g6Var = (g6) vr0Var.o().get(str)) == null) {
                    return g1Var;
                }
                S2322588539201815831 s2322588539201815831 = (S2322588539201815831) g1Var.n();
                s2322588539201815831.e().getClass();
                C7584963549263810245 c7584963549263810245 = (C7584963549263810245) vr0Var.n();
                c7584963549263810245.e().getClass();
                Y12531765857967015337 y12531765857967015337 = (Y12531765857967015337) g6Var.n();
                List f = y12531765857967015337.f();
                f.getClass();
                Iterator it = f.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        K5751602218013079365.f0();
                        throw null;
                    }
                    b6 b6Var = (b6) next;
                    if (S10823041268949770285.t(b6Var.q(), ue2Var.a) && b6Var.r$1() == 3) {
                        y12531765857967015337.f().getClass();
                        W17538889179347911592 w17538889179347911592 = (W17538889179347911592) b6Var.n();
                        w17538889179347911592.c(2);
                        b6 b6Var2 = (b6) w17538889179347911592.a();
                        y12531765857967015337.b();
                        ((g6) y12531765857967015337.b).a(i, b6Var2);
                    }
                    i = i2;
                }
                g6 g6Var2 = (g6) y12531765857967015337.a();
                str.getClass();
                c7584963549263810245.d(str, g6Var2);
                vr0 vr0Var2 = (vr0) c7584963549263810245.a();
                name.getClass();
                s2322588539201815831.d(name, vr0Var2);
                return (g1) s2322588539201815831.a();
            case 3:
                ((V5252629055842691065) this.j).c();
                return O9245300239821758723.a;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                try {
                    return Intent.parseUri(str2, 0);
                } catch (Exception e) {
                    ((pr) this.j).b.a("Invalid intent Uri for canOpenIntents gmsg", (Throwable) e);
                    return null;
                }
            case 5:
                g1 g1Var2 = (g1) obj;
                g1Var2.getClass();
                String str3 = (String) this.j;
                S2322588539201815831 s23225885392018158312 = (S2322588539201815831) g1Var2.n();
                s23225885392018158312.e().getClass();
                s23225885392018158312.b();
                ((g1) s23225885392018158312.b).s().clear();
                str3.getClass();
                s23225885392018158312.b();
                ((g1) s23225885392018158312.b).b(str3);
                return (g1) s23225885392018158312.a();
            case 6:
                K7982234182034951622 k7982234182034951622 = (K7982234182034951622) obj;
                ih0 j = ((xh1) this.j).b.j();
                synchronized (j) {
                    synchronized (j) {
                        j.d = k7982234182034951622;
                    }
                    return O9245300239821758723.a;
                }
                j.a(k7982234182034951622);
                return O9245300239821758723.a;
            case 7:
                Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
                ArrayList arrayList = (ArrayList) this.j;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    y2066038017114788875.g((Z17471428274427141949) arrayList.get(i3), 0, 0, 0.0f);
                }
                return O9245300239821758723.a;
            case 8:
                E687636901257241786 e687636901257241786 = (E687636901257241786) obj;
                float f2 = e687636901257241786.b;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                float f3 = e687636901257241786.c;
                if (f3 < -0.5f) {
                    f3 = -0.5f;
                }
                if (f3 > 0.5f) {
                    f3 = 0.5f;
                }
                float f4 = e687636901257241786.d;
                float f5 = f4 >= -0.5f ? f4 : -0.5f;
                float f6 = f5 <= 0.5f ? f5 : 0.5f;
                float f7 = e687636901257241786.a;
                float f8 = f7 >= 0.0f ? f7 : 0.0f;
                return new U10174709222559481877(U10174709222559481877.a(J8045362843799184672.d(f2, f3, f6, f8 <= 1.0f ? f8 : 1.0f, E4238948680093459570.x), (G5298154673482189769) this.j));
            case 9:
                return Boolean.valueOf(!S10823041268949770285.t(obj, ((W3656598099029166611) this.j).d.getValue()));
            case 10:
                ((O16200024709371809403) obj).b(((Number) ((L13148442655056575112) this.j).getValue()).floatValue());
                return O9245300239821758723.a;
            case 11:
                L17598299826319227431 l17598299826319227431 = (L17598299826319227431) obj;
                B9692660393722135472 b9692660393722135472 = (B9692660393722135472) this.j;
                B1061516154492673368 b1061516154492673368 = b9692660393722135472.l;
                if (b9692660393722135472.n && b9692660393722135472.A && b1061516154492673368 != null) {
                    Q7316561721656982910 R = l17598299826319227431.R();
                    long F = R.F();
                    R.A().l();
                    try {
                        ((Q7316561721656982910) ((H12843822278061842084) R.b).b).A().b(b1061516154492673368);
                        b9692660393722135472.c(l17598299826319227431);
                    } finally {
                        L11610354117192841236.w(R, F);
                    }
                } else {
                    b9692660393722135472.c(l17598299826319227431);
                }
                return O9245300239821758723.a;
            case 12:
                ((D16915945238461757356) this.j).cancel(false);
                return O9245300239821758723.a;
            case 13:
                return obj == ((U9803441765912152712) this.j) ? "(this)" : String.valueOf(obj);
            case 14:
                return obj == ((K18075763046227786881) this.j) ? "(this)" : String.valueOf(obj);
            default:
                return obj == ((E13273723708836014930) this.j) ? "(this)" : String.valueOf(obj);
        }
    }
}
