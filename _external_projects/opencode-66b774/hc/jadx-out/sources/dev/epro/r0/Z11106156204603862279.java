package dev.epro.r0;

import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z11106156204603862279 extends S15562910060800872316 {
    public B13729205492206812220 e;
    public V11842483535419227802 f;
    public final View g;
    public final D16659454241982226004 h;
    public boolean i;

    public Z11106156204603862279(B13729205492206812220 b13729205492206812220, V11842483535419227802 v11842483535419227802, View view, F10342546226345611902 f10342546226345611902, R8540738700654750557 r8540738700654750557, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        this.e = b13729205492206812220;
        this.f = v11842483535419227802;
        this.g = view;
        Window window = getWindow();
        if (window == null) {
            S10973172697741180971.m("Dialog has no window");
            throw null;
        }
        V11842483535419227802 v118424835354192278022 = this.f;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            v118424835354192278022.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        byte b = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.f.getClass();
        E17665849472693074628.i(window, true);
        window.setGravity(17);
        this.f.getClass();
        D16659454241982226004 d16659454241982226004 = new D16659454241982226004(getContext(), window);
        this.f.getClass();
        setTitle("");
        d16659454241982226004.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        d16659454241982226004.setClipChildren(false);
        d16659454241982226004.setElevation(r8540738700654750557.K(8.0f));
        d16659454241982226004.setOutlineProvider(new U6068910839918238195((byte) 0));
        this.h = d16659454241982226004;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            g(viewGroup);
        }
        setContentView(d16659454241982226004);
        d16659454241982226004.setTag(R.id.view_tree_lifecycle_owner, U8836654130139556418.m(view));
        d16659454241982226004.setTag(R.id.view_tree_view_model_store_owner, E10717724117948616506.k(view));
        d16659454241982226004.setTag(R.id.view_tree_saved_state_registry_owner, C468629748621011703.h(view));
        h(this.e, this.f, f10342546226345611902);
        U6333859635337865127 u6333859635337865127A = a();
        L18340033906139995425 l18340033906139995425 = new L18340033906139995425(this, b);
        u6333859635337865127A.getClass();
        u6333859635337865127A.a(this, new U14177313425639231181(l18340033906139995425));
    }

    public static final void g(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof D16659454241982226004) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                g(viewGroup2);
            }
        }
    }

    public final void h(B13729205492206812220 b13729205492206812220, V11842483535419227802 v11842483535419227802, F10342546226345611902 f10342546226345611902) {
        int i;
        this.e = b13729205492206812220;
        this.f = v11842483535419227802;
        Y17711880887972520074 y17711880887972520074 = v11842483535419227802.a;
        boolean zB = W10645948712581465792.b(this.g);
        int iOrdinal = y17711880887972520074.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    Z3383101362411723454.g();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = f10342546226345611902.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                Z3383101362411723454.g();
                return;
            }
            i = 1;
        }
        D16659454241982226004 d16659454241982226004 = this.h;
        d16659454241982226004.setLayoutDirection(i);
        boolean z = v11842483535419227802.b;
        Window window2 = d16659454241982226004.j;
        boolean z2 = (d16659454241982226004.n && z == d16659454241982226004.l && true == d16659454241982226004.m) ? false : true;
        d16659454241982226004.l = z;
        d16659454241982226004.m = true;
        if (z2) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z ? -2 : -1;
            if (i2 != attributes.width || !d16659454241982226004.n) {
                window2.setLayout(i2, -2);
                d16659454241982226004.n = true;
            }
        }
        setCanceledOnTouchOutside(true);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(0);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f.getClass();
        if (!keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.e.invoke();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            dev.epro.r0.V11842483535419227802 r1 = r9.f
            r1.getClass()
            dev.epro.r0.D16659454241982226004 r1 = r9.h
            r1.getClass()
            float r2 = r10.getX()
            float r2 = java.lang.Math.abs(r2)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 3
            r5 = 0
            r6 = 1
            if (r2 > 0) goto L75
            float r2 = r10.getY()
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L75
            android.view.View r2 = r1.getChildAt(r5)
            if (r2 != 0) goto L33
            goto L75
        L33:
            int r3 = r1.getLeft()
            int r7 = r2.getLeft()
            int r7 = r7 + r3
            int r3 = r2.getWidth()
            int r3 = r3 + r7
            int r1 = r1.getTop()
            int r8 = r2.getTop()
            int r8 = r8 + r1
            int r1 = r2.getHeight()
            int r1 = r1 + r8
            float r2 = r10.getX()
            int r2 = dev.epro.r0.T18016951143603335921.Z(r2)
            if (r7 > r2) goto L75
            if (r2 > r3) goto L75
            float r2 = r10.getY()
            int r2 = dev.epro.r0.T18016951143603335921.Z(r2)
            if (r8 > r2) goto L75
            if (r2 > r1) goto L75
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L72
            if (r10 == r6) goto L72
            if (r10 == r4) goto L72
            goto L8f
        L72:
            r9.i = r5
            return r0
        L75:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L90
            if (r10 == r6) goto L83
            if (r10 == r4) goto L80
            goto L8f
        L80:
            r9.i = r5
            return r0
        L83:
            boolean r10 = r9.i
            if (r10 == 0) goto L8f
            dev.epro.r0.B13729205492206812220 r10 = r9.e
            r10.invoke()
            r9.i = r5
            return r6
        L8f:
            return r0
        L90:
            r9.i = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z11106156204603862279.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
