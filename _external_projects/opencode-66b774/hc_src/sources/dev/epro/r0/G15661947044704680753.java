package dev.epro.r0;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G15661947044704680753 implements P1187139614085405202, DialogInterface.OnClickListener {
    public B9683044498301182575 a;
    public B16530580336360837432 b;
    public CharSequence c;
    public final /* synthetic */ T4056244775750501969 d;

    public G15661947044704680753(T4056244775750501969 t4056244775750501969) {
        this.d = t4056244775750501969;
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final boolean b() {
        B9683044498301182575 b9683044498301182575 = this.a;
        if (b9683044498301182575 != null) {
            return b9683044498301182575.isShowing();
        }
        return false;
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final int c() {
        return 0;
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void dismiss() {
        B9683044498301182575 b9683044498301182575 = this.a;
        if (b9683044498301182575 != null) {
            b9683044498301182575.dismiss();
            this.a = null;
        }
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final Drawable f() {
        return null;
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void m(int i, int i2) {
        if (this.b == null) {
            return;
        }
        T4056244775750501969 t4056244775750501969 = this.d;
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836(t4056244775750501969.getPopupContext());
        V4825737980590471194 v4825737980590471194 = (V4825737980590471194) t17032536773975598836.b;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            v4825737980590471194.d = charSequence;
        }
        B16530580336360837432 b16530580336360837432 = this.b;
        int selectedItemPosition = t4056244775750501969.getSelectedItemPosition();
        v4825737980590471194.g = b16530580336360837432;
        v4825737980590471194.h = this;
        v4825737980590471194.j = selectedItemPosition;
        v4825737980590471194.i = true;
        B9683044498301182575 d = t17032536773975598836.d();
        this.a = d;
        AlertController$RecycleListView alertController$RecycleListView = d.g.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final int n() {
        return 0;
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final CharSequence o() {
        return this.c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        T4056244775750501969 t4056244775750501969 = this.d;
        t4056244775750501969.setSelection(i);
        if (t4056244775750501969.getOnItemClickListener() != null) {
            t4056244775750501969.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void p(ListAdapter listAdapter) {
        this.b = (B16530580336360837432) listAdapter;
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void i(Drawable drawable) {
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void j(int i) {
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void k(int i) {
    }

    @Override // dev.epro.r0.P1187139614085405202
    public final void l(int i) {
    }
}
