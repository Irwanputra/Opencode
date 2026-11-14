package dev.epro.r0;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class D12479954144552011276 {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            new SecureRandom();
        }
    }
}
