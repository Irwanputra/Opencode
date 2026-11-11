.class public Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;
.super Landroid/widget/LinearLayout;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/tabs/TabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u306a\u304e\u3071\u3044\u3062\u304e"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:I

.field public いいにぽつ:Landroid/animation/ValueAnimator;

.field public final くし〴〺ぅ:Landroid/graphics/Paint;

.field public づざかべべ:I

.field public てぜきぽく:I

.field public なぎぱいぢぎ:F

.field public final synthetic のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

.field public final びぐびあび:Landroid/graphics/drawable/GradientDrawable;

.field public ぺぁあねじ:I

.field public ぺふねづ〺:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Landroid/content/Context;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    invoke-direct {p0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->づざかべべ:I

    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぁごぐすすぃ:I

    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〳ぜぞぜべっ:I

    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぺぁあねじ:I

    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぺふねづ〺:I

    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->てぜきぽく:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setWillNotDraw(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->くし〴〺ぅ:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->びぐびあび:Landroid/graphics/drawable/GradientDrawable;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 7

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    iget-object v0, v0, Lcom/google/android/material/tabs/TabLayout;->へぬ〴づぞ:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    iget v2, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〺つふすそ:I

    if-ltz v2, :cond_12

    move v0, v2

    :cond_12
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    iget v2, v2, Lcom/google/android/material/tabs/TabLayout;->ぇ〳〲〺すっ:I

    if-eqz v2, :cond_31

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v2, v3, :cond_23

    if-eq v2, v4, :cond_3a

    const/4 v0, 0x3

    if-eq v2, v0, :cond_36

    const/4 v0, 0x0

    goto :goto_3a

    :cond_23
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    sub-int/2addr v1, v0

    div-int/2addr v1, v4

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v2

    add-int/2addr v2, v0

    div-int/lit8 v0, v2, 0x2

    goto :goto_3a

    :cond_31
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    sub-int/2addr v1, v0

    :cond_36
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v0

    :cond_3a
    :goto_3a
    iget v2, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〳ぜぞぜべっ:I

    if-ltz v2, :cond_74

    iget v3, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぺぁあねじ:I

    if-le v3, v2, :cond_74

    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    iget-object v2, v2, Lcom/google/android/material/tabs/TabLayout;->へぬ〴づぞ:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_49

    goto :goto_4b

    :cond_49
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->びぐびあび:Landroid/graphics/drawable/GradientDrawable;

    :goto_4b
    invoke-static {v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〴なぱへて(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget v3, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〳ぜぞぜべっ:I

    iget v4, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぺぁあねじ:I

    invoke-virtual {v2, v3, v1, v4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->くし〴〺ぅ:Landroid/graphics/Paint;

    if-eqz v0, :cond_71

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    if-ne v1, v3, :cond_6e

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_71

    :cond_6e
    invoke-static {v2, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->せだてはぺて(Landroid/graphics/drawable/Drawable;I)V

    :cond_71
    :goto_71
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_74
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 6

    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    iget-object p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->いいにぽつ:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_15

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p1

    if-eqz p1, :cond_15

    const/4 p1, 0x0

    iget p2, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->づざかべべ:I

    const/4 p3, -0x1

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->なぎぱいぢぎ(ZII)V

    goto :goto_18

    :cond_15
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->づざかべべ()V

    :goto_18
    return-void
.end method

.method public onMeasure(II)V
    .registers 11

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_c

    return-void

    :cond_c
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    iget v1, v0, Lcom/google/android/material/tabs/TabLayout;->〻ぞまぎな〻:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_18

    iget v0, v0, Lcom/google/android/material/tabs/TabLayout;->びえぁぜい:I

    if-ne v0, v2, :cond_7d

    :cond_18
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1f
    if-ge v4, v0, :cond_36

    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-nez v7, :cond_33

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    :cond_33
    add-int/lit8 v4, v4, 0x1

    goto :goto_1f

    :cond_36
    if-gtz v5, :cond_39

    return-void

    :cond_39
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    const/16 v6, 0x10

    invoke-static {v4, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇぬぎばつ(Landroid/content/Context;I)F

    move-result v4

    float-to-int v4, v4

    mul-int v6, v5, v0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v7

    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v7, v4

    if-gt v6, v7, :cond_71

    const/4 v2, 0x0

    :goto_50
    if-ge v1, v0, :cond_6f

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    iget v6, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v7, 0x0

    if-ne v6, v5, :cond_67

    iget v6, v4, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v6, v6, v7

    if-eqz v6, :cond_6c

    :cond_67
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    const/4 v2, 0x1

    :cond_6c
    add-int/lit8 v1, v1, 0x1

    goto :goto_50

    :cond_6f
    move v3, v2

    goto :goto_78

    :cond_71
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    iput v1, v0, Lcom/google/android/material/tabs/TabLayout;->〻ぞまぎな〻:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->ぇぬぎばつ(Z)V

    :goto_78
    if-eqz v3, :cond_7d

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    :cond_7d
    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .registers 4

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRtlPropertiesChanged(I)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_12

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぁごぐすすぃ:I

    if-eq v0, p1, :cond_12

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->requestLayout()V

    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぁごぐすすぃ:I

    :cond_12
    return-void
.end method

.method public 〺つふすそ(II)V
    .registers 4

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〳ぜぞぜべっ:I

    if-ne p1, v0, :cond_8

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぺぁあねじ:I

    if-eq p2, v0, :cond_1b

    :cond_8
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〳ぜぞぜべっ:I

    iput p2, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぺぁあねじ:I

    .line 1
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x10

    if-lt p1, p2, :cond_18

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_1b

    :cond_18
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_1b
    :goto_1b
    return-void
.end method

.method public くし〴〺ぅ(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->くし〴〺ぅ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    if-eq v0, p1, :cond_1c

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->くし〴〺ぅ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p1, v0, :cond_19

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_1c

    :cond_19
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_1c
    :goto_1c
    return-void
.end method

.method public final げつ〴ぬぐ(Lcom/google/android/material/tabs/TabLayout$TabView;Landroid/graphics/RectF;)V
    .registers 6

    invoke-static {p1}, Lcom/google/android/material/tabs/TabLayout$TabView;->げつ〴ぬぐ(Lcom/google/android/material/tabs/TabLayout$TabView;)I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x18

    invoke-static {v1, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇぬぎばつ(Landroid/content/Context;I)F

    move-result v1

    float-to-int v1, v1

    if-ge v0, v1, :cond_12

    move v0, v1

    :cond_12
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getRight()I

    move-result p1

    add-int/2addr p1, v1

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 v0, v0, 0x2

    sub-int v1, p1, v0

    add-int/2addr p1, v0

    int-to-float v0, v1

    int-to-float p1, p1

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public final づざかべべ()V
    .registers 8

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->づざかべべ:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_85

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-lez v1, :cond_85

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    iget-boolean v4, v3, Lcom/google/android/material/tabs/TabLayout;->どぇぞほだ:Z

    if-nez v4, :cond_31

    instance-of v4, v0, Lcom/google/android/material/tabs/TabLayout$TabView;

    if-eqz v4, :cond_31

    check-cast v0, Lcom/google/android/material/tabs/TabLayout$TabView;

    .line 1
    iget-object v1, v3, Lcom/google/android/material/tabs/TabLayout;->びぐびあび:Landroid/graphics/RectF;

    .line 2
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->げつ〴ぬぐ(Lcom/google/android/material/tabs/TabLayout$TabView;Landroid/graphics/RectF;)V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    .line 3
    iget-object v0, v0, Lcom/google/android/material/tabs/TabLayout;->びぐびあび:Landroid/graphics/RectF;

    .line 4
    iget v1, v0, Landroid/graphics/RectF;->left:F

    float-to-int v1, v1

    iget v0, v0, Landroid/graphics/RectF;->right:F

    float-to-int v2, v0

    :cond_31
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->なぎぱいぢぎ:F

    const/4 v3, 0x0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_87

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->づざかべべ:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_87

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->づざかべべ:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v4

    iget-object v5, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    iget-boolean v6, v5, Lcom/google/android/material/tabs/TabLayout;->どぇぞほだ:Z

    if-nez v6, :cond_6d

    instance-of v6, v0, Lcom/google/android/material/tabs/TabLayout$TabView;

    if-eqz v6, :cond_6d

    check-cast v0, Lcom/google/android/material/tabs/TabLayout$TabView;

    .line 5
    iget-object v3, v5, Lcom/google/android/material/tabs/TabLayout;->びぐびあび:Landroid/graphics/RectF;

    .line 6
    invoke-virtual {p0, v0, v3}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->げつ〴ぬぐ(Lcom/google/android/material/tabs/TabLayout$TabView;Landroid/graphics/RectF;)V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    .line 7
    iget-object v0, v0, Lcom/google/android/material/tabs/TabLayout;->びぐびあび:Landroid/graphics/RectF;

    .line 8
    iget v3, v0, Landroid/graphics/RectF;->left:F

    float-to-int v3, v3

    iget v0, v0, Landroid/graphics/RectF;->right:F

    float-to-int v4, v0

    :cond_6d
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->なぎぱいぢぎ:F

    int-to-float v3, v3

    mul-float v3, v3, v0

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float v6, v5, v0

    int-to-float v1, v1

    mul-float v6, v6, v1

    add-float/2addr v6, v3

    float-to-int v1, v6

    int-to-float v3, v4

    mul-float v3, v3, v0

    sub-float/2addr v5, v0

    int-to-float v0, v2

    mul-float v5, v5, v0

    add-float/2addr v5, v3

    float-to-int v2, v5

    goto :goto_87

    :cond_85
    const/4 v1, -0x1

    const/4 v2, -0x1

    :cond_87
    :goto_87
    invoke-virtual {p0, v1, v2}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〺つふすそ(II)V

    return-void
.end method

.method public final なぎぱいぢぎ(ZII)V
    .registers 9

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->づざかべべ()V

    return-void

    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    iget-boolean v4, v3, Lcom/google/android/material/tabs/TabLayout;->どぇぞほだ:Z

    if-nez v4, :cond_2d

    instance-of v4, v0, Lcom/google/android/material/tabs/TabLayout$TabView;

    if-eqz v4, :cond_2d

    check-cast v0, Lcom/google/android/material/tabs/TabLayout$TabView;

    .line 1
    iget-object v1, v3, Lcom/google/android/material/tabs/TabLayout;->びぐびあび:Landroid/graphics/RectF;

    .line 2
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->げつ〴ぬぐ(Lcom/google/android/material/tabs/TabLayout$TabView;Landroid/graphics/RectF;)V

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->のぷのちつ:Lcom/google/android/material/tabs/TabLayout;

    .line 3
    iget-object v0, v0, Lcom/google/android/material/tabs/TabLayout;->びぐびあび:Landroid/graphics/RectF;

    .line 4
    iget v1, v0, Landroid/graphics/RectF;->left:F

    float-to-int v1, v1

    iget v0, v0, Landroid/graphics/RectF;->right:F

    float-to-int v2, v0

    :cond_2d
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〳ぜぞぜべっ:I

    iget v3, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぺぁあねじ:I

    if-ne v0, v1, :cond_36

    if-ne v3, v2, :cond_36

    return-void

    :cond_36
    if-eqz p1, :cond_3c

    iput v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぺふねづ〺:I

    iput v3, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->てぜきぽく:I

    :cond_3c
    new-instance v0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;-><init>(Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;II)V

    if-eqz p1, :cond_6b

    new-instance p1, Landroid/animation/ValueAnimator;

    invoke-direct {p1}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->いいにぽつ:Landroid/animation/ValueAnimator;

    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Landroid/animation/TimeInterpolator;

    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    int-to-long v1, p3

    invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    const/4 p3, 0x2

    new-array p3, p3, [F

    fill-array-data p3, :array_76

    invoke-virtual {p1, p3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p3, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$〺つふすそ;

    invoke-direct {p3, p0, p2}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$〺つふすそ;-><init>(Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;I)V

    invoke-virtual {p1, p3}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_75

    :cond_6b
    iget-object p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->いいにぽつ:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    iget-object p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->いいにぽつ:Landroid/animation/ValueAnimator;

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :goto_75
    return-void

    :array_76
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public びぐびあび(I)V
    .registers 3

    iget v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〺つふすそ:I

    if-eq v0, p1, :cond_15

    iput p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〺つふすそ:I

    .line 1
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p1, v0, :cond_12

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_15

    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_15
    :goto_15
    return-void
.end method
