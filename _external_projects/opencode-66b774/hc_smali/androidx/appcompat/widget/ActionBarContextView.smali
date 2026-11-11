.class public Landroidx/appcompat/widget/ActionBarContextView;
.super Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;
.source ""


# instance fields
.field public いいにぽつ:Ljava/lang/CharSequence;

.field public ぇぬぎばつ:Landroid/widget/TextView;

.field public ぉざぅち〻:I

.field public おぐぴう〸ず:Landroid/widget/TextView;

.field public ごづごきえ:I

.field public ざとぅぼこ〺:I

.field public てぜきぽく:Landroid/view/View;

.field public のぷのちつ:Landroid/view/View;

.field public は〲ぱなで:Z

.field public へぬ〴づぞ:Landroid/widget/LinearLayout;

.field public ぺふねづ〺:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionModeStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    invoke-direct {p0, p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object v0, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionMode:[I

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionMode_background:I

    .line 3
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {p1, v0}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_21

    :cond_1d
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 4
    :goto_21
    sget-object p3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p3, v0, :cond_2d

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_30

    :cond_2d
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 5
    :goto_30
    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionMode_titleTextStyle:I

    .line 6
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 7
    iput p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぉざぅち〻:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionMode_subtitleTextStyle:I

    .line 8
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 9
    iput p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->ざとぅぼこ〺:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionMode_height:I

    .line 10
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result p1

    .line 11
    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->なぎぱいぢぎ:I

    sget p1, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionMode_closeItemLayout:I

    sget p3, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_action_mode_close_item_material:I

    .line 12
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 13
    iput p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->ごづごきえ:I

    .line 14
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public bridge synthetic getAnimatedVisibility()I
    .registers 2

    invoke-super {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->getAnimatedVisibility()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getContentHeight()I
    .registers 2

    invoke-super {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->getContentHeight()I

    move-result v0

    return v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぺふねづ〺:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->いいにぽつ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->づざかべべ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->のぷのちつ()Z

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->づざかべべ:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ()Z

    :cond_f
    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_27

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->いいにぽつ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_2a

    :cond_27
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_2a
    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 15

    invoke-static {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_e

    sub-int v0, p4, p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_12

    :cond_e
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    :goto_12
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p3

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result p3

    sub-int p3, p5, p3

    iget-object p5, p0, Landroidx/appcompat/widget/ActionBarContextView;->てぜきぽく:Landroid/view/View;

    const/16 v7, 0x8

    if-eqz p5, :cond_5c

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result p5

    if-eq p5, v7, :cond_5c

    iget-object p5, p0, Landroidx/appcompat/widget/ActionBarContextView;->てぜきぽく:Landroid/view/View;

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p5

    check-cast p5, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p1, :cond_3b

    iget v1, p5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_3d

    :cond_3b
    iget v1, p5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :goto_3d
    if-eqz p1, :cond_42

    iget p5, p5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_44

    :cond_42
    iget p5, p5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    :goto_44
    if-eqz p1, :cond_48

    sub-int/2addr v0, v1

    goto :goto_49

    :cond_48
    add-int/2addr v0, v1

    :goto_49
    move v8, v0

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->てぜきぽく:Landroid/view/View;

    move-object v0, p0

    move v2, v8

    move v3, v6

    move v4, p3

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび(Landroid/view/View;IIIZ)I

    move-result v0

    add-int/2addr v8, v0

    if-eqz p1, :cond_5a

    sub-int/2addr v8, p5

    goto :goto_5b

    :cond_5a
    add-int/2addr v8, p5

    :goto_5b
    move v0, v8

    :cond_5c
    move p5, v0

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_77

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->のぷのちつ:Landroid/view/View;

    if-nez v1, :cond_77

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eq v0, v7, :cond_77

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    move-object v0, p0

    move v2, p5

    move v3, v6

    move v4, p3

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび(Landroid/view/View;IIIZ)I

    move-result v0

    add-int/2addr p5, v0

    :cond_77
    move v2, p5

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->のぷのちつ:Landroid/view/View;

    if-eqz v1, :cond_83

    move-object v0, p0

    move v3, v6

    move v4, p3

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび(Landroid/view/View;IIIZ)I

    :cond_83
    if-eqz p1, :cond_8b

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p2

    move v3, p2

    goto :goto_92

    :cond_8b
    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result p2

    sub-int/2addr p4, p2

    move v3, p4

    :goto_92
    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v2, :cond_9f

    xor-int/lit8 p1, p1, 0x1

    move-object v1, p0

    move v4, v6

    move v5, p3

    move v6, p1

    invoke-virtual/range {v1 .. v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび(Landroid/view/View;IIIZ)I

    :cond_9f
    return-void
.end method

.method public onMeasure(II)V
    .registers 13

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_100

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-eqz v0, :cond_e1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->なぎぱいぢぎ:I

    if-lez v0, :cond_17

    goto :goto_1b

    :cond_17
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    :goto_1b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p2

    sub-int p2, p1, p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v3

    sub-int/2addr p2, v3

    sub-int v3, v0, v2

    const/high16 v4, -0x80000000

    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->てぜきぽく:Landroid/view/View;

    const/4 v7, 0x0

    if-eqz v6, :cond_4e

    invoke-virtual {p0, v6, p2, v5, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/view/View;III)I

    move-result p2

    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->てぜきぽく:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v8, v6

    sub-int/2addr p2, v8

    :cond_4e
    iget-object v6, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v6, :cond_5e

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-ne v6, p0, :cond_5e

    iget-object v6, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p0, v6, p2, v5, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/view/View;III)I

    move-result p2

    :cond_5e
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    if-eqz v6, :cond_91

    iget-object v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->のぷのちつ:Landroid/view/View;

    if-nez v8, :cond_91

    iget-boolean v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->は〲ぱなで:Z

    if-eqz v8, :cond_8d

    invoke-static {v7, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    iget-object v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v6, v5}, Landroid/widget/LinearLayout;->measure(II)V

    iget-object v5, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    invoke-virtual {v5}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v5

    if-gt v5, p2, :cond_7d

    const/4 v6, 0x1

    goto :goto_7e

    :cond_7d
    const/4 v6, 0x0

    :goto_7e
    if-eqz v6, :cond_81

    sub-int/2addr p2, v5

    :cond_81
    iget-object v5, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    if-eqz v6, :cond_87

    const/4 v6, 0x0

    goto :goto_89

    :cond_87
    const/16 v6, 0x8

    :goto_89
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_91

    :cond_8d
    invoke-virtual {p0, v6, p2, v5, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/view/View;III)I

    move-result p2

    :cond_91
    :goto_91
    iget-object v5, p0, Landroidx/appcompat/widget/ActionBarContextView;->のぷのちつ:Landroid/view/View;

    if-eqz v5, :cond_c3

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iget v6, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v8, -0x2

    if-eq v6, v8, :cond_a1

    const/high16 v9, 0x40000000    # 2.0f

    goto :goto_a3

    :cond_a1
    const/high16 v9, -0x80000000

    :goto_a3
    if-ltz v6, :cond_a9

    invoke-static {v6, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_a9
    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v5, v8, :cond_ae

    goto :goto_b0

    :cond_ae
    const/high16 v1, -0x80000000

    :goto_b0
    if-ltz v5, :cond_b6

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_b6
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarContextView;->のぷのちつ:Landroid/view/View;

    invoke-static {p2, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v4, p2, v1}, Landroid/view/View;->measure(II)V

    :cond_c3
    iget p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->なぎぱいぢぎ:I

    if-gtz p2, :cond_dd

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    const/4 v0, 0x0

    :goto_cc
    if-ge v7, p2, :cond_dd

    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, v2

    if-le v1, v0, :cond_da

    move v0, v1

    :cond_da
    add-int/lit8 v7, v7, 0x1

    goto :goto_cc

    :cond_dd
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void

    :cond_e1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " can only be used with android:layout_height=\"wrap_content\""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_100
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_120

    :goto_11f
    throw p1

    :goto_120
    goto :goto_11f
.end method

.method public setContentHeight(I)V
    .registers 2

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->なぎぱいぢぎ:I

    return-void
.end method

.method public setCustomView(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->のぷのちつ:Landroid/view/View;

    if-eqz v0, :cond_7

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_7
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->のぷのちつ:Landroid/view/View;

    if-eqz p1, :cond_15

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_15

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    :cond_15
    if-eqz p1, :cond_1a

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1a
    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->ぁごぐすすぃ()V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->いいにぽつ:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->ぁごぐすすぃ()V

    return-void
.end method

.method public setTitleOptional(Z)V
    .registers 3

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->は〲ぱなで:Z

    if-eq p1, v0, :cond_7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_7
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->は〲ぱなで:Z

    return-void
.end method

.method public bridge synthetic setVisibility(I)V
    .registers 2

    invoke-super {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->setVisibility(I)V

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public 〳ぜぞぜべっ()V
    .registers 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->のぷのちつ:Landroid/view/View;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび:Landroidx/appcompat/widget/ActionMenuView;

    return-void
.end method

.method public final ぁごぐすすぃ()V
    .registers 7

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    if-nez v0, :cond_53

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_action_bar_title_item:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    sget v1, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->action_bar_title:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->おぐぴう〸ず:Landroid/widget/TextView;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    sget v1, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->action_bar_subtitle:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぇぬぎばつ:Landroid/widget/TextView;

    iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぉざぅち〻:I

    if-eqz v0, :cond_44

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->おぐぴう〸ず:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぉざぅち〻:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_44
    iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ざとぅぼこ〺:I

    if-eqz v0, :cond_53

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぇぬぎばつ:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->ざとぅぼこ〺:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_53
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->おぐぴう〸ず:Landroid/widget/TextView;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->いいにぽつ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぇぬぎばつ:Landroid/widget/TextView;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->いいにぽつ:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->ぇぬぎばつ:Landroid/widget/TextView;

    const/4 v3, 0x0

    const/16 v4, 0x8

    if-eqz v1, :cond_7a

    const/4 v5, 0x0

    goto :goto_7c

    :cond_7a
    const/16 v5, 0x8

    :goto_7c
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    if-nez v0, :cond_88

    if-eqz v1, :cond_86

    goto :goto_88

    :cond_86
    const/16 v3, 0x8

    :cond_88
    :goto_88
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_98

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->へぬ〴づぞ:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_98
    return-void
.end method

.method public なぎぱいぢぎ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V
    .registers 8

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->てぜきぽく:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_16

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->ごづごきえ:I

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->てぜきぽく:Landroid/view/View;

    goto :goto_1e

    :cond_16
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_21

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->てぜきぽく:Landroid/view/View;

    :goto_1e
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_21
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->てぜきぽく:Landroid/view/View;

    sget v2, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->action_mode_close_button:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Landroidx/appcompat/widget/ActionBarContextView$げつ〴ぬぐ;

    invoke-direct {v2, p0, p1}, Landroidx/appcompat/widget/ActionBarContextView$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/ActionBarContextView;Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;->づざかべべ()Landroid/view/Menu;

    move-result-object p1

    check-cast p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->づざかべべ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz v0, :cond_3e

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuPresenter;->〺つふすそ()Z

    :cond_3e
    new-instance v0, Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroidx/appcompat/widget/ActionMenuPresenter;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->づざかべべ:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v2, 0x1

    .line 1
    iput-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->へぬ〴づぞ:Z

    iput-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->おぐぴう〸ず:Z

    .line 2
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x1

    invoke-direct {v0, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->づざかべべ:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v4, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/content/Context;

    invoke-virtual {p1, v3, v4}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;Landroid/content/Context;)V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->づざかべべ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 3
    iget-object v3, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    if-nez v3, :cond_76

    .line 4
    iget-object v4, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->づざかべべ:Landroid/view/LayoutInflater;

    iget v5, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぁごぐすすぃ:I

    invoke-virtual {v4, v5, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    iput-object v1, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    iget-object v4, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v1, v4}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionMenuPresenter;->ぁごぐすすぃ(Z)V

    :cond_76
    iget-object v1, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ;

    if-eq v3, v1, :cond_80

    .line 5
    move-object v2, v1

    check-cast v2, Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v2, p1}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Landroidx/appcompat/widget/ActionMenuPresenter;)V

    .line 6
    :cond_80
    check-cast v1, Landroidx/appcompat/widget/ActionMenuView;

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび:Landroidx/appcompat/widget/ActionMenuView;

    const/4 p1, 0x0

    invoke-static {v1, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇとしたべど(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->びぐびあび:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
