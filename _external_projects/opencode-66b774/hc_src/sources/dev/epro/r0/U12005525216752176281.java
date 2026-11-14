package dev.epro.r0;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.WeakHashMap;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class U12005525216752176281 extends C13374971588771233833 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final K6451967398688752533 S;
    public final F12843666193012269065 T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final F6942723054099263096 a0;
    public Dialog b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;

    public U12005525216752176281() {
        new U3594978070141619353((Object) this, (byte) 3);
        this.S = new K6451967398688752533(this);
        this.T = new F12843666193012269065(this);
        this.U = 0;
        this.V = 0;
        this.W = true;
        this.X = true;
        this.Y = -1;
        this.a0 = new F6942723054099263096((Object) this, (byte) 2);
        this.f0 = false;
    }

    public Dialog B() {
        return new S15562910060800872316(z(), this.V);
    }

    @Override // dev.epro.r0.C13374971588771233833
    public final C775827382551829194 c() {
        return new K13681188464640137371(this, new K13681188464640137371(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.c0 || this.d0) {
            return;
        }
        this.d0 = true;
        this.e0 = false;
        Dialog dialog = this.b0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.b0.dismiss();
        }
        this.c0 = true;
        if (this.Y >= 0) {
            P14575954172000745949 k = k();
            int i = this.Y;
            if (i < 0) {
                S10973172697741180971.j(G6547577305291411977.n(i, "Bad id: "));
                return;
            } else {
                k.v(new E10160310379137155518(k, i), true);
                this.Y = -1;
                return;
            }
        }
        W10130330342449691688 w10130330342449691688 = new W10130330342449691688(k());
        w10130330342449691688.f550o = true;
        P14575954172000745949 p14575954172000745949 = this.r;
        if (p14575954172000745949 == null || p14575954172000745949 == w10130330342449691688.p) {
            w10130330342449691688.b(new M12888013728560752810(3, this));
            w10130330342449691688.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // dev.epro.r0.C13374971588771233833
    public final void q(R13227154569034155950 r13227154569034155950) {
        W16122746836868022518 w16122746836868022518;
        super.q(r13227154569034155950);
        I1378617920849948703 i1378617920849948703 = this.M;
        i1378617920849948703.getClass();
        I1378617920849948703.a("observeForever");
        F6942723054099263096 f6942723054099263096 = this.a0;
        W16122746836868022518 w161227468368680225182 = new W16122746836868022518(i1378617920849948703, f6942723054099263096);
        K1186241071261229227 k1186241071261229227 = i1378617920849948703.b;
        D11758182151919292105 d11758182151919292105 = k1186241071261229227.a;
        while (d11758182151919292105 != null && !d11758182151919292105.a.equals(f6942723054099263096)) {
            d11758182151919292105 = d11758182151919292105.c;
        }
        if (d11758182151919292105 != null) {
            w16122746836868022518 = d11758182151919292105.b;
        } else {
            D11758182151919292105 d117581821519192921052 = new D11758182151919292105(f6942723054099263096, w161227468368680225182);
            k1186241071261229227.d++;
            D11758182151919292105 d117581821519192921053 = k1186241071261229227.b;
            if (d117581821519192921053 == null) {
                k1186241071261229227.a = d117581821519192921052;
                k1186241071261229227.b = d117581821519192921052;
            } else {
                d117581821519192921053.c = d117581821519192921052;
                d117581821519192921052.d = d117581821519192921053;
                k1186241071261229227.b = d117581821519192921052;
            }
            w16122746836868022518 = null;
        }
        if (w16122746836868022518 == null) {
            w161227468368680225182.a(true);
        }
        if (this.e0) {
            return;
        }
        this.d0 = false;
    }

    @Override // dev.epro.r0.C13374971588771233833
    public final void r(Bundle bundle) {
        Parcelable parcelable;
        this.C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.t.N(parcelable);
            P14575954172000745949 p14575954172000745949 = this.t;
            p14575954172000745949.E = false;
            p14575954172000745949.F = false;
            p14575954172000745949.L.g = false;
            p14575954172000745949.s(1);
        }
        P14575954172000745949 p145759541720007459492 = this.t;
        if (p145759541720007459492.s < 1) {
            p145759541720007459492.E = false;
            p145759541720007459492.F = false;
            p145759541720007459492.L.g = false;
            p145759541720007459492.s(1);
        }
        new Handler();
        this.X = this.w == 0;
        if (bundle != null) {
            this.U = bundle.getInt("android:style", 0);
            this.V = bundle.getInt("android:theme", 0);
            this.W = bundle.getBoolean("android:cancelable", true);
            this.X = bundle.getBoolean("android:showsDialog", this.X);
            this.Y = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // dev.epro.r0.C13374971588771233833
    public final void s() {
        this.C = true;
        Dialog dialog = this.b0;
        if (dialog != null) {
            this.c0 = true;
            dialog.setOnDismissListener(null);
            this.b0.dismiss();
            if (!this.d0) {
                onDismiss(this.b0);
            }
            this.b0 = null;
            this.f0 = false;
        }
    }

    @Override // dev.epro.r0.C13374971588771233833
    public final void t() {
        this.C = true;
        if (!this.e0 && !this.d0) {
            this.d0 = true;
        }
        I1378617920849948703 i1378617920849948703 = this.M;
        i1378617920849948703.getClass();
        I1378617920849948703.a("removeObserver");
        K1186241071261229227 k1186241071261229227 = i1378617920849948703.b;
        WeakHashMap weakHashMap = k1186241071261229227.c;
        D11758182151919292105 d11758182151919292105 = k1186241071261229227.a;
        while (d11758182151919292105 != null && !d11758182151919292105.a.equals(this.a0)) {
            d11758182151919292105 = d11758182151919292105.c;
        }
        W16122746836868022518 w16122746836868022518 = null;
        if (d11758182151919292105 != null) {
            k1186241071261229227.d--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((T1694598823106750438) it.next()).a(d11758182151919292105);
                }
            }
            D11758182151919292105 d117581821519192921052 = d11758182151919292105.d;
            D11758182151919292105 d117581821519192921053 = d11758182151919292105.c;
            if (d117581821519192921052 != null) {
                d117581821519192921052.c = d117581821519192921053;
            } else {
                k1186241071261229227.a = d117581821519192921053;
            }
            D11758182151919292105 d117581821519192921054 = d11758182151919292105.c;
            if (d117581821519192921054 != null) {
                d117581821519192921054.d = d117581821519192921052;
            } else {
                k1186241071261229227.b = d117581821519192921052;
            }
            d11758182151919292105.c = null;
            d11758182151919292105.d = null;
            w16122746836868022518 = d11758182151919292105.b;
        }
        if (w16122746836868022518 == null) {
            return;
        }
        w16122746836868022518.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:10:0x0017, B:12:0x0024, B:19:0x003d, B:23:0x0046, B:24:0x004e, B:26:0x0042, B:27:0x002f, B:29:0x0035, B:30:0x003a, B:31:0x0066), top: B:9:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:10:0x0017, B:12:0x0024, B:19:0x003d, B:23:0x0046, B:24:0x004e, B:26:0x0042, B:27:0x002f, B:29:0x0035, B:30:0x003a, B:31:0x0066), top: B:9:0x0017 }] */
    @Override // dev.epro.r0.C13374971588771233833
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater u(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = super.u(r7)
            boolean r0 = r6.X
            if (r0 == 0) goto L7b
            boolean r1 = r6.Z
            if (r1 == 0) goto Le
            goto L7b
        Le:
            if (r0 != 0) goto L11
            goto L6e
        L11:
            boolean r0 = r6.f0
            if (r0 != 0) goto L6e
            r0 = 0
            r1 = 1
            r6.Z = r1     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r2 = r6.B()     // Catch: java.lang.Throwable -> L4c
            r6.b0 = r2     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r6.X     // Catch: java.lang.Throwable -> L4c
            r4 = 0
            if (r3 == 0) goto L66
            int r3 = r6.U     // Catch: java.lang.Throwable -> L4c
            if (r3 == r1) goto L3a
            r5 = 2
            if (r3 == r5) goto L3a
            r5 = 3
            if (r3 == r5) goto L2f
            goto L3d
        L2f:
            android.view.Window r3 = r2.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L3a
            r5 = 24
            r3.addFlags(r5)     // Catch: java.lang.Throwable -> L4c
        L3a:
            r2.requestWindowFeature(r1)     // Catch: java.lang.Throwable -> L4c
        L3d:
            dev.epro.r0.C10994625127000459680 r2 = r6.s     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L42
            goto L44
        L42:
            dev.epro.r0.R13227154569034155950 r4 = r2.r     // Catch: java.lang.Throwable -> L4c
        L44:
            if (r4 == 0) goto L4e
            android.app.Dialog r2 = r6.b0     // Catch: java.lang.Throwable -> L4c
            r2.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r7 = move-exception
            goto L6b
        L4e:
            android.app.Dialog r2 = r6.b0     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r6.W     // Catch: java.lang.Throwable -> L4c
            r2.setCancelable(r3)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r2 = r6.b0     // Catch: java.lang.Throwable -> L4c
            dev.epro.r0.K6451967398688752533 r3 = r6.S     // Catch: java.lang.Throwable -> L4c
            r2.setOnCancelListener(r3)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r2 = r6.b0     // Catch: java.lang.Throwable -> L4c
            dev.epro.r0.F12843666193012269065 r3 = r6.T     // Catch: java.lang.Throwable -> L4c
            r2.setOnDismissListener(r3)     // Catch: java.lang.Throwable -> L4c
            r6.f0 = r1     // Catch: java.lang.Throwable -> L4c
            goto L68
        L66:
            r6.b0 = r4     // Catch: java.lang.Throwable -> L4c
        L68:
            r6.Z = r0
            goto L6e
        L6b:
            r6.Z = r0
            throw r7
        L6e:
            android.app.Dialog r6 = r6.b0
            if (r6 == 0) goto L7b
            android.content.Context r6 = r6.getContext()
            android.view.LayoutInflater r6 = r7.cloneInContext(r6)
            return r6
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U12005525216752176281.u(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // dev.epro.r0.C13374971588771233833
    public final void v(Bundle bundle) {
        Dialog dialog = this.b0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.U;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.V;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.W;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.X;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.Y;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // dev.epro.r0.C13374971588771233833
    public final void w() {
        this.C = true;
        Dialog dialog = this.b0;
        if (dialog != null) {
            this.c0 = false;
            dialog.show();
            View decorView = this.b0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // dev.epro.r0.C13374971588771233833
    public final void x() {
        this.C = true;
        Dialog dialog = this.b0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // dev.epro.r0.C13374971588771233833
    public final void y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.y(layoutInflater, viewGroup, bundle);
        if (this.b0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.b0.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
