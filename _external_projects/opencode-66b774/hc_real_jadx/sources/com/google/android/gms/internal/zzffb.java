package com.google.android.gms.internal;

import java.io.InputStream;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzffb {
    private static volatile boolean zzpfq = true;
    public int zzpfm;
    public int zzpfn;
    public int zzpfo;
    private boolean zzpfp;

    private zzffb() {
        this.zzpfn = 100;
        this.zzpfo = Integer.MAX_VALUE;
        this.zzpfp = false;
    }

    public static zzffb zzb(byte[] bArr, int i, int i2, boolean z) {
        zzffd zzffdVar = new zzffd(bArr, i, i2, z);
        try {
            zzffdVar.zzks(i2);
            return zzffdVar;
        } catch (zzfge e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static zzffb zzbb(byte[] bArr) {
        return zzb(bArr, 0, bArr.length, false);
    }

    public static long zzcs(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzffb zzg(byte[] bArr, int i, int i2) {
        return zzb(bArr, i, i2, false);
    }

    public static zzffb zzi(InputStream inputStream) {
        if (inputStream != null) {
            return new zzffe(inputStream);
        }
        byte[] bArr = zzffz.EMPTY_BYTE_ARRAY;
        return zzb(bArr, 0, bArr.length, false);
    }

    public static int zzkv(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double readDouble();

    public abstract float readFloat();

    public abstract String readString();

    public abstract <T extends zzffu<T, ?>> T zza(T t, zzffm zzffmVar);

    public abstract void zza(zzfhf zzfhfVar, zzffm zzffmVar);

    public abstract int zzcvt();

    public abstract long zzcvu();

    public abstract long zzcvv();

    public abstract int zzcvw();

    public abstract long zzcvx();

    public abstract int zzcvy();

    public abstract boolean zzcvz();

    public abstract String zzcwa();

    public abstract zzfes zzcwb();

    public abstract int zzcwc();

    public abstract int zzcwd();

    public abstract int zzcwe();

    public abstract long zzcwf();

    public abstract int zzcwg();

    public abstract long zzcwh();

    public abstract int zzcwi();

    public abstract long zzcwj();

    public abstract int zzcwk();

    public abstract boolean zzcwl();

    public abstract int zzcwm();

    public abstract void zzkp(int i);

    public abstract boolean zzkq(int i);

    public final int zzkr(int i) {
        int i2 = this.zzpfo;
        this.zzpfo = Integer.MAX_VALUE;
        return i2;
    }

    public abstract int zzks(int i);

    public abstract void zzkt(int i);

    public abstract void zzku(int i);
}
