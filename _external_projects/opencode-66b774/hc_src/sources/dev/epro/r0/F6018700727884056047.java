package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F6018700727884056047 extends P9893650590651797888 implements J12078565427869724451 {
    public final /* synthetic */ F4096073349764486348 i;
    public final /* synthetic */ W3656598099029166611 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F6018700727884056047(F4096073349764486348 f4096073349764486348, W3656598099029166611 w3656598099029166611) {
        super(3);
        this.i = f4096073349764486348;
        this.j = w3656598099029166611;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        I5164649337253478959 i5164649337253478959 = (I5164649337253478959) obj;
        Z17471428274427141949 d = ((G17613326942144185441) obj2).d(((I16980768508151520658) obj3).a);
        if (i5164649337253478959.A()) {
            if (!((Boolean) this.i.invoke(this.j.d.getValue())).booleanValue()) {
                j = 0;
                return i5164649337253478959.m((int) (j >> 32), (int) (4294967295L & j), X9852054718446117252.a, new W6379596077193263535(d, (byte) 0));
            }
        }
        j = (d.a << 32) | (d.b & 4294967295L);
        return i5164649337253478959.m((int) (j >> 32), (int) (4294967295L & j), X9852054718446117252.a, new W6379596077193263535(d, (byte) 0));
    }
}
