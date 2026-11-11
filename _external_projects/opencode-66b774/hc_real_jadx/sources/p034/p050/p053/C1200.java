package p034.p050.p053;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p034.p035.p038.p039.InterfaceC1013;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1200 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final int[] f5942 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Bitmap f5943;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ProgressBar f5944;

    public C1200(ProgressBar progressBar) {
        this.f5944 = progressBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Drawable m2675(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC1013) {
            InterfaceC1013 interfaceC1013 = (InterfaceC1013) drawable;
            Drawable mo2356 = interfaceC1013.mo2356();
            if (mo2356 != null) {
                interfaceC1013.mo2357(m2675(mo2356, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m2675(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f5943 == null) {
                    this.f5943 = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo2676(AttributeSet attributeSet, int i) {
        C1260 m2910 = C1260.m2910(this.f5944.getContext(), attributeSet, f5942, i, 0);
        Drawable m2911 = m2910.m2911(0);
        if (m2911 != null) {
            ProgressBar progressBar = this.f5944;
            if (m2911 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) m2911;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable m2675 = m2675(animationDrawable.getFrame(i2), true);
                    m2675.setLevel(10000);
                    animationDrawable2.addFrame(m2675, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                m2911 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(m2911);
        }
        Drawable m29112 = m2910.m2911(1);
        if (m29112 != null) {
            this.f5944.setProgressDrawable(m2675(m29112, false));
        }
        m2910.f6162.recycle();
    }
}
