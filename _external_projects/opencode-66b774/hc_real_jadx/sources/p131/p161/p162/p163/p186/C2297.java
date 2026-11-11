package p131.p161.p162.p163.p186;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.のぷのちつ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2297 extends Property<Drawable, Integer> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Property<Drawable, Integer> f9516 = new C2297();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final WeakHashMap<Drawable, Integer> f9517;

    public C2297() {
        super(Integer.class, "drawableAlphaCompat");
        this.f9517 = new WeakHashMap<>();
    }

    @Override // android.util.Property
    public Integer get(Drawable drawable) {
        int i;
        Drawable drawable2 = drawable;
        if (Build.VERSION.SDK_INT >= 19) {
            i = drawable2.getAlpha();
        } else {
            if (this.f9517.containsKey(drawable2)) {
                return this.f9517.get(drawable2);
            }
            i = Base64.BASELENGTH;
        }
        return Integer.valueOf(i);
    }

    @Override // android.util.Property
    public void set(Drawable drawable, Integer num) {
        Drawable drawable2 = drawable;
        Integer num2 = num;
        if (Build.VERSION.SDK_INT < 19) {
            this.f9517.put(drawable2, num2);
        }
        drawable2.setAlpha(num2.intValue());
    }
}
