package com.google.android.gms.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzfes implements Serializable, Iterable<Byte> {
    public static final zzfes zzpfg = new zzfez(zzffz.EMPTY_BYTE_ARRAY);
    private static final zzfew zzpfh;
    private int zzmal = 0;

    static {
        boolean z;
        try {
            Class.forName("android.content.Context");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        zzfet zzfetVar = null;
        zzpfh = z ? new zzffa(zzfetVar) : new zzfeu(zzfetVar);
    }

    private static zzfes zza(Iterator<zzfes> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        zzfes zza = zza(it, i2);
        zzfes zza2 = zza(it, i - i2);
        if (Integer.MAX_VALUE - zza.size() >= zza2.size()) {
            return zzfhq.zza(zza, zza2);
        }
        int size = zza.size();
        int size2 = zza2.size();
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static zzfes zzaz(byte[] bArr) {
        return zze(bArr, 0, bArr.length);
    }

    public static zzfes zzba(byte[] bArr) {
        return new zzfez(bArr);
    }

    public static zzfes zze(byte[] bArr, int i, int i2) {
        return new zzfez(zzpfh.zzf(bArr, i, i2));
    }

    public static zzfes zzf(Iterable<zzfes> iterable) {
        int size = ((Collection) iterable).size();
        return size == 0 ? zzpfg : zza(iterable.iterator(), size);
    }

    public static int zzh(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static zzfex zzko(int i) {
        return new zzfex(i, null);
    }

    public static zzfes zztr(String str) {
        return new zzfez(str.getBytes(zzffz.UTF_8));
    }

    public static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzmal;
        if (i == 0) {
            int size = size();
            i = zzg(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzmal = i;
        }
        return i;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzfet(this);
    }

    public abstract int size();

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return zzffz.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        zzb(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract void zza(zzfer zzferVar);

    public final void zza(byte[] bArr, int i, int i2, int i3) {
        zzh(i, i + i3, size());
        zzh(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zzb(bArr, i, i2, i3);
        }
    }

    public abstract void zzb(byte[] bArr, int i, int i2, int i3);

    public abstract zzffb zzcvm();

    public abstract int zzcvn();

    public abstract boolean zzcvo();

    public final int zzcvp() {
        return this.zzmal;
    }

    public abstract int zzg(int i, int i2, int i3);

    public abstract byte zzkn(int i);

    public abstract zzfes zzx(int i, int i2);
}
