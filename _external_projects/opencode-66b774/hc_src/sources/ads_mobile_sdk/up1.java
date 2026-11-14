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

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
        int i;
        int i2;
        String str;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        O14274123019025838265 o2 = de.o();
        String str2 = this.d;
        o2.b();
        ((de) o2.b).b(str2);
        o2.b();
        ((de) o2.b).p();
        String packageName = this.a.getPackageName();
        o2.b();
        ((de) o2.b).c(packageName);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        o2.b();
        de deVar = (de) o2.b;
        i = deVar.bitField0_;
        deVar.bitField0_ = i | 4;
        deVar.evtTime_ = currentTimeMillis;
        long currentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
        o2.b();
        de deVar2 = (de) o2.b;
        i2 = deVar2.bitField0_;
        deVar2.bitField0_ = i2 | 32;
        deVar2.uptSignal_ = currentTimeMillis2;
        if (this.e) {
            try {
                Signature[] signatureArr = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 64).signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    str = "E";
                } else {
                    byte[] digest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                    }
                    str = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                }
            } catch (Exception unused) {
                str = "E";
            }
            o2.b();
            ((de) o2.b).d(str);
        }
        try {
            long j2 = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
            o2.b();
            de deVar3 = (de) o2.b;
            i6 = deVar3.bitField0_;
            deVar3.bitField0_ = i6 | 16;
            deVar3.vcdSignal_ = j2;
        } catch (PackageManager.NameNotFoundException unused2) {
            o2.b();
            de deVar4 = (de) o2.b;
            i3 = deVar4.bitField0_;
            deVar4.bitField0_ = i3 | 16;
            deVar4.vcdSignal_ = -1L;
        }
        a aVar = this.c;
        synchronized (aVar) {
            z = aVar.d;
        }
        if (!z) {
            this.c.a();
        }
        L16390669445741171034 a = this.c.a(null, ((de) o2.a()).a());
        a.b();
        le leVar = (le) a.b;
        leVar.getClass();
        leVar.protoName_ = 4;
        i4 = leVar.bitField0_;
        leVar.bitField0_ = i4 | 2;
        a.b();
        le leVar2 = (le) a.b;
        leVar2.getClass();
        leVar2.encryptionMethod_ = Y18228141026965703196.a(2);
        i5 = leVar2.bitField0_;
        leVar2.bitField0_ = i5 | 4;
        return V4416135141588678913.d(true).c(((le) a.a()).a());
    }
}
