package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final /* synthetic */ class zzduq {
    public static final /* synthetic */ int[] zzlzc;
    public static final /* synthetic */ int[] zzlzd;

    static {
        zzdur.values();
        int[] iArr = new int[3];
        zzlzd = iArr;
        try {
            zzdur zzdurVar = zzdur.NIST_P256;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            int[] iArr2 = zzlzd;
            zzdur zzdurVar2 = zzdur.NIST_P384;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            int[] iArr3 = zzlzd;
            zzdur zzdurVar3 = zzdur.NIST_P521;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        zzdus.values();
        int[] iArr4 = new int[2];
        zzlzc = iArr4;
        try {
            zzdus zzdusVar = zzdus.UNCOMPRESSED;
            iArr4[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            int[] iArr5 = zzlzc;
            zzdus zzdusVar2 = zzdus.COMPRESSED;
            iArr5[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
