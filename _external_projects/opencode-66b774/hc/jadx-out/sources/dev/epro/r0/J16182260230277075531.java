package dev.epro.r0;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J16182260230277075531 extends I10827619964430248728 {
    private static final J16182260230277075531 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        J16182260230277075531 j16182260230277075531 = new J16182260230277075531();
        zzb = j16182260230277075531;
        I10827619964430248728.k(J16182260230277075531.class, j16182260230277075531);
    }

    public static D9644658574388513154 l() {
        return (D9644658574388513154) zzb.g();
    }

    public static /* synthetic */ void m(J16182260230277075531 j16182260230277075531, int i) {
        j16182260230277075531.zzd |= 8;
        j16182260230277075531.zzh = i;
    }

    public static /* synthetic */ void n(J16182260230277075531 j16182260230277075531) {
        String str = Build.MODEL;
        str.getClass();
        j16182260230277075531.zzd |= 4;
        j16182260230277075531.zzg = str;
    }

    public static /* synthetic */ void o(J16182260230277075531 j16182260230277075531) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        j16182260230277075531.zzd |= 2;
        j16182260230277075531.zzf = str;
    }

    public static /* synthetic */ void p(J16182260230277075531 j16182260230277075531) {
        j16182260230277075531.zze = 1;
        j16182260230277075531.zzd = 1 | j16182260230277075531.zzd;
    }

    @Override // dev.epro.r0.I10827619964430248728
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new N17310361809908093775(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new J16182260230277075531();
        }
        if (i2 == 4) {
            return new D9644658574388513154(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
