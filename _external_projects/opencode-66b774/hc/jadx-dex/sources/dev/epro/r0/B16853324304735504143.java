package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B16853324304735504143 implements dev.epro.r0.I3673563500665330592 {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    public B16853324304735504143(byte b) {
        switch (b) {
            case 2:
                this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
                this.b = new java.util.concurrent.CountDownLatch(1);
                this.f = "PublicSuffixDatabase.list";
                break;
            default:
                this.a = new int[]{2131230836, 2131230834, 2131230760};
                this.b = new int[]{2131230784, 2131230819, 2131230791, 2131230786, 2131230787, 2131230790, 2131230789};
                this.c = new int[]{2131230833, 2131230835, 2131230777, 2131230829, 2131230830, 2131230831, 2131230832};
                this.d = new int[]{2131230809, 2131230775, 2131230808};
                this.e = new int[]{2131230827, 2131230837};
                this.f = new int[]{2131230763, 2131230769, 2131230764, 2131230770};
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

    public static android.content.res.ColorStateList c(android.content.Context context, int i) {
        int iC = dev.epro.r0.X170853990943489827.c(context, 2130968846);
        int iB = dev.epro.r0.X170853990943489827.b(context, 2130968841);
        int[] iArr = dev.epro.r0.X170853990943489827.b;
        int[] iArr2 = dev.epro.r0.X170853990943489827.d;
        int iB2 = dev.epro.r0.E7030189496516270437.b(iC, i);
        return new android.content.res.ColorStateList(new int[][]{iArr, iArr2, dev.epro.r0.X170853990943489827.c, dev.epro.r0.X170853990943489827.f}, new int[]{iB, iB2, dev.epro.r0.E7030189496516270437.b(iC, i), i});
    }

    public static android.graphics.drawable.LayerDrawable d(dev.epro.r0.B5275173104802412095 b5275173104802412095, android.content.Context context, int i) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.drawable.BitmapDrawable bitmapDrawable2;
        android.graphics.drawable.BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        android.graphics.drawable.Drawable drawableD = b5275173104802412095.d(context, 2131230823);
        android.graphics.drawable.Drawable drawableD2 = b5275173104802412095.d(context, 2131230824);
        if ((drawableD instanceof android.graphics.drawable.BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawableD;
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof android.graphics.drawable.BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (android.graphics.drawable.BitmapDrawable) drawableD2;
        } else {
            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap2);
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void l(android.graphics.drawable.Drawable drawable, int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilterF;
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = dev.epro.r0.D6070089955350435999.b;
        }
        android.graphics.PorterDuff.Mode mode2 = dev.epro.r0.D6070089955350435999.b;
        synchronized (dev.epro.r0.D6070089955350435999.class) {
            porterDuffColorFilterF = dev.epro.r0.B5275173104802412095.f(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterF);
    }

    public dev.epro.r0.A17163912561928975531 b() throws java.security.GeneralSecurityException {
        if (((java.lang.Integer) this.a) == null) {
            dev.epro.r0.W4415201450379021245.c("AES key size is not set");
            return null;
        }
        if (((java.lang.Integer) this.b) == null) {
            dev.epro.r0.W4415201450379021245.c("HMAC key size is not set");
            return null;
        }
        if (((java.lang.Integer) this.c) == null) {
            dev.epro.r0.W4415201450379021245.c("iv size is not set");
            return null;
        }
        java.lang.Integer num = (java.lang.Integer) this.d;
        if (num == null) {
            dev.epro.r0.W4415201450379021245.c("tag size is not set");
            return null;
        }
        if (((dev.epro.r0.D14731132657808549702) this.e) == null) {
            dev.epro.r0.W4415201450379021245.c("hash type is not set");
            return null;
        }
        if (((dev.epro.r0.D14731132657808549702) this.f) == null) {
            dev.epro.r0.W4415201450379021245.c("variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        dev.epro.r0.D14731132657808549702 d14731132657808549702 = (dev.epro.r0.D14731132657808549702) this.e;
        if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.g) {
            if (iIntValue > 20) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.h) {
            if (iIntValue > 28) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.i) {
            if (iIntValue > 32) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.j) {
            if (iIntValue > 48) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (d14731132657808549702 != dev.epro.r0.D14731132657808549702.k) {
                dev.epro.r0.W4415201450379021245.c("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new dev.epro.r0.A17163912561928975531(((java.lang.Integer) this.a).intValue(), ((java.lang.Integer) this.b).intValue(), ((java.lang.Integer) this.c).intValue(), ((java.lang.Integer) this.d).intValue(), (dev.epro.r0.D14731132657808549702) this.f, (dev.epro.r0.D14731132657808549702) this.e);
    }

    public android.content.res.ColorStateList e(android.content.Context context, int i) {
        if (i == 2131230780) {
            return dev.epro.r0.B5998207562248239613.r(context, 2131099669);
        }
        if (i == 2131230826) {
            return dev.epro.r0.B5998207562248239613.r(context, 2131099672);
        }
        if (i != 2131230825) {
            if (i == 2131230768) {
                return c(context, dev.epro.r0.X170853990943489827.c(context, 2130968841));
            }
            if (i == 2131230762) {
                return c(context, 0);
            }
            if (i == 2131230767) {
                return c(context, dev.epro.r0.X170853990943489827.c(context, 2130968839));
            }
            if (i == 2131230821 || i == 2131230822) {
                return dev.epro.r0.B5998207562248239613.r(context, 2131099671);
            }
            if (a((int[]) this.b, i)) {
                return dev.epro.r0.X170853990943489827.d(context, 2130968847);
            }
            if (a((int[]) this.e, i)) {
                return dev.epro.r0.B5998207562248239613.r(context, 2131099668);
            }
            if (a((int[]) this.f, i)) {
                return dev.epro.r0.B5998207562248239613.r(context, 2131099667);
            }
            if (i == 2131230818) {
                return dev.epro.r0.B5998207562248239613.r(context, 2131099670);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        android.content.res.ColorStateList colorStateListD = dev.epro.r0.X170853990943489827.d(context, 2130968898);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = dev.epro.r0.X170853990943489827.b;
            iArr2[0] = dev.epro.r0.X170853990943489827.b(context, 2130968898);
            iArr[1] = dev.epro.r0.X170853990943489827.e;
            iArr2[1] = dev.epro.r0.X170853990943489827.c(context, 2130968845);
            iArr[2] = dev.epro.r0.X170853990943489827.f;
            iArr2[2] = dev.epro.r0.X170853990943489827.c(context, 2130968898);
        } else {
            int[] iArr3 = dev.epro.r0.X170853990943489827.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = dev.epro.r0.X170853990943489827.e;
            iArr2[1] = dev.epro.r0.X170853990943489827.c(context, 2130968845);
            iArr[2] = dev.epro.r0.X170853990943489827.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new android.content.res.ColorStateList(iArr, iArr2);
    }

    public dev.epro.r0.L5982594854256394033 f() throws java.io.IOException {
        dev.epro.r0.X4422675003582389573 x4422675003582389573 = dev.epro.r0.X4422675003582389573.a;
        dev.epro.r0.G12005847563586305646 g12005847563586305646 = dev.epro.r0.X4422675003582389573.a;
        dev.epro.r0.G12005847563586305646 g120058475635863056462 = g12005847563586305646 != null ? g12005847563586305646 : null;
        android.content.Context contextB = g120058475635863056462 != null ? g120058475635863056462.b() : null;
        android.content.res.AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            java.io.InputStream inputStreamOpen = assets.open((java.lang.String) this.f);
            inputStreamOpen.getClass();
            return new dev.epro.r0.L5982594854256394033(inputStreamOpen, new dev.epro.r0.O12329764647113144543());
        }
        if (android.os.Build.FINGERPRINT == null) {
            dev.epro.r0.Q11088980322693754445.h("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        dev.epro.r0.Q11088980322693754445.h("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public void g() {
        try {
            dev.epro.r0.T13344602445187831655 t13344602445187831655 = new dev.epro.r0.T13344602445187831655(f());
            try {
                dev.epro.r0.P5124777957357031757 p5124777957357031757E = t13344602445187831655.e(t13344602445187831655.g());
                dev.epro.r0.P5124777957357031757 p5124777957357031757E2 = t13344602445187831655.e(t13344602445187831655.g());
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
            ((java.util.concurrent.CountDownLatch) this.b).countDown();
        }
    }

    public void i(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
        }
        this.a = java.lang.Integer.valueOf(i);
    }

    public void j(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", java.lang.Integer.valueOf(i)));
        }
        this.b = java.lang.Integer.valueOf(i);
    }

    public void k(int i) throws java.security.GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", java.lang.Integer.valueOf(i)));
        }
        this.c = java.lang.Integer.valueOf(i);
    }

    public void m(int i) throws java.security.GeneralSecurityException {
        if (i < 10) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", java.lang.Integer.valueOf(i)));
        }
        this.d = java.lang.Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public dev.epro.r0.C4341747165502163559 h() {
        android.app.Application application = (android.app.Application) ((dev.epro.r0.I3673563500665330592) this.a).h();
        dev.epro.r0.O6655543165492094776 o6655543165492094776 = (dev.epro.r0.O6655543165492094776) ((dev.epro.r0.D9201356603168736774) this.b).h();
        android.os.Handler handler = dev.epro.r0.L7597948271951285043.a;
        dev.epro.r0.Q3791352212346016950.m(handler);
        dev.epro.r0.L10699316803831699764 l10699316803831699764 = dev.epro.r0.L7597948271951285043.b;
        dev.epro.r0.Q3791352212346016950.m(l10699316803831699764);
        return new dev.epro.r0.C4341747165502163559(application, o6655543165492094776, handler, l10699316803831699764, (dev.epro.r0.Y15841630011871852334) ((dev.epro.r0.I3673563500665330592) this.c).h(), ((dev.epro.r0.I3673563500665330592) this.d).a(), (dev.epro.r0.X17123927029532314696) ((dev.epro.r0.M204440408817344908) this.e).h(), (dev.epro.r0.G5446205426701161097) ((dev.epro.r0.I3673563500665330592) this.f).h());
    }

    public B16853324304735504143(java.lang.String str, java.lang.String str2, java.util.Set set) {
        java.util.Set setUnmodifiableSet = set == null ? java.util.Collections.EMPTY_SET : java.util.Collections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        this.d = str;
        this.e = str2;
        this.f = dev.epro.r0.R15745234700111449188.b;
        java.util.HashSet hashSet = new java.util.HashSet(setUnmodifiableSet);
        java.util.Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.c = java.util.Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            dev.epro.r0.Z3383101362411723454.s();
            throw null;
        }
    }

    public B16853324304735504143(dev.epro.r0.Z6787503239643758223 z6787503239643758223, dev.epro.r0.D9201356603168736774 d9201356603168736774, dev.epro.r0.D9201356603168736774 d92013566031687367742, dev.epro.r0.M1458640882343060544 m1458640882343060544, dev.epro.r0.M204440408817344908 m204440408817344908, dev.epro.r0.D9201356603168736774 d92013566031687367743) {
        this.a = z6787503239643758223;
        this.b = d9201356603168736774;
        this.c = d92013566031687367742;
        this.d = m1458640882343060544;
        this.e = m204440408817344908;
        this.f = d92013566031687367743;
    }
}
