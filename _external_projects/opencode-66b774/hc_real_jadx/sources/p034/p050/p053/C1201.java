package p034.p050.p053;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1201 extends Drawable {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ActionBarContainer f5945;

    public C1201(ActionBarContainer actionBarContainer) {
        this.f5945 = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f5945;
        if (actionBarContainer.f220) {
            Drawable drawable = actionBarContainer.f212;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f218;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f5945;
        Drawable drawable3 = actionBarContainer2.f214;
        if (drawable3 == null || !actionBarContainer2.f215) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f5945;
        if (actionBarContainer.f220) {
            drawable = actionBarContainer.f212;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f218;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
