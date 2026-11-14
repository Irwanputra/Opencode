package dev.epro.r0;

import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
        U6333859635337865127 a = a();
        L18340033906139995425 l18340033906139995425 = new L18340033906139995425(this, b);
        a.getClass();
        a.a(this, new U14177313425639231181(l18340033906139995425));
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
        boolean b = W10645948712581465792.b(this.g);
        int ordinal = y17711880887972520074.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                b = true;
            } else {
                if (ordinal != 2) {
                    Z3383101362411723454.g();
                    return;
                }
                b = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(b ? 8192 : -8193, 8192);
        int ordinal2 = f10342546226345611902.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
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

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int Z;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.f.getClass();
        D16659454241982226004 d16659454241982226004 = this.h;
        d16659454241982226004.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = d16659454241982226004.getChildAt(0)) != null) {
            int left = childAt.getLeft() + d16659454241982226004.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + d16659454241982226004.getTop();
            int height = childAt.getHeight() + top;
            int Z2 = T18016951143603335921.Z(motionEvent.getX());
            if (left <= Z2 && Z2 <= width && top <= (Z = T18016951143603335921.Z(motionEvent.getY())) && Z <= height) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                    this.i = false;
                    return onTouchEvent;
                }
                return onTouchEvent;
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.i = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.i = false;
                return onTouchEvent;
            }
        } else if (this.i) {
            this.e.invoke();
            this.i = false;
            return true;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
