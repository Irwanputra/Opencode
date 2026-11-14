package dev.epro.r0;

import ads_mobile_sdk.db0;
import ads_mobile_sdk.gu0;
import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I11492088171899515263 extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public F2170640016238248049 a;
    public E6758797890281795541 b;
    public E5386183571211952538 c;

    public final void a() {
        E5386183571211952538 e5386183571211952538 = this.c;
        if (e5386183571211952538 != null) {
            Z1555232923955070058.a.getClass();
            R7033599853981556291.E((W5797197595347441198) ((db0) gu0.a()).u.get(), null, null, new N4024785987441166868(e5386183571211952538, null, (byte) 23), 3);
        }
    }

    public final void b() {
        E6758797890281795541 e6758797890281795541 = this.b;
        if (this.a != null) {
            setMinimumHeight(0);
            setMinimumWidth(0);
        } else if (e6758797890281795541 == null) {
            setMinimumHeight(0);
            setMinimumWidth(0);
        } else {
            Context context = getContext();
            context.getClass();
            setMinimumHeight((int) Q3791352212346016950.c(context, e6758797890281795541.b));
            Context context2 = getContext();
            context2.getClass();
            setMinimumWidth((int) Q3791352212346016950.c(context2, e6758797890281795541.a));
        }
        requestLayout();
    }

    public final F2170640016238248049 getBannerAd() {
        return this.a;
    }
}
