package com.github.clans.fab;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import p131.p158.p159.p160.C2102;
import p131.p158.p159.p160.ViewOnClickListenerC2103;
import team.dev.epro.apkcustom.MainActivity;

/* loaded from: /tmp/opencode/hc_real.dex */
public class FloatingActionMenu extends ViewGroup {

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public Context f2411;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public int f2412;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2413;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public int f2414;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AnimatorSet f2415;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public Interpolator f2416;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f2417;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2418;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public int f2419;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f2420;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public float f2421;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f2422;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public boolean f2423;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f2424;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public Typeface f2425;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f2426;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f2427;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public int f2428;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public Interpolator f2429;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f2430;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public ValueAnimator f2431;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public String f2432;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public InterfaceC0361 f2433;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AnimatorSet f2434;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public boolean f2435;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public int f2436;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public boolean f2437;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public Animation f2438;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public ColorStateList f2439;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public ImageView f2440;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public float f2441;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f2442;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public float f2443;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public ValueAnimator f2444;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public int f2445;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public int f2446;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2447;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public int f2448;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f2449;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f2450;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public float f2451;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public boolean f2452;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public int f2453;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public FloatingActionButton f2454;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f2455;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public boolean f2456;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Handler f2457;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f2458;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public int f2459;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public boolean f2460;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f2461;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AnimatorSet f2462;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f2463;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public Drawable f2464;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f2465;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f2466;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public Animation f2467;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public int f2468;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f2469;

