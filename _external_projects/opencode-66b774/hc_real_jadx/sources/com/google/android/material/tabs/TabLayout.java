package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p042.C1053;
import p034.p035.p042.C1055;
import p034.p035.p045.C1096;
import p034.p035.p045.C1114;
import p034.p035.p045.p046.C1084;
import p034.p050.p055.p056.C1266;
import p034.p084.p085.AbstractC1512;
import p034.p095.C1687;
import p131.p161.p162.p163.C2110;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p175.C2223;
import p131.p161.p162.p163.p176.ViewOnLayoutChangeListenerC2225;
import p131.p161.p162.p163.p181.C2235;
import p131.p161.p162.p163.p185.C2255;
import p131.p161.p162.p163.p186.C2294;
import p237.p238.p239.p241.p242.C2786;

@ViewPager.InterfaceC0304
/* loaded from: /tmp/opencode/hc_real.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static final int f3445 = C2350.Widget_Design_TabLayout;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public static final C1053<C0465> f3446 = new C1055(16);

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f3447;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ArrayList<C0465> f3448;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public C0463 f3449;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f3450;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f3451;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f3452;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean f3453;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f3454;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public C0464 f3455;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public float f3456;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f3457;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public float f3458;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public InterfaceC0466 f3459;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public DataSetObserver f3460;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public PorterDuff.Mode f3461;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C0465 f3462;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public AbstractC1512 f3463;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public boolean f3464;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final int f3465;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final int f3466;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final int f3467;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public InterfaceC0466 f3468;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public ValueAnimator f3469;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C0469 f3470;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public ColorStateList f3471;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final int f3472;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f3473;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public final C1053<TabView> f3474;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f3475;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean f3476;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public ColorStateList f3477;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f3478;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f3479;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final RectF f3480;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f3481;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public ViewPager f3482;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Drawable f3483;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f3484;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final ArrayList<InterfaceC0466> f3485;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public ColorStateList f3486;

    public final class TabView extends LinearLayout {

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public static final /* synthetic */ int f3487 = 0;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public TextView f3488;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0465 f3489;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public View f3490;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public Drawable f3491;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public TextView f3492;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public View f3493;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public BadgeDrawable f3495;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public ImageView f3496;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public ImageView f3497;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public int f3498;

        public TabView(Context context) {
            super(context);
            this.f3498 = 2;
            m1496(context);
            int i = TabLayout.this.f3475;
            int i2 = TabLayout.this.f3451;
            int i3 = TabLayout.this.f3447;
            int i4 = TabLayout.this.f3484;
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 17) {
                setPaddingRelative(i, i2, i3, i4);
            } else {
                setPadding(i, i2, i3, i4);
            }
            setGravity(17);
            setOrientation(!TabLayout.this.f3476 ? 1 : 0);
            setClickable(true);
            C1096.m2514(this, C1114.m2557(getContext(), 1002));
        }

        private BadgeDrawable getBadge() {
            return this.f3495;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f3492, this.f3496, this.f3490};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f3495 == null) {
                Context context = getContext();
                int i = BadgeDrawable.f2957;
                int i2 = BadgeDrawable.f2956;
                BadgeDrawable badgeDrawable = new BadgeDrawable(context);
                int[] iArr = C2243.Badge;
                C2255.m4406(context, null, i, i2);
                C2255.m4404(context, null, iArr, i, i2, new int[0]);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, i, i2);
                badgeDrawable.m1306(obtainStyledAttributes.getInt(C2243.Badge_maxCharacterCount, 4));
                int i3 = C2243.Badge_number;
                if (obtainStyledAttributes.hasValue(i3)) {
                    badgeDrawable.m1300(obtainStyledAttributes.getInt(i3, 0));
                }
                badgeDrawable.m1304(C1687.m3662(context, obtainStyledAttributes, C2243.Badge_backgroundColor).getDefaultColor());
                int i4 = C2243.Badge_badgeTextColor;
                if (obtainStyledAttributes.hasValue(i4)) {
                    badgeDrawable.m1297(C1687.m3662(context, obtainStyledAttributes, i4).getDefaultColor());
                }
                badgeDrawable.m1299(obtainStyledAttributes.getInt(C2243.Badge_badgeGravity, 8388661));
                badgeDrawable.f2972.f2984 = obtainStyledAttributes.getDimensionPixelOffset(C2243.Badge_horizontalOffset, 0);
                badgeDrawable.m1307();
                badgeDrawable.f2972.f2980 = obtainStyledAttributes.getDimensionPixelOffset(C2243.Badge_verticalOffset, 0);
                badgeDrawable.m1307();
                obtainStyledAttributes.recycle();
                this.f3495 = badgeDrawable;
            }
            m1494();
            BadgeDrawable badgeDrawable2 = this.f3495;
            if (badgeDrawable2 != null) {
                return badgeDrawable2;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f3491;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f3491.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public C0465 getTab() {
            return this.f3489;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f3495;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f3495.m1301()));
            }
            C1084.C1086 m2470 = C1084.C1086.m2470(0, 1, this.f3489.f3510, 1, false, isSelected());
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) m2470.f5552);
            }
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                C1084.C1087 c1087 = C1084.C1087.f5554;
                if (i >= 21) {
                    accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c1087.f5566);
                }
            }
            if (i >= 19) {
                accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "Tab");
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
        
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L32;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L1e
                if (r1 == 0) goto L14
                if (r0 <= r2) goto L1e
            L14:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.f3478
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f3492
                if (r0 == 0) goto La8
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f3456
                int r1 = r7.f3498
                android.widget.ImageView r2 = r7.f3496
                r3 = 1
                if (r2 == 0) goto L38
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L38
                r1 = 1
                goto L46
            L38:
                android.widget.TextView r2 = r7.f3492
                if (r2 == 0) goto L46
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L46
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f3458
            L46:
                android.widget.TextView r2 = r7.f3492
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.f3492
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.f3492
                int r5 = p237.p238.p239.p241.p242.C2786.m4766(r5)
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 != 0) goto L60
                if (r5 < 0) goto La8
                if (r1 == r5) goto La8
            L60:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.f3479
                r6 = 0
                if (r5 != r3) goto L99
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L99
                if (r4 != r3) goto L99
                android.widget.TextView r2 = r7.f3492
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L98
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L99
            L98:
                r3 = 0
            L99:
                if (r3 == 0) goto La8
                android.widget.TextView r2 = r7.f3492
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f3492
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            La8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f3489 == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            C0465 c0465 = this.f3489;
            TabLayout tabLayout = c0465.f3509;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m1486(c0465, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f3492;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f3496;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f3490;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(C0465 c0465) {
            if (c0465 != this.f3489) {
                this.f3489 = c0465;
                m1488();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final void m1488() {
            FrameLayout frameLayout;
            Drawable drawable;
            FrameLayout frameLayout2;
            C0465 c0465 = this.f3489;
            Drawable drawable2 = null;
            View view = c0465 != null ? c0465.f3508 : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f3490 = view;
                TextView textView = this.f3492;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f3496;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f3496.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f3488 = textView2;
                if (textView2 != null) {
                    this.f3498 = C2786.m4766(textView2);
                }
                this.f3497 = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view2 = this.f3490;
                if (view2 != null) {
                    removeView(view2);
                    this.f3490 = null;
                }
                this.f3488 = null;
                this.f3497 = null;
            }
            boolean z = false;
            if (this.f3490 == null) {
                if (this.f3496 == null) {
                    if (C2223.f9238) {
                        frameLayout2 = new FrameLayout(getContext());
                        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        addView(frameLayout2, 0);
                    } else {
                        frameLayout2 = this;
                    }
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(C2110.design_layout_tab_icon, (ViewGroup) frameLayout2, false);
                    this.f3496 = imageView2;
                    frameLayout2.addView(imageView2, 0);
                }
                if (c0465 != null && (drawable = c0465.f3507) != null) {
                    drawable2 = C2786.m4758(drawable).mutate();
                }
                if (drawable2 != null) {
                    C2786.m4788(drawable2, TabLayout.this.f3471);
                    PorterDuff.Mode mode = TabLayout.this.f3461;
                    if (mode != null) {
                        C2786.m4802(drawable2, mode);
                    }
                }
                if (this.f3492 == null) {
                    if (C2223.f9238) {
                        frameLayout = new FrameLayout(getContext());
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        addView(frameLayout);
                    } else {
                        frameLayout = this;
                    }
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(C2110.design_layout_tab_text, (ViewGroup) frameLayout, false);
                    this.f3492 = textView3;
                    frameLayout.addView(textView3);
                    this.f3498 = C2786.m4766(this.f3492);
                }
                C2786.m4774(this.f3492, TabLayout.this.f3452);
                ColorStateList colorStateList = TabLayout.this.f3486;
                if (colorStateList != null) {
                    this.f3492.setTextColor(colorStateList);
                }
                m1491(this.f3492, this.f3496);
                m1494();
                ImageView imageView3 = this.f3496;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2225(this, imageView3));
                }
                TextView textView4 = this.f3492;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2225(this, textView4));
                }
            } else {
                TextView textView5 = this.f3488;
                if (textView5 != null || this.f3497 != null) {
                    m1491(textView5, this.f3497);
                }
            }
            if (c0465 != null && !TextUtils.isEmpty(c0465.f3506)) {
                setContentDescription(c0465.f3506);
            }
            if (c0465 != null) {
                TabLayout tabLayout = c0465.f3509;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                if (tabLayout.getSelectedTabPosition() == c0465.f3510) {
                    z = true;
                }
            }
            setSelected(z);
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final FrameLayout m1489(View view) {
            if ((view == this.f3496 || view == this.f3492) && C2223.f9238) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final void m1490(View view) {
            if (m1492() && view == this.f3493) {
                C2223.m4321(this.f3495, view, m1489(view));
            }
        }

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public final void m1491(TextView textView, ImageView imageView) {
            Drawable drawable;
            C0465 c0465 = this.f3489;
            Drawable mutate = (c0465 == null || (drawable = c0465.f3507) == null) ? null : C2786.m4758(drawable).mutate();
            C0465 c04652 = this.f3489;
            CharSequence charSequence = c04652 != null ? c04652.f3504 : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    this.f3489.getClass();
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int m3674 = (z && imageView.getVisibility() == 0) ? (int) C1687.m3674(getContext(), 8) : 0;
                if (TabLayout.this.f3476) {
                    if (m3674 != C2786.m4794(marginLayoutParams)) {
                        C2786.m4803(marginLayoutParams, m3674);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (m3674 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = m3674;
                    if (Build.VERSION.SDK_INT >= 17) {
                        marginLayoutParams.setMarginEnd(0);
                    } else {
                        marginLayoutParams.rightMargin = 0;
                    }
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C0465 c04653 = this.f3489;
            C2786.m4764(this, z ? null : c04653 != null ? c04653.f3506 : null);
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final boolean m1492() {
            return this.f3495 != null;
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final void m1493() {
            if (m1492()) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f3493;
                if (view != null) {
                    C2223.m4322(this.f3495, view, m1489(view));
                    this.f3493 = null;
                }
            }
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final void m1494() {
            C0465 c0465;
            View view;
            C0465 c04652;
            if (m1492()) {
                if (this.f3490 == null) {
                    ImageView imageView = this.f3496;
                    if (imageView == null || (c04652 = this.f3489) == null || c04652.f3507 == null) {
                        if (this.f3492 != null && (c0465 = this.f3489) != null) {
                            c0465.getClass();
                            View view2 = this.f3493;
                            TextView textView = this.f3492;
                            if (view2 == textView) {
                                m1490(textView);
                                return;
                            } else {
                                m1493();
                                view = this.f3492;
                            }
                        }
                    } else if (this.f3493 == imageView) {
                        m1490(imageView);
                        return;
                    } else {
                        m1493();
                        view = this.f3496;
                    }
                    m1495(view);
                    return;
                }
                m1493();
            }
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final void m1495(View view) {
            if (m1492() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                BadgeDrawable badgeDrawable = this.f3495;
                FrameLayout m1489 = m1489(view);
                C2223.m4321(badgeDrawable, view, m1489);
                if (C2223.f9238) {
                    m1489.setForeground(badgeDrawable);
                } else {
                    view.getOverlay().add(badgeDrawable);
                }
                this.f3493 = view;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.LinearLayout, com.google.android.material.tabs.TabLayout$TabView] */
        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public final void m1496(Context context) {
            int i = TabLayout.this.f3467;
            if (i != 0) {
                Drawable m2928 = C1266.m2928(context, i);
                this.f3491 = m2928;
                if (m2928 != null && m2928.isStateful()) {
                    this.f3491.setState(getDrawableState());
                }
            } else {
                this.f3491 = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f3477 != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList m4346 = C2235.m4346(TabLayout.this.f3477);
                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z = TabLayout.this.f3453;
                    if (z) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new RippleDrawable(m4346, gradientDrawable, z ? null : gradientDrawable2);
                } else {
                    Drawable m4758 = C2786.m4758(gradientDrawable2);
                    C2786.m4788(m4758, m4346);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, m4758});
                }
            }
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(gradientDrawable);
            } else {
                setBackgroundDrawable(gradientDrawable);
            }
            TabLayout.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$〳ぜぞぜべっ, reason: contains not printable characters */
    public static class C0463 implements ViewPager.InterfaceC0308 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final WeakReference<TabLayout> f3499;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f3500;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f3501;

        public C0463(TabLayout tabLayout) {
            this.f3499 = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
        /* renamed from: 〺つふすそ */
        public void mo1059(int i) {
            this.f3500 = this.f3501;
            this.f3501 = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
        /* renamed from: くし〴〺ぅ */
        public void mo1060(int i) {
            TabLayout tabLayout = this.f3499.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f3501;
            tabLayout.m1486(tabLayout.m1472(i), i2 == 0 || (i2 == 2 && this.f3500 == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
        /* renamed from: げつ〴ぬぐ */
        public void mo1061(int i, float f, int i2) {
            TabLayout tabLayout = this.f3499.get();
            if (tabLayout != null) {
                int i3 = this.f3501;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.f3500 == 1, (i3 == 2 && this.f3500 == 0) ? false : true);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$〺つふすそ, reason: contains not printable characters */
    public class C0464 implements ViewPager.InterfaceC0298 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f3502;

        public C0464() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0298
        /* renamed from: びぐびあび */
        public void mo1062(ViewPager viewPager, AbstractC1512 abstractC1512, AbstractC1512 abstractC15122) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f3482 == viewPager) {
                tabLayout.m1481(abstractC15122, this.f3502);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C0465 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public CharSequence f3504;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public TabView f3505;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public CharSequence f3506;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Drawable f3507;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public View f3508;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public TabLayout f3509;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f3510 = -1;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m1497() {
            TabView tabView = this.f3505;
            if (tabView != null) {
                tabView.m1488();
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0465 m1498(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f3506) && !TextUtils.isEmpty(charSequence)) {
                this.f3505.setContentDescription(charSequence);
            }
            this.f3504 = charSequence;
            m1497();
            return this;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC0466<T extends C0465> {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        void mo1499(T t);

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        void mo1500(T t);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo1501(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0467 implements ValueAnimator.AnimatorUpdateListener {
        public C0467() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$づざかべべ, reason: contains not printable characters */
    public class C0468 extends DataSetObserver {
        public C0468() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m1475();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m1475();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0469 extends LinearLayout {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f3513;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f3514;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f3515;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public ValueAnimator f3516;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Paint f3517;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f3518;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public int f3519;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public float f3520;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final GradientDrawable f3522;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int f3523;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public int f3524;

        /* renamed from: com.google.android.material.tabs.TabLayout$なぎぱいぢぎ$〺つふすそ, reason: contains not printable characters */
        public class C0470 extends AnimatorListenerAdapter {

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public final /* synthetic */ int f3526;

            public C0470(int i) {
                this.f3526 = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C0469 c0469 = C0469.this;
                c0469.f3518 = this.f3526;
                c0469.f3520 = 0.0f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C0469.this.f3518 = this.f3526;
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0471 implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final /* synthetic */ int f3527;

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public final /* synthetic */ int f3529;

            public C0471(int i, int i2) {
                this.f3529 = i;
                this.f3527 = i2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C0469 c0469 = C0469.this;
                int i = c0469.f3524;
                int i2 = this.f3529;
                TimeInterpolator timeInterpolator = C2294.f9509;
                c0469.m1502(Math.round((i2 - i) * animatedFraction) + i, Math.round(animatedFraction * (this.f3527 - r1)) + C0469.this.f3519);
            }
        }

        public C0469(Context context) {
            super(context);
            this.f3518 = -1;
            this.f3515 = -1;
            this.f3513 = -1;
            this.f3523 = -1;
            this.f3524 = -1;
            this.f3519 = -1;
            setWillNotDraw(false);
            this.f3517 = new Paint();
            this.f3522 = new GradientDrawable();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void draw(android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f3483
                r1 = 0
                if (r0 == 0) goto Lc
                int r0 = r0.getIntrinsicHeight()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                int r2 = r5.f3514
                if (r2 < 0) goto L12
                r0 = r2
            L12:
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.f3454
                if (r2 == 0) goto L31
                r3 = 1
                r4 = 2
                if (r2 == r3) goto L23
                if (r2 == r4) goto L3a
                r0 = 3
                if (r2 == r0) goto L36
                r0 = 0
                goto L3a
            L23:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r1 = r1 / r4
                int r2 = r5.getHeight()
                int r2 = r2 + r0
                int r0 = r2 / 2
                goto L3a
            L31:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
            L36:
                int r0 = r5.getHeight()
            L3a:
                int r2 = r5.f3513
                if (r2 < 0) goto L74
                int r3 = r5.f3523
                if (r3 <= r2) goto L74
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r2 = r2.f3483
                if (r2 == 0) goto L49
                goto L4b
            L49:
                android.graphics.drawable.GradientDrawable r2 = r5.f3522
            L4b:
                android.graphics.drawable.Drawable r2 = p237.p238.p239.p241.p242.C2786.m4758(r2)
                android.graphics.drawable.Drawable r2 = r2.mutate()
                int r3 = r5.f3513
                int r4 = r5.f3523
                r2.setBounds(r3, r1, r4, r0)
                android.graphics.Paint r0 = r5.f3517
                if (r0 == 0) goto L71
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                int r0 = r0.getColor()
                if (r1 != r3) goto L6e
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.setColorFilter(r0, r1)
                goto L71
            L6e:
                p237.p238.p239.p241.p242.C2786.m4806(r2, r0)
            L71:
                r2.draw(r6)
            L74:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C0469.draw(android.graphics.Canvas):void");
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f3516;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m1505();
            } else {
                m1506(false, this.f3518, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f3450 == 1 || tabLayout.f3479 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) C1687.m3674(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f3450 = 0;
                    tabLayout2.m1476(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.f3515 == i) {
                return;
            }
            requestLayout();
            this.f3515 = i;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m1502(int i, int i2) {
            if (i == this.f3513 && i2 == this.f3523) {
                return;
            }
            this.f3513 = i;
            this.f3523 = i2;
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void m1503(int i) {
            if (this.f3517.getColor() != i) {
                this.f3517.setColor(i);
                AtomicInteger atomicInteger = C1096.f5578;
                if (Build.VERSION.SDK_INT >= 16) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidate();
                }
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final void m1504(TabView tabView, RectF rectF) {
            int contentWidth = tabView.getContentWidth();
            int m3674 = (int) C1687.m3674(getContext(), 24);
            if (contentWidth < m3674) {
                contentWidth = m3674;
            }
            int right = (tabView.getRight() + tabView.getLeft()) / 2;
            int i = contentWidth / 2;
            rectF.set(right - i, 0.0f, right + i, 0.0f);
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final void m1505() {
            int i;
            int i2;
            View childAt = getChildAt(this.f3518);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f3473 && (childAt instanceof TabView)) {
                    m1504((TabView) childAt, tabLayout.f3480);
                    RectF rectF = TabLayout.this.f3480;
                    i = (int) rectF.left;
                    i2 = (int) rectF.right;
                }
                if (this.f3520 > 0.0f && this.f3518 < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f3518 + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f3473 && (childAt2 instanceof TabView)) {
                        m1504((TabView) childAt2, tabLayout2.f3480);
                        RectF rectF2 = TabLayout.this.f3480;
                        left = (int) rectF2.left;
                        right = (int) rectF2.right;
                    }
                    float f = this.f3520;
                    i = (int) (((1.0f - f) * i) + (left * f));
                    i2 = (int) (((1.0f - f) * i2) + (right * f));
                }
            }
            m1502(i, i2);
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final void m1506(boolean z, int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m1505();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.f3473 && (childAt instanceof TabView)) {
                m1504((TabView) childAt, tabLayout.f3480);
                RectF rectF = TabLayout.this.f3480;
                left = (int) rectF.left;
                right = (int) rectF.right;
            }
            int i3 = this.f3513;
            int i4 = this.f3523;
            if (i3 == left && i4 == right) {
                return;
            }
            if (z) {
                this.f3524 = i3;
                this.f3519 = i4;
            }
            C0471 c0471 = new C0471(left, right);
            if (!z) {
                this.f3516.removeAllUpdateListeners();
                this.f3516.addUpdateListener(c0471);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3516 = valueAnimator;
            valueAnimator.setInterpolator(C2294.f9507);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(c0471);
            valueAnimator.addListener(new C0470(i));
            valueAnimator.start();
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void m1507(int i) {
            if (this.f3514 != i) {
                this.f3514 = i;
                AtomicInteger atomicInteger = C1096.f5578;
                if (Build.VERSION.SDK_INT >= 16) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidate();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC0472 extends InterfaceC0466<C0465> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$ぺぁあねじ, reason: contains not printable characters */
    public static class C0473 implements InterfaceC0472 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final ViewPager f3530;

        public C0473(ViewPager viewPager) {
            this.f3530 = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC0466
        /* renamed from: 〺つふすそ */
        public void mo1499(C0465 c0465) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC0466
        /* renamed from: くし〴〺ぅ */
        public void mo1500(C0465 c0465) {
            this.f3530.setCurrentItem(c0465.f3510);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC0466
        /* renamed from: げつ〴ぬぐ */
        public void mo1501(C0465 c0465) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.tabStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getDefaultHeight() {
        int size = this.f3448.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C0465 c0465 = this.f3448.get(i);
                if (c0465 != null && c0465.f3507 != null && !TextUtils.isEmpty(c0465.f3504)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f3476) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f3465;
        if (i != -1) {
            return i;
        }
        int i2 = this.f3479;
        if (i2 == 0 || i2 == 2) {
            return this.f3472;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f3470.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f3470.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f3470.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static ColorStateList m1471(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m1473(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m1473(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m1473(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m1473(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C0465 c0465 = this.f3462;
        if (c0465 != null) {
            return c0465.f3510;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f3448.size();
    }

    public int getTabGravity() {
        return this.f3450;
    }

    public ColorStateList getTabIconTint() {
        return this.f3471;
    }

    public int getTabIndicatorGravity() {
        return this.f3454;
    }

    public int getTabMaxWidth() {
        return this.f3478;
    }

    public int getTabMode() {
        return this.f3479;
    }

    public ColorStateList getTabRippleColor() {
        return this.f3477;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f3483;
    }

    public ColorStateList getTabTextColors() {
        return this.f3486;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2163) {
            C1687.m3669(this, (C2163) background);
        }
        if (this.f3482 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m1482((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3464) {
            setupWithViewPager(null);
            this.f3464 = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        for (int i = 0; i < this.f3470.getChildCount(); i++) {
            View childAt = this.f3470.getChildAt(i);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).f3491) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.f3491.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1084.C1085 m2469 = C1084.C1085.m2469(1, getTabCount(), false, 1);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) m2469.f5551);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r0 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L29;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = p034.p095.C1687.m3674(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f3466
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = p034.p095.C1687.m3674(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f3478 = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f3479
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1687.m3731(this, f);
    }

    public void setInlineLabel(boolean z) {
        ImageView imageView;
        if (this.f3476 != z) {
            this.f3476 = z;
            for (int i = 0; i < this.f3470.getChildCount(); i++) {
                View childAt = this.f3470.getChildAt(i);
                if (childAt instanceof TabView) {
                    TabView tabView = (TabView) childAt;
                    tabView.setOrientation(!TabLayout.this.f3476 ? 1 : 0);
                    TextView textView = tabView.f3488;
                    if (textView == null && tabView.f3497 == null) {
                        textView = tabView.f3492;
                        imageView = tabView.f3496;
                    } else {
                        imageView = tabView.f3497;
                    }
                    tabView.m1491(textView, imageView);
                }
            }
            m1483();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC0466 interfaceC0466) {
        InterfaceC0466 interfaceC04662 = this.f3468;
        if (interfaceC04662 != null) {
            this.f3485.remove(interfaceC04662);
        }
        this.f3468 = interfaceC0466;
        if (interfaceC0466 == null || this.f3485.contains(interfaceC0466)) {
            return;
        }
        this.f3485.add(interfaceC0466);
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC0472 interfaceC0472) {
        setOnTabSelectedListener((InterfaceC0466) interfaceC0472);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m1474();
        this.f3469.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.f3470.getChildCount()) {
            return;
        }
        if (z2) {
            C0469 c0469 = this.f3470;
            ValueAnimator valueAnimator = c0469.f3516;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c0469.f3516.cancel();
            }
            c0469.f3518 = i;
            c0469.f3520 = f;
            c0469.m1505();
        }
        ValueAnimator valueAnimator2 = this.f3469;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f3469.cancel();
        }
        scrollTo(m1480(i, f), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    public void setSelectedTabIndicator(int i) {
        setSelectedTabIndicator(i != 0 ? C1266.m2928(getContext(), i) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f3483 != drawable) {
            this.f3483 = drawable;
            C1096.m2508(this.f3470);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f3470.m1503(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f3454 != i) {
            this.f3454 = i;
            C1096.m2508(this.f3470);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f3470.m1507(i);
    }

    public void setTabGravity(int i) {
        if (this.f3450 != i) {
            this.f3450 = i;
            m1483();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f3471 != colorStateList) {
            this.f3471 = colorStateList;
            m1484();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C1266.m2929(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f3473 = z;
        C1096.m2508(this.f3470);
    }

    public void setTabMode(int i) {
        if (i != this.f3479) {
            this.f3479 = i;
            m1483();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f3477 != colorStateList) {
            this.f3477 = colorStateList;
            for (int i = 0; i < this.f3470.getChildCount(); i++) {
                View childAt = this.f3470.getChildAt(i);
                if (childAt instanceof TabView) {
                    Context context = getContext();
                    int i2 = TabView.f3487;
                    ((TabView) childAt).m1496(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C1266.m2929(getContext(), i));
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m1471(i, i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f3486 != colorStateList) {
            this.f3486 = colorStateList;
            m1484();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC1512 abstractC1512) {
        m1481(abstractC1512, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f3453 != z) {
            this.f3453 = z;
            for (int i = 0; i < this.f3470.getChildCount(); i++) {
                View childAt = this.f3470.getChildAt(i);
                if (childAt instanceof TabView) {
                    Context context = getContext();
                    int i2 = TabView.f3487;
                    ((TabView) childAt).m1496(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        m1482(viewPager, z, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C0465 m1472(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f3448.get(i);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1473(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        C0465 m1485 = m1485();
        CharSequence charSequence = tabItem.f3442;
        if (charSequence != null) {
            m1485.m1498(charSequence);
        }
        Drawable drawable = tabItem.f3443;
        if (drawable != null) {
            m1485.f3507 = drawable;
            TabLayout tabLayout = m1485.f3509;
            if (tabLayout.f3450 == 1 || tabLayout.f3479 == 2) {
                tabLayout.m1476(true);
            }
            m1485.m1497();
            if (C2223.f9238) {
                TabView tabView = m1485.f3505;
                int i = TabView.f3487;
                if (tabView.m1492() && m1485.f3505.f3495.isVisible()) {
                    m1485.f3505.invalidate();
                }
            }
        }
        int i2 = tabItem.f3444;
        if (i2 != 0) {
            m1485.f3508 = LayoutInflater.from(m1485.f3505.getContext()).inflate(i2, (ViewGroup) m1485.f3505, false);
            m1485.m1497();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            m1485.f3506 = tabItem.getContentDescription();
            m1485.m1497();
        }
        m1479(m1485, this.f3448.isEmpty());
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m1474() {
        if (this.f3469 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3469 = valueAnimator;
            valueAnimator.setInterpolator(C2294.f9507);
            this.f3469.setDuration(this.f3457);
            this.f3469.addUpdateListener(new C0467());
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m1475() {
        int currentItem;
        for (int childCount = this.f3470.getChildCount() - 1; childCount >= 0; childCount--) {
            TabView tabView = (TabView) this.f3470.getChildAt(childCount);
            this.f3470.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.f3474.mo2385(tabView);
            }
            requestLayout();
        }
        Iterator<C0465> it = this.f3448.iterator();
        while (it.hasNext()) {
            C0465 next = it.next();
            it.remove();
            next.f3509 = null;
            next.f3505 = null;
            next.f3507 = null;
            next.f3504 = null;
            next.f3506 = null;
            next.f3510 = -1;
            next.f3508 = null;
            f3446.mo2385(next);
        }
        this.f3462 = null;
        AbstractC1512 abstractC1512 = this.f3463;
        if (abstractC1512 != null) {
            int mo1135 = abstractC1512.mo1135();
            for (int i = 0; i < mo1135; i++) {
                C0465 m1485 = m1485();
                m1485.m1498(this.f3463.mo1632(i));
                m1479(m1485, false);
            }
            ViewPager viewPager = this.f3482;
            if (viewPager == null || mo1135 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m1486(m1472(currentItem), true);
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void m1476(boolean z) {
        for (int i = 0; i < this.f3470.getChildCount(); i++) {
            View childAt = this.f3470.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m1477((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final void m1477(LinearLayout.LayoutParams layoutParams) {
        float f;
        if (this.f3479 == 1 && this.f3450 == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1478(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C1096.m2517(this)) {
            C0469 c0469 = this.f3470;
            int childCount = c0469.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    z = false;
                    break;
                } else {
                    if (c0469.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!z) {
                int scrollX = getScrollX();
                int m1480 = m1480(i, 0.0f);
                if (scrollX != m1480) {
                    m1474();
                    this.f3469.setIntValues(scrollX, m1480);
                    this.f3469.start();
                }
                C0469 c04692 = this.f3470;
                int i3 = this.f3457;
                ValueAnimator valueAnimator = c04692.f3516;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c04692.f3516.cancel();
                }
                c04692.m1506(true, i, i3);
                return;
            }
        }
        setScrollPosition(i, 0.0f, true);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1479(C0465 c0465, boolean z) {
        int size = this.f3448.size();
        if (c0465.f3509 != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        c0465.f3510 = size;
        this.f3448.add(size, c0465);
        int size2 = this.f3448.size();
        while (true) {
            size++;
            if (size >= size2) {
                break;
            } else {
                this.f3448.get(size).f3510 = size;
            }
        }
        TabView tabView = c0465.f3505;
        tabView.setSelected(false);
        tabView.setActivated(false);
        C0469 c0469 = this.f3470;
        int i = c0465.f3510;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m1477(layoutParams);
        c0469.addView(tabView, i, layoutParams);
        if (z) {
            TabLayout tabLayout = c0465.f3509;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m1486(c0465, true);
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int m1480(int i, float f) {
        int i2 = this.f3479;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f3470.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f3470.getChildCount() ? this.f3470.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return C1096.m2491(this) == 0 ? left + i4 : left - i4;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m1481(AbstractC1512 abstractC1512, boolean z) {
        DataSetObserver dataSetObserver;
        AbstractC1512 abstractC15122 = this.f3463;
        if (abstractC15122 != null && (dataSetObserver = this.f3460) != null) {
            abstractC15122.f6965.unregisterObserver(dataSetObserver);
        }
        this.f3463 = abstractC1512;
        if (z && abstractC1512 != null) {
            if (this.f3460 == null) {
                this.f3460 = new C0468();
            }
            abstractC1512.f6965.registerObserver(this.f3460);
        }
        m1475();
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final void m1482(ViewPager viewPager, boolean z, boolean z2) {
        List<ViewPager.InterfaceC0298> list;
        List<ViewPager.InterfaceC0308> list2;
        ViewPager viewPager2 = this.f3482;
        if (viewPager2 != null) {
            C0463 c0463 = this.f3449;
            if (c0463 != null && (list2 = viewPager2.f1901) != null) {
                list2.remove(c0463);
            }
            C0464 c0464 = this.f3455;
            if (c0464 != null && (list = this.f3482.f1916) != null) {
                list.remove(c0464);
            }
        }
        InterfaceC0466 interfaceC0466 = this.f3459;
        if (interfaceC0466 != null) {
            this.f3485.remove(interfaceC0466);
            this.f3459 = null;
        }
        if (viewPager != null) {
            this.f3482 = viewPager;
            if (this.f3449 == null) {
                this.f3449 = new C0463(this);
            }
            C0463 c04632 = this.f3449;
            c04632.f3501 = 0;
            c04632.f3500 = 0;
            viewPager.m1064(c04632);
            C0473 c0473 = new C0473(viewPager);
            this.f3459 = c0473;
            if (!this.f3485.contains(c0473)) {
                this.f3485.add(c0473);
            }
            AbstractC1512 adapter = viewPager.getAdapter();
            if (adapter != null) {
                m1481(adapter, z);
            }
            if (this.f3455 == null) {
                this.f3455 = new C0464();
            }
            C0464 c04642 = this.f3455;
            c04642.f3502 = z;
            if (viewPager.f1916 == null) {
                viewPager.f1916 = new ArrayList();
            }
            viewPager.f1916.add(c04642);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f3482 = null;
            m1481(null, false);
        }
        this.f3464 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 != 2) goto L22;
     */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1483() {
        /*
            r4 = this;
            int r0 = r4.f3479
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r4.f3481
            int r3 = r4.f3475
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            com.google.android.material.tabs.TabLayout$なぎぱいぢぎ r3 = r4.f3470
            p034.p035.p045.C1096.m2486(r3, r0, r2, r2, r2)
            int r0 = r4.f3479
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L23
            if (r0 == r1) goto L23
            goto L40
        L23:
            int r0 = r4.f3450
            com.google.android.material.tabs.TabLayout$なぎぱいぢぎ r0 = r4.f3470
            r0.setGravity(r2)
            goto L40
        L2b:
            int r0 = r4.f3450
            if (r0 == 0) goto L38
            if (r0 == r2) goto L34
            if (r0 == r1) goto L38
            goto L40
        L34:
            com.google.android.material.tabs.TabLayout$なぎぱいぢぎ r0 = r4.f3470
            r1 = 1
            goto L3d
        L38:
            com.google.android.material.tabs.TabLayout$なぎぱいぢぎ r0 = r4.f3470
            r1 = 8388611(0x800003, float:1.1754948E-38)
        L3d:
            r0.setGravity(r1)
        L40:
            r4.m1476(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.m1483():void");
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final void m1484() {
        int size = this.f3448.size();
        for (int i = 0; i < size; i++) {
            this.f3448.get(i).m1497();
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C0465 m1485() {
        C0465 mo2386 = f3446.mo2386();
        if (mo2386 == null) {
            mo2386 = new C0465();
        }
        mo2386.f3509 = this;
        C1053<TabView> c1053 = this.f3474;
        TabView mo23862 = c1053 != null ? c1053.mo2386() : null;
        if (mo23862 == null) {
            mo23862 = new TabView(getContext());
        }
        mo23862.setTab(mo2386);
        mo23862.setFocusable(true);
        mo23862.setMinimumWidth(getTabMinWidth());
        mo23862.setContentDescription(TextUtils.isEmpty(mo2386.f3506) ? mo2386.f3504 : mo2386.f3506);
        mo2386.f3505 = mo23862;
        return mo2386;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m1486(C0465 c0465, boolean z) {
        C0465 c04652 = this.f3462;
        if (c04652 == c0465) {
            if (c04652 != null) {
                for (int size = this.f3485.size() - 1; size >= 0; size--) {
                    this.f3485.get(size).mo1501(c0465);
                }
                m1478(c0465.f3510);
                return;
            }
            return;
        }
        int i = c0465 != null ? c0465.f3510 : -1;
        if (z) {
            if ((c04652 == null || c04652.f3510 == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                m1478(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f3462 = c0465;
        if (c04652 != null) {
            for (int size2 = this.f3485.size() - 1; size2 >= 0; size2--) {
                this.f3485.get(size2).mo1499(c04652);
            }
        }
        if (c0465 != null) {
            for (int size3 = this.f3485.size() - 1; size3 >= 0; size3--) {
                this.f3485.get(size3).mo1500(c0465);
            }
        }
    }
}
