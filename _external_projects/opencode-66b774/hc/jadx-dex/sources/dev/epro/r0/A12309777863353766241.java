package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A12309777863353766241 extends dev.epro.r0.S5282637534609503170 {
    public final dev.epro.r0.H8745424616867554108 e;
    public final dev.epro.r0.H8745424616867554108 f;
    public final float[] g;

    public A12309777863353766241(dev.epro.r0.H8745424616867554108 h8745424616867554108, dev.epro.r0.H8745424616867554108 h87454246168675541082) {
        float[] fArrF;
        super(h87454246168675541082, h8745424616867554108, h87454246168675541082, (float[]) null);
        this.e = h8745424616867554108;
        this.f = h87454246168675541082;
        float[] fArr = (float[]) dev.epro.r0.H12843822278061842084.e.b;
        dev.epro.r0.Q9435736031653407531 q9435736031653407531 = h8745424616867554108.d;
        float[] fArr2 = h8745424616867554108.i;
        dev.epro.r0.Q9435736031653407531 q94357360316534075312 = h87454246168675541082.d;
        float[] fArr3 = h87454246168675541082.j;
        if (dev.epro.r0.A10225670138084435446.w(q9435736031653407531, q94357360316534075312)) {
            fArrF = dev.epro.r0.A10225670138084435446.F(fArr3, fArr2);
        } else {
            float[] fArrA = q9435736031653407531.a();
            float[] fArrA2 = q94357360316534075312.a();
            dev.epro.r0.Q9435736031653407531 q94357360316534075313 = dev.epro.r0.C9869900372345142877.d;
            fArrF = dev.epro.r0.A10225670138084435446.F(dev.epro.r0.A10225670138084435446.w(q94357360316534075312, q94357360316534075313) ? fArr3 : dev.epro.r0.A10225670138084435446.E(dev.epro.r0.A10225670138084435446.F(dev.epro.r0.A10225670138084435446.v(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), h87454246168675541082.i)), dev.epro.r0.A10225670138084435446.w(q9435736031653407531, q94357360316534075313) ? fArr2 : dev.epro.r0.A10225670138084435446.F(dev.epro.r0.A10225670138084435446.v(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrF;
    }

    public final long a(long j) {
        float fG = dev.epro.r0.U10174709222559481877.g(j);
        float f = dev.epro.r0.U10174709222559481877.f(j);
        float fD = dev.epro.r0.U10174709222559481877.d(j);
        float fC = dev.epro.r0.U10174709222559481877.c(j);
        dev.epro.r0.F12101231409752321762 f12101231409752321762 = this.e.p;
        float fG2 = (float) f12101231409752321762.g(fG);
        float fG3 = (float) f12101231409752321762.g(f);
        float fG4 = (float) f12101231409752321762.g(fD);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fG4) + (fArr[3] * fG3) + (fArr[0] * fG2);
        float f3 = (fArr[7] * fG4) + (fArr[4] * fG3) + (fArr[1] * fG2);
        float f4 = (fArr[8] * fG4) + (fArr[5] * fG3) + (fArr[2] * fG2);
        dev.epro.r0.H8745424616867554108 h8745424616867554108 = this.f;
        dev.epro.r0.F12101231409752321762 f121012314097523217622 = h8745424616867554108.m;
        return dev.epro.r0.J8045362843799184672.d((float) f121012314097523217622.g(f2), (float) f121012314097523217622.g(f3), (float) f121012314097523217622.g(f4), fC, h8745424616867554108);
    }
}
