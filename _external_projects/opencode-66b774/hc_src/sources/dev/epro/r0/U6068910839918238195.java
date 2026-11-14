package dev.epro.r0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U6068910839918238195 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        I2814787646979818974 i2814787646979818974;
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 3:
                if (!(view instanceof I2814787646979818974) || (outline2 = (i2814787646979818974 = (I2814787646979818974) view).e) == null) {
                    return;
                }
                outline.set(outline2);
                float f = i2814787646979818974.k;
                if (f == 0.0f && i2814787646979818974.l == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) i2814787646979818974.l);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
