package dev.epro.r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O8953140192291099683 {
    public final Context a;
    public final B9683044498301182575 b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public Button f;
    public Button g;
    public Button h;
    public NestedScrollView i;
    public Drawable j;
    public ImageView k;
    public TextView l;
    public TextView m;
    public View n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f418o;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final L3074996211714236562 v;
    public int p = -1;
    public final G17185360867502361524 w = new G17185360867502361524(this, 1);

    public O8953140192291099683(Context context, B9683044498301182575 b9683044498301182575, Window window) {
        this.a = context;
        this.b = b9683044498301182575;
        this.c = window;
        L3074996211714236562 l3074996211714236562 = new L3074996211714236562();
        l3074996211714236562.a = new WeakReference(b9683044498301182575);
        this.v = l3074996211714236562;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, Y17304307076558258116.e, R.attr.alertDialogStyle, 0);
        this.q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.s = obtainStyledAttributes.getResourceId(7, 0);
        this.t = obtainStyledAttributes.getResourceId(3, 0);
        this.u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b9683044498301182575.g().e(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
