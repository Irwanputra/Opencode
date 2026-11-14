package dev.epro.r0;

import android.net.Network;
import java.util.Comparator;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class F3575088397037908981 implements Comparator {
    public final /* synthetic */ Network a;

    static {
        izmyclvb.dpqpjfpoanwt1(1133);
    }

    private native void pwhchzyfefir(Network network);

    @Override // java.util.Comparator
    public final native int compare(Object obj, Object obj2);

    public F3575088397037908981(Network network) {
        this.a = network;
        pwhchzyfefir(network);
    }
}
