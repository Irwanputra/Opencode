package dev.epro.r0;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E3889562084885881810 extends N5230833122018532994 {
    public final View B;
    public final P13832034982779129365 C;
    public R11800251031747375035 D;
    public F4096073349764486348 E;
    public F4096073349764486348 F;
    public F4096073349764486348 G;

    public E3889562084885881810(Context context, F4096073349764486348 f4096073349764486348, N4308732927120516147 n4308732927120516147, P14826151584039718691 p14826151584039718691, int i, Y633750919412282388 y633750919412282388) {
        View view = (View) f4096073349764486348.invoke(context);
        P13832034982779129365 p13832034982779129365 = new P13832034982779129365();
        super(context, n4308732927120516147, i, p13832034982779129365, view, y633750919412282388);
        this.B = view;
        this.C = p13832034982779129365;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objE = p14826151584039718691 != null ? p14826151584039718691.e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (p14826151584039718691 != null) {
            setSavableRegistryEntry(p14826151584039718691.f(strValueOf, new T1769843459973694375(this, (byte) 2)));
        }
        M14716691558468128220 m14716691558468128220 = S10823041268949770285.a;
        this.E = m14716691558468128220;
        this.F = m14716691558468128220;
        this.G = m14716691558468128220;
    }

    public static final void n(E3889562084885881810 e3889562084885881810) {
        e3889562084885881810.G.invoke(e3889562084885881810.B);
        e3889562084885881810.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(R11800251031747375035 r11800251031747375035) {
        R11800251031747375035 r118002510317473750352 = this.D;
        if (r118002510317473750352 != null) {
            ((I1632105416032993715) r118002510317473750352).x();
        }
        this.D = r11800251031747375035;
    }

    public final P13832034982779129365 getDispatcher() {
        return this.C;
    }

    public final F4096073349764486348 getReleaseBlock() {
        return this.G;
    }

    public final F4096073349764486348 getResetBlock() {
        return this.F;
    }

    public /* bridge */ /* synthetic */ O10944101174480148852 getSubCompositionView() {
        return null;
    }

    public final F4096073349764486348 getUpdateBlock() {
        return this.E;
    }

    public final void setReleaseBlock(F4096073349764486348 f4096073349764486348) {
        this.G = f4096073349764486348;
        setRelease(new T1769843459973694375(this, (byte) 3));
    }

    public final void setResetBlock(F4096073349764486348 f4096073349764486348) {
        this.F = f4096073349764486348;
        setReset(new T1769843459973694375(this, (byte) 4));
    }

    public final void setUpdateBlock(F4096073349764486348 f4096073349764486348) {
        this.E = f4096073349764486348;
        setUpdate(new T1769843459973694375(this, (byte) 5));
    }

    public View getViewRoot() {
        return this;
    }
}
