package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class V13302460013598267156 extends ImageButton {
    public final G6575252167976303972 a;
    public final N12245111110189169079 b;
    public boolean c;

    public V13302460013598267156(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        X170853990943489827.a(this, getContext());
        G6575252167976303972 g6575252167976303972 = new G6575252167976303972(this);
        this.a = g6575252167976303972;
        g6575252167976303972.f(attributeSet, i);
        N12245111110189169079 n12245111110189169079 = new N12245111110189169079(this);
        this.b = n12245111110189169079;
        n12245111110189169079.m(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.b();
        }
        N12245111110189169079 n12245111110189169079 = this.b;
        if (n12245111110189169079 != null) {
            n12245111110189169079.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            return g6575252167976303972.e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        L11462694090053902638 l11462694090053902638;
        N12245111110189169079 n12245111110189169079 = this.b;
        if (n12245111110189169079 == null || (l11462694090053902638 = (L11462694090053902638) n12245111110189169079.d) == null) {
            return null;
        }
        return (ColorStateList) l11462694090053902638.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        L11462694090053902638 l11462694090053902638;
        N12245111110189169079 n12245111110189169079 = this.b;
        if (n12245111110189169079 == null || (l11462694090053902638 = (L11462694090053902638) n12245111110189169079.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) l11462694090053902638.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        N12245111110189169079 n12245111110189169079 = this.b;
        if (n12245111110189169079 != null) {
            n12245111110189169079.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        N12245111110189169079 n12245111110189169079 = this.b;
        if (n12245111110189169079 != null && drawable != null && !this.c) {
            n12245111110189169079.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (n12245111110189169079 != null) {
            n12245111110189169079.c();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) n12245111110189169079.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(n12245111110189169079.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        N12245111110189169079 n12245111110189169079 = this.b;
        ImageView imageView = (ImageView) n12245111110189169079.c;
        if (i != 0) {
            Drawable drawableG = M9216324016624295870.G(imageView.getContext(), i);
            if (drawableG != null) {
                T11496100853119631009.a(drawableG);
            }
            imageView.setImageDrawable(drawableG);
        } else {
            imageView.setImageDrawable(null);
        }
        n12245111110189169079.c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        N12245111110189169079 n12245111110189169079 = this.b;
        if (n12245111110189169079 != null) {
            n12245111110189169079.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        G6575252167976303972 g6575252167976303972 = this.a;
        if (g6575252167976303972 != null) {
            g6575252167976303972.m(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        N12245111110189169079 n12245111110189169079 = this.b;
        if (n12245111110189169079 != null) {
            L11462694090053902638 l11462694090053902638 = (L11462694090053902638) n12245111110189169079.d;
            if (l11462694090053902638 == null) {
                l11462694090053902638 = new L11462694090053902638();
                n12245111110189169079.d = l11462694090053902638;
            }
            l11462694090053902638.c = colorStateList;
            l11462694090053902638.b = true;
            n12245111110189169079.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        N12245111110189169079 n12245111110189169079 = this.b;
        if (n12245111110189169079 != null) {
            L11462694090053902638 l11462694090053902638 = (L11462694090053902638) n12245111110189169079.d;
            if (l11462694090053902638 == null) {
                l11462694090053902638 = new L11462694090053902638();
                n12245111110189169079.d = l11462694090053902638;
            }
            l11462694090053902638.d = mode;
            l11462694090053902638.a = true;
            n12245111110189169079.c();
        }
    }
}
