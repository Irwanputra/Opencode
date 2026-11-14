package ads_mobile_sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames;
import dev.epro.r0.E10717724117948616506;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.T18016951143603335921;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class zv1 {
    public final Context a;
    public final jr0 b;
    public final ci3 c;

    public zv1(Context context, jr0 jr0Var, ci3 ci3Var) {
        context.getClass();
        jr0Var.getClass();
        ci3Var.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = ci3Var;
    }

    public final I16631908410500040363 a(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map) {
        ViewGroup.LayoutParams layoutParams;
        ao aoVar = ao.a$11;
        char c = 0;
        scaleType.getClass();
        if (frameLayout == null) {
            return new I16631908410500040363();
        }
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        int i = 2;
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null) {
                int[] iArr2 = new int[i];
                view.getLocationOnScreen(iArr2);
                I16631908410500040363 i166319084105000403632 = new I16631908410500040363();
                I16631908410500040363 i166319084105000403633 = new I16631908410500040363();
                int measuredWidth = view.getMeasuredWidth();
                Context context = this.a;
                i166319084105000403633.s("width", Integer.valueOf(E10717724117948616506.f(context, measuredWidth)));
                char c2 = c;
                i166319084105000403633.s("height", Integer.valueOf(E10717724117948616506.f(context, view.getMeasuredHeight())));
                i166319084105000403633.s("x", Integer.valueOf(E10717724117948616506.f(context, iArr2[c2] - iArr[c2])));
                Iterator it2 = it;
                i166319084105000403633.s("y", Integer.valueOf(E10717724117948616506.f(context, iArr2[1] - iArr[1])));
                int[] iArr3 = iArr;
                i166319084105000403633.t("relative_to", "ad_view");
                i166319084105000403632.q("frame", i166319084105000403633);
                I16631908410500040363 i166319084105000403634 = new I16631908410500040363();
                Rect rect = new Rect();
                if (view.getLocalVisibleRect(rect)) {
                    i166319084105000403634 = a(context, rect);
                } else {
                    i166319084105000403634.s("width", 0);
                    i166319084105000403634.s("height", 0);
                    i166319084105000403634.s("x", Integer.valueOf(E10717724117948616506.f(context, iArr2[c2] - iArr3[c2])));
                    i166319084105000403634.s("y", Integer.valueOf(E10717724117948616506.f(context, iArr2[1] - iArr3[1])));
                    i166319084105000403634.t("relative_to", "ad_view");
                }
                i166319084105000403632.q("visible_bounds", i166319084105000403634);
                boolean zT = S10823041268949770285.t(str, NativeAdAssetNames.ASSET_MEDIA_CONTENT);
                jr0 jr0Var = this.b;
                if (zT) {
                    i166319084105000403632.t("mediaview_graphics_matrix", view.getMatrix().toShortString());
                    Boolean bool = Boolean.FALSE;
                    if (((Boolean) jr0Var.a("gads:nas_collect_layout_params:enabled", bool, aoVar)).booleanValue() && (layoutParams = view.getLayoutParams()) != null) {
                        i166319084105000403632.s("view_width_layout_type", Integer.valueOf(L11610354117192841236.A(a(layoutParams.width))));
                        i166319084105000403632.s("view_height_layout_type", Integer.valueOf(L11610354117192841236.A(a(layoutParams.height))));
                    }
                    if (((Boolean) jr0Var.a("gads:nas_collect_view_path:enabled", bool, aoVar)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(view.getId()));
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            arrayList.add(Integer.valueOf(((View) parent).getId()));
                        }
                        i166319084105000403632.t("view_path", R9411874267597469228.J0(arrayList, "/", null, null, 0, null, 62));
                    }
                    i166319084105000403632.s("mediaview_scale_type", Integer.valueOf(scaleType.ordinal()));
                }
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    i166319084105000403632.s("text_color", Integer.valueOf(textView.getCurrentTextColor()));
                    i166319084105000403632.s("font_size", Float.valueOf(textView.getTextSize()));
                    i166319084105000403632.t("text", textView.getText().toString());
                }
                i166319084105000403632.r("is_clickable", Boolean.valueOf(view.isClickable()));
                if (((Boolean) jr0Var.a("gads:nas_collect_alpha:enabled", Boolean.TRUE, aoVar)).booleanValue()) {
                    i166319084105000403632.s("alpha", Float.valueOf(view.getAlpha()));
                }
                i16631908410500040363.q(str, i166319084105000403632);
                it = it2;
                c = c2;
                iArr = iArr3;
                i = 2;
            }
        }
        return i16631908410500040363;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final I16631908410500040363 b(FrameLayout frameLayout) {
        int i;
        jr0 jr0Var;
        char c;
        ao aoVar = ao.a$11;
        if (frameLayout == null) {
            return new I16631908410500040363();
        }
        ViewParent parent = frameLayout.getParent();
        loop0: while (true) {
            i = 5;
            jr0Var = this.b;
            if (parent == null) {
                c = 1;
                break;
            }
            if (parent instanceof ScrollView) {
                c = 2;
                break;
            }
            if (parent instanceof AbsListView) {
                c = 3;
                break;
            }
            if (parent instanceof HorizontalScrollView) {
                c = 4;
                break;
            }
            if (parent instanceof NestedScrollView) {
                c = 5;
                break;
            }
            jr0Var.getClass();
            if (((Boolean) jr0Var.a("gads:native:enable_scroll_view_type_by_keyword", Boolean.FALSE, aoVar)).booleanValue()) {
                for (String str : (List) jr0Var.a("gads:native:scrollable_container_keywords", K5751602218013079365.V("recycler", "viewflipper"), ao.a$23)) {
                    String lowerCase = parent.getClass().getName().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (M8927913404651150384.L(lowerCase, str, false)) {
                        c = 6;
                        break loop0;
                    }
                }
            }
            parent = parent.getParent();
        }
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        jr0Var.getClass();
        Boolean bool = Boolean.TRUE;
        if (((Boolean) jr0Var.a("gads:native:enable_contained_in_scroll_view_signal", bool, aoVar)).booleanValue()) {
            i16631908410500040363.r("contained_in_scroll_view", Boolean.valueOf(c != 1));
        }
        if (((Boolean) jr0Var.a("gads:native:enable_scroll_view_type_signal", bool, aoVar)).booleanValue()) {
            switch (c) {
                case 1:
                    i = 0;
                    i16631908410500040363.s("scroll_view_type", Integer.valueOf(i));
                    break;
                case 2:
                    i = 1;
                    i16631908410500040363.s("scroll_view_type", Integer.valueOf(i));
                    break;
                case 3:
                    i = 2;
                    i16631908410500040363.s("scroll_view_type", Integer.valueOf(i));
                    break;
                case 4:
                    i = 3;
                    i16631908410500040363.s("scroll_view_type", Integer.valueOf(i));
                    break;
                case 5:
                    i = 4;
                    i16631908410500040363.s("scroll_view_type", Integer.valueOf(i));
                    break;
                case 6:
                    i16631908410500040363.s("scroll_view_type", Integer.valueOf(i));
                    break;
                default:
                    throw null;
            }
        }
        return i16631908410500040363;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.I16631908410500040363 c(android.widget.FrameLayout r18) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zv1.c(android.widget.FrameLayout):dev.epro.r0.I16631908410500040363");
    }

    public static int a(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    public final I16631908410500040363 a(String str, Point point, Point point2) {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        int i = point2.x;
        Context context = this.a;
        i16631908410500040363.s("x", Integer.valueOf(E10717724117948616506.f(context, i)));
        i16631908410500040363.s("y", Integer.valueOf(E10717724117948616506.f(context, point2.y)));
        i16631908410500040363.s("start_x", Integer.valueOf(E10717724117948616506.f(context, point.x)));
        i16631908410500040363.s("start_y", Integer.valueOf(E10717724117948616506.f(context, point.y)));
        I16631908410500040363 i166319084105000403632 = new I16631908410500040363();
        i166319084105000403632.q("click_point", i16631908410500040363);
        i166319084105000403632.t("asset_id", str);
        return i166319084105000403632;
    }

    public final I16631908410500040363 a(FrameLayout frameLayout) {
        Window window;
        if (frameLayout != null) {
            I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
            View rootView = frameLayout.getRootView();
            Context context = rootView != null ? rootView.getContext() : null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            WindowManager.LayoutParams attributes = (activity == null || (window = activity.getWindow()) == null) ? null : window.getAttributes();
            i16631908410500040363.r("can_show_on_lock_screen", Boolean.valueOf((attributes == null || (attributes.flags & 524288) == 0) ? false : true));
            KeyguardManager keyguardManager = (KeyguardManager) this.a.getSystemService(KeyguardManager.class);
            i16631908410500040363.r("is_keyguard_locked", keyguardManager != null ? Boolean.valueOf(keyguardManager.isKeyguardLocked()) : null);
            return i16631908410500040363;
        }
        return new I16631908410500040363();
    }

    public final I16631908410500040363 a() {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        Context context = this.a;
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        float f = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        i16631908410500040363.s("width", Integer.valueOf(T18016951143603335921.Z(f / displayMetrics2.density)));
        context.getClass();
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        float f2 = displayMetrics3.heightPixels;
        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        displayMetrics4.getClass();
        i16631908410500040363.s("height", Integer.valueOf(T18016951143603335921.Z(f2 / displayMetrics4.density)));
        return i16631908410500040363;
    }

    public static I16631908410500040363 a(Context context, Rect rect) {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        int i = rect.right - rect.left;
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        i16631908410500040363.s("width", Integer.valueOf(T18016951143603335921.Z(i / displayMetrics.density)));
        float f = rect.bottom - rect.top;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        i16631908410500040363.s("height", Integer.valueOf(T18016951143603335921.Z(f / displayMetrics2.density)));
        float f2 = rect.left;
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        i16631908410500040363.s("x", Integer.valueOf(T18016951143603335921.Z(f2 / displayMetrics3.density)));
        float f3 = rect.top;
        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        displayMetrics4.getClass();
        i16631908410500040363.s("y", Integer.valueOf(T18016951143603335921.Z(f3 / displayMetrics4.density)));
        i16631908410500040363.t("relative_to", "self");
        return i16631908410500040363;
    }
}
