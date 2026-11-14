package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D14923926280730703491 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ dev.epro.r0.R8694073888791625695[] A;
    public final /* synthetic */ dev.epro.r0.J16088445080955867036 B;
    public final /* synthetic */ dev.epro.r0.F6741456026889144139 C;
    public dev.epro.r0.R8694073888791625695[] t;
    public dev.epro.r0.J16088445080955867036 u;
    public dev.epro.r0.F6741456026889144139 v;
    public int w;
    public int x;
    public int y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D14923926280730703491(dev.epro.r0.R8694073888791625695[] r8694073888791625695Arr, dev.epro.r0.J16088445080955867036 j16088445080955867036, dev.epro.r0.F6741456026889144139 f6741456026889144139, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.A = r8694073888791625695Arr;
        this.B = j16088445080955867036;
        this.C = f6741456026889144139;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new dev.epro.r0.D14923926280730703491(this.A, this.B, this.C, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.B1062434985168244363) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r7.d(r6, r12, r11) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.z
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.y
            int r4 = r11.x
            int r5 = r11.w
            dev.epro.r0.F6741456026889144139 r6 = r11.v
            dev.epro.r0.J16088445080955867036 r7 = r11.u
            dev.epro.r0.R8694073888791625695[] r8 = r11.t
            dev.epro.r0.E17665849472693074628.k(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            return r1
        L21:
            dev.epro.r0.E17665849472693074628.k(r12)
            dev.epro.r0.R8694073888791625695[] r12 = r11.A
            int r0 = r12.length
            r4 = 0
            dev.epro.r0.J16088445080955867036 r5 = r11.B
            dev.epro.r0.F6741456026889144139 r6 = r11.C
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.t = r8
            r11.u = r7
            r11.v = r6
            r11.w = r9
            r11.x = r4
            r11.y = r0
            r11.z = r2
            java.lang.Object r12 = r7.e(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            dev.epro.r0.Z3383101362411723454.g()
            return r1
        L5d:
            r11.t = r8
            r11.u = r7
            r11.v = r6
            r11.w = r9
            r11.x = r4
            r11.y = r0
            r11.z = r3
            java.lang.Object r12 = r7.d(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            dev.epro.r0.O9245300239821758723 r11 = dev.epro.r0.O9245300239821758723.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D14923926280730703491.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
