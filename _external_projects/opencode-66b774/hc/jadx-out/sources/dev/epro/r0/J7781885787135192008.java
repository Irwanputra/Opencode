package dev.epro.r0;

import dev.epro.slowdns.DestinationObserver;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class J7781885787135192008 implements DestinationObserver {
    public final L12639328004344855510 a;
    public final AtomicBoolean b;

    static {
        izmyclvb.dpqpjfpoanwt1(1985);
    }

    private native void bnnbkmgynnpf(L12639328004344855510 l12639328004344855510);

    @Override // dev.epro.slowdns.DestinationObserver
    public final native boolean canReportDestination();

    @Override // dev.epro.slowdns.DestinationObserver
    public final native void onDestination(String str, int i);

    public J7781885787135192008(L12639328004344855510 l12639328004344855510) {
        l12639328004344855510.getClass();
        bnnbkmgynnpf(l12639328004344855510);
    }
}
