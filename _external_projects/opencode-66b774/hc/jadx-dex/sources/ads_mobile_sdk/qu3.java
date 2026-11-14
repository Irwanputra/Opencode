package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qu3 {
    public final ads_mobile_sdk.mu3 a;
    public final ads_mobile_sdk.ju3 b;
    public final dev.epro.r0.O3228356295430981133 c;

    public qu3(ads_mobile_sdk.mu3 mu3Var, dev.epro.r0.O3228356295430981133 o3228356295430981133) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i = iArr[7] % iArr[8];
        this.a = mu3Var;
        this.c = o3228356295430981133;
        this.b = new ads_mobile_sdk.ju3((byte) 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.F15751422393861875968 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.K1641439379888813200 */
    public final java.util.Optional a() {
        try {
            java.util.ArrayDeque arrayDeque = this.b.a;
            if (arrayDeque.isEmpty()) {
                throw new dev.epro.r0.K1641439379888813200();
            }
            ads_mobile_sdk.gu3 gu3Var = (ads_mobile_sdk.gu3) arrayDeque.pop();
            long j = gu3Var.a;
            long j2 = gu3Var.b;
            long j3 = gu3Var.c;
            ads_mobile_sdk.mu3 mu3Var = this.a;
            if (mu3Var.b < j2) {
                return java.util.Optional.of(ads_mobile_sdk.hm2.H);
            }
            this.c.a(j);
            if (j3 == 0) {
                while (mu3Var.b > j2) {
                    mu3Var.a();
                }
            }
            return java.util.Optional.empty();
        } catch (dev.epro.r0.K1641439379888813200 unused) {
            return java.util.Optional.of(ads_mobile_sdk.hm2.x);
        } catch (dev.epro.r0.F15751422393861875968 unused2) {
            return java.util.Optional.of(ads_mobile_sdk.hm2.H);
        } catch (dev.epro.r0.U10904789608794664935 e) {
            e = e;
            dev.epro.r0.W4415201450379021245.b(ads_mobile_sdk.xt3.a("CEiv6BFfPnitUE+D"), e);
            return null;
        } catch (dev.epro.r0.V6799596001827289384 e2) {
            e = e2;
            dev.epro.r0.W4415201450379021245.b(ads_mobile_sdk.xt3.a("CEiv6BFfPnitUE+D"), e);
            return null;
        }
    }
}
