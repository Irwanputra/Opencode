package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final /* synthetic */ class zzdqw {
    public static final /* synthetic */ int[] zzltf;
    public static final /* synthetic */ int[] zzltg;
    public static final /* synthetic */ int[] zzlth;

    static {
        zzdsa.values();
        int[] iArr = new int[4];
        zzlth = iArr;
        try {
            zzdsa zzdsaVar = zzdsa.UNCOMPRESSED;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            int[] iArr2 = zzlth;
            zzdsa zzdsaVar2 = zzdsa.COMPRESSED;
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        zzdso.values();
        int[] iArr3 = new int[6];
        zzltg = iArr3;
        try {
            zzdso zzdsoVar = zzdso.NIST_P256;
            iArr3[2] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            int[] iArr4 = zzltg;
            zzdso zzdsoVar2 = zzdso.NIST_P384;
            iArr4[3] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            int[] iArr5 = zzltg;
            zzdso zzdsoVar3 = zzdso.NIST_P521;
            iArr5[4] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        zzdsq.values();
        int[] iArr6 = new int[6];
        zzltf = iArr6;
        try {
            zzdsq zzdsqVar = zzdsq.SHA1;
            iArr6[1] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            int[] iArr7 = zzltf;
            zzdsq zzdsqVar2 = zzdsq.SHA256;
            iArr7[3] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            int[] iArr8 = zzltf;
            zzdsq zzdsqVar3 = zzdsq.SHA512;
            iArr8[4] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
