package p131.p161.p211.p214.p215;

import java.util.Map;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2531;
import p131.p161.p211.InterfaceC2653;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.EnumC2533;
import p131.p161.p211.p214.C2547;
import p131.p161.p211.p214.C2622;
import p131.p161.p211.p214.InterfaceC2629;
import p131.p161.p211.p214.p217.AbstractC2645;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2557 implements InterfaceC2656 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2547 f9932;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InterfaceC2653 f9933;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C2614 f9934;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final AbstractC2645 f9935 = AbstractC2645.f10101;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2622 f9936;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.いいにぽつ$〺つふすそ, reason: contains not printable characters */
    public static abstract class AbstractC2558 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final boolean f9937;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final boolean f9938;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final String f9939;

        public AbstractC2558(String str, boolean z, boolean z2) {
            this.f9939 = str;
            this.f9937 = z;
            this.f9938 = z2;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public abstract void mo4594(C2534 c2534, Object obj);

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public abstract boolean mo4595(Object obj);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public abstract void mo4596(C2535 c2535, Object obj);
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.いいにぽつ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C2559<T> extends AbstractC2658<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Map<String, AbstractC2558> f9940;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final InterfaceC2629<T> f9941;

        public C2559(InterfaceC2629<T> interfaceC2629, Map<String, AbstractC2558> map) {
            this.f9941 = interfaceC2629;
            this.f9940 = map;
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: 〺つふすそ */
        public void mo4533(C2534 c2534, T t) {
            if (t == null) {
                c2534.mo4541();
                return;
            }
            c2534.mo4543();
            try {
                for (AbstractC2558 abstractC2558 : this.f9940.values()) {
                    if (abstractC2558.mo4595(t)) {
                        c2534.mo4544(abstractC2558.f9939);
                        abstractC2558.mo4594(c2534, t);
                    }
                }
                c2534.mo4545();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: げつ〴ぬぐ */
        public T mo4534(C2535 c2535) {
            if (c2535.mo4559() == EnumC2533.NULL) {
                c2535.mo4572();
                return null;
            }
            T mo4589 = this.f9941.mo4589();
            try {
                c2535.mo4585();
                while (c2535.mo4563()) {
                    AbstractC2558 abstractC2558 = this.f9940.get(c2535.mo4582());
                    if (abstractC2558 != null && abstractC2558.f9938) {
                        abstractC2558.mo4596(c2535, mo4589);
                    }
                    c2535.mo4581();
                }
                c2535.mo4570();
                return mo4589;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new C2531(e2);
            }
        }
    }

    public C2557(C2547 c2547, InterfaceC2653 interfaceC2653, C2622 c2622, C2614 c2614) {
        this.f9932 = c2547;
        this.f9933 = interfaceC2653;
        this.f9936 = c2622;
        this.f9934 = c2614;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m4593(java.lang.reflect.Field r6, boolean r7) {
        /*
            r5 = this;
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.おぐぴう〸ず r0 = r5.f9936
            java.lang.Class r1 = r6.getType()
            boolean r2 = r0.m4612(r1)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L17
            boolean r1 = r0.m4611(r1, r7)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            if (r1 != 0) goto L63
            int r1 = r6.getModifiers()
            r1 = r1 & 136(0x88, float:1.9E-43)
            if (r1 == 0) goto L23
            goto L5d
        L23:
            boolean r1 = r6.isSynthetic()
            if (r1 == 0) goto L2a
            goto L5d
        L2a:
            java.lang.Class r1 = r6.getType()
            boolean r1 = r0.m4612(r1)
            if (r1 == 0) goto L35
            goto L5d
        L35:
            if (r7 == 0) goto L3a
            java.util.List<なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.〺つふすそ> r7 = r0.f10056
            goto L3c
        L3a:
            java.util.List<なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.〺つふすそ> r7 = r0.f10057
        L3c:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L5f
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.くし〴〺ぅ r0 = new なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.くし〴〺ぅ
            r0.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L4b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5f
            java.lang.Object r7 = r6.next()
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.〺つふすそ r7 = (p131.p161.p211.InterfaceC2521) r7
            boolean r7 = r7.m4535(r0)
            if (r7 == 0) goto L4b
        L5d:
            r6 = 1
            goto L60
        L5f:
            r6 = 0
        L60:
            if (r6 != 0) goto L63
            goto L64
        L63:
            r3 = 0
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.p214.p215.C2557.m4593(java.lang.reflect.Field, boolean):boolean");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // p131.p161.p211.InterfaceC2656
    /* renamed from: げつ〴ぬぐ */
    public <T> p131.p161.p211.AbstractC2658<T> mo4592(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
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
}
