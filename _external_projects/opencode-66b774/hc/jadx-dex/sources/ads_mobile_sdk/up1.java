package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class up1 {
    public final android.content.Context a;
    public final ads_mobile_sdk.vi3 b;
    public final ads_mobile_sdk.a c;
    public final java.lang.String d;
    public final boolean e;

    public up1(android.content.Context context, ads_mobile_sdk.vi3 vi3Var, ads_mobile_sdk.a aVar, ads_mobile_sdk.j7 j7Var) {
        this.a = context;
        this.b = vi3Var;
        this.c = aVar;
        this.d = j7Var.F();
        this.e = j7Var.z();
    }

    public final java.lang.String a(long j) {
        java.lang.String strEncodeToString;
        boolean z;
        dev.epro.r0.O14274123019025838265 o14274123019025838265O = ads_mobile_sdk.de.o();
        java.lang.String str = this.d;
        o14274123019025838265O.b();
        ((ads_mobile_sdk.de) o14274123019025838265O.b).b(str);
        o14274123019025838265O.b();
        ((ads_mobile_sdk.de) o14274123019025838265O.b).p();
        java.lang.String packageName = this.a.getPackageName();
        o14274123019025838265O.b();
        ((ads_mobile_sdk.de) o14274123019025838265O.b).c(packageName);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        o14274123019025838265O.b();
        ads_mobile_sdk.de deVar = (ads_mobile_sdk.de) o14274123019025838265O.b;
        deVar.bitField0_ |= 4;
        deVar.evtTime_ = jCurrentTimeMillis;
        long jCurrentTimeMillis2 = (java.lang.System.currentTimeMillis() - j) / 1000;
        o14274123019025838265O.b();
        ads_mobile_sdk.de deVar2 = (ads_mobile_sdk.de) o14274123019025838265O.b;
        deVar2.bitField0_ |= 32;
        deVar2.uptSignal_ = jCurrentTimeMillis2;
        if (this.e) {
            try {
                android.content.pm.Signature[] signatureArr = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 64).signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    strEncodeToString = "E";
                } else {
                    byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (byte b : bArrDigest) {
                        java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                    }
                    strEncodeToString = android.util.Base64.encodeToString(sb.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), 11);
                }
            } catch (java.lang.Exception unused) {
                strEncodeToString = "E";
            }
            o14274123019025838265O.b();
            ((ads_mobile_sdk.de) o14274123019025838265O.b).d(strEncodeToString);
        }
        try {
            long j2 = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
            o14274123019025838265O.b();
            ads_mobile_sdk.de deVar3 = (ads_mobile_sdk.de) o14274123019025838265O.b;
            deVar3.bitField0_ |= 16;
            deVar3.vcdSignal_ = j2;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            o14274123019025838265O.b();
            ads_mobile_sdk.de deVar4 = (ads_mobile_sdk.de) o14274123019025838265O.b;
            deVar4.bitField0_ |= 16;
            deVar4.vcdSignal_ = -1L;
        }
        ads_mobile_sdk.a aVar = this.c;
        synchronized (aVar) {
            z = aVar.d;
        }
        if (!z) {
            this.c.a();
        }
        dev.epro.r0.L16390669445741171034 l16390669445741171034A = this.c.a(null, ((ads_mobile_sdk.de) o14274123019025838265O.a()).a());
        l16390669445741171034A.b();
        ads_mobile_sdk.le leVar = (ads_mobile_sdk.le) l16390669445741171034A.b;
        leVar.getClass();
        leVar.protoName_ = 4;
        leVar.bitField0_ |= 2;
        l16390669445741171034A.b();
        ads_mobile_sdk.le leVar2 = (ads_mobile_sdk.le) l16390669445741171034A.b;
        leVar2.getClass();
        leVar2.encryptionMethod_ = dev.epro.r0.Y18228141026965703196.a(2);
        leVar2.bitField0_ |= 4;
        return dev.epro.r0.V4416135141588678913.d(true).c(((ads_mobile_sdk.le) l16390669445741171034A.a()).a());
    }
}
