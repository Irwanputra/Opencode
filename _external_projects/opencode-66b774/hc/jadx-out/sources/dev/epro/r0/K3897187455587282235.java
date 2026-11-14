package dev.epro.r0;

import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class K3897187455587282235 implements S5790556442212423769 {
    public final /* synthetic */ U5896941291278117761 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ S5790556442212423769 c;

    static {
        izmyclvb.dpqpjfpoanwt1(1115);
    }

    private native void qsrikiaadrwy(U5896941291278117761 u5896941291278117761, long j, S5790556442212423769 s5790556442212423769);

    @Override // dev.epro.r0.S5790556442212423769
    public final native boolean canReportDestination();

    @Override // dev.epro.r0.S5790556442212423769
    public final native void onDestination(String str, int i);

    public K3897187455587282235(U5896941291278117761 u5896941291278117761, long j, S5790556442212423769 s5790556442212423769) {
        this.a = u5896941291278117761;
        this.b = j;
        this.c = s5790556442212423769;
        qsrikiaadrwy(u5896941291278117761, j, s5790556442212423769);
    }
}
