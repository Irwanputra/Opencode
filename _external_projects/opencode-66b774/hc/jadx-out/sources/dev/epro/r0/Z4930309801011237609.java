package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z4930309801011237609 extends E15788154820100421965 {
    public final H17686692708284905246 f;
    public X7175349259954592591 g;

    public Z4930309801011237609(V5142773592757085764 v5142773592757085764, Y4747001757717931618 y4747001757717931618, R8540738700654750557 r8540738700654750557) {
        super(v5142773592757085764, y4747001757717931618, r8540738700654750557);
        this.f = I3887072968740112330.a(Integer.MAX_VALUE, 6, null);
    }

    public static Y5330024065592724852 e(H17686692708284905246 h17686692708284905246) {
        Y5330024065592724852 y5330024065592724852 = null;
        N3180492300688416475 n3180492300688416475Q = U1554499319261669842.q(new Q15505522140990258817(new H14024318998669537922(h17686692708284905246, (byte) 1), null));
        while (n3180492300688416475Q.hasNext()) {
            Y5330024065592724852 y5330024065592724852A = (Y5330024065592724852) n3180492300688416475Q.next();
            if (y5330024065592724852 != null) {
                y5330024065592724852A = y5330024065592724852.a(y5330024065592724852A);
            }
            y5330024065592724852 = y5330024065592724852A;
        }
        return y5330024065592724852;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if (r16.b.invoke(r0, r6) == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dev.epro.r0.V5142773592757085764 r17, dev.epro.r0.Y5330024065592724852 r18, dev.epro.r0.K14749510448791472029 r19) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z4930309801011237609.c(dev.epro.r0.V5142773592757085764, dev.epro.r0.Y5330024065592724852, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean d(Y1086209215650239921 y1086209215650239921) {
        boolean z;
        boolean z2;
        boolean z3;
        H17686692708284905246 h17686692708284905246;
        V5142773592757085764 v5142773592757085764;
        N13196868278329319633 n13196868278329319633 = (N13196868278329319633) R9411874267597469228.D0(y1086209215650239921.a);
        if (n13196868278329319633 != null) {
            List listB = n13196868278329319633.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                h17686692708284905246 = this.f;
                v5142773592757085764 = this.a;
                if (i >= size) {
                    break;
                }
                H18070649131661950539 h18070649131661950539 = (H18070649131661950539) listB.get(i);
                long j = h18070649131661950539.d ^ (-9223372034707292160L);
                if (!(v5142773592757085764.j(v5142773592757085764.f(j)) == 0.0f)) {
                    z3 = !(h17686692708284905246.a(new Y5330024065592724852(j, h18070649131661950539.a, false)) instanceof F15209282533750470613) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = n13196868278329319633.l ^ (-9223372034707292160L);
            boolean z4 = y1086209215650239921.f == 12;
            if (!(v5142773592757085764.j(v5142773592757085764.f(j2)) == 0.0f) || z4) {
                if (!(h17686692708284905246.a(new Y5330024065592724852(j2, n13196868278329319633.b, z4)) instanceof F15209282533750470613) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
