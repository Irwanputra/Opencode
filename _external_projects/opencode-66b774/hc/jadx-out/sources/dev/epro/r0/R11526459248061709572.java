package dev.epro.r0;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R11526459248061709572 extends E15788154820100421965 {
    public final H12843822278061842084 f;
    public final H17686692708284905246 g;
    public X7175349259954592591 h;

    public R11526459248061709572(V5142773592757085764 v5142773592757085764, H12843822278061842084 h12843822278061842084, Y4747001757717931618 y4747001757717931618, R8540738700654750557 r8540738700654750557) {
        super(v5142773592757085764, y4747001757717931618, r8540738700654750557);
        this.f = h12843822278061842084;
        this.g = I3887072968740112330.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(dev.epro.r0.R11526459248061709572 r11, dev.epro.r0.A7209497065939201693 r12, dev.epro.r0.A81664135048468380 r13, dev.epro.r0.V5142773592757085764 r14, dev.epro.r0.A7209497065939201693 r15, long r16, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R11526459248061709572.e(dev.epro.r0.R11526459248061709572, dev.epro.r0.A7209497065939201693, dev.epro.r0.A81664135048468380, dev.epro.r0.V5142773592757085764, dev.epro.r0.A7209497065939201693, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static I12220150998180337643 g(H17686692708284905246 h17686692708284905246) {
        I12220150998180337643 i12220150998180337643 = null;
        N3180492300688416475 n3180492300688416475Q = U1554499319261669842.q(new Q15505522140990258817(new H14024318998669537922(h17686692708284905246, (byte) 0), null));
        while (n3180492300688416475Q.hasNext()) {
            I12220150998180337643 i12220150998180337643A = (I12220150998180337643) n3180492300688416475Q.next();
            if (i12220150998180337643 != null) {
                i12220150998180337643A = i12220150998180337643.a(i12220150998180337643A);
            }
            i12220150998180337643 = i12220150998180337643A;
        }
        return i12220150998180337643;
    }

    public final float c(G3869673327990687150 g3869673327990687150, float f) {
        V5142773592757085764 v5142773592757085764 = this.a;
        long jI = v5142773592757085764.i(v5142773592757085764.e(f));
        V5142773592757085764 v51427735927570857642 = g3869673327990687150.a;
        return v5142773592757085764.h(v5142773592757085764.f(v51427735927570857642.d(v51427735927570857642.k, jI, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.V5142773592757085764 r20, dev.epro.r0.I12220150998180337643 r21, float r22, float r23, dev.epro.r0.K14749510448791472029 r24) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R11526459248061709572.d(dev.epro.r0.V5142773592757085764, dev.epro.r0.I12220150998180337643, float, float, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean f(Y1086209215650239921 y1086209215650239921) {
        long j;
        R8540738700654750557 r8540738700654750557 = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.b;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? F18342544821595307642.i(viewConfiguration) : r8540738700654750557.K(64.0f));
        float f2 = -(i > 26 ? F18342544821595307642.e(viewConfiguration) : r8540738700654750557.K(64.0f));
        List list = y1086209215650239921.a;
        L2216691091636065972 l2216691091636065972 = new L2216691091636065972(0L);
        int size = list.size();
        boolean zC = false;
        int i2 = 0;
        while (true) {
            j = l2216691091636065972.a;
            if (i2 >= size) {
                break;
            }
            l2216691091636065972 = new L2216691091636065972(L2216691091636065972.f(j, ((N13196868278329319633) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        V5142773592757085764 v5142773592757085764 = this.a;
        float fJ = v5142773592757085764.j(v5142773592757085764.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            G4373553504164397325 g4373553504164397325 = v5142773592757085764.a;
            zC = fJ > 0.0f ? g4373553504164397325.c() : g4373553504164397325.a();
        }
        if (zC) {
            return !(this.g.a(new I12220150998180337643(jFloatToRawIntBits, ((N13196868278329319633) R9411874267597469228.B0(y1086209215650239921.a)).b, false)) instanceof F15209282533750470613);
        }
        return this.d;
    }
}
