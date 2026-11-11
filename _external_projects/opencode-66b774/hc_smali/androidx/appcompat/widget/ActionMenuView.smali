.class public Landroidx/appcompat/widget/ActionMenuView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$〺つふすそ;
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActionMenuView$LayoutParams;,
        Landroidx/appcompat/widget/ActionMenuView$げつ〴ぬぐ;,
        Landroidx/appcompat/widget/ActionMenuView$〺つふすそ;,
        Landroidx/appcompat/widget/ActionMenuView$くし〴〺ぅ;,
        Landroidx/appcompat/widget/ActionMenuView$びぐびあび;
    }
.end annotation


# instance fields
.field public 〻ぞまぎな〻:Z

.field public ぇ〳〲〺すっ:I

.field public ぉ〲なぱぽた:I

.field public ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

.field public ごづごきえ:Z

.field public ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

.field public ざとぅぼこ〺:Landroid/content/Context;

.field public でどあくず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

.field public なぶひせが:Landroidx/appcompat/widget/ActionMenuView$びぐびあび;

.field public は〲ぱなで:I

.field public びえぁぜい:I

.field public ぶでにく〼〳:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setBaselineAligned(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x42600000    # 56.0f

    mul-float v1, v1, v0

    float-to-int v1, v1

    iput v1, p0, Landroidx/appcompat/widget/ActionMenuView;->ぇ〳〲〺すっ:I

    const/high16 v1, 0x40800000    # 4.0f

    mul-float v0, v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroidx/appcompat/widget/ActionMenuView;->びえぁぜい:I

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ざとぅぼこ〺:Landroid/content/Context;

    iput p2, p0, Landroidx/appcompat/widget/ActionMenuView;->は〲ぱなで:I

    return-void
.end method

.method public static ごづごきえ(Landroid/view/View;IIII)I
    .registers 10

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    sub-int/2addr v1, p4

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p3

    invoke-static {v1, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    instance-of p4, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    if-eqz p4, :cond_1b

    move-object p4, p0

    check-cast p4, Landroidx/appcompat/view/menu/ActionMenuItemView;

    goto :goto_1c

    :cond_1b
    const/4 p4, 0x0

    :goto_1c
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p4, :cond_28

    invoke-virtual {p4}, Landroidx/appcompat/view/menu/ActionMenuItemView;->くし〴〺ぅ()Z

    move-result p4

    if-eqz p4, :cond_28

    const/4 p4, 0x1

    goto :goto_29

    :cond_28
    const/4 p4, 0x0

    :goto_29
    const/4 v3, 0x2

    if-lez p2, :cond_4d

    if-eqz p4, :cond_30

    if-lt p2, v3, :cond_4d

    :cond_30
    mul-int p2, p2, p1

    const/high16 v4, -0x80000000

    invoke-static {p2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0, p2, p3}, Landroid/view/View;->measure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    div-int v4, p2, p1

    rem-int/2addr p2, p1

    if-eqz p2, :cond_46

    add-int/lit8 v4, v4, 0x1

    :cond_46
    if-eqz p4, :cond_4b

    if-ge v4, v3, :cond_4b

    goto :goto_4e

    :cond_4b
    move v3, v4

    goto :goto_4e

    :cond_4d
    const/4 v3, 0x0

    :goto_4e
    iget-boolean p2, v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->くし〴〺ぅ:Z

    if-nez p2, :cond_55

    if-eqz p4, :cond_55

    const/4 v1, 0x1

    :cond_55
    iput-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->なぎぱいぢぎ:Z

    iput v3, v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->びぐびあび:I

    mul-int p1, p1, v3

    const/high16 p2, 0x40000000    # 2.0f

    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-virtual {p0, p1, p3}, Landroid/view/View;->measure(II)V

    return v3
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 2

    instance-of p1, p1, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    return p1
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    .line 1
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->ざとぅぼこ〺(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public getMenu()Landroid/view/Menu;
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-nez v0, :cond_3d

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-direct {v1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    new-instance v2, Landroidx/appcompat/widget/ActionMenuView$くし〴〺ぅ;

    invoke-direct {v2, p0}, Landroidx/appcompat/widget/ActionMenuView$くし〴〺ぅ;-><init>(Landroidx/appcompat/widget/ActionMenuView;)V

    .line 1
    iput-object v2, v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

    .line 2
    new-instance v1, Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/ActionMenuPresenter;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, v1, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ:Z

    iput-boolean v0, v1, Landroidx/appcompat/widget/ActionMenuPresenter;->おぐぴう〸ず:Z

    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->でどあくず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    if-eqz v0, :cond_27

    goto :goto_2c

    :cond_27
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$〺つふすそ;

    invoke-direct {v0}, Landroidx/appcompat/widget/ActionMenuView$〺つふすそ;-><init>()V

    .line 5
    :goto_2c
    iput-object v0, v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    .line 6
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v2, p0, Landroidx/appcompat/widget/ActionMenuView;->ざとぅぼこ〺:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;Landroid/content/Context;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 7
    iput-object p0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 8
    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 9
    :cond_3d
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    return-object v0
.end method

.method public getOverflowIcon()Landroid/graphics/drawable/Drawable;
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 1
    iget-object v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_16

    :cond_e
    iget-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->のぷのちつ:Z

    if-eqz v1, :cond_15

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    goto :goto_16

    :cond_15
    const/4 v0, 0x0

    :goto_16
    return-object v0
.end method

.method public getPopupTheme()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/ActionMenuView;->は〲ぱなで:I

    return v0
.end method

.method public getWindowAnimations()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p1, :cond_1d

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->ぁごぐすすぃ(Z)V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->おぐぴう〸ず()Z

    move-result p1

    if-eqz p1, :cond_1d

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->のぷのちつ()Z

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->ぇぬぎばつ()Z

    :cond_1d
    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->〺つふすそ()Z

    :cond_a
    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 15

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuView;->〻ぞまぎな〻:Z

    if-nez v0, :cond_8

    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->onLayout(ZIIII)V

    return-void

    :cond_8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    sub-int/2addr p5, p3

    div-int/lit8 p5, p5, 0x2

    invoke-virtual {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getDividerWidth()I

    move-result p3

    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result p2

    sub-int p2, p4, p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_26
    const/16 v4, 0x8

    const/4 v5, 0x1

    if-ge v1, p1, :cond_88

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-ne v6, v4, :cond_36

    goto :goto_85

    :cond_36
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    iget-boolean v6, v4, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->くし〴〺ぅ:Z

    if-eqz v6, :cond_75

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/ActionMenuView;->は〲ぱなで(I)Z

    move-result v6

    if-eqz v6, :cond_4b

    add-int/2addr v2, p3

    :cond_4b
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    if-eqz v0, :cond_5b

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v7

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v7, v4

    add-int v4, v7, v2

    goto :goto_6a

    :cond_5b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v8

    sub-int/2addr v7, v8

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int v4, v7, v4

    sub-int v7, v4, v2

    :goto_6a
    div-int/lit8 v8, v6, 0x2

    sub-int v8, p5, v8

    add-int/2addr v6, v8

    invoke-virtual {v5, v7, v8, v4, v6}, Landroid/view/View;->layout(IIII)V

    sub-int/2addr p2, v2

    const/4 v2, 0x1

    goto :goto_85

    :cond_75
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    iget v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v5, v6

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v5, v4

    sub-int/2addr p2, v5

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/ActionMenuView;->は〲ぱなで(I)Z

    add-int/lit8 v3, v3, 0x1

    :goto_85
    add-int/lit8 v1, v1, 0x1

    goto :goto_26

    :cond_88
    if-ne p1, v5, :cond_a7

    if-nez v2, :cond_a7

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    div-int/lit8 p4, p4, 0x2

    div-int/lit8 v0, p2, 0x2

    sub-int/2addr p4, v0

    div-int/lit8 v0, p3, 0x2

    sub-int/2addr p5, v0

    add-int/2addr p2, p4

    add-int/2addr p3, p5

    invoke-virtual {p1, p4, p5, p2, p3}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_a7
    xor-int/lit8 p3, v2, 0x1

    sub-int/2addr v3, p3

    if-lez v3, :cond_ae

    div-int/2addr p2, v3

    goto :goto_af

    :cond_ae
    const/4 p2, 0x0

    :goto_af
    const/4 p3, 0x0

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-eqz v0, :cond_f4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result p4

    sub-int/2addr p3, p4

    const/4 p4, 0x0

    :goto_c0
    if-ge p4, p1, :cond_12e

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eq v2, v4, :cond_f1

    iget-boolean v2, v1, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->くし〴〺ぅ:Z

    if-eqz v2, :cond_d7

    goto :goto_f1

    :cond_d7
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p3, v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    div-int/lit8 v5, v3, 0x2

    sub-int v5, p5, v5

    sub-int v6, p3, v2

    add-int/2addr v3, v5

    invoke-virtual {v0, v6, v5, p3, v3}, Landroid/view/View;->layout(IIII)V

    iget v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v0

    add-int/2addr v2, p2

    sub-int/2addr p3, v2

    :cond_f1
    :goto_f1
    add-int/lit8 p4, p4, 0x1

    goto :goto_c0

    :cond_f4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p3

    const/4 p4, 0x0

    :goto_f9
    if-ge p4, p1, :cond_12e

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eq v2, v4, :cond_12b

    iget-boolean v2, v1, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->くし〴〺ぅ:Z

    if-eqz v2, :cond_110

    goto :goto_12b

    :cond_110
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p3, v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    div-int/lit8 v5, v3, 0x2

    sub-int v5, p5, v5

    add-int v6, p3, v2

    add-int/2addr v3, v5

    invoke-virtual {v0, p3, v5, v6, v3}, Landroid/view/View;->layout(IIII)V

    iget v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    invoke-static {v2, v0, p2, p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(IIII)I

    move-result p3

    :cond_12b
    :goto_12b
    add-int/lit8 p4, p4, 0x1

    goto :goto_f9

    :cond_12e
    return-void
.end method

.method public onMeasure(II)V
    .registers 32

    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView;->〻ぞまぎな〻:Z

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_10

    const/4 v2, 0x1

    goto :goto_11

    :cond_10
    const/4 v2, 0x0

    :goto_11
    iput-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->〻ぞまぎな〻:Z

    if-eq v1, v2, :cond_17

    iput v4, v0, Landroidx/appcompat/widget/ActionMenuView;->ぉ〲なぱぽた:I

    :cond_17
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    iget-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->〻ぞまぎな〻:Z

    if-eqz v2, :cond_2c

    iget-object v2, v0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v2, :cond_2c

    iget v6, v0, Landroidx/appcompat/widget/ActionMenuView;->ぉ〲なぱぽた:I

    if-eq v1, v6, :cond_2c

    iput v1, v0, Landroidx/appcompat/widget/ActionMenuView;->ぉ〲なぱぽた:I

    invoke-virtual {v2, v5}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぉざぅち〻(Z)V

    :cond_2c
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    iget-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->〻ぞまぎな〻:Z

    if-eqz v2, :cond_292

    if-lez v1, :cond_292

    .line 1
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v8

    add-int/2addr v8, v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v9

    add-int/2addr v9, v7

    const/4 v7, -0x2

    move/from16 v10, p2

    invoke-static {v10, v9, v7}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    sub-int/2addr v2, v8

    iget v8, v0, Landroidx/appcompat/widget/ActionMenuView;->ぇ〳〲〺すっ:I

    div-int v10, v2, v8

    rem-int v11, v2, v8

    if-nez v10, :cond_69

    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    goto/16 :goto_2ac

    :cond_69
    div-int/2addr v11, v10

    add-int/2addr v11, v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    :goto_77
    if-ge v14, v8, :cond_f3

    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    move/from16 v18, v6

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v6

    move/from16 v19, v2

    const/16 v2, 0x8

    if-ne v6, v2, :cond_8a

    goto :goto_eb

    :cond_8a
    instance-of v2, v4, Landroidx/appcompat/view/menu/ActionMenuItemView;

    add-int/lit8 v3, v3, 0x1

    if-eqz v2, :cond_99

    iget v6, v0, Landroidx/appcompat/widget/ActionMenuView;->びえぁぜい:I

    move/from16 v20, v3

    const/4 v3, 0x0

    invoke-virtual {v4, v6, v3, v6, v3}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_9c

    :cond_99
    move/from16 v20, v3

    const/4 v3, 0x0

    :goto_9c
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    iput-boolean v3, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->〳ぜぞぜべっ:Z

    iput v3, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->づざかべべ:I

    iput v3, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->びぐびあび:I

    iput-boolean v3, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->なぎぱいぢぎ:Z

    iput v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eqz v2, :cond_bb

    move-object v2, v4

    check-cast v2, Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/ActionMenuItemView;->くし〴〺ぅ()Z

    move-result v2

    if-eqz v2, :cond_bb

    const/4 v2, 0x1

    goto :goto_bc

    :cond_bb
    const/4 v2, 0x0

    :goto_bc
    iput-boolean v2, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->ぁごぐすすぃ:Z

    iget-boolean v2, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->くし〴〺ぅ:Z

    if-eqz v2, :cond_c4

    const/4 v2, 0x1

    goto :goto_c5

    :cond_c4
    move v2, v10

    :goto_c5
    invoke-static {v4, v11, v2, v7, v9}, Landroidx/appcompat/widget/ActionMenuView;->ごづごきえ(Landroid/view/View;IIII)I

    move-result v2

    invoke-static {v12, v2}, Ljava/lang/Math;->max(II)I

    move-result v12

    iget-boolean v3, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->なぎぱいぢぎ:Z

    if-eqz v3, :cond_d3

    add-int/lit8 v13, v13, 0x1

    :cond_d3
    iget-boolean v3, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->くし〴〺ぅ:Z

    if-eqz v3, :cond_d8

    const/4 v15, 0x1

    :cond_d8
    sub-int/2addr v10, v2

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v3, 0x1

    if-ne v2, v3, :cond_e9

    shl-int v2, v3, v14

    int-to-long v2, v2

    or-long v16, v16, v2

    :cond_e9
    move/from16 v3, v20

    :goto_eb
    add-int/lit8 v14, v14, 0x1

    move/from16 v6, v18

    move/from16 v2, v19

    const/4 v4, 0x0

    goto :goto_77

    :cond_f3
    move/from16 v19, v2

    move/from16 v18, v6

    const/4 v2, 0x2

    if-eqz v15, :cond_fe

    if-ne v3, v2, :cond_fe

    const/4 v4, 0x1

    goto :goto_ff

    :cond_fe
    const/4 v4, 0x0

    :goto_ff
    const/4 v6, 0x0

    :goto_100
    const-wide/16 v20, 0x1

    if-lez v13, :cond_19a

    if-lez v10, :cond_19a

    const v9, 0x7fffffff

    const/4 v2, 0x0

    const/4 v14, 0x0

    const-wide/16 v22, 0x0

    :goto_10d
    if-ge v2, v8, :cond_13e

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v24

    move/from16 v25, v5

    move-object/from16 v5, v24

    check-cast v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move/from16 v24, v6

    iget-boolean v6, v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->なぎぱいぢぎ:Z

    if-nez v6, :cond_124

    goto :goto_137

    :cond_124
    iget v5, v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->びぐびあび:I

    if-ge v5, v9, :cond_12d

    shl-long v22, v20, v2

    move v9, v5

    const/4 v14, 0x1

    goto :goto_137

    :cond_12d
    if-ne v5, v9, :cond_137

    shl-long v5, v20, v2

    or-long v5, v22, v5

    add-int/lit8 v14, v14, 0x1

    move-wide/from16 v22, v5

    :cond_137
    :goto_137
    add-int/lit8 v2, v2, 0x1

    move/from16 v6, v24

    move/from16 v5, v25

    goto :goto_10d

    :cond_13e
    move/from16 v25, v5

    move/from16 v24, v6

    or-long v16, v16, v22

    if-le v14, v10, :cond_147

    goto :goto_19e

    :cond_147
    add-int/lit8 v9, v9, 0x1

    const/4 v2, 0x0

    :goto_14a
    if-ge v2, v8, :cond_194

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move/from16 v26, v13

    const/4 v14, 0x1

    shl-int v13, v14, v2

    int-to-long v13, v13

    and-long v20, v22, v13

    const-wide/16 v27, 0x0

    cmp-long v24, v20, v27

    if-nez v24, :cond_16d

    iget v5, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->びぐびあび:I

    if-ne v5, v9, :cond_16a

    or-long v16, v16, v13

    :cond_16a
    move/from16 v27, v4

    goto :goto_18d

    :cond_16d
    if-eqz v4, :cond_181

    iget-boolean v13, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->ぁごぐすすぃ:Z

    if-eqz v13, :cond_181

    const/4 v13, 0x1

    if-ne v10, v13, :cond_181

    iget v14, v0, Landroidx/appcompat/widget/ActionMenuView;->びえぁぜい:I

    add-int v13, v14, v11

    move/from16 v27, v4

    const/4 v4, 0x0

    invoke-virtual {v5, v13, v4, v14, v4}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_183

    :cond_181
    move/from16 v27, v4

    :goto_183
    iget v4, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->びぐびあび:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->びぐびあび:I

    iput-boolean v5, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->〳ぜぞぜべっ:Z

    add-int/lit8 v10, v10, -0x1

    :goto_18d
    add-int/lit8 v2, v2, 0x1

    move/from16 v13, v26

    move/from16 v4, v27

    goto :goto_14a

    :cond_194
    move/from16 v5, v25

    const/4 v2, 0x2

    const/4 v6, 0x1

    goto/16 :goto_100

    :cond_19a
    move/from16 v25, v5

    move/from16 v24, v6

    :goto_19e
    const/4 v2, 0x1

    if-nez v15, :cond_1a5

    if-ne v3, v2, :cond_1a5

    const/4 v4, 0x1

    goto :goto_1a6

    :cond_1a5
    const/4 v4, 0x0

    :goto_1a6
    if-lez v10, :cond_256

    const-wide/16 v5, 0x0

    cmp-long v9, v16, v5

    if-eqz v9, :cond_256

    sub-int/2addr v3, v2

    if-lt v10, v3, :cond_1b5

    if-nez v4, :cond_1b5

    if-le v12, v2, :cond_256

    :cond_1b5
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->bitCount(J)I

    move-result v2

    int-to-float v2, v2

    if-nez v4, :cond_1f3

    and-long v3, v16, v20

    const/high16 v5, 0x3f000000    # 0.5f

    const-wide/16 v12, 0x0

    cmp-long v6, v3, v12

    if-eqz v6, :cond_1d6

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    iget-boolean v3, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->ぁごぐすすぃ:Z

    if-nez v3, :cond_1d6

    sub-float/2addr v2, v5

    :cond_1d6
    add-int/lit8 v3, v8, -0x1

    const/4 v4, 0x1

    shl-int v6, v4, v3

    int-to-long v12, v6

    and-long v12, v16, v12

    const-wide/16 v14, 0x0

    cmp-long v4, v12, v14

    if-eqz v4, :cond_1f3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    iget-boolean v3, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->ぁごぐすすぃ:Z

    if-nez v3, :cond_1f3

    sub-float/2addr v2, v5

    :cond_1f3
    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-lez v3, :cond_1fe

    mul-int v10, v10, v11

    int-to-float v3, v10

    div-float/2addr v3, v2

    float-to-int v3, v3

    goto :goto_1ff

    :cond_1fe
    const/4 v3, 0x0

    :goto_1ff
    const/4 v2, 0x0

    :goto_200
    if-ge v2, v8, :cond_256

    const/4 v4, 0x1

    shl-int v5, v4, v2

    int-to-long v4, v5

    and-long v4, v16, v4

    const-wide/16 v9, 0x0

    cmp-long v6, v4, v9

    if-nez v6, :cond_211

    const/4 v4, 0x1

    const/4 v12, 0x2

    goto :goto_253

    :cond_211
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    instance-of v4, v4, Landroidx/appcompat/view/menu/ActionMenuItemView;

    if-eqz v4, :cond_232

    iput v3, v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->づざかべべ:I

    const/4 v4, 0x1

    iput-boolean v4, v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->〳ぜぞぜべっ:Z

    if-nez v2, :cond_22f

    iget-boolean v4, v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->ぁごぐすすぃ:Z

    if-nez v4, :cond_22f

    neg-int v4, v3

    const/4 v6, 0x2

    div-int/2addr v4, v6

    iput v4, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :cond_22f
    const/4 v4, 0x1

    const/4 v12, 0x2

    goto :goto_240

    :cond_232
    iget-boolean v4, v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->くし〴〺ぅ:Z

    if-eqz v4, :cond_243

    iput v3, v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->づざかべべ:I

    const/4 v4, 0x1

    iput-boolean v4, v5, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->〳ぜぞぜべっ:Z

    neg-int v6, v3

    const/4 v12, 0x2

    div-int/2addr v6, v12

    iput v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    :goto_240
    const/16 v24, 0x1

    goto :goto_253

    :cond_243
    const/4 v4, 0x1

    const/4 v12, 0x2

    if-eqz v2, :cond_24b

    div-int/lit8 v6, v3, 0x2

    iput v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :cond_24b
    add-int/lit8 v6, v8, -0x1

    if-eq v2, v6, :cond_253

    div-int/lit8 v6, v3, 0x2

    iput v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    :cond_253
    :goto_253
    add-int/lit8 v2, v2, 0x1

    goto :goto_200

    :cond_256
    move/from16 v6, v24

    if-eqz v6, :cond_281

    const/4 v4, 0x0

    :goto_25b
    if-ge v4, v8, :cond_281

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    iget-boolean v5, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->〳ぜぞぜべっ:Z

    if-nez v5, :cond_26e

    const/high16 v3, 0x40000000    # 2.0f

    goto :goto_27e

    :cond_26e
    iget v5, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->びぐびあび:I

    mul-int v5, v5, v11

    iget v3, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->づざかべべ:I

    add-int/2addr v5, v3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v5, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-virtual {v2, v5, v7}, Landroid/view/View;->measure(II)V

    :goto_27e
    add-int/lit8 v4, v4, 0x1

    goto :goto_25b

    :cond_281
    const/high16 v3, 0x40000000    # 2.0f

    if-eq v1, v3, :cond_28a

    move/from16 v2, v19

    move/from16 v6, v25

    goto :goto_28e

    :cond_28a
    move/from16 v6, v18

    move/from16 v2, v19

    :goto_28e
    invoke-virtual {v0, v2, v6}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    goto :goto_2ac

    :cond_292
    move/from16 v10, p2

    const/4 v3, 0x0

    :goto_295
    if-ge v3, v1, :cond_2a9

    .line 2
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    const/4 v4, 0x0

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_295

    :cond_2a9
    invoke-super/range {p0 .. p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    :goto_2ac
    return-void
.end method

.method public setExpandedActionViewsExclusive(Z)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 1
    iput-boolean p1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->は〲ぱなで:Z

    return-void
.end method

.method public setMenuCallbacks(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 3

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->でどあくず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionMenuView;->ぶでにく〼〳:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

    return-void
.end method

.method public setOnMenuItemClickListener(Landroidx/appcompat/widget/ActionMenuView$びぐびあび;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->なぶひせが:Landroidx/appcompat/widget/ActionMenuView$びぐびあび;

    return-void
.end method

.method public setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 1
    iget-object v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぺふねづ〺:Landroidx/appcompat/widget/ActionMenuPresenter$びぐびあび;

    if-eqz v1, :cond_d

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_12

    :cond_d
    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->のぷのちつ:Z

    iput-object p1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->てぜきぽく:Landroid/graphics/drawable/Drawable;

    :goto_12
    return-void
.end method

.method public setOverflowReserved(Z)V
    .registers 2

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ごづごきえ:Z

    return-void
.end method

.method public setPopupTheme(I)V
    .registers 4

    iget v0, p0, Landroidx/appcompat/widget/ActionMenuView;->は〲ぱなで:I

    if-eq v0, p1, :cond_1a

    iput p1, p0, Landroidx/appcompat/widget/ActionMenuView;->は〲ぱなで:I

    if-nez p1, :cond_f

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ざとぅぼこ〺:Landroid/content/Context;

    goto :goto_1a

    :cond_f
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ざとぅぼこ〺:Landroid/content/Context;

    :cond_1a
    :goto_1a
    return-void
.end method

.method public setPresenter(Landroidx/appcompat/widget/ActionMenuPresenter;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ざっざへづ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 1
    iput-object p0, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 2
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    return-void
.end method

.method public bridge synthetic 〳ぜぞぜべっ()Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    return-void
.end method

.method public bridge synthetic いいにぽつ(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->ざとぅぼこ〺(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public ぉざぅち〻()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;
    .registers 3

    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;-><init>(II)V

    const/16 v1, 0x10

    iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;->〺つふすそ:I

    return-object v0
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    invoke-virtual {v0, p1, v1, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで(Landroid/view/MenuItem;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;I)Z

    move-result p1

    return p1
.end method

.method public ざとぅぼこ〺(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;
    .registers 3

    if-eqz p1, :cond_1c

    instance-of v0, p1, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    if-eqz v0, :cond_e

    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;-><init>(Landroidx/appcompat/widget/ActionMenuView$LayoutParams;)V

    goto :goto_13

    :cond_e
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_13
    iget p1, v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;->〺つふすそ:I

    if-gtz p1, :cond_1b

    const/16 p1, 0x10

    iput p1, v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;->〺つふすそ:I

    :cond_1b
    return-object v0

    :cond_1c
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->ぉざぅち〻()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public は〲ぱなで(I)Z
    .registers 6

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    :cond_4
    add-int/lit8 v1, p1, -0x1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge p1, v3, :cond_1f

    instance-of v3, v1, Landroidx/appcompat/widget/ActionMenuView$げつ〴ぬぐ;

    if-eqz v3, :cond_1f

    check-cast v1, Landroidx/appcompat/widget/ActionMenuView$げつ〴ぬぐ;

    invoke-interface {v1}, Landroidx/appcompat/widget/ActionMenuView$げつ〴ぬぐ;->げつ〴ぬぐ()Z

    move-result v1

    or-int/2addr v0, v1

    :cond_1f
    if-lez p1, :cond_2c

    instance-of p1, v2, Landroidx/appcompat/widget/ActionMenuView$げつ〴ぬぐ;

    if-eqz p1, :cond_2c

    check-cast v2, Landroidx/appcompat/widget/ActionMenuView$げつ〴ぬぐ;

    invoke-interface {v2}, Landroidx/appcompat/widget/ActionMenuView$げつ〴ぬぐ;->〺つふすそ()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2c
    return v0
.end method

.method public ぺぁあねじ(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    .registers 4

    .line 1
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method
