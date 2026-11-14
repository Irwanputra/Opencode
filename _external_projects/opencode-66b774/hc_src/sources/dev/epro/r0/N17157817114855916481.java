package dev.epro.r0;

import android.R;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import dev.epro.httpcustom.MainActivity;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N17157817114855916481 extends V10300877997588547986 {
    public M17382065452405895374 d;
    public final U15108547266844314449 e;

    public N17157817114855916481(MainActivity mainActivity) {
        super(mainActivity);
        this.e = new U15108547266844314449(this, mainActivity);
    }

    public static void H(SplashScreenView splashScreenView) {
        View rootView;
        splashScreenView.getClass();
        WindowInsets build = I9104972935492198939.f().build();
        build.getClass();
        Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        rootView = splashScreenView.getRootView();
        if (build == rootView.computeSystemWindowInsets(build, rect)) {
            rect.isEmpty();
        }
    }

    @Override // dev.epro.r0.V10300877997588547986
    public final void B(D1951813632017244428 d1951813632017244428) {
        this.c = d1951813632017244428;
        View findViewById = ((MainActivity) this.b).findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.d != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
        }
        M17382065452405895374 m17382065452405895374 = new M17382065452405895374(this, findViewById, (byte) 1);
        this.d = m17382065452405895374;
        viewTreeObserver.addOnPreDrawListener(m17382065452405895374);
    }

    @Override // dev.epro.r0.V10300877997588547986
    public final void r() {
        int i;
        MainActivity mainActivity = (MainActivity) this.b;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(net.zetetic.database.R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.e);
        }
    }
}