    /* renamed from: com.github.clans.fab.FloatingActionMenu$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0360 implements Runnable {
        public RunnableC0360() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FloatingActionMenu floatingActionMenu = FloatingActionMenu.this;
            floatingActionMenu.f2469 = false;
            InterfaceC0361 interfaceC0361 = floatingActionMenu.f2433;
            if (interfaceC0361 != null) {
                ((MainActivity.C0516) interfaceC0361).m1634(false);
            }
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionMenu$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC0361 {
    }

    /* renamed from: com.github.clans.fab.FloatingActionMenu$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0362 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ FloatingActionButton f2471;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ boolean f2472;

        public RunnableC0362(FloatingActionButton floatingActionButton, boolean z) {
            this.f2471 = floatingActionButton;
            this.f2472 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            FloatingActionMenu floatingActionMenu = FloatingActionMenu.this;
            if (floatingActionMenu.f2469) {
                FloatingActionButton floatingActionButton = this.f2471;
                if (floatingActionButton != floatingActionMenu.f2454) {
                    floatingActionButton.m1185(this.f2472);
                }
                Label label = (Label) this.f2471.getTag(C2102.fab_label);
                if (label == null || !label.f2483) {
                    return;
                }
                if (this.f2472 && label.f2479 != null) {
                    label.f2481.cancel();
                    label.startAnimation(label.f2479);
                }
                label.setVisibility(4);
            }
        }
    }

    public FloatingActionMenu(Context context) {
        this(context, null);
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0312, code lost:
    
        if (r12 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0320, code lost:
    
        r1 = 135.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0322, code lost:
    
        r12 = android.animation.ObjectAnimator.ofFloat(r10.f2440, "rotation", r3, 0.0f);
        r10.f2415.play(android.animation.ObjectAnimator.ofFloat(r10.f2440, "rotation", 0.0f, r1));
        r10.f2434.play(r12);
        r10.f2415.setInterpolator(r10.f2429);
        r10.f2434.setInterpolator(r10.f2416);
        r10.f2415.setDuration(300L);
        r10.f2434.setDuration(300L);
        r12 = r11.getResourceId(p131.p158.p159.p160.C2109.FloatingActionMenu_menu_fab_show_animation, p131.p158.p159.p160.C2101.fab_scale_up);
        setMenuButtonShowAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), r12));
        android.view.animation.AnimationUtils.loadAnimation(getContext(), r12);
        r12 = r11.getResourceId(p131.p158.p159.p160.C2109.FloatingActionMenu_menu_fab_hide_animation, p131.p158.p159.p160.C2101.fab_scale_down);
        setMenuButtonHideAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), r12));
        android.view.animation.AnimationUtils.loadAnimation(getContext(), r12);
        r11.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0395, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x031e, code lost:
    
        if (r12 == 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatingActionMenu(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.clans.fab.FloatingActionMenu.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setLabelEllipsize(Label label) {
        TextUtils.TruncateAt truncateAt;
        int i = this.f2453;
        if (i == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (i != 4) {
            return;
        } else {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        }
        label.setEllipsize(truncateAt);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimationDelayPerItem() {
        return this.f2436;
    }

    public AnimatorSet getIconToggleAnimatorSet() {
        return this.f2462;
    }

    public int getMenuButtonColorNormal() {
        return this.f2468;
    }

    public int getMenuButtonColorPressed() {
        return this.f2428;
    }

    public int getMenuButtonColorRipple() {
        return this.f2445;
    }

    public String getMenuButtonLabelText() {
        return this.f2432;
    }

    public ImageView getMenuIconView() {
        return this.f2440;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.f2454);
        bringChildToFront(this.f2440);
        this.f2420 = getChildCount();
        for (int i = 0; i < this.f2420; i++) {
            if (getChildAt(i) != this.f2440) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) getChildAt(i);
                int i2 = C2102.fab_label;
                if (floatingActionButton.getTag(i2) == null) {
                    String labelText = floatingActionButton.getLabelText();
                    if (!TextUtils.isEmpty(labelText)) {
                        Label label = new Label(this.f2411);
                        label.setClickable(true);
                        label.setFab(floatingActionButton);
                        label.setShowAnimation(AnimationUtils.loadAnimation(getContext(), this.f2465));
                        label.setHideAnimation(AnimationUtils.loadAnimation(getContext(), this.f2430));
                        if (this.f2446 > 0) {
                            label.setTextAppearance(getContext(), this.f2446);
                            label.setShowShadow(false);
                            label.setUsingStyle(true);
                        } else {
                            int i3 = this.f2417;
                            int i4 = this.f2426;
                            int i5 = this.f2422;
                            label.f2478 = i3;
                            label.f2492 = i4;
                            label.f2485 = i5;
                            label.setShowShadow(this.f2463);
                            label.setCornerRadius(this.f2450);
                            if (this.f2453 > 0) {
                                setLabelEllipsize(label);
                            }
                            label.setMaxLines(this.f2419);
                            label.m1192();
                            label.setTextSize(0, this.f2441);
                            label.setTextColor(this.f2439);
                            int i6 = this.f2458;
                            int i7 = this.f2424;
                            if (this.f2463) {
                                i6 += Math.abs(floatingActionButton.getShadowXOffset()) + floatingActionButton.getShadowRadius();
                                i7 += Math.abs(floatingActionButton.getShadowYOffset()) + floatingActionButton.getShadowRadius();
                            }
                            label.setPadding(i6, i7, this.f2458, this.f2424);
                            if (this.f2419 < 0 || this.f2437) {
                                label.setSingleLine(this.f2437);
                            }
                        }
                        Typeface typeface = this.f2425;
                        if (typeface != null) {
                            label.setTypeface(typeface);
                        }
                        label.setText(labelText);
                        label.setOnClickListener(floatingActionButton.getOnClickListener());
                        addView(label);
                        floatingActionButton.setTag(i2, label);
                    }
                    FloatingActionButton floatingActionButton2 = this.f2454;
                    if (floatingActionButton == floatingActionButton2) {
                        floatingActionButton2.setOnClickListener(new ViewOnClickListenerC2103(this));
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingRight = this.f2459 == 0 ? ((i3 - i) - (this.f2418 / 2)) - getPaddingRight() : getPaddingLeft() + (this.f2418 / 2);
        boolean z2 = this.f2412 == 0;
        int measuredHeight = z2 ? ((i4 - i2) - this.f2454.getMeasuredHeight()) - getPaddingBottom() : getPaddingTop();
        int measuredWidth = paddingRight - (this.f2454.getMeasuredWidth() / 2);
        FloatingActionButton floatingActionButton = this.f2454;
        floatingActionButton.layout(measuredWidth, measuredHeight, floatingActionButton.getMeasuredWidth() + measuredWidth, this.f2454.getMeasuredHeight() + measuredHeight);
        int measuredWidth2 = paddingRight - (this.f2440.getMeasuredWidth() / 2);
        int measuredHeight2 = ((this.f2454.getMeasuredHeight() / 2) + measuredHeight) - (this.f2440.getMeasuredHeight() / 2);
        ImageView imageView = this.f2440;
        imageView.layout(measuredWidth2, measuredHeight2, imageView.getMeasuredWidth() + measuredWidth2, this.f2440.getMeasuredHeight() + measuredHeight2);
        if (z2) {
            measuredHeight = this.f2447 + this.f2454.getMeasuredHeight() + measuredHeight;
        }
        for (int i5 = this.f2420 - 1; i5 >= 0; i5--) {
            View childAt = getChildAt(i5);
            if (childAt != this.f2440) {
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) childAt;
                if (floatingActionButton2.getVisibility() != 8) {
                    int measuredWidth3 = paddingRight - (floatingActionButton2.getMeasuredWidth() / 2);
                    if (z2) {
                        measuredHeight = (measuredHeight - floatingActionButton2.getMeasuredHeight()) - this.f2447;
                    }
                    if (floatingActionButton2 != this.f2454) {
                        floatingActionButton2.layout(measuredWidth3, measuredHeight, floatingActionButton2.getMeasuredWidth() + measuredWidth3, floatingActionButton2.getMeasuredHeight() + measuredHeight);
                        if (!this.f2449) {
                            floatingActionButton2.m1185(false);
                        }
                    }
                    View view = (View) floatingActionButton2.getTag(C2102.fab_label);
                    if (view != null) {
                        int measuredWidth4 = ((this.f2452 ? this.f2418 : floatingActionButton2.getMeasuredWidth()) / 2) + this.f2413;
                        int i6 = this.f2459;
                        int i7 = i6 == 0 ? paddingRight - measuredWidth4 : measuredWidth4 + paddingRight;
                        int measuredWidth5 = i6 == 0 ? i7 - view.getMeasuredWidth() : view.getMeasuredWidth() + i7;
                        int i8 = this.f2459;
                        int i9 = i8 == 0 ? measuredWidth5 : i7;
                        if (i8 != 0) {
                            i7 = measuredWidth5;
                        }
                        int measuredHeight3 = ((floatingActionButton2.getMeasuredHeight() - view.getMeasuredHeight()) / 2) + (measuredHeight - this.f2466);
                        view.layout(i9, measuredHeight3, i7, view.getMeasuredHeight() + measuredHeight3);
                        if (!this.f2449) {
                            view.setVisibility(4);
                        }
                    }
                    measuredHeight = z2 ? measuredHeight - this.f2447 : this.f2447 + childAt.getMeasuredHeight() + measuredHeight;
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f2418 = 0;
        measureChildWithMargins(this.f2440, i, 0, i2, 0);
        for (int i3 = 0; i3 < this.f2420; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && childAt != this.f2440) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
                this.f2418 = Math.max(this.f2418, childAt.getMeasuredWidth());
            }
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= this.f2420) {
                break;
            }
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8 && childAt2 != this.f2440) {
                int measuredWidth = childAt2.getMeasuredWidth() + 0;
                int measuredHeight = childAt2.getMeasuredHeight() + i4;
                Label label = (Label) childAt2.getTag(C2102.fab_label);
                if (label != null) {
                    int measuredWidth2 = (this.f2418 - childAt2.getMeasuredWidth()) / (this.f2452 ? 1 : 2);
                    measureChildWithMargins(label, i, childAt2.getMeasuredWidth() + (label.f2477 ? Math.abs(label.f2482) + label.f2476 : 0) + this.f2413 + measuredWidth2, i2, 0);
                    i6 = Math.max(i6, label.getMeasuredWidth() + measuredWidth + measuredWidth2);
                }
                i4 = measuredHeight;
            }
            i5++;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(this.f2418, i6 + this.f2413);
        double paddingBottom = getPaddingBottom() + getPaddingTop() + ((this.f2420 - 1) * this.f2447) + i4;
        Double.isNaN(paddingBottom);
        Double.isNaN(paddingBottom);
        Double.isNaN(paddingBottom);
        Double.isNaN(paddingBottom);
        Double.isNaN(paddingBottom);
        Double.isNaN(paddingBottom);
        int i7 = (int) ((0.03d * paddingBottom) + paddingBottom);
        if (getLayoutParams().width == -1) {
            paddingRight = ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), i);
        }
        if (getLayoutParams().height == -1) {
            i7 = ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), i2);
        }
        setMeasuredDimension(paddingRight, i7);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2435) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            return this.f2469;
        }
        if (action != 1) {
            return false;
        }
        m1188(this.f2423);
        return true;
    }

    public void setAnimated(boolean z) {
        this.f2423 = z;
        this.f2415.setDuration(z ? 300L : 0L);
        this.f2434.setDuration(z ? 300L : 0L);
    }

    public void setAnimationDelayPerItem(int i) {
        this.f2436 = i;
    }

    public void setClosedOnTouchOutside(boolean z) {
        this.f2435 = z;
    }

    public void setIconAnimated(boolean z) {
        this.f2460 = z;
    }

    public void setIconAnimationCloseInterpolator(Interpolator interpolator) {
        this.f2434.setInterpolator(interpolator);
    }

    public void setIconAnimationInterpolator(Interpolator interpolator) {
        this.f2415.setInterpolator(interpolator);
        this.f2434.setInterpolator(interpolator);
    }

    public void setIconAnimationOpenInterpolator(Interpolator interpolator) {
        this.f2415.setInterpolator(interpolator);
    }

    public void setIconToggleAnimatorSet(AnimatorSet animatorSet) {
        this.f2462 = animatorSet;
    }

    public void setMenuButtonColorNormal(int i) {
        this.f2468 = i;
        this.f2454.setColorNormal(i);
    }

    public void setMenuButtonColorNormalResId(int i) {
        this.f2468 = getResources().getColor(i);
        this.f2454.setColorNormalResId(i);
    }

    public void setMenuButtonColorPressed(int i) {
        this.f2428 = i;
        this.f2454.setColorPressed(i);
    }

    public void setMenuButtonColorPressedResId(int i) {
        this.f2428 = getResources().getColor(i);
        this.f2454.setColorPressedResId(i);
    }

    public void setMenuButtonColorRipple(int i) {
        this.f2445 = i;
        this.f2454.setColorRipple(i);
    }

    public void setMenuButtonColorRippleResId(int i) {
        this.f2445 = getResources().getColor(i);
        this.f2454.setColorRippleResId(i);
    }

    public void setMenuButtonHideAnimation(Animation animation) {
        this.f2467 = animation;
        this.f2454.setHideAnimation(animation);
    }

    public void setMenuButtonLabelText(String str) {
        this.f2454.setLabelText(str);
    }

    public void setMenuButtonShowAnimation(Animation animation) {
        this.f2438 = animation;
        this.f2454.setShowAnimation(animation);
    }

    public void setOnMenuButtonClickListener(View.OnClickListener onClickListener) {
        this.f2454.setOnClickListener(onClickListener);
    }

    public void setOnMenuButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2454.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMenuToggleListener(InterfaceC0361 interfaceC0361) {
        this.f2433 = interfaceC0361;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m1187(boolean z) {
        if (getVisibility() == 4) {
            if (z) {
                startAnimation(this.f2438);
            }
            setVisibility(0);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1188(boolean z) {
        if (this.f2469) {
            if (this.f2414 != 0) {
                this.f2431.start();
            }
            if (this.f2460) {
                AnimatorSet animatorSet = this.f2462;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    this.f2434.start();
                    this.f2415.cancel();
                }
            }
            this.f2449 = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                    i++;
                    this.f2457.postDelayed(new RunnableC0362((FloatingActionButton) childAt, z), i2);
                    i2 += this.f2436;
                }
            }
            this.f2457.postDelayed(new RunnableC0360(), (i + 1) * this.f2436);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
