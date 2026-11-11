package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import sun.misc.Unsafe;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfiq {
    private static final Logger logger = Logger.getLogger(zzfiq.class.getName());
    private static final Unsafe zzlrs;
    private static final boolean zzpfz;
    private static final Class<?> zzpks;
    private static final boolean zzpkt;
    private static final boolean zzpku;
    private static final boolean zzpkv;
    private static final zzd zzpkw;
    private static final boolean zzpkx;
    private static final long zzpky;
    private static final long zzpkz;
    private static final long zzpla;
    private static final long zzplb;
    private static final long zzplc;
    private static final long zzpld;
    private static final long zzple;
    private static final long zzplf;
    private static final long zzplg;
    private static final long zzplh;
    private static final long zzpli;
    private static final long zzplj;
    private static final long zzplk;
    private static final long zzpll;
    private static final boolean zzplm;

    public static final class zza extends zzd {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.zzfiq.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzfiq.zzplm) {
                zzfiq.zza(obj, j, b);
            } else {
                zzfiq.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.zzfiq.zzd
        public final byte zzf(Object obj, long j) {
            return zzfiq.zzplm ? zzfiq.zzb(obj, j) : zzfiq.zzc(obj, j);
        }
    }

    public static final class zzb extends zzd {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.zzfiq.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzfiq.zzplm) {
                zzfiq.zza(obj, j, b);
            } else {
                zzfiq.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.zzfiq.zzd
        public final byte zzf(Object obj, long j) {
            return zzfiq.zzplm ? zzfiq.zzb(obj, j) : zzfiq.zzc(obj, j);
        }
    }

    public static final class zzc extends zzd {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.zzfiq.zzd
        public final void zze(Object obj, long j, byte b) {
            this.zzpln.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.zzfiq.zzd
        public final byte zzf(Object obj, long j) {
            return this.zzpln.getByte(obj, j);
        }
    }

    public static abstract class zzd {
        public Unsafe zzpln;

        public zzd(Unsafe unsafe) {
            this.zzpln = unsafe;
        }

        public final int zza(Object obj, long j) {
            return this.zzpln.getInt(obj, j);
        }

        public abstract void zze(Object obj, long j, byte b);

        public abstract byte zzf(Object obj, long j);
    }

    static {
        Field zza2;
        Unsafe zzczz = zzczz();
        zzlrs = zzczz;
        zzpks = zztx("libcore.io.Memory");
        zzpkt = zztx("org.robolectric.Robolectric") != null;
        boolean zzp = zzp(Long.TYPE);
        zzpku = zzp;
        boolean zzp2 = zzp(Integer.TYPE);
        zzpkv = zzp2;
        zzd zzdVar = null;
        if (zzczz != null) {
            if (!zzdac()) {
                zzdVar = new zzc(zzczz);
            } else if (zzp) {
                zzdVar = new zzb(zzczz);
            } else if (zzp2) {
                zzdVar = new zza(zzczz);
            }
        }
        zzpkw = zzdVar;
        zzpkx = zzdab();
        zzpfz = zzdaa();
        zzpky = zzn(byte[].class);
        zzpkz = zzn(boolean[].class);
        zzpla = zzo(boolean[].class);
        zzplb = zzn(int[].class);
        zzplc = zzo(int[].class);
        zzpld = zzn(long[].class);
        zzple = zzo(long[].class);
        zzplf = zzn(float[].class);
        zzplg = zzo(float[].class);
        zzplh = zzn(double[].class);
        zzpli = zzo(double[].class);
        zzplj = zzn(Object[].class);
        zzplk = zzo(Object[].class);
        if (!zzdac() || (zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress")) == null) {
            zza2 = zza((Class<?>) Buffer.class, "address");
        }
        zzpll = (zza2 == null || zzdVar == null) ? -1L : zzdVar.zzpln.objectFieldOffset(zza2);
        zzplm = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzfiq() {
    }

    public static int zza(Object obj, long j) {
        return zzpkw.zza(obj, j);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zza(obj, j2) & ((Base64.BASELENGTH << i) ^ (-1))));
    }

    private static void zza(Object obj, long j, int i) {
        zzpkw.zzpln.putInt(obj, j, i);
    }

    public static void zza(byte[] bArr, long j, byte b) {
        zzpkw.zze(bArr, zzpky + j, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzb(Object obj, long j) {
        return (byte) (zza(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3)));
    }

    public static byte zzb(byte[] bArr, long j) {
        return zzpkw.zzf(bArr, zzpky + j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zza(obj, j2) & ((Base64.BASELENGTH << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzc(Object obj, long j) {
        return (byte) (zza(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    public static boolean zzczx() {
        return zzpfz;
    }

    public static boolean zzczy() {
        return zzpkx;
    }

    private static Unsafe zzczz() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzfir());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzdaa() {
        Unsafe unsafe = zzlrs;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (zzdac()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzdab() {
        Unsafe unsafe = zzlrs;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (zzdac()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzdac() {
        return (zzpks == null || zzpkt) ? false : true;
    }

    private static int zzn(Class<?> cls) {
        if (zzpfz) {
            return zzpkw.zzpln.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzo(Class<?> cls) {
        if (zzpfz) {
            return zzpkw.zzpln.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean zzp(Class<?> cls) {
        if (!zzdac()) {
            return false;
        }
        try {
            Class<?> cls2 = zzpks;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static <T> Class<T> zztx(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
