package dev.epro.r0;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B16853324304735504143 implements I3673563500665330592 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public B16853324304735504143(byte b) {
        switch (b) {
            case 2:
                this.a = new AtomicBoolean(false);
                this.b = new CountDownLatch(1);
                this.f = "PublicSuffixDatabase.list";
                break;
            default:
                this.a = new int[]{2131230836, 2131230834, 2131230760};
                this.b = new int[]{2131230784, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{2131230833, 2131230835, 2131230777, R.drawable.abc_text_cursor_material, 2131230830, 2131230831, 2131230832};
                this.d = new int[]{2131230809, R.drawable.abc_cab_background_internal_bg, 2131230808};
                this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i) {
        int iC = X170853990943489827.c(context, R.attr.colorControlHighlight);
        int iB = X170853990943489827.b(context, R.attr.colorButtonNormal);
        int[] iArr = X170853990943489827.b;
        int[] iArr2 = X170853990943489827.d;
        int iB2 = E7030189496516270437.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, X170853990943489827.c, X170853990943489827.f}, new int[]{iB, iB2, E7030189496516270437.b(iC, i), i});
    }

    public static LayerDrawable d(B5275173104802412095 b5275173104802412095, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = b5275173104802412095.d(context, R.drawable.abc_star_black_48dp);
        Drawable drawableD2 = b5275173104802412095.d(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void l(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = D6070089955350435999.b;
        }
        PorterDuff.Mode mode2 = D6070089955350435999.b;
        synchronized (D6070089955350435999.class) {
            porterDuffColorFilterF = B5275173104802412095.f(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterF);
    }

    public A17163912561928975531 b() {
        if (((Integer) this.a) == null) {
            W4415201450379021245.c("AES key size is not set");
            return null;
        }
        if (((Integer) this.b) == null) {
            W4415201450379021245.c("HMAC key size is not set");
            return null;
        }
        if (((Integer) this.c) == null) {
            W4415201450379021245.c("iv size is not set");
            return null;
        }
        Integer num = (Integer) this.d;
        if (num == null) {
            W4415201450379021245.c("tag size is not set");
            return null;
        }
        if (((D14731132657808549702) this.e) == null) {
            W4415201450379021245.c("hash type is not set");
            return null;
        }
        if (((D14731132657808549702) this.f) == null) {
            W4415201450379021245.c("variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        D14731132657808549702 d14731132657808549702 = (D14731132657808549702) this.e;
        if (d14731132657808549702 == D14731132657808549702.g) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (d14731132657808549702 == D14731132657808549702.h) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (d14731132657808549702 == D14731132657808549702.i) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (d14731132657808549702 == D14731132657808549702.j) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (d14731132657808549702 != D14731132657808549702.k) {
                W4415201450379021245.c("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new A17163912561928975531(((Integer) this.a).intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (D14731132657808549702) this.f, (D14731132657808549702) this.e);
    }

    public ColorStateList e(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return B5998207562248239613.r(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230826) {
            return B5998207562248239613.r(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return c(context, X170853990943489827.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return c(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return c(context, X170853990943489827.c(context, R.attr.colorAccent));
            }
            if (i == 2131230821 || i == R.drawable.abc_spinner_textfield_background_material) {
                return B5998207562248239613.r(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.b, i)) {
                return X170853990943489827.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.e, i)) {
                return B5998207562248239613.r(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f, i)) {
                return B5998207562248239613.r(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return B5998207562248239613.r(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = X170853990943489827.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = X170853990943489827.b;
            iArr2[0] = X170853990943489827.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = X170853990943489827.e;
            iArr2[1] = X170853990943489827.c(context, R.attr.colorControlActivated);
            iArr[2] = X170853990943489827.f;
            iArr2[2] = X170853990943489827.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = X170853990943489827.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = X170853990943489827.e;
            iArr2[1] = X170853990943489827.c(context, R.attr.colorControlActivated);
            iArr[2] = X170853990943489827.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public L5982594854256394033 f() throws IOException {
        X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
        Object obj = X4422675003582389573.a;
        G12005847563586305646 g12005847563586305646 = obj != null ? (G12005847563586305646) obj : null;
        Context contextB = g12005847563586305646 != null ? g12005847563586305646.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open((String) this.f);
            inputStreamOpen.getClass();
            return new L5982594854256394033(inputStreamOpen, new O12329764647113144543());
        }
        if (Build.FINGERPRINT == null) {
            Q11088980322693754445.h("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        Q11088980322693754445.h("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public void g() {
        try {
            T13344602445187831655 t13344602445187831655 = new T13344602445187831655(f());
            try {
                P5124777957357031757 p5124777957357031757E = t13344602445187831655.e(t13344602445187831655.g());
                P5124777957357031757 p5124777957357031757E2 = t13344602445187831655.e(t13344602445187831655.g());
                t13344602445187831655.close();
                synchronized (this) {
                    p5124777957357031757E.getClass();
                    this.c = p5124777957357031757E;
                    p5124777957357031757E2.getClass();
                    this.d = p5124777957357031757E2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.b).countDown();
        }
    }

    public void i(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public void j(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public void k(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public void m(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
    }

    @Override // dev.epro.r0.I3673563500665330592
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C4341747165502163559 h() {
        Application application = (Application) ((I3673563500665330592) this.a).h();
        O6655543165492094776 o6655543165492094776 = (O6655543165492094776) ((D9201356603168736774) this.b).h();
        Handler handler = L7597948271951285043.a;
        Q3791352212346016950.m(handler);
        L10699316803831699764 l10699316803831699764 = L7597948271951285043.b;
        Q3791352212346016950.m(l10699316803831699764);
        return new C4341747165502163559(application, o6655543165492094776, handler, l10699316803831699764, (Y15841630011871852334) ((I3673563500665330592) this.c).h(), ((M1458640882343060544) ((I3673563500665330592) this.d)).h(), (X17123927029532314696) ((M204440408817344908) this.e).h(), (G5446205426701161097) ((I3673563500665330592) this.f).h());
    }

    public B16853324304735504143(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.d = str;
        this.e = str2;
        this.f = R15745234700111449188.b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.c = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            Z3383101362411723454.s();
            throw null;
        }
    }

    public B16853324304735504143(Z6787503239643758223 z6787503239643758223, D9201356603168736774 d9201356603168736774, D9201356603168736774 d92013566031687367742, M1458640882343060544 m1458640882343060544, M204440408817344908 m204440408817344908, D9201356603168736774 d92013566031687367743) {
        this.a = z6787503239643758223;
        this.b = d9201356603168736774;
        this.c = d92013566031687367742;
        this.d = m1458640882343060544;
        this.e = m204440408817344908;
        this.f = d92013566031687367743;
    }
}
