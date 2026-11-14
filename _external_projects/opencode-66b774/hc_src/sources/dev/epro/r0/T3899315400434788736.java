package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T3899315400434788736 extends T7441316690157960089 implements L12639328004344855510 {
    public final /* synthetic */ byte t = 0;
    public long u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3899315400434788736(long j, X4418276304150334445 x4418276304150334445, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.u = j;
        this.x = x4418276304150334445;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                T3899315400434788736 t3899315400434788736 = new T3899315400434788736(this.u, (X4418276304150334445) obj2, r4833348786910499294);
                t3899315400434788736.w = obj;
                return t3899315400434788736;
            default:
                T3899315400434788736 t38993154004347887362 = new T3899315400434788736((N13196868278329319633) obj2, r4833348786910499294);
                t38993154004347887362.w = obj;
                return t38993154004347887362;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z7637734454282223795 z7637734454282223795 = (Z7637734454282223795) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((T3899315400434788736) create(r4833348786910499294, z7637734454282223795)).invokeSuspend(o9245300239821758723);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:7:0x0047). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.t
            java.lang.Object r1 = r9.x
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9.v
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.u
            java.lang.Object r2 = r9.w
            dev.epro.r0.Z7637734454282223795 r2 = (dev.epro.r0.Z7637734454282223795) r2
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L47
        L1d:
            dev.epro.r0.S10973172697741180971.m(r3)
            goto L50
        L21:
            dev.epro.r0.E17665849472693074628.k(r10)
            java.lang.Object r10 = r9.w
            dev.epro.r0.Z7637734454282223795 r10 = (dev.epro.r0.Z7637734454282223795) r10
            dev.epro.r0.N13196868278329319633 r1 = (dev.epro.r0.N13196868278329319633) r1
            long r0 = r1.b
            dev.epro.r0.K1865709164992808030 r2 = r10.h()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.w = r2
            r9.u = r0
            r9.v = r5
            r10 = 3
            java.lang.Object r10 = dev.epro.r0.U2645994142831146282.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            dev.epro.r0.N13196868278329319633 r10 = (dev.epro.r0.N13196868278329319633) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            dev.epro.r0.X4418276304150334445 r1 = (dev.epro.r0.X4418276304150334445) r1
            boolean r0 = r9.v
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.w
            dev.epro.r0.Z7637734454282223795 r9 = (dev.epro.r0.Z7637734454282223795) r9
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L84
        L61:
            dev.epro.r0.S10973172697741180971.m(r3)
            goto Lb6
        L65:
            dev.epro.r0.E17665849472693074628.k(r10)
            java.lang.Object r10 = r9.w
            dev.epro.r0.Z7637734454282223795 r10 = (dev.epro.r0.Z7637734454282223795) r10
            long r2 = r9.u
            dev.epro.r0.Q15027034467569330017 r0 = new dev.epro.r0.Q15027034467569330017
            r6 = 26
            r0.<init>(r1, r6)
            r9.w = r10
            r9.v = r5
            java.lang.Object r9 = dev.epro.r0.F10757829603125321143.d(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            dev.epro.r0.N13196868278329319633 r10 = (dev.epro.r0.N13196868278329319633) r10
            if (r10 == 0) goto L9c
            long r0 = r1.a
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            dev.epro.r0.U8657744197706684835 r2 = dev.epro.r0.U8657744197706684835.b
            goto Lb6
        L9c:
            dev.epro.r0.P9733793856018248168 r9 = r9.e
            dev.epro.r0.Y1086209215650239921 r9 = r9.t
            java.util.List r9 = r9.a
            java.lang.Object r9 = dev.epro.r0.R9411874267597469228.B0(r9)
            dev.epro.r0.N13196868278329319633 r9 = (dev.epro.r0.N13196868278329319633) r9
            boolean r10 = dev.epro.r0.I3887072968740112330.t(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            dev.epro.r0.U8657744197706684835 r2 = dev.epro.r0.U8657744197706684835.a
            goto Lb6
        Lb4:
            dev.epro.r0.U8657744197706684835 r2 = dev.epro.r0.U8657744197706684835.d
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T3899315400434788736.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3899315400434788736(N13196868278329319633 n13196868278329319633, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.x = n13196868278329319633;
    }
}
