package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import dev.epro.r0.H3737085483209546534;
import dev.epro.r0.H7244645155502647900;
import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.S4967920478913205567;
import dev.epro.r0.U4857089234315512256;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class f8 implements K4548097313143615345, H7244645155502647900 {
    public final Object a;
    public Object b;
    public qw2 c;
    public Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ byte g = 2;

    public f8(jr0 jr0Var, Optional optional, Optional optional2, i03 i03Var, qw2 qw2Var, U4857089234315512256 u4857089234315512256) {
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
        this.f = (List) jr0Var.a("gad:scar_rtb_signal:enabled_list", K5751602218013079365.U("8"), ao.a$23);
    }

    public int a(int i) {
        float f;
        float f2 = i;
        DisplayMetrics displayMetrics = ((Context) this.d).getResources().getDisplayMetrics();
        if (Build.VERSION.SDK_INT >= 34) {
            f = H3737085483209546534.a(f2, displayMetrics);
        } else {
            float f3 = displayMetrics.density;
            f = f3 == 0.0f ? 0.0f : f2 / f3;
        }
        return (int) Math.ceil(f);
    }

    @Override // dev.epro.r0.H7244645155502647900
    /* renamed from: a */
    public Object mo2a() {
        throw null;
    }

    @Override // dev.epro.r0.H7244645155502647900
    public Object a(S4967920478913205567 s4967920478913205567) {
        throw null;
    }

    @Override // dev.epro.r0.H7244645155502647900
    public Object a(U4857089234315512256 u4857089234315512256) {
        throw null;
    }

    @Override // dev.epro.r0.H7244645155502647900
    public Object a$1() {
        throw null;
    }

    @Override // dev.epro.r0.H7244645155502647900
    public Object b(boolean z) {
        throw null;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // dev.epro.r0.K4548097313143615345
    public java.lang.Object d(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
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

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public cw0 mo19a() {
        switch (this.g) {
            case 0:
                return cw0.AD_SIZE;
            default:
                return cw0.RTB_SIGNAL;
        }
    }

    public f8(Optional optional, Optional optional2, qw2 qw2Var, Context context, jr0 jr0Var, dj0 dj0Var) {
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

    public f8(db0 db0Var) {
        this.a = db0Var;
    }
}
