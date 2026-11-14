package dev.epro.r0;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T14597605096299173136 extends X509Certificate {
    public final X509Certificate a;
    public final byte[] b;
    public int c = -1;

    public T14597605096299173136(X509Certificate x509Certificate, byte[] bArr) {
        this.a = x509Certificate;
        this.b = (byte[]) bArr.clone();
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        this.a.checkValidity();
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((X509Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        return this.a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return this.a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public final List getExtendedKeyUsage() {
        return this.a.getExtendedKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        return this.a.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() {
        return this.a.getIssuerAlternativeNames();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return this.a.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        return this.a.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        return this.a.getIssuerX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return this.a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return this.a.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.a.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.a.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        return this.a.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.a.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        return this.a.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.a.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return this.a.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.a.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() {
        return this.a.getSubjectAlternativeNames();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return this.a.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        return this.a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        return this.a.getSubjectX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        return this.a.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.a.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        return this.a.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        try {
            int iHashCode = Arrays.hashCode(getEncoded());
            this.c = iHashCode;
            return iHashCode;
        } catch (CertificateEncodingException unused) {
            this.c = 0;
            return 0;
        }
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        return this.a.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.a.verify(publicKey);
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        this.a.checkValidity(date);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.a.verify(publicKey, str);
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        this.a.verify(publicKey, provider);
    }
}
