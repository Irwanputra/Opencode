package p034.p074.p075.p076;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p034.p035.p043.p044.C1056;
import p034.p074.p075.p076.C1466;
import p034.p080.C1502;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1462 extends AbstractC1480 implements Animatable {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1463 f6756;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ArgbEvaluator f6757;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Drawable.Callback f6758;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Context f6759;

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public static class C1463 extends Drawable.ConstantState {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1466 f6760;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public AnimatorSet f6761;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f6762;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C1502<Animator, String> f6763;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public ArrayList<Animator> f6764;

        public C1463(C1463 c1463, Drawable.Callback callback, Resources resources) {
            if (c1463 != null) {
                this.f6762 = c1463.f6762;
                C1466 c1466 = c1463.f6760;
                if (c1466 != null) {
                    Drawable.ConstantState constantState = c1466.getConstantState();
                    C1466 c14662 = (C1466) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f6760 = c14662;
                    c14662.mutate();
                    this.f6760 = c14662;
                    c14662.setCallback(callback);
                    this.f6760.setBounds(c1463.f6760.getBounds());
                    this.f6760.f6769 = false;
                }
                ArrayList<Animator> arrayList = c1463.f6764;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f6764 = new ArrayList<>(size);
                    this.f6763 = new C1502<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c1463.f6764.get(i);
                        Animator clone = animator.clone();
                        String orDefault = c1463.f6763.getOrDefault(animator, null);
                        clone.setTarget(this.f6760.f6771.f6777.f6793.getOrDefault(orDefault, null));
                        this.f6764.add(clone);
                        this.f6763.put(clone, orDefault);
                    }
                    if (this.f6761 == null) {
                        this.f6761 = new AnimatorSet();
                    }
                    this.f6761.playTogether(this.f6764);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6762;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1465 implements Drawable.Callback {
        public C1465() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C1462.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1462.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1462.this.unscheduleSelf(runnable);
        }
    }

    public C1462() {
        this(null, null, null);
    }

    public C1462(Context context, C1463 c1463, Resources resources) {
        this.f6757 = null;
        C1465 c1465 = new C1465();
        this.f6758 = c1465;
        this.f6759 = context;
        this.f6756 = new C1463(null, c1465, null);
    }

    @Override // p034.p074.p075.p076.AbstractC1480, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6850;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        drawable.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6850;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return drawable.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f6756.f6760.draw(canvas);
        if (this.f6756.f6761.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6850;
        if (drawable == null) {
            return this.f6756.f6760.getAlpha();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6756.f6762;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6850;
        if (drawable == null) {
            return this.f6756.f6760.getColorFilter();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6850 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1464(this.f6850.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f6756.f6760.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f6756.f6760.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.getOpacity() : this.f6756.f6760.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser xmlResourceParser;
        int i;
        Animator m3211;
        C1466 c1466;
        int next;
        Drawable drawable = this.f6850;
        int i2 = 21;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        for (int i3 = 1; eventType != i3 && (xmlPullParser.getDepth() >= depth || eventType != 3); i3 = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m2396 = C1056.m2396(resources, theme, attributeSet, C1478.f6842);
                    int resourceId = m2396.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = C1466.f6767;
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 24) {
                            c1466 = new C1466();
                            c1466.f6850 = i4 >= i2 ? resources.getDrawable(resourceId, theme) : resources.getDrawable(resourceId);
                            new C1466.C1475(c1466.f6850.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != i3);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                c1466 = C1466.m3200(resources, xml, asAttributeSet, theme);
                            } catch (IOException | XmlPullParserException unused) {
                                c1466 = null;
                            }
                        }
                        c1466.f6769 = false;
                        c1466.setCallback(this.f6758);
                        C1466 c14662 = this.f6756.f6760;
                        if (c14662 != null) {
                            c14662.setCallback(null);
                        }
                        this.f6756.f6760 = c1466;
                    }
                    m2396.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1478.f6844);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(i3, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f6759;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 24) {
                            m3211 = AnimatorInflater.loadAnimator(context, resourceId2);
                            i = i5;
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    xmlResourceParser = resources2.getAnimation(resourceId2);
                                } catch (Throwable th) {
                                    th = th;
                                    xmlResourceParser = null;
                                }
                                try {
                                    i = i5;
                                    m3211 = C1476.m3211(context, resources2, theme2, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0, 1.0f);
                                    xmlResourceParser.close();
                                } catch (IOException e) {
                                    e = e;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e2) {
                                    e = e2;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                e = e3;
                            } catch (XmlPullParserException e4) {
                                e = e4;
                            }
                        }
                        m3211.setTarget(this.f6756.f6760.f6771.f6777.f6793.getOrDefault(string, null));
                        if (i < 21) {
                            m3199(m3211);
                        }
                        C1463 c1463 = this.f6756;
                        if (c1463.f6764 == null) {
                            c1463.f6764 = new ArrayList<>();
                            this.f6756.f6763 = new C1502<>();
                        }
                        this.f6756.f6764.add(m3211);
                        this.f6756.f6763.put(m3211, string);
                    }
                    obtainAttributes.recycle();
                    eventType = xmlPullParser.next();
                    i2 = 21;
                }
            }
            eventType = xmlPullParser.next();
            i2 = 21;
        }
        C1463 c14632 = this.f6756;
        if (c14632.f6761 == null) {
            c14632.f6761 = new AnimatorSet();
        }
        c14632.f6761.playTogether(c14632.f6764);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6850;
        return drawable != null ? C2786.m4797(drawable) : this.f6756.f6760.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f6850;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f6756.f6761.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.isStateful() : this.f6756.f6760.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6756.f6760.setBounds(rect);
        }
    }

    @Override // p034.p074.p075.p076.AbstractC1480, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.setLevel(i) : this.f6756.f6760.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6850;
        return drawable != null ? drawable.setState(iArr) : this.f6756.f6760.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f6756.f6760.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            C2786.m4824(drawable, z);
            return;
        }
        C1466 c1466 = this.f6756.f6760;
        Drawable drawable2 = c1466.f6850;
        if (drawable2 != null) {
            C2786.m4824(drawable2, z);
        } else {
            c1466.f6771.f6782 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        C1466 c1466 = this.f6756.f6760;
        Drawable drawable2 = c1466.f6850;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        } else {
            c1466.f6772 = colorFilter;
            c1466.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTint(int i) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            C2786.m4806(drawable, i);
        } else {
            this.f6756.f6760.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            C2786.m4788(drawable, colorStateList);
        } else {
            this.f6756.f6760.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            C2786.m4802(drawable, mode);
        } else {
            this.f6756.f6760.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f6756.f6760.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f6756.f6761.isStarted()) {
                return;
            }
            this.f6756.f6761.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f6850;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6756.f6761.end();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m3199(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m3199(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f6757 == null) {
                    this.f6757 = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f6757);
            }
        }
    }

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1464 extends Drawable.ConstantState {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Drawable.ConstantState f6765;

        public C1464(Drawable.ConstantState constantState) {
            this.f6765 = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6765.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6765.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1462 c1462 = new C1462(null, null, null);
            Drawable newDrawable = this.f6765.newDrawable();
            c1462.f6850 = newDrawable;
            newDrawable.setCallback(c1462.f6758);
            return c1462;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1462 c1462 = new C1462(null, null, null);
            Drawable newDrawable = this.f6765.newDrawable(resources);
            c1462.f6850 = newDrawable;
            newDrawable.setCallback(c1462.f6758);
            return c1462;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1462 c1462 = new C1462(null, null, null);
            Drawable newDrawable = this.f6765.newDrawable(resources, theme);
            c1462.f6850 = newDrawable;
            newDrawable.setCallback(c1462.f6758);
            return c1462;
        }
    }
}
