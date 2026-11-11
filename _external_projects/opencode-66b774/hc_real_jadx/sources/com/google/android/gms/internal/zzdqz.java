package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final /* synthetic */ class zzdqz {
    public static final /* synthetic */ int[] zzltf;

    static {
        zzdsq.values();
        int[] iArr = new int[6];
        zzltf = iArr;
        try {
            zzdsq zzdsqVar = zzdsq.SHA1;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            int[] iArr2 = zzltf;
            zzdsq zzdsqVar2 = zzdsq.SHA256;
            iArr2[3] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            int[] iArr3 = zzltf;
            zzdsq zzdsqVar3 = zzdsq.SHA512;
            iArr3[4] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
