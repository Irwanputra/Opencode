package dev.epro.r0;

import ads_mobile_sdk.qw2;
import com.trilead.ssh2.signature.KeyAlgorithm;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class I10051424186108607289 implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ I10051424186108607289(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        double L;
        String keyFormat;
        switch (this.a) {
            case 0:
                H1172266339307530335 h1172266339307530335 = (H1172266339307530335) obj;
                if (h1172266339307530335.b) {
                    L = 6.0d;
                } else {
                    double d = h1172266339307530335.c;
                    L = d <= -1.0d ? 87.0d : d < 0.0d ? V12319504402545346730.L(87.0d, 87.0d, (d - (-1.0d)) / 1.0d) : d < 0.5d ? V12319504402545346730.L(87.0d, 80.0d, (d - 0.0d) / 0.5d) : d < 1.0d ? V12319504402545346730.L(80.0d, 75.0d, (d - 0.5d) / 0.5d) : 75.0d;
                }
                break;
            case 1:
                keyFormat = ((KeyAlgorithm) obj).getKeyFormat();
                break;
            case 2:
                ((qw2) obj).getClass();
                break;
            default:
                ((qw2) obj).getClass();
                break;
        }
        return new AtomicInteger(0);
    }
}
