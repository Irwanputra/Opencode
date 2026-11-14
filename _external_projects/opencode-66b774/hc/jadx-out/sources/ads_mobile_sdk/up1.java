package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import dev.epro.r0.L16390669445741171034;
import dev.epro.r0.O14274123019025838265;
import dev.epro.r0.V4416135141588678913;
import dev.epro.r0.Y18228141026965703196;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class up1 {
    public final Context a;
    public final vi3 b;
    public final a c;
    public final String d;
    public final boolean e;

    public up1(Context context, vi3 vi3Var, a aVar, j7 j7Var) {
        this.a = context;
        this.b = vi3Var;
        this.c = aVar;
        this.d = j7Var.F();
        this.e = j7Var.z();
    }

    public final String a(long j) {
        String strEncodeToString;
        boolean z;
        O14274123019025838265 o14274123019025838265O = de.o();
        String str = this.d;
        o14274123019025838265O.b();
        ((de) o14274123019025838265O.b).b(str);
        o14274123019025838265O.b();
        ((de) o14274123019025838265O.b).p();
        String packageName = this.a.getPackageName();
        o14274123019025838265O.b();
        ((de) o14274123019025838265O.b).c(packageName);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        o14274123019025838265O.b();
        de deVar = (de) o14274123019025838265O.b;
        deVar.bitField0_ |= 4;
        deVar.evtTime_ = jCurrentTimeMillis;
        long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
        o14274123019025838265O.b();
        de deVar2 = (de) o14274123019025838265O.b;
        deVar2.bitField0_ |= 32;
        deVar2.uptSignal_ = jCurrentTimeMillis2;
        if (this.e) {
            try {
                Signature[] signatureArr = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 64).signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    strEncodeToString = "E";
                } else {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                    }
                    strEncodeToString = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                }
            } catch (Exception unused) {
                strEncodeToString = "E";
            }
            o14274123019025838265O.b();
            ((de) o14274123019025838265O.b).d(strEncodeToString);
        }
        try {
            long j2 = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
            o14274123019025838265O.b();
            de deVar3 = (de) o14274123019025838265O.b;
            deVar3.bitField0_ |= 16;
            deVar3.vcdSignal_ = j2;
        } catch (PackageManager.NameNotFoundException unused2) {
            o14274123019025838265O.b();
            de deVar4 = (de) o14274123019025838265O.b;
            deVar4.bitField0_ |= 16;
            deVar4.vcdSignal_ = -1L;
        }
        a aVar = this.c;
        synchronized (aVar) {
            z = aVar.d;
        }
        if (!z) {
            this.c.a();
        }
        L16390669445741171034 l16390669445741171034A = this.c.a(null, ((de) o14274123019025838265O.a()).a());
        l16390669445741171034A.b();
        le leVar = (le) l16390669445741171034A.b;
        leVar.getClass();
        leVar.protoName_ = 4;
        leVar.bitField0_ |= 2;
        l16390669445741171034A.b();
        le leVar2 = (le) l16390669445741171034A.b;
        leVar2.getClass();
        leVar2.encryptionMethod_ = Y18228141026965703196.a(2);
        leVar2.bitField0_ |= 4;
        return V4416135141588678913.d(true).c(((le) l16390669445741171034A.a()).a());
    }
}
