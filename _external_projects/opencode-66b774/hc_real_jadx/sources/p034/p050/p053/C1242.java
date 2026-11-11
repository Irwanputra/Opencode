package p034.p050.p053;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p034.p035.p038.C1011;
import p034.p050.C1263;
import p034.p050.C1264;
import p034.p050.C1265;
import p034.p050.p053.C1234;
import p034.p050.p055.p056.C1266;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1242 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final PorterDuff.Mode f6095 = PorterDuff.Mode.SRC_IN;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C1242 f6096;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1234 f6097;

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1243 implements C1234.InterfaceC1238 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int[] f6100 = {C1265.abc_textfield_search_default_mtrl_alpha, C1265.abc_textfield_default_mtrl_alpha, C1265.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int[] f6098 = {C1265.abc_ic_commit_search_api_mtrl_alpha, C1265.abc_seekbar_tick_mark_material, C1265.abc_ic_menu_share_mtrl_alpha, C1265.abc_ic_menu_copy_mtrl_am_alpha, C1265.abc_ic_menu_cut_mtrl_alpha, C1265.abc_ic_menu_selectall_mtrl_alpha, C1265.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int[] f6099 = {C1265.abc_textfield_activated_mtrl_alpha, C1265.abc_textfield_search_activated_mtrl_alpha, C1265.abc_cab_background_top_mtrl_alpha, C1265.abc_text_cursor_material, C1265.abc_text_select_handle_left_mtrl_dark, C1265.abc_text_select_handle_middle_mtrl_dark, C1265.abc_text_select_handle_right_mtrl_dark, C1265.abc_text_select_handle_left_mtrl_light, C1265.abc_text_select_handle_middle_mtrl_light, C1265.abc_text_select_handle_right_mtrl_light};

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final int[] f6103 = {C1265.abc_popup_background_mtrl_mult, C1265.abc_cab_background_internal_bg, C1265.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final int[] f6101 = {C1265.abc_tab_indicator_material, C1265.abc_textfield_search_material};

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final int[] f6102 = {C1265.abc_btn_check_material, C1265.abc_btn_radio_material, C1265.abc_btn_check_material_anim, C1265.abc_btn_radio_material_anim};

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final ColorStateList m2872(Context context, int i) {
            int m2891 = C1252.m2891(context, C1264.colorControlHighlight);
            return new ColorStateList(new int[][]{C1252.f6129, C1252.f6135, C1252.f6131, C1252.f6134}, new int[]{C1252.m2890(context, C1264.colorButtonNormal), C1011.m2352(m2891, i), C1011.m2352(m2891, i), i});
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ColorStateList m2873(Context context, int i) {
            if (i == C1265.abc_edit_text_material) {
                return C1266.m2929(context, C1263.abc_tint_edittext);
            }
            if (i == C1265.abc_switch_track_mtrl_alpha) {
                return C1266.m2929(context, C1263.abc_tint_switch_track);
            }
            if (i != C1265.abc_switch_thumb_material) {
                if (i == C1265.abc_btn_default_mtrl_shape) {
                    return m2872(context, C1252.m2891(context, C1264.colorButtonNormal));
                }
                if (i == C1265.abc_btn_borderless_material) {
                    return m2872(context, 0);
                }
                if (i == C1265.abc_btn_colored_material) {
                    return m2872(context, C1252.m2891(context, C1264.colorAccent));
                }
                if (i == C1265.abc_spinner_mtrl_am_alpha || i == C1265.abc_spinner_textfield_background_material) {
                    return C1266.m2929(context, C1263.abc_tint_spinner);
                }
                if (m2874(this.f6098, i)) {
                    return C1252.m2893(context, C1264.colorControlNormal);
                }
                if (m2874(this.f6101, i)) {
                    return C1266.m2929(context, C1263.abc_tint_default);
                }
                if (m2874(this.f6102, i)) {
                    return C1266.m2929(context, C1263.abc_tint_btn_checkable);
                }
                if (i == C1265.abc_seekbar_thumb_material) {
                    return C1266.m2929(context, C1263.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = C1264.colorSwitchThumbNormal;
            ColorStateList m2893 = C1252.m2893(context, i2);
            if (m2893 == null || !m2893.isStateful()) {
                iArr[0] = C1252.f6129;
                iArr2[0] = C1252.m2890(context, i2);
                iArr[1] = C1252.f6133;
                iArr2[1] = C1252.m2891(context, C1264.colorControlActivated);
                iArr[2] = C1252.f6134;
                iArr2[2] = C1252.m2891(context, i2);
            } else {
                iArr[0] = C1252.f6129;
                iArr2[0] = m2893.getColorForState(iArr[0], 0);
                iArr[1] = C1252.f6133;
                iArr2[1] = C1252.m2891(context, C1264.colorControlActivated);
                iArr[2] = C1252.f6134;
                iArr2[2] = m2893.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final boolean m2874(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final void m2875(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C1210.m2696(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1242.f6095;
            }
            drawable.setColorFilter(C1242.m2866(i, mode));
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m2866(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m2852;
        synchronized (C1242.class) {
            m2852 = C1234.m2852(i, mode);
        }
        return m2852;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static synchronized C1242 m2867() {
        C1242 c1242;
        synchronized (C1242.class) {
            if (f6096 == null) {
                m2868();
            }
            c1242 = f6096;
        }
        return c1242;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static synchronized void m2868() {
        synchronized (C1242.class) {
            if (f6096 == null) {
                C1242 c1242 = new C1242();
                f6096 = c1242;
                c1242.f6097 = C1234.m2853();
                C1234 c1234 = f6096.f6097;
                C1243 c1243 = new C1243();
                synchronized (c1234) {
                    c1234.f6086 = c1243;
                }
            }
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static void m2869(Drawable drawable, C1206 c1206, int[] iArr) {
        PorterDuff.Mode mode = C1234.f6082;
        if (!C1210.m2696(drawable) || drawable.mutate() == drawable) {
            boolean z = c1206.f5963;
            if (z || c1206.f5961) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? c1206.f5962 : null;
                PorterDuff.Mode mode2 = c1206.f5961 ? c1206.f5960 : C1234.f6082;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilter = C1234.m2852(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public synchronized Drawable m2870(Context context, int i) {
        return this.f6097.m2861(context, i);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public synchronized ColorStateList m2871(Context context, int i) {
        return this.f6097.m2862(context, i);
    }
}
