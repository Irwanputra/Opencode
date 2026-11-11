package p034.p095;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: づざかべべ.は〲ぱなで.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1733<T> extends Property<T, Float> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final PathMeasure f7909;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final float f7910;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Property<T, PointF> f7911;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final PointF f7912;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f7913;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final float[] f7914;

    public C1733(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f7914 = new float[2];
        this.f7912 = new PointF();
        this.f7911 = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f7909 = pathMeasure;
        this.f7910 = pathMeasure.getLength();
    }

    @Override // android.util.Property
    public Float get(Object obj) {
        return Float.valueOf(this.f7913);
    }

    @Override // android.util.Property
    public void set(Object obj, Float f) {
        Float f2 = f;
        this.f7913 = f2.floatValue();
        this.f7909.getPosTan(f2.floatValue() * this.f7910, this.f7914, null);
        PointF pointF = this.f7912;
        float[] fArr = this.f7914;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f7911.set(obj, pointF);
    }
}
