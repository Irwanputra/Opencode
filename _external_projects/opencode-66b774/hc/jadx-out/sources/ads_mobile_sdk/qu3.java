package ads_mobile_sdk;

import dev.epro.r0.F15751422393861875968;
import dev.epro.r0.K1641439379888813200;
import dev.epro.r0.O3228356295430981133;
import dev.epro.r0.U10904789608794664935;
import dev.epro.r0.V6799596001827289384;
import dev.epro.r0.W4415201450379021245;
import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qu3 {
    public final mu3 a;
    public final ju3 b;
    public final O3228356295430981133 c;

    public qu3(mu3 mu3Var, O3228356295430981133 o3228356295430981133) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i = iArr[7] % iArr[8];
        this.a = mu3Var;
        this.c = o3228356295430981133;
        this.b = new ju3((byte) 0);
    }

    public final Optional a() {
        try {
            ArrayDeque arrayDeque = this.b.a;
            if (arrayDeque.isEmpty()) {
                throw new K1641439379888813200();
            }
            gu3 gu3Var = (gu3) arrayDeque.pop();
            long j = gu3Var.a;
            long j2 = gu3Var.b;
            long j3 = gu3Var.c;
            mu3 mu3Var = this.a;
            if (mu3Var.b < j2) {
                return Optional.of(hm2.H);
            }
            this.c.a(j);
            if (j3 == 0) {
                while (mu3Var.b > j2) {
                    mu3Var.a();
                }
            }
            return Optional.empty();
        } catch (F15751422393861875968 unused) {
            return Optional.of(hm2.H);
        } catch (K1641439379888813200 unused2) {
            return Optional.of(hm2.x);
        } catch (U10904789608794664935 e) {
            e = e;
            W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e);
            return null;
        } catch (V6799596001827289384 e2) {
            e = e2;
            W4415201450379021245.b(xt3.a("CEiv6BFfPnitUE+D"), e);
            return null;
        }
    }
}
