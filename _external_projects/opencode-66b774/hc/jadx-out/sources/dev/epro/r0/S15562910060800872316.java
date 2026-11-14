package dev.epro.r0;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class S15562910060800872316 extends Dialog implements I4293432593871965076, U11782692406915154495, N8244753885299370799, F18341548724281518495 {
    public I1283052979100930176 a;
    public final V10300877997588547986 b;
    public final O12494175665883759871 c;
    public final O12494175665883759871 d;

    public S15562910060800872316(Context context, int i) {
        super(context, i);
        this.b = new V10300877997588547986(new U8000365519789522238(this, new N8306548196372912291(this, (byte) 14)));
        final byte b = 0;
        this.c = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.A16219122048370620608
            public final /* synthetic */ S15562910060800872316 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b2 = b;
                S15562910060800872316 s15562910060800872316 = this.b;
                switch (b2) {
                    case 0:
                        A3218799297244048918 a3218799297244048918 = new A3218799297244048918();
                        s15562910060800872316.c().l(a3218799297244048918);
                        return a3218799297244048918;
                    default:
                        return new U6333859635337865127(new W13948953340889349604(s15562910060800872316, (byte) 7));
                }
            }
        });
        final byte b2 = 1;
        this.d = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.A16219122048370620608
            public final /* synthetic */ S15562910060800872316 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b22 = b2;
                S15562910060800872316 s15562910060800872316 = this.b;
                switch (b22) {
                    case 0:
                        A3218799297244048918 a3218799297244048918 = new A3218799297244048918();
                        s15562910060800872316.c().l(a3218799297244048918);
                        return a3218799297244048918;
                    default:
                        return new U6333859635337865127(new W13948953340889349604(s15562910060800872316, (byte) 7));
                }
            }
        });
    }

    public static final void f(S15562910060800872316 s15562910060800872316) {
        super.onBackPressed();
    }

    @Override // dev.epro.r0.U11782692406915154495
    public final U6333859635337865127 a() {
        return (U6333859635337865127) this.d.getValue();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // dev.epro.r0.F18341548724281518495
    public final V10300877997588547986 b() {
        return (V10300877997588547986) this.b.c;
    }

    @Override // dev.epro.r0.N8244753885299370799
    public final J15730374346044043770 c() {
        return a().b().c;
    }

    public final I1283052979100930176 d() {
        I1283052979100930176 i1283052979100930176 = this.a;
        if (i1283052979100930176 != null) {
            return i1283052979100930176;
        }
        I1283052979100930176 i12830529791009301762 = new I1283052979100930176(this, true);
        this.a = i12830529791009301762;
        return i12830529791009301762;
    }

    public final void e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // dev.epro.r0.I4293432593871965076
    public final R3192876217964974737 j() {
        return d();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((A3218799297244048918) this.c.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            U6333859635337865127 u6333859635337865127A = a();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            u6333859635337865127A.d(onBackInvokedDispatcher);
        }
        this.b.v(bundle);
        d().e(P72364327365747079.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.w(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        d().e(P72364327365747079.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d().e(P72364327365747079.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }
}
