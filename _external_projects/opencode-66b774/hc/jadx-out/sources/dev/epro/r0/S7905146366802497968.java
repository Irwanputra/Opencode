package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S7905146366802497968 extends E14280029398128460522 {
    public final L12639328004344855510 f;

    public S7905146366802497968(L12639328004344855510 l12639328004344855510, G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064) {
        super(l12639328004344855510, g8001132634698687269, i, t1542296375665870064, (byte) 0);
        this.f = l12639328004344855510;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dev.epro.r0.E14280029398128460522, dev.epro.r0.M8065676928355175142
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dev.epro.r0.A2558500182237595544 r5, dev.epro.r0.R4833348786910499294 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dev.epro.r0.H17798331116151756541
            if (r0 == 0) goto L13
            r0 = r6
            dev.epro.r0.H17798331116151756541 r0 = (dev.epro.r0.H17798331116151756541) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L1a
        L13:
            dev.epro.r0.H17798331116151756541 r0 = new dev.epro.r0.H17798331116151756541
            dev.epro.r0.K14749510448791472029 r6 = (dev.epro.r0.K14749510448791472029) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            dev.epro.r0.A2558500182237595544 r5 = r0.t
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.t = r5
            r0.w = r3
            java.lang.Object r4 = super.c(r5, r0)
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r6) goto L40
            return r6
        L40:
            dev.epro.r0.J17843656891628349757 r5 = (dev.epro.r0.J17843656891628349757) r5
            dev.epro.r0.H17686692708284905246 r4 = r5.d
            boolean r4 = r4.A()
            if (r4 == 0) goto L4d
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L4d:
            java.lang.String r4 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S7905146366802497968.c(dev.epro.r0.A2558500182237595544, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.E14280029398128460522, dev.epro.r0.M8065676928355175142
    public final M8065676928355175142 d(G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064) {
        return new S7905146366802497968(this.f, g8001132634698687269, i, t1542296375665870064);
    }
}
