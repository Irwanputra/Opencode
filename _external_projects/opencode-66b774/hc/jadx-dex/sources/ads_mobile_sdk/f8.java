package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class f8 implements dev.epro.r0.K4548097313143615345, dev.epro.r0.H7244645155502647900 {
    public final java.lang.Object a;
    public java.lang.Object b;
    public ads_mobile_sdk.qw2 c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public final /* synthetic */ byte g = 2;

    public f8(ads_mobile_sdk.jr0 jr0Var, java.util.Optional optional, java.util.Optional optional2, ads_mobile_sdk.i03 i03Var, ads_mobile_sdk.qw2 qw2Var, dev.epro.r0.U4857089234315512256 u4857089234315512256) {
        jr0Var.getClass();
        optional.getClass();
        optional2.getClass();
        i03Var.getClass();
        qw2Var.getClass();
        u4857089234315512256.getClass();
        this.a = optional;
        this.b = optional2;
        this.d = i03Var;
        this.c = qw2Var;
        this.e = u4857089234315512256;
        this.f = (java.util.List) jr0Var.a("gad:scar_rtb_signal:enabled_list", dev.epro.r0.K5751602218013079365.U("8"), ads_mobile_sdk.ao.a$23);
    }

    public int a(int i) {
        float fA;
        float f = i;
        android.util.DisplayMetrics displayMetrics = ((android.content.Context) this.d).getResources().getDisplayMetrics();
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            fA = dev.epro.r0.H3737085483209546534.a(f, displayMetrics);
        } else {
            float f2 = displayMetrics.density;
            fA = f2 == 0.0f ? 0.0f : f / f2;
        }
        return (int) java.lang.Math.ceil(fA);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public java.lang.Object m5a() {
        throw null;
    }

    public java.lang.Object a(dev.epro.r0.S4967920478913205567 s4967920478913205567) {
        throw null;
    }

    public java.lang.Object a(dev.epro.r0.U4857089234315512256 u4857089234315512256) {
        throw null;
    }

    public java.lang.Object a$1() {
        throw null;
    }

    public java.lang.Object b(boolean z) {
        throw null;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public java.lang.Object d(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public ads_mobile_sdk.cw0 a() {
        switch (this.g) {
            case 0:
                return ads_mobile_sdk.cw0.AD_SIZE;
            default:
                return ads_mobile_sdk.cw0.RTB_SIGNAL;
        }
    }

    public f8(java.util.Optional optional, java.util.Optional optional2, ads_mobile_sdk.qw2 qw2Var, android.content.Context context, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.dj0 dj0Var) {
        optional.getClass();
        optional2.getClass();
        qw2Var.getClass();
        context.getClass();
        jr0Var.getClass();
        dj0Var.getClass();
        this.a = optional;
        this.b = optional2;
        this.c = qw2Var;
        this.d = context;
        this.e = jr0Var;
        this.f = dj0Var;
    }

    public f8(ads_mobile_sdk.db0 db0Var) {
        this.a = db0Var;
    }
}
