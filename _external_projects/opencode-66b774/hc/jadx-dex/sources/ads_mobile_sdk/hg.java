package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hg extends java.security.cert.X509Certificate {
    public final java.security.cert.X509Certificate a;
    public final byte[] b;

    public hg(java.security.cert.X509Certificate x509Certificate, byte[] bArr) {
        this.a = x509Certificate;
        this.b = bArr;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws java.security.cert.CertificateNotYetValidException, java.security.cert.CertificateExpiredException {
        this.a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        return this.a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final java.util.Set getCriticalExtensionOIDs() {
        return this.a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.b;
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(java.lang.String str) {
        return this.a.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final java.security.Principal getIssuerDN() {
        return this.a.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        return this.a.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return this.a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final java.util.Set getNonCriticalExtensionOIDs() {
        return this.a.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final java.util.Date getNotAfter() {
        return this.a.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final java.util.Date getNotBefore() {
        return this.a.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final java.security.PublicKey getPublicKey() {
        return this.a.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final java.math.BigInteger getSerialNumber() {
        return this.a.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final java.lang.String getSigAlgName() {
        return this.a.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final java.lang.String getSigAlgOID() {
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
    public final java.security.Principal getSubjectDN() {
        return this.a.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        return this.a.getSubjectUniqueID();
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
    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.security.NoSuchProviderException {
        this.a.verify(publicKey);
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(java.util.Date date) throws java.security.cert.CertificateNotYetValidException, java.security.cert.CertificateExpiredException {
        this.a.checkValidity(date);
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey, java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.security.NoSuchProviderException {
        this.a.verify(publicKey, str);
    }
}
