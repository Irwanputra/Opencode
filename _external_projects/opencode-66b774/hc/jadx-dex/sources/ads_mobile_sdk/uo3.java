package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class uo3 {
    public static final byte[] a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    public static final byte[] b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    public static boolean a(java.io.File file) throws java.security.GeneralSecurityException {
        try {
            java.security.cert.X509Certificate[][] x509CertificateArrJ = dev.epro.r0.W7808703833045379622.j(file.getAbsolutePath());
            if (x509CertificateArrJ.length == 1) {
                byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA-256").digest(x509CertificateArrJ[0][0].getEncoded());
                return java.util.Arrays.equals(a, bArrDigest) || (!"user".equals(android.os.Build.TYPE) && java.util.Arrays.equals(b, bArrDigest));
            }
            dev.epro.r0.W4415201450379021245.c("APK has more than one signature.");
            return false;
        } catch (java.io.IOException | java.lang.RuntimeException e) {
            throw new java.security.GeneralSecurityException("Failed to verify signatures", e);
        } catch (dev.epro.r0.Z12698456576814114874 e2) {
            throw new java.security.GeneralSecurityException("Package is not signed", e2);
        }
    }
}
