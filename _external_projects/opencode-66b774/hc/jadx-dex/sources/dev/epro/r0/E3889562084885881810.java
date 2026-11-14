package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E3889562084885881810 extends dev.epro.r0.N5230833122018532994 {
    public final android.view.View B;
    public final dev.epro.r0.P13832034982779129365 C;
    public dev.epro.r0.R11800251031747375035 D;
    public dev.epro.r0.F4096073349764486348 E;
    public dev.epro.r0.F4096073349764486348 F;
    public dev.epro.r0.F4096073349764486348 G;

    /* JADX WARN: Multi-variable type inference failed */
    public E3889562084885881810(android.content.Context context, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.N4308732927120516147 n4308732927120516147, dev.epro.r0.P14826151584039718691 p14826151584039718691, int i, dev.epro.r0.Y633750919412282388 y633750919412282388) {
        android.view.View view = (android.view.View) f4096073349764486348.invoke(context);
        dev.epro.r0.P13832034982779129365 p13832034982779129365 = new dev.epro.r0.P13832034982779129365();
        super(context, n4308732927120516147, i, p13832034982779129365, view, y633750919412282388);
        this.B = view;
        this.C = p13832034982779129365;
        setClipChildren(false);
        java.lang.String strValueOf = java.lang.String.valueOf(i);
        java.lang.Object objE = p14826151584039718691 != null ? p14826151584039718691.e(strValueOf) : null;
        android.util.SparseArray<android.os.Parcelable> sparseArray = objE instanceof android.util.SparseArray ? (android.util.SparseArray) objE : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (p14826151584039718691 != null) {
            setSavableRegistryEntry(p14826151584039718691.f(strValueOf, new dev.epro.r0.T1769843459973694375(this, (byte) 2)));
        }
        dev.epro.r0.M14716691558468128220 m14716691558468128220 = dev.epro.r0.S10823041268949770285.a;
        this.E = m14716691558468128220;
        this.F = m14716691558468128220;
        this.G = m14716691558468128220;
    }

    public static final void n(dev.epro.r0.E3889562084885881810 e3889562084885881810) {
        e3889562084885881810.G.invoke(e3889562084885881810.B);
        e3889562084885881810.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(dev.epro.r0.R11800251031747375035 r11800251031747375035) {
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = this.D;
        if (i1632105416032993715 != null) {
            i1632105416032993715.x();
        }
        this.D = r11800251031747375035;
    }

    public final dev.epro.r0.P13832034982779129365 getDispatcher() {
        return this.C;
    }

    public final dev.epro.r0.F4096073349764486348 getReleaseBlock() {
        return this.G;
    }

    public final dev.epro.r0.F4096073349764486348 getResetBlock() {
        return this.F;
    }

    public /* bridge */ /* synthetic */ dev.epro.r0.O10944101174480148852 getSubCompositionView() {
        return null;
    }

    public final dev.epro.r0.F4096073349764486348 getUpdateBlock() {
        return this.E;
    }

    public final void setReleaseBlock(dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        this.G = f4096073349764486348;
        setRelease(new dev.epro.r0.T1769843459973694375(this, (byte) 3));
    }

    public final void setResetBlock(dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        this.F = f4096073349764486348;
        setReset(new dev.epro.r0.T1769843459973694375(this, (byte) 4));
    }

    public final void setUpdateBlock(dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        this.E = f4096073349764486348;
        setUpdate(new dev.epro.r0.T1769843459973694375(this, (byte) 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.view.View getViewRoot() {
        return this;
    }
}
