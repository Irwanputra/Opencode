package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zv1 {
    public final android.content.Context a;
    public final ads_mobile_sdk.jr0 b;
    public final ads_mobile_sdk.ci3 c;

    public zv1(android.content.Context context, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.ci3 ci3Var) {
        context.getClass();
        jr0Var.getClass();
        ci3Var.getClass();
        this.a = context;
        this.b = jr0Var;
        this.c = ci3Var;
    }

    public final dev.epro.r0.I16631908410500040363 a(android.widget.FrameLayout frameLayout, android.widget.ImageView.ScaleType scaleType, java.util.Map map) {
        android.view.ViewGroup.LayoutParams layoutParams;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        char c = 0;
        scaleType.getClass();
        if (frameLayout == null) {
            return new dev.epro.r0.I16631908410500040363();
        }
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        int i = 2;
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (view != null) {
                int[] iArr2 = new int[i];
                view.getLocationOnScreen(iArr2);
                dev.epro.r0.I16631908410500040363 i166319084105000403632 = new dev.epro.r0.I16631908410500040363();
                dev.epro.r0.I16631908410500040363 i166319084105000403633 = new dev.epro.r0.I16631908410500040363();
                int measuredWidth = view.getMeasuredWidth();
                android.content.Context context = this.a;
                i166319084105000403633.s("width", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, measuredWidth)));
                char c2 = c;
                i166319084105000403633.s("height", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, view.getMeasuredHeight())));
                i166319084105000403633.s("x", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, iArr2[c2] - iArr[c2])));
                java.util.Iterator it2 = it;
                i166319084105000403633.s("y", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, iArr2[1] - iArr[1])));
                int[] iArr3 = iArr;
                i166319084105000403633.t("relative_to", "ad_view");
                i166319084105000403632.q("frame", i166319084105000403633);
                dev.epro.r0.I16631908410500040363 i166319084105000403634 = new dev.epro.r0.I16631908410500040363();
                android.graphics.Rect rect = new android.graphics.Rect();
                if (view.getLocalVisibleRect(rect)) {
                    i166319084105000403634 = a(context, rect);
                } else {
                    i166319084105000403634.s("width", 0);
                    i166319084105000403634.s("height", 0);
                    i166319084105000403634.s("x", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, iArr2[c2] - iArr3[c2])));
                    i166319084105000403634.s("y", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, iArr2[1] - iArr3[1])));
                    i166319084105000403634.t("relative_to", "ad_view");
                }
                i166319084105000403632.q("visible_bounds", i166319084105000403634);
                boolean zT = dev.epro.r0.S10823041268949770285.t(str, com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames.ASSET_MEDIA_CONTENT);
                ads_mobile_sdk.jr0 jr0Var = this.b;
                if (zT) {
                    i166319084105000403632.t("mediaview_graphics_matrix", view.getMatrix().toShortString());
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    if (((java.lang.Boolean) jr0Var.a("gads:nas_collect_layout_params:enabled", bool, aoVar)).booleanValue() && (layoutParams = view.getLayoutParams()) != null) {
                        i166319084105000403632.s("view_width_layout_type", java.lang.Integer.valueOf(dev.epro.r0.L11610354117192841236.A(a(layoutParams.width))));
                        i166319084105000403632.s("view_height_layout_type", java.lang.Integer.valueOf(dev.epro.r0.L11610354117192841236.A(a(layoutParams.height))));
                    }
                    if (((java.lang.Boolean) jr0Var.a("gads:nas_collect_view_path:enabled", bool, aoVar)).booleanValue()) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(java.lang.Integer.valueOf(view.getId()));
                        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                            arrayList.add(java.lang.Integer.valueOf(((android.view.View) parent).getId()));
                        }
                        i166319084105000403632.t("view_path", dev.epro.r0.R9411874267597469228.J0(arrayList, "/", (java.lang.String) null, (java.lang.String) null, 0, (dev.epro.r0.F4096073349764486348) null, 62));
                    }
                    i166319084105000403632.s("mediaview_scale_type", java.lang.Integer.valueOf(scaleType.ordinal()));
                }
                if (view instanceof android.widget.TextView) {
                    android.widget.TextView textView = (android.widget.TextView) view;
                    i166319084105000403632.s("text_color", java.lang.Integer.valueOf(textView.getCurrentTextColor()));
                    i166319084105000403632.s("font_size", java.lang.Float.valueOf(textView.getTextSize()));
                    i166319084105000403632.t("text", textView.getText().toString());
                }
                i166319084105000403632.r("is_clickable", java.lang.Boolean.valueOf(view.isClickable()));
                if (((java.lang.Boolean) jr0Var.a("gads:nas_collect_alpha:enabled", java.lang.Boolean.TRUE, aoVar)).booleanValue()) {
                    i166319084105000403632.s("alpha", java.lang.Float.valueOf(view.getAlpha()));
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
    public final dev.epro.r0.I16631908410500040363 b(android.widget.FrameLayout frameLayout) {
        int i;
        ads_mobile_sdk.jr0 jr0Var;
        char c;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        if (frameLayout == null) {
            return new dev.epro.r0.I16631908410500040363();
        }
        android.view.ViewParent parent = frameLayout.getParent();
        loop0: while (true) {
            i = 5;
            jr0Var = this.b;
            if (parent == null) {
                c = 1;
                break;
            }
            if (parent instanceof android.widget.ScrollView) {
                c = 2;
                break;
            }
            if (parent instanceof android.widget.AbsListView) {
                c = 3;
                break;
            }
            if (parent instanceof android.widget.HorizontalScrollView) {
                c = 4;
                break;
            }
            if (parent instanceof androidx.core.widget.NestedScrollView) {
                c = 5;
                break;
            }
            jr0Var.getClass();
            if (((java.lang.Boolean) jr0Var.a("gads:native:enable_scroll_view_type_by_keyword", java.lang.Boolean.FALSE, aoVar)).booleanValue()) {
                for (java.lang.String str : (java.util.List) jr0Var.a("gads:native:scrollable_container_keywords", dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{"recycler", "viewflipper"}), ads_mobile_sdk.ao.a$23)) {
                    java.lang.String lowerCase = parent.getClass().getName().toLowerCase(java.util.Locale.ROOT);
                    lowerCase.getClass();
                    if (dev.epro.r0.M8927913404651150384.L(lowerCase, str, false)) {
                        c = 6;
                        break loop0;
                    }
                }
            }
            parent = parent.getParent();
        }
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        jr0Var.getClass();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (((java.lang.Boolean) jr0Var.a("gads:native:enable_contained_in_scroll_view_signal", bool, aoVar)).booleanValue()) {
            i16631908410500040363.r("contained_in_scroll_view", java.lang.Boolean.valueOf(c != 1));
        }
        if (((java.lang.Boolean) jr0Var.a("gads:native:enable_scroll_view_type_signal", bool, aoVar)).booleanValue()) {
            switch (c) {
                case 1:
                    i = 0;
                    i16631908410500040363.s("scroll_view_type", java.lang.Integer.valueOf(i));
                    break;
                case 2:
                    i = 1;
                    i16631908410500040363.s("scroll_view_type", java.lang.Integer.valueOf(i));
                    break;
                case 3:
                    i = 2;
                    i16631908410500040363.s("scroll_view_type", java.lang.Integer.valueOf(i));
                    break;
                case 4:
                    i = 3;
                    i16631908410500040363.s("scroll_view_type", java.lang.Integer.valueOf(i));
                    break;
                case 5:
                    i = 4;
                    i16631908410500040363.s("scroll_view_type", java.lang.Integer.valueOf(i));
                    break;
                case 6:
                    i16631908410500040363.s("scroll_view_type", java.lang.Integer.valueOf(i));
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

    public final dev.epro.r0.I16631908410500040363 a(java.lang.String str, android.graphics.Point point, android.graphics.Point point2) {
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        int i = point2.x;
        android.content.Context context = this.a;
        i16631908410500040363.s("x", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, i)));
        i16631908410500040363.s("y", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, point2.y)));
        i16631908410500040363.s("start_x", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, point.x)));
        i16631908410500040363.s("start_y", java.lang.Integer.valueOf(dev.epro.r0.E10717724117948616506.f(context, point.y)));
        dev.epro.r0.I16631908410500040363 i166319084105000403632 = new dev.epro.r0.I16631908410500040363();
        i166319084105000403632.q("click_point", i16631908410500040363);
        i166319084105000403632.t("asset_id", str);
        return i166319084105000403632;
    }

    public final dev.epro.r0.I16631908410500040363 a(android.widget.FrameLayout frameLayout) {
        android.view.Window window;
        if (frameLayout != null) {
            dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
            android.view.View rootView = frameLayout.getRootView();
            android.content.Context context = rootView != null ? rootView.getContext() : null;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            android.view.WindowManager.LayoutParams attributes = (activity == null || (window = activity.getWindow()) == null) ? null : window.getAttributes();
            i16631908410500040363.r("can_show_on_lock_screen", java.lang.Boolean.valueOf((attributes == null || (attributes.flags & 524288) == 0) ? false : true));
            android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) this.a.getSystemService(android.app.KeyguardManager.class);
            i16631908410500040363.r("is_keyguard_locked", keyguardManager != null ? java.lang.Boolean.valueOf(keyguardManager.isKeyguardLocked()) : null);
            return i16631908410500040363;
        }
        return new dev.epro.r0.I16631908410500040363();
    }

    public final dev.epro.r0.I16631908410500040363 a() {
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        android.content.Context context = this.a;
        context.getClass();
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        float f = displayMetrics.widthPixels;
        android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        i16631908410500040363.s("width", java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(f / displayMetrics2.density)));
        context.getClass();
        android.util.DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        float f2 = displayMetrics3.heightPixels;
        android.util.DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        displayMetrics4.getClass();
        i16631908410500040363.s("height", java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(f2 / displayMetrics4.density)));
        return i16631908410500040363;
    }

    public static dev.epro.r0.I16631908410500040363 a(android.content.Context context, android.graphics.Rect rect) {
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        int i = rect.right - rect.left;
        context.getClass();
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        i16631908410500040363.s("width", java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(i / displayMetrics.density)));
        float f = rect.bottom - rect.top;
        android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        i16631908410500040363.s("height", java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(f / displayMetrics2.density)));
        float f2 = rect.left;
        android.util.DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        i16631908410500040363.s("x", java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(f2 / displayMetrics3.density)));
        float f3 = rect.top;
        android.util.DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        displayMetrics4.getClass();
        i16631908410500040363.s("y", java.lang.Integer.valueOf(dev.epro.r0.T18016951143603335921.Z(f3 / displayMetrics4.density)));
        i16631908410500040363.t("relative_to", "self");
        return i16631908410500040363;
    }
}
