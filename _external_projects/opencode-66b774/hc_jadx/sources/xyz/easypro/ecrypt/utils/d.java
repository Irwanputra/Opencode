package xyz.easypro.ecrypt.utils;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: /tmp/opencode/apk_x/classes.dex */
public class d {
    public static final /* synthetic */ int a = 0;

    public static String a(byte[] bArr) {
        MessageDigest messageDigest;
        try {
            byte[] encoded = ((X509Certificate) CertificateFactory.getInstance(Crypt.xrc(" |jHk")).generateCertificate(new ByteArrayInputStream(bArr))).getEncoded();
            try {
                messageDigest = MessageDigest.getInstance(Crypt.xrc("56j"));
            } catch (NoSuchAlgorithmException unused) {
                System.exit(0);
                messageDigest = null;
            }
            messageDigest.update(encoded);
            return String.format(Crypt.xrc("]blJ*"), new BigInteger(1, messageDigest.digest()));
        } catch (Exception unused2) {
            return "";
        }
    }
}
