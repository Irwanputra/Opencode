package p131.p135.p137;

import p107.p108.p109.p110.p119.C1888;
import p131.p135.p142.InterfaceC2021;

/* renamed from: なぎぱいぢぎ.〺つふすそ.〺つふすそ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1976 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C1982 f8598;

    public RunnableC1976(C1982 c1982) {
        this.f8598 = c1982;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC2021 interfaceC2021 = this.f8598.f8626;
        if (interfaceC2021 != null) {
            ((C1888) interfaceC2021).m4001();
        }
        this.f8598.m4096();
    }
}
