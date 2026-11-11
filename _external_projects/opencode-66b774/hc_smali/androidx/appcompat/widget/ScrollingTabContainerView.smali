.class public Landroidx/appcompat/widget/ScrollingTabContainerView;
.super Landroid/widget/HorizontalScrollView;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;,
        Landroidx/appcompat/widget/ScrollingTabContainerView$げつ〴ぬぐ;,
        Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:Ljava/lang/Runnable;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:I

.field public びぐびあび:Landroid/widget/Spinner;

.field public ぺぁあねじ:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 8

    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ScrollingTabContainerView$くし〴〺ぅ;-><init>(Landroidx/appcompat/widget/ScrollingTabContainerView;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->setHorizontalScrollBarEnabled(Z)V

    .line 1
    sget-object v1, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar:[I

    sget v2, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionBarStyle:I

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v1, v2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_height:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lづざかべべ/〺つふすそ/〺つふすそ;->abc_action_bar_embed_tabs:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v4

    if-nez v4, :cond_35

    .line 3
    sget v4, Lづざかべべ/〺つふすそ/びぐびあび;->abc_action_bar_stacked_max_height:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_35
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 4
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->setContentHeight(I)V

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lづざかべべ/〺つふすそ/びぐびあび;->abc_action_bar_stacked_tab_max_width:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 6
    iput p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->ぁごぐすすぃ:I

    .line 7
    new-instance p1, Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionBarTabBarStyle:I

    invoke-direct {p1, v0, v3, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->setMeasureWithLargestChildEnabled(Z)V

    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V

    new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->〺つふすそ:Ljava/lang/Runnable;

    if-eqz v0, :cond_a

    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->post(Ljava/lang/Runnable;)Z

    :cond_a
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 7

    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 1
    sget-object v0, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar:[I

    sget v1, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionBarStyle:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_height:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lづざかべべ/〺つふすそ/〺つふすそ;->abc_action_bar_embed_tabs:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v3

    if-nez v3, :cond_31

    .line 3
    sget v3, Lづざかべべ/〺つふすそ/びぐびあび;->abc_action_bar_stacked_max_height:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_31
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 4
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/ScrollingTabContainerView;->setContentHeight(I)V

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lづざかべべ/〺つふすそ/びぐびあび;->abc_action_bar_stacked_tab_max_width:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 6
    iput p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->ぁごぐすすぃ:I

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->〺つふすそ:Ljava/lang/Runnable;

    if-eqz v0, :cond_a

    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_a
    return-void
.end method

.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    check-cast p2, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;

    .line 1
    iget-object p1, p2, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;->くし〴〺ぅ:Landroidx/appcompat/app/ActionBar$〺つふすそ;

    .line 2
    invoke-virtual {p1}, Landroidx/appcompat/app/ActionBar$〺つふすそ;->づざかべべ()V

    return-void
.end method

.method public onMeasure(II)V
    .registers 10

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p2, v0, :cond_c

    const/4 v3, 0x1

    goto :goto_d

    :cond_c
    const/4 v3, 0x0

    :goto_d
    invoke-virtual {p0, v3}, Landroid/widget/HorizontalScrollView;->setFillViewport(Z)V

    iget-object v4, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v5, -0x1

    if-le v4, v1, :cond_42

    if-eq p2, v0, :cond_1f

    const/high16 v6, -0x80000000

    if-ne p2, v6, :cond_42

    :cond_1f
    const/4 p2, 0x2

    if-le v4, p2, :cond_30

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    int-to-float p2, p2

    const v4, 0x3ecccccd    # 0.4f

    mul-float p2, p2, v4

    float-to-int p2, p2

    iput p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->なぎぱいぢぎ:I

    goto :goto_37

    :cond_30
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    div-int/2addr v4, p2

    iput v4, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->なぎぱいぢぎ:I

    :goto_37
    iget p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->なぎぱいぢぎ:I

    iget v4, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->ぁごぐすすぃ:I

    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->なぎぱいぢぎ:I

    goto :goto_44

    :cond_42
    iput v5, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->なぎぱいぢぎ:I

    :goto_44
    iget p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->〳ぜぞぜべっ:I

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    if-nez v3, :cond_52

    iget-boolean v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->づざかべべ:Z

    if-eqz v0, :cond_52

    const/4 v0, 0x1

    goto :goto_53

    :cond_52
    const/4 v0, 0x0

    :goto_53
    if-eqz v0, :cond_c5

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0, v2, p2}, Landroid/view/ViewGroup;->measure(II)V

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    if-le v0, v4, :cond_c5

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    if-eqz v0, :cond_71

    invoke-virtual {v0}, Landroid/widget/Spinner;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_71

    goto :goto_72

    :cond_71
    const/4 v1, 0x0

    :goto_72
    if-eqz v1, :cond_75

    goto :goto_c8

    .line 2
    :cond_75
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    const/4 v1, 0x0

    const/4 v2, -0x2

    if-nez v0, :cond_93

    .line 3
    new-instance v0, Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v6, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionDropDownStyle:I

    invoke-direct {v0, v4, v1, v6}, Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v4, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    invoke-direct {v4, v2, v5}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4}, Landroid/widget/Spinner;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, p0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 4
    iput-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    :cond_93
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v2, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v4}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    if-nez v0, :cond_b4

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    new-instance v2, Landroidx/appcompat/widget/ScrollingTabContainerView$げつ〴ぬぐ;

    invoke-direct {v2, p0}, Landroidx/appcompat/widget/ScrollingTabContainerView$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/ScrollingTabContainerView;)V

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    :cond_b4
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->〺つふすそ:Ljava/lang/Runnable;

    if-eqz v0, :cond_bd

    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->removeCallbacks(Ljava/lang/Runnable;)Z

    iput-object v1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->〺つふすそ:Ljava/lang/Runnable;

    :cond_bd
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    iget v1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->ぺぁあねじ:I

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_c8

    .line 5
    :cond_c5
    invoke-virtual {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->げつ〴ぬぐ()Z

    :goto_c8
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getMeasuredWidth()I

    move-result v0

    invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getMeasuredWidth()I

    move-result p1

    if-eqz v3, :cond_dc

    if-eq v0, p1, :cond_dc

    iget p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->ぺぁあねじ:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ScrollingTabContainerView;->setTabSelected(I)V

    :cond_dc
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method public setAllowCollapse(Z)V
    .registers 2

    iput-boolean p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->づざかべべ:Z

    return-void
.end method

.method public setContentHeight(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->〳ぜぞぜべっ:I

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->requestLayout()V

    return-void
.end method

.method public setTabSelected(I)V
    .registers 7

    iput p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->ぺぁあねじ:I

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_a
    if-ge v2, v0, :cond_36

    iget-object v3, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-ne v2, p1, :cond_16

    const/4 v4, 0x1

    goto :goto_17

    :cond_16
    const/4 v4, 0x0

    :goto_17
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    if-eqz v4, :cond_33

    .line 1
    iget-object v3, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->〺つふすそ:Ljava/lang/Runnable;

    if-eqz v4, :cond_29

    invoke-virtual {p0, v4}, Landroid/widget/HorizontalScrollView;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_29
    new-instance v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉ〲なぱぽた;

    invoke-direct {v4, p0, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉ〲なぱぽた;-><init>(Landroidx/appcompat/widget/ScrollingTabContainerView;Landroid/view/View;)V

    iput-object v4, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->〺つふすそ:Ljava/lang/Runnable;

    invoke-virtual {p0, v4}, Landroid/widget/HorizontalScrollView;->post(Ljava/lang/Runnable;)Z

    :cond_33
    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    .line 2
    :cond_36
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    if-eqz v0, :cond_3f

    if-ltz p1, :cond_3f

    invoke-virtual {v0, p1}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_3f
    return-void
.end method

.method public final げつ〴ぬぐ()Z
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/widget/Spinner;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_d

    const/4 v0, 0x1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    if-nez v0, :cond_11

    return v1

    .line 2
    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x1

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v2}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->びぐびあび:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->setTabSelected(I)V

    return v1
.end method
