package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C13057135431387016944 extends R14062301455140331524 implements L12639328004344855510 {
    public R8015591507171738907 t;
    public Object u;
    public E8130113249282715849 v;
    public byte w;
    public /* synthetic */ Object x;
    public final /* synthetic */ E8130113249282715849 y;
    public final /* synthetic */ F4096073349764486348 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13057135431387016944(E8130113249282715849 e8130113249282715849, F4096073349764486348 f4096073349764486348, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.y = e8130113249282715849;
        this.z = f4096073349764486348;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        C13057135431387016944 c13057135431387016944 = new C13057135431387016944(this.y, this.z, r4833348786910499294);
        c13057135431387016944.x = obj;
        return c13057135431387016944;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((C13057135431387016944) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // dev.epro.r0.B401944902727389462
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C13057135431387016944.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
