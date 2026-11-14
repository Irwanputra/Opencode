package com.trilead.ssh2.signature;

import com.trilead.ssh2.signature.ECDSAKeyAlgorithm;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class KeyAlgorithmManager {
    private static final Collection<KeyAlgorithm<PublicKey, PrivateKey>> supportedAlgorithms = buildSupportAlgorithmsList();

    private KeyAlgorithmManager() {
    }

    private static Collection<KeyAlgorithm<PublicKey, PrivateKey>> buildSupportAlgorithmsList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ED25519KeyAlgorithm());
        try {
            KeyFactory.getInstance("EC");
            arrayList.add(new ECDSAKeyAlgorithm.ECDSASha2Nistp521());
            arrayList.add(new ECDSAKeyAlgorithm.ECDSASha2Nistp384());
            arrayList.add(new ECDSAKeyAlgorithm.ECDSASha2Nistp256());
        } catch (GeneralSecurityException unused) {
        }
        arrayList.add(new RSAKeyAlgorithm("SHA256withRSA", "rsa-sha2-256"));
        arrayList.add(new RSAKeyAlgorithm("SHA512withRSA", "rsa-sha2-512"));
        arrayList.add(new RSAKeyAlgorithm());
        arrayList.add(new DSAKeyAlgorithm());
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<KeyAlgorithm<PublicKey, PrivateKey>> getSupportedAlgorithms() {
        return supportedAlgorithms;
    }
}
