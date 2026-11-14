package dev.epro.r0;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N6415941970858904263 {
    public static volatile CertificateFactory a;
    public static final byte[] b;
    public static final byte[] c;

    public static X509Certificate a(byte[] bArr) {
        if (a == null) {
            synchronized (N6415941970858904263.class) {
                if (a == null) {
                    try {
                        a = CertificateFactory.getInstance("X.509");
                    } catch (CertificateException e) {
                        throw new RuntimeException("Failed to create X.509 CertificateFactory", e);
                    }
                }
            }
        }
        return b(bArr, a);
    }

    public static X509Certificate b(byte[] bArr, CertificateFactory certificateFactory) throws CertificateException {
        try {
            try {
                return (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
            } catch (CertificateException unused) {
                ByteBuffer byteBufferC = c(ByteBuffer.wrap(bArr));
                byteBufferC.position();
                try {
                    if (S2941385686793915703.Q(byteBufferC, J8045362843799184672.class) != null) {
                        throw new ClassCastException();
                    }
                    P5201717407242849942.b(null);
                    throw null;
                } catch (W16495563625558853219 e) {
                    e = e;
                    throw new CertificateException("Failed to parse certificate", e);
                } catch (CertificateException e2) {
                    e = e2;
                    throw new CertificateException("Failed to parse certificate", e);
                }
            }
        } catch (K6445406877359976829 | W16495563625558853219 | CertificateException e3) {
            e = e3;
            throw new CertificateException("Failed to parse certificate", e);
        }
    }

    public static native ByteBuffer c(ByteBuffer byteBuffer);

    static {
        izmyclvb.dpqpjfpoanwt1(1222);
        b = "-----BEGIN CERTIFICATE-----".getBytes();
        c = "-----END CERTIFICATE-----".getBytes();
    }
}
