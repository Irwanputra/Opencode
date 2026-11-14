package dev.epro.r0;

import dev.epro.httpcustom.HTTPCustomApp;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class I11416996268164420496 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ HTTPCustomApp v;

    static {
        izmyclvb.dpqpjfpoanwt1(1751);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I11416996268164420496(HTTPCustomApp hTTPCustomApp, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = hTTPCustomApp;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        HTTPCustomApp hTTPCustomApp = this.v;
        switch (b) {
            case 0:
                return new I11416996268164420496(hTTPCustomApp, r4833348786910499294, (byte) 0);
            default:
                return new I11416996268164420496(hTTPCustomApp, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((I11416996268164420496) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);
}
