package dev.epro.r0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Bundle;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.Iterator;
import java.util.UUID;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class T15504973625601650233 implements R12081023847482212386, P14632082186738269386, V4371024969283281503, L15260231637027815334, W14715101850940949422, E17928301615710791514 {
    public final /* synthetic */ byte a;

    public T15504973625601650233(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.a = (byte) 21;
        if (G6547577305291411977.c(1)) {
            new SecretKeySpec(bArr, "AES");
        } else {
            W4415201450379021245.c("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
    }

    public static R14289894334981469490 a(U9296548531947164180 u9296548531947164180, V7801742040189616406 v7801742040189616406, Bundle bundle, Q14196755420833223976 q14196755420833223976, F6942723054099263096 f6942723054099263096) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        v7801742040189616406.getClass();
        q14196755420833223976.getClass();
        return new R14289894334981469490(u9296548531947164180, v7801742040189616406, bundle, q14196755420833223976, f6942723054099263096, string, null);
    }

    public static I11613337141824465265 b(int i, A459791877761184370 a459791877761184370, byte[] bArr) {
        int i2 = I11613337141824465265.d;
        if ((i & 1) != 0) {
            a459791877761184370 = null;
        }
        int length = bArr.length;
        bArr.getClass();
        L14928198200995638215.a(bArr.length, 0L, length);
        return new I11613337141824465265(length, a459791877761184370, bArr);
    }

    public static Typeface f(String str, R6694982557896913324 r6694982557896913324, int i) {
        if (i == 0 && S10823041268949770285.t(r6694982557896913324, R6694982557896913324.c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && S10823041268949770285.t(r6694982557896913324, R6694982557896913324.f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), r6694982557896913324.a, i == 1);
    }

    @Override // dev.epro.r0.V4371024969283281503
    public Typeface c(S13128812947675933386 s13128812947675933386, R6694982557896913324 r6694982557896913324, int i) {
        return f(s13128812947675933386.f, r6694982557896913324, i);
    }

    @Override // dev.epro.r0.E17928301615710791514
    public Iterator d(M9197813449740923653 m9197813449740923653, CharSequence charSequence) {
        return new J4946742493713840399(m9197813449740923653, charSequence);
    }

    @Override // dev.epro.r0.P14632082186738269386
    public Object e(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // dev.epro.r0.V4371024969283281503
    public Typeface g(R6694982557896913324 r6694982557896913324, int i) {
        return f(null, r6694982557896913324, i);
    }

    public Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.a) {
            case 28:
                int iHashCode = hashCode();
                M9216324016624295870.q(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return E12098517352909843120.m("CreationExtras.Key@", string, "<", J17975719213314763068.a(Bundle.class).c(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ T15504973625601650233(byte b) {
        this.a = b;
    }

    public T15504973625601650233() {
        this.a = (byte) 2;
        new B1412794554478658227(16);
        long[] jArr = X4026756943680612204.a;
        new A4559761392562572984();
    }
}
