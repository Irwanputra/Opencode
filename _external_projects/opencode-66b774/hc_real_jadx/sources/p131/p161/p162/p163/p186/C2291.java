package p131.p161.p162.p163.p186;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import p034.p080.C1493;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.のぷのちつ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2291 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C1493<String, C2289> f9505 = new C1493<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1493<String, PropertyValuesHolder[]> f9504 = new C1493<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C2291 m4449(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m4450(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m4450(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C2291 m4450(List<Animator> list) {
        C2291 c2291 = new C2291();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c2291.f9504.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = C2294.f9507;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = C2294.f9508;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = C2294.f9511;
            }
            C2289 c2289 = new C2289(startDelay, duration, interpolator);
            c2289.f9502 = objectAnimator.getRepeatCount();
            c2289.f9501 = objectAnimator.getRepeatMode();
            c2291.f9505.put(propertyName, c2289);
        }
        return c2291;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C2291 m4451(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m4449(context, resourceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2291) {
            return this.f9505.equals(((C2291) obj).f9505);
        }
        return false;
    }

    public int hashCode() {
        return this.f9505.hashCode();
    }

    public String toString() {
        return '\n' + C2291.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f9505 + "}\n";
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m4452(String str) {
        return this.f9504.getOrDefault(str, null) != null;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public PropertyValuesHolder[] m4453(String str) {
        if (!m4452(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] orDefault = this.f9504.getOrDefault(str, null);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
        for (int i = 0; i < orDefault.length; i++) {
            propertyValuesHolderArr[i] = orDefault[i].clone();
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C2289 m4454(String str) {
        if (this.f9505.getOrDefault(str, null) != null) {
            return this.f9505.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public <T> ObjectAnimator m4455(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, m4453(str));
        ofPropertyValuesHolder.setProperty(property);
        m4454(str).m4448(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }
}
