package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P3983812329505132585 extends I10827619964430248728 {
    private static final P3983812329505132585 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        P3983812329505132585 p3983812329505132585 = new P3983812329505132585();
        zzb = p3983812329505132585;
        I10827619964430248728.k(P3983812329505132585.class, p3983812329505132585);
    }

    public static U1589746969543987342 l() {
        return (U1589746969543987342) zzb.g();
    }

    public static /* synthetic */ void m(P3983812329505132585 p3983812329505132585, String str) {
        str.getClass();
        p3983812329505132585.zzd |= 1;
        p3983812329505132585.zze = str;
    }

    public static /* synthetic */ void n(P3983812329505132585 p3983812329505132585, String str) {
        str.getClass();
        p3983812329505132585.zzd |= 2;
        p3983812329505132585.zzf = str;
    }

    @Override // dev.epro.r0.I10827619964430248728
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new N17310361809908093775(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new P3983812329505132585();
        }
        if (i2 == 4) {
            return new U1589746969543987342(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
