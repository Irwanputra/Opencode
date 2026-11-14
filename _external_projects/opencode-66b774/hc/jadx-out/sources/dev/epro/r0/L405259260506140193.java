package dev.epro.r0;

import ads_mobile_sdk.qu3;
import ads_mobile_sdk.zt3;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L405259260506140193 implements V9266657454036696449 {
    public final long a;
    public final long b;
    public final Object c;
    public final Object d;

    public L405259260506140193(H3517214926285464793 h3517214926285464793, T14358595426441148744 t14358595426441148744) {
        this.c = h3517214926285464793;
        this.d = t14358595426441148744;
        this.a = ((long) (h3517214926285464793.q() + h3517214926285464793.n())) * 1000000;
        this.b = 0L;
    }

    public static L405259260506140193 a(Q6203700555324584864 q6203700555324584864, byte[] bArr, boolean z) throws I10296188574218802332, X11759594239978599137 {
        byte[] bArr2;
        q6203700555324584864.a();
        qu3 qu3Var = (qu3) q6203700555324584864.b;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        qu3Var.c.b = new zt3(bArr2);
        List list = (List) q6203700555324584864.a(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        q6203700555324584864.a(jLongValue, Optional.empty());
        StringBuilder sb = new StringBuilder("3.960507516.");
        sb.append(W1349480363743553773.d.c(Q6203700555324584864.b()));
        sb.append(z ? "-s" : "");
        return new L405259260506140193(q6203700555324584864, jLongValue2, jLongValue3, sb.toString());
    }

    @Override // dev.epro.r0.V9266657454036696449
    public long b(Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        return Long.MAX_VALUE;
    }

    public long c(long j) {
        long j2 = this.b;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.a;
        long j5 = j3 / j4;
        return (((T14358595426441148744) this.d) == T14358595426441148744.a || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 e(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        return ((H3517214926285464793) this.c).e(c(j), z13251062865217617579, z132510628652176175792, f(j, z13251062865217617579, z132510628652176175793, z132510628652176175792));
    }

    public Z13251062865217617579 f(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = this.a;
        return j3 > j4 ? ((H3517214926285464793) this.c).r(j4 - j2, z13251062865217617579, z132510628652176175793, z132510628652176175792) : z132510628652176175792;
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 r(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        return ((H3517214926285464793) this.c).r(c(j), z13251062865217617579, z132510628652176175792, f(j, z13251062865217617579, z132510628652176175793, z132510628652176175792));
    }

    public L405259260506140193(Q6203700555324584864 q6203700555324584864, long j, long j2, String str) {
        this.c = q6203700555324584864;
        this.a = j;
        this.b = j2;
        this.d = str;
    }

    @Override // dev.epro.r0.V9266657454036696449
    public boolean a() {
        return true;
    }
}
