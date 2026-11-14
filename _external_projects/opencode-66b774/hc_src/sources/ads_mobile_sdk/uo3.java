package ads_mobile_sdk;

import android.os.Build;
import dev.epro.r0.W4415201450379021245;
import dev.epro.r0.W7808703833045379622;
import dev.epro.r0.Z12698456576814114874;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class uo3 {
    public static final byte[] a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    public static final byte[] b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    public static boolean a(File file) {
        try {
            X509Certificate[][] j = W7808703833045379622.j(file.getAbsolutePath());
            if (j.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(j[0][0].getEncoded());
                return Arrays.equals(a, digest) || (!"user".equals(Build.TYPE) && Arrays.equals(b, digest));
            }
            W4415201450379021245.c("APK has more than one signature.");
            return false;
        } catch (Z12698456576814114874 e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
