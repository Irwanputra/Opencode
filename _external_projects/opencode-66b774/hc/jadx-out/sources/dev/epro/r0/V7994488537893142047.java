package dev.epro.r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V7994488537893142047 extends L9028203031476232898 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final V3347111345872287314 f = new V3347111345872287314();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, Q12598757537405990809 q12598757537405990809) {
        F3160751278268780235 f3160751278268780235J = j(view);
        if (f3160751278268780235J != null) {
            f3160751278268780235J.d(q12598757537405990809);
            if (f3160751278268780235J.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), q12598757537405990809);
            }
        }
    }

    public static void g(View view, Q12598757537405990809 q12598757537405990809, N3121440022506799205 n3121440022506799205, boolean z) {
        F3160751278268780235 f3160751278268780235J = j(view);
        if (f3160751278268780235J != null) {
            f3160751278268780235J.b = n3121440022506799205;
            if (!z) {
                f3160751278268780235J.e(q12598757537405990809);
                z = f3160751278268780235J.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), q12598757537405990809, n3121440022506799205, z);
            }
        }
    }

    public static void h(View view, N3121440022506799205 n3121440022506799205, List list) {
        F3160751278268780235 f3160751278268780235J = j(view);
        if (f3160751278268780235J != null) {
            n3121440022506799205 = f3160751278268780235J.f(n3121440022506799205, list);
            if (f3160751278268780235J.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), n3121440022506799205, list);
            }
        }
    }

    public static void i(View view, Q12598757537405990809 q12598757537405990809, V10300877997588547986 v10300877997588547986) {
        F3160751278268780235 f3160751278268780235J = j(view);
        if (f3160751278268780235J != null) {
            f3160751278268780235J.g(q12598757537405990809, v10300877997588547986);
            if (f3160751278268780235J.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), q12598757537405990809, v10300877997588547986);
            }
        }
    }

    public static F3160751278268780235 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof F6507052717076293065) {
            return ((F6507052717076293065) tag).a;
        }
        return null;
    }
}
