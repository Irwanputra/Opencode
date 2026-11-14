package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class KeyAlgorithmManager {
    private static final java.util.Collection<com.trilead.ssh2.signature.KeyAlgorithm<java.security.PublicKey, java.security.PrivateKey>> supportedAlgorithms = buildSupportAlgorithmsList();

    private KeyAlgorithmManager() {
    }

    private static java.util.Collection<com.trilead.ssh2.signature.KeyAlgorithm<java.security.PublicKey, java.security.PrivateKey>> buildSupportAlgorithmsList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.trilead.ssh2.signature.ED25519KeyAlgorithm());
        try {
            java.security.KeyFactory.getInstance("EC");
            arrayList.add(new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp521());
            arrayList.add(new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp384());
            arrayList.add(new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp256());
        } catch (java.security.GeneralSecurityException unused) {
        }
        arrayList.add(new com.trilead.ssh2.signature.RSAKeyAlgorithm("SHA256withRSA", "rsa-sha2-256"));
        arrayList.add(new com.trilead.ssh2.signature.RSAKeyAlgorithm("SHA512withRSA", "rsa-sha2-512"));
        arrayList.add(new com.trilead.ssh2.signature.RSAKeyAlgorithm());
        arrayList.add(new com.trilead.ssh2.signature.DSAKeyAlgorithm());
        return java.util.Collections.unmodifiableCollection(arrayList);
    }

    public static java.util.Collection<com.trilead.ssh2.signature.KeyAlgorithm<java.security.PublicKey, java.security.PrivateKey>> getSupportedAlgorithms() {
        return supportedAlgorithms;
    }
}
