package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.io.IOException;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class O12381155415298832183 extends H7764668292392457836 implements AutoCloseable {
    public final long a;
    public G6500976686365785884 b;
    public final int c;

    static {
        izmyclvb.dpqpjfpoanwt1(pd.T0);
    }

    private native void astkcztrfggg(long j, G6500976686365785884 g6500976686365785884, IOException iOException, int i);

    @Override // java.lang.AutoCloseable
    public final native void close();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O12381155415298832183(long j, G6500976686365785884 g6500976686365785884, IOException iOException, int i) {
        super(iOException);
        iOException.getClass();
        astkcztrfggg(j, g6500976686365785884, iOException, i);
    }
}
