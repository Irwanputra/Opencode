.class public Landroidx/constraintlayout/widget/Placeholder;
.super Landroid/view/View;
.source ""


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:Landroid/view/View;

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/constraintlayout/widget/Placeholder;->〺つふすそ:I

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/constraintlayout/widget/Placeholder;->くし〴〺ぅ:Landroid/view/View;

    const/4 v0, 0x4

    iput v0, p0, Landroidx/constraintlayout/widget/Placeholder;->びぐびあび:I

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/Placeholder;->げつ〴ぬぐ(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/constraintlayout/widget/Placeholder;->〺つふすそ:I

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/constraintlayout/widget/Placeholder;->くし〴〺ぅ:Landroid/view/View;

    const/4 p1, 0x4

    iput p1, p0, Landroidx/constraintlayout/widget/Placeholder;->びぐびあび:I

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/Placeholder;->げつ〴ぬぐ(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/constraintlayout/widget/Placeholder;->〺つふすそ:I

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/constraintlayout/widget/Placeholder;->くし〴〺ぅ:Landroid/view/View;

    const/4 p1, 0x4

    iput p1, p0, Landroidx/constraintlayout/widget/Placeholder;->びぐびあび:I

    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/Placeholder;->げつ〴ぬぐ(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public getContent()Landroid/view/View;
    .registers 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/Placeholder;->くし〴〺ぅ:Landroid/view/View;

    return-object v0
.end method

.method public getEmptyVisibility()I
    .registers 2

    iget v0, p0, Landroidx/constraintlayout/widget/Placeholder;->びぐびあび:I

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 9

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_68

    const/16 v0, 0xdf

    invoke-virtual {p1, v0, v0, v0}, Landroid/graphics/Canvas;->drawRGB(III)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/16 v1, 0xff

    const/16 v2, 0xd2

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/graphics/Paint;->setARGB(IIII)V

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v4

    sget-object v5, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    const-string v5, "?"

    const/4 v6, 0x1

    invoke-virtual {v0, v5, v2, v6, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    int-to-float v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v4

    sub-float/2addr v2, v6

    iget v6, v1, Landroid/graphics/Rect;->left:I

    int-to-float v6, v6

    sub-float/2addr v2, v6

    int-to-float v3, v3

    div-float/2addr v3, v4

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v4

    add-float/2addr v6, v3

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    sub-float/2addr v6, v1

    invoke-virtual {p1, v5, v2, v6, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_68
    return-void
.end method

.method public setContentId(I)V
    .registers 4

    iget v0, p0, Landroidx/constraintlayout/widget/Placeholder;->〺つふすそ:I

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Landroidx/constraintlayout/widget/Placeholder;->くし〴〺ぅ:Landroid/view/View;

    if-eqz v0, :cond_1a

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/Placeholder;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    iput-boolean v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->くぎぶ〼のそ:Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/Placeholder;->くし〴〺ぅ:Landroid/view/View;

    :cond_1a
    iput p1, p0, Landroidx/constraintlayout/widget/Placeholder;->〺つふすそ:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_30

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_30

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_30
    return-void
.end method

.method public setEmptyVisibility(I)V
    .registers 2

    iput p1, p0, Landroidx/constraintlayout/widget/Placeholder;->びぐびあび:I

    return-void
.end method

.method public 〺つふすそ()V
    .registers 6

    iget-object v0, p0, Landroidx/constraintlayout/widget/Placeholder;->くし〴〺ぅ:Landroid/view/View;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    iget-object v1, p0, Landroidx/constraintlayout/widget/Placeholder;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    iget-object v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->びちづぼぬ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    const/4 v3, 0x0

    .line 1
    iput v3, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->のびぶけせ:I

    .line 2
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->びちづぼぬ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    invoke-virtual {v2}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ざとぅぼこ〺()Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび$げつ〴ぬぐ;

    move-result-object v2

    sget-object v3, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび$げつ〴ぬぐ;

    if-eq v2, v3, :cond_2d

    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->びちづぼぬ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    iget-object v4, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->びちづぼぬ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    invoke-virtual {v4}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ぶでにく〼〳()I

    move-result v4

    invoke-virtual {v2, v4}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->えがぐせほち(I)V

    :cond_2d
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->びちづぼぬ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    invoke-virtual {v2}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->でどあくず()Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび$げつ〴ぬぐ;

    move-result-object v2

    if-eq v2, v3, :cond_40

    iget-object v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->びちづぼぬ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    iget-object v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->びちづぼぬ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    invoke-virtual {v2}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ぉざぅち〻()I

    move-result v2

    invoke-virtual {v0, v2}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->げがぴうあだ(I)V

    :cond_40
    iget-object v0, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->びちづぼぬ:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    const/16 v1, 0x8

    .line 3
    iput v1, v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->のびぶけせ:I

    return-void
.end method

.method public final げつ〴ぬぐ(Landroid/util/AttributeSet;)V
    .registers 6

    iget v0, p0, Landroidx/constraintlayout/widget/Placeholder;->びぐびあび:I

    invoke-super {p0, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/widget/Placeholder;->〺つふすそ:I

    if-eqz p1, :cond_3e

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_placeholder:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_19
    if-ge v1, v0, :cond_3b

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    sget v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_placeholder_content:I

    if-ne v2, v3, :cond_2c

    iget v3, p0, Landroidx/constraintlayout/widget/Placeholder;->〺つふすそ:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/widget/Placeholder;->〺つふすそ:I

    goto :goto_38

    :cond_2c
    sget v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->ConstraintLayout_placeholder_placeholder_emptyVisibility:I

    if-ne v2, v3, :cond_38

    iget v3, p0, Landroidx/constraintlayout/widget/Placeholder;->びぐびあび:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/widget/Placeholder;->びぐびあび:I

    :cond_38
    :goto_38
    add-int/lit8 v1, v1, 0x1

    goto :goto_19

    :cond_3b
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3e
    return-void
.end method
