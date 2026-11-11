.class public Lcom/google/android/material/internal/FlowLayout;
.super Landroid/view/ViewGroup;
.source ""


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public づざかべべ:I

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/internal/FlowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/internal/FlowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    iput-boolean p3, p0, Lcom/google/android/material/internal/FlowLayout;->びぐびあび:Z

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->FlowLayout:[I

    invoke-virtual {p1, p2, v0, p3, p3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->FlowLayout_lineSpacing:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/internal/FlowLayout;->〺つふすそ:I

    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->FlowLayout_itemSpacing:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/internal/FlowLayout;->くし〴〺ぅ:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public getItemSpacing()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/internal/FlowLayout;->くし〴〺ぅ:I

    return v0
.end method

.method public getLineSpacing()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/internal/FlowLayout;->〺つふすそ:I

    return v0
.end method

.method public getRowCount()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/internal/FlowLayout;->づざかべべ:I

    return v0
.end method

.method public onLayout(ZIIII)V
    .registers 15

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 p3, 0x0

    if-nez p1, :cond_a

    iput p3, p0, Lcom/google/android/material/internal/FlowLayout;->づざかべべ:I

    return-void

    :cond_a
    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/material/internal/FlowLayout;->づざかべべ:I

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result p5

    if-ne p5, p1, :cond_15

    const/4 p5, 0x1

    goto :goto_16

    :cond_15
    const/4 p5, 0x0

    :goto_16
    if-eqz p5, :cond_1d

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    goto :goto_21

    :cond_1d
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    :goto_21
    if-eqz p5, :cond_28

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v1

    goto :goto_2c

    :cond_28
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v1

    :goto_2c
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    sub-int/2addr p4, p2

    sub-int/2addr p4, v1

    move v3, v0

    move p2, v2

    const/4 v1, 0x0

    :goto_35
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-ge v1, v4, :cond_ad

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_52

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->row_index_key:I

    const/4 v6, -0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto :goto_aa

    :cond_52
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v6, :cond_65

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-static {v5}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->おかぷせ〱(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v6

    invoke-static {v5}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->けときぜと(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v5

    goto :goto_67

    :cond_65
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_67
    add-int v7, v3, v6

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    add-int/2addr v8, v7

    iget-boolean v7, p0, Lcom/google/android/material/internal/FlowLayout;->びぐびあび:Z

    if-nez v7, :cond_7d

    if-le v8, p4, :cond_7d

    iget p2, p0, Lcom/google/android/material/internal/FlowLayout;->〺つふすそ:I

    add-int/2addr p2, v2

    iget v2, p0, Lcom/google/android/material/internal/FlowLayout;->づざかべべ:I

    add-int/2addr v2, p1

    iput v2, p0, Lcom/google/android/material/internal/FlowLayout;->づざかべべ:I

    move v3, v0

    :cond_7d
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->row_index_key:I

    iget v7, p0, Lcom/google/android/material/internal/FlowLayout;->づざかべべ:I

    sub-int/2addr v7, p1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v2, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    add-int v2, v3, v6

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v2

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    add-int/2addr v8, p2

    if-eqz p5, :cond_9c

    sub-int v2, p4, v7

    sub-int v7, p4, v3

    sub-int/2addr v7, v6

    :cond_9c
    invoke-virtual {v4, v2, p2, v7, v8}, Landroid/view/View;->layout(IIII)V

    add-int/2addr v6, v5

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v2, v6

    iget v4, p0, Lcom/google/android/material/internal/FlowLayout;->くし〴〺ぅ:I

    add-int/2addr v2, v4

    add-int/2addr v3, v2

    move v2, v8

    :goto_aa
    add-int/lit8 v1, v1, 0x1

    goto :goto_35

    :cond_ad
    return-void
.end method

.method public onMeasure(II)V
    .registers 22

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    const/high16 v5, -0x80000000

    const/high16 v6, 0x40000000    # 2.0f

    if-eq v2, v5, :cond_1f

    if-ne v2, v6, :cond_1b

    goto :goto_1f

    :cond_1b
    const v7, 0x7fffffff

    goto :goto_20

    :cond_1f
    :goto_1f
    move v7, v1

    :goto_20
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v10

    sub-int/2addr v7, v10

    move v11, v9

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_30
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v14

    if-ge v12, v14, :cond_aa

    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    move-result v15

    const/16 v6, 0x8

    if-ne v15, v6, :cond_47

    move/from16 v15, p2

    const/16 v16, 0x0

    goto :goto_a3

    :cond_47
    move/from16 v6, p1

    move/from16 v15, p2

    invoke-virtual {v0, v14, v6, v15}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v10, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v10, :cond_63

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v10, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/16 v16, 0x0

    add-int/lit8 v10, v10, 0x0

    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/lit8 v5, v5, 0x0

    goto :goto_67

    :cond_63
    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    :goto_67
    add-int v17, v8, v10

    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v18

    add-int v6, v18, v17

    if-le v6, v7, :cond_7f

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/internal/FlowLayout;->げつ〴ぬぐ()Z

    move-result v6

    if-nez v6, :cond_7f

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v8

    iget v6, v0, Lcom/google/android/material/internal/FlowLayout;->〺つふすそ:I

    add-int v11, v9, v6

    :cond_7f
    add-int v6, v8, v10

    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v9, v6

    invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v6, v11

    if-le v9, v13, :cond_8e

    move v13, v9

    :cond_8e
    add-int/2addr v10, v5

    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v9, v10

    iget v10, v0, Lcom/google/android/material/internal/FlowLayout;->くし〴〺ぅ:I

    add-int/2addr v9, v10

    add-int/2addr v9, v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-ne v12, v8, :cond_a1

    add-int/2addr v13, v5

    :cond_a1
    move v8, v9

    move v9, v6

    :goto_a3
    add-int/lit8 v12, v12, 0x1

    const/high16 v5, -0x80000000

    const/high16 v6, 0x40000000    # 2.0f

    goto :goto_30

    :cond_aa
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v5

    add-int/2addr v5, v13

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v6

    add-int/2addr v6, v9

    const/high16 v7, -0x80000000

    if-eq v2, v7, :cond_be

    const/high16 v8, 0x40000000    # 2.0f

    if-eq v2, v8, :cond_c4

    move v1, v5

    goto :goto_c4

    :cond_be
    const/high16 v8, 0x40000000    # 2.0f

    .line 1
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_c4
    :goto_c4
    if-eq v4, v7, :cond_ca

    if-eq v4, v8, :cond_ce

    move v3, v6

    goto :goto_ce

    :cond_ca
    invoke-static {v6, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 2
    :cond_ce
    :goto_ce
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public setItemSpacing(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/material/internal/FlowLayout;->くし〴〺ぅ:I

    return-void
.end method

.method public setLineSpacing(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/material/internal/FlowLayout;->〺つふすそ:I

    return-void
.end method

.method public setSingleLine(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/google/android/material/internal/FlowLayout;->びぐびあび:Z

    return-void
.end method

.method public げつ〴ぬぐ()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/material/internal/FlowLayout;->びぐびあび:Z

    return v0
.end method
