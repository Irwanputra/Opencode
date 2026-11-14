package dev.epro.r0;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K13763486024898229291 extends S15562910060800872316 {
    public B13729205492206812220 e;
    public R14415661131438974095 f;
    public long g;
    public final View h;
    public final P15244306345293739895 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K13763486024898229291(B13729205492206812220 b13729205492206812220, R14415661131438974095 r14415661131438974095, long j, View view, F10342546226345611902 f10342546226345611902, R8540738700654750557 r8540738700654750557, UUID uuid, U16834965109098959004 u16834965109098959004, W5797197595347441198 w5797197595347441198) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        boolean z = false;
        this.e = b13729205492206812220;
        this.f = r14415661131438974095;
        this.g = j;
        this.h = view;
        Window window = getWindow();
        if (window == null) {
            S10973172697741180971.m("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        E17665849472693074628.i(window, false);
        P15244306345293739895 p15244306345293739895 = new P15244306345293739895(getContext());
        p15244306345293739895.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        p15244306345293739895.setClipChildren(false);
        p15244306345293739895.setElevation(r8540738700654750557.K(8.0f));
        p15244306345293739895.setOutlineProvider(new U6068910839918238195((byte) 1));
        this.i = p15244306345293739895;
        setContentView(p15244306345293739895);
        p15244306345293739895.setTag(R.id.view_tree_lifecycle_owner, U8836654130139556418.m(view));
        p15244306345293739895.setTag(R.id.view_tree_view_model_store_owner, E10717724117948616506.k(view));
        p15244306345293739895.setTag(R.id.view_tree_saved_state_registry_owner, C468629748621011703.h(view));
        g(this.e, this.f, this.g, f10342546226345611902);
        M9197813449740923653 m9197813449740923653 = new M9197813449740923653(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        H4776669175763245653 s7186231212856355878 = i >= 35 ? new S7186231212856355878(window, m9197813449740923653) : i >= 30 ? new S3454875417302688768(window, m9197813449740923653) : i >= 26 ? new N17192714187392118750(window, m9197813449740923653) : new Z5540756766699434826(window, m9197813449740923653);
        this.f.getClass();
        long j2 = this.g;
        long j3 = U10174709222559481877.g;
        s7186231212856355878.n(!P15388715743159210616.a(j2, j3) && ((double) J8045362843799184672.k0(j2)) <= 0.5d);
        this.f.getClass();
        if (!P15388715743159210616.a(this.g, j3) && J8045362843799184672.k0(r3) <= 0.5d) {
            z = true;
        }
        s7186231212856355878.m(z);
        U6333859635337865127 a = a();
        this.f.getClass();
        a.a(this, new A16333291076997953260(w5797197595347441198, u16834965109098959004, new W2269277550458425547(this, (byte) 13)));
    }

    public final void g(B13729205492206812220 b13729205492206812220, R14415661131438974095 r14415661131438974095, long j, F10342546226345611902 f10342546226345611902) {
        this.e = b13729205492206812220;
        this.f = r14415661131438974095;
        this.g = j;
        r14415661131438974095.getClass();
        ViewGroup.LayoutParams layoutParams = this.h.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int ordinal = f10342546226345611902.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            Z3383101362411723454.g();
            return;
        }
        this.i.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.e.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
