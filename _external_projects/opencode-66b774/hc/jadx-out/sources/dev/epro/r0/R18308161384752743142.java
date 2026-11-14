package dev.epro.r0;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPairGenerator;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class R18308161384752743142 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyPairGenerator b;
    public final /* synthetic */ KeyGenParameterSpec c;

    static {
        izmyclvb.qgayjvbiagej2(345);
    }

    private native void evvaikxasvle(KeyPairGenerator keyPairGenerator, KeyGenParameterSpec keyGenParameterSpec, byte b);

    @Override // dev.epro.r0.B13729205492206812220
    public final native Object invoke();

    public /* synthetic */ R18308161384752743142(KeyPairGenerator keyPairGenerator, KeyGenParameterSpec keyGenParameterSpec, byte b) {
        this.a = b;
        this.b = keyPairGenerator;
        this.c = keyGenParameterSpec;
        evvaikxasvle(keyPairGenerator, keyGenParameterSpec, b);
    }
}
