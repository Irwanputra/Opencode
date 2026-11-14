package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class a {
    public java.security.MessageDigest a;
    public final ads_mobile_sdk.vi3 b;
    public final java.lang.Object c = new java.lang.Object();
    public boolean d = false;
    public java.security.SecureRandom e;

    public a(ads_mobile_sdk.vi3 vi3Var) {
        this.b = vi3Var;
    }

    public final byte[] a(byte[] bArr, java.lang.String str, boolean z) {
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            dev.epro.r0.K2042933864045806308.h();
            return null;
        }
        java.nio.ByteBuffer byteBufferPut = java.nio.ByteBuffer.allocate(i + 1).put((byte) bArr.length);
        if (bArr.length < i) {
            int length = i - bArr.length;
            byte[] bArr2 = new byte[length];
            this.e.nextBytes(bArr2);
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length + length);
            java.lang.System.arraycopy(bArr2, 0, bArrCopyOf, bArr.length, length);
            bArr = bArrCopyOf;
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = java.nio.ByteBuffer.allocate(256).put(a(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        for (ads_mobile_sdk.ak0 ak0Var : new ads_mobile_sdk.gk0().K2) {
            ak0Var.a(bArrArray, bArr3);
        }
        if (!dev.epro.r0.T3803022700175900929.a(str)) {
            ads_mobile_sdk.c cVar = new ads_mobile_sdk.c(str.length() > 32 ? str.substring(0, 32).getBytes(java.nio.charset.StandardCharsets.UTF_8) : str.getBytes(java.nio.charset.StandardCharsets.UTF_8), (byte) 0);
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                i2 = (i2 + 1) & 255;
                byte[] bArr4 = cVar.a;
                byte b = bArr4[i2];
                i3 = (i3 + b) & 255;
                bArr4[i2] = bArr4[i3];
                bArr4[i3] = b;
                bArr3[i4] = (byte) (bArr4[(bArr4[i2] + b) & 255] ^ bArr3[i4]);
            }
        }
        return bArr3;
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.c) {
            this.a.reset();
            this.a.update(bArr);
            bArrDigest = this.a.digest();
        }
        return bArrDigest;
    }

    public final dev.epro.r0.L16390669445741171034 a(java.lang.String str, byte[] bArr) {
        dev.epro.r0.L16390669445741171034 l16390669445741171034O = ads_mobile_sdk.le.o();
        byte[] bArrA = a(bArr);
        ads_mobile_sdk.qq qqVarA = ads_mobile_sdk.sq.a(0, bArrA, bArrA.length);
        l16390669445741171034O.b();
        ((ads_mobile_sdk.le) l16390669445741171034O.b).b(qqVarA);
        int length = ((bArr.length - 1) / 255) + 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < length; i++) {
            int i2 = i * 255;
            int length2 = i2 + 255;
            if (bArr.length <= length2) {
                length2 = bArr.length;
            }
            arrayList.add(java.util.Arrays.copyOfRange(bArr, i2, length2));
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            java.lang.Object obj = arrayList.get(i3);
            i3++;
            ads_mobile_sdk.qq qqVarA2 = ads_mobile_sdk.sq.a(0, a((byte[]) obj, str, false), 256);
            l16390669445741171034O.b();
            ((ads_mobile_sdk.le) l16390669445741171034O.b).a(qqVarA2);
        }
        return l16390669445741171034O;
    }

    public final void a() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        if (z) {
            return;
        }
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        synchronized (this) {
            ads_mobile_sdk.vi3 vi3Var = this.b;
            ads_mobile_sdk.sh3 sh3Var = new ads_mobile_sdk.sh3(ads_mobile_sdk.yk0.EVENT_ID_FALLBACK_INIT_OBFUSCATOR, vi3Var.b, vi3Var.a);
            try {
                try {
                    try {
                        sh3Var.b();
                        this.e = secureRandom;
                        this.a = java.security.MessageDigest.getInstance("MD5");
                        this.d = true;
                    } catch (java.lang.Throwable th) {
                        sh3Var.a(th);
                        throw th;
                    }
                } catch (java.security.NoSuchAlgorithmException e) {
                    sh3Var.a(e);
                }
                sh3Var.a();
            } catch (java.lang.Throwable th2) {
                sh3Var.a();
                throw th2;
            }
        }
    }
}
