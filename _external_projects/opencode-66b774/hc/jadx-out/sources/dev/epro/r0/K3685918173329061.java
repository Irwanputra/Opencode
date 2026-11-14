package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K3685918173329061 extends I10827619964430248728 {
    private static final K3685918173329061 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        K3685918173329061 k3685918173329061 = new K3685918173329061();
        zzb = k3685918173329061;
        I10827619964430248728.k(K3685918173329061.class, k3685918173329061);
    }

    public static Q6316841325799975503 l() {
        return (Q6316841325799975503) zzb.g();
    }

    public static /* synthetic */ void m(K3685918173329061 k3685918173329061, String str) {
        k3685918173329061.zzd |= 2;
        k3685918173329061.zzf = str;
    }

    public static /* synthetic */ void n(K3685918173329061 k3685918173329061, long j) {
        k3685918173329061.zzd |= 4;
        k3685918173329061.zzg = j;
    }

    public static /* synthetic */ void o(K3685918173329061 k3685918173329061, int i) {
        k3685918173329061.zze = i - 2;
        k3685918173329061.zzd |= 1;
    }

    @Override // dev.epro.r0.I10827619964430248728
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new N17310361809908093775(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new K3685918173329061();
        }
        if (i2 == 4) {
            return new Q6316841325799975503(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
