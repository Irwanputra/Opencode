.class public Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/slidingpanelayout/widget/SlidingPaneLayout$〺つふすそ;,
        Landroidx/slidingpanelayout/widget/SlidingPaneLayout$げつ〴ぬぐ;,
        Landroidx/slidingpanelayout/widget/SlidingPaneLayout$SavedState;,
        Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;,
        Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;,
        Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/view/View;

.field public 〺つふすそ:I

.field public 〻ぞまぎな〻:Z

.field public ぁごぐすすぃ:Z

.field public いいにぽつ:F

.field public ぇぬぎばつ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;

.field public final ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

.field public おぐぴう〸ず:F

.field public くし〴〺ぅ:I

.field public final ごづごきえ:Landroid/graphics/Rect;

.field public final ざっざへづ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public ざとぅぼこ〺:Z

.field public づざかべべ:Landroid/graphics/drawable/Drawable;

.field public てぜきぽく:Z

.field public でどあくず:Ljava/lang/reflect/Method;

.field public final なぎぱいぢぎ:I

.field public のぷのちつ:I

.field public は〲ぱなで:Z

.field public びぐびあび:Landroid/graphics/drawable/Drawable;

.field public ぶでにく〼〳:Ljava/lang/reflect/Field;

.field public へぬ〴づぞ:F

.field public ぺぁあねじ:F

.field public ぺふねづ〺:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p2, -0x33333334

    iput p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ:I

    const/4 p2, 0x1

    iput-boolean p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->は〲ぱなで:Z

    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ごづごきえ:Landroid/graphics/Rect;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざっざへづ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p3, 0x42000000    # 32.0f

    mul-float p3, p3, p1

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p3, v0

    float-to-int p3, p3

    iput p3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->なぎぱいぢぎ:I

    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    new-instance p3, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$げつ〴ぬぐ;

    invoke-direct {p3, p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$げつ〴ぬぐ;-><init>(Landroidx/slidingpanelayout/widget/SlidingPaneLayout;)V

    invoke-static {p0, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おかぷせ〱(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;)V

    invoke-static {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ておぞぞはね(Landroid/view/View;I)V

    new-instance p2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;

    invoke-direct {p2, p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;-><init>(Landroidx/slidingpanelayout/widget/SlidingPaneLayout;)V

    invoke-static {p0, v0, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺふねづ〺(Landroid/view/ViewGroup;FLづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;)Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    move-result-object p2

    iput-object p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    const/high16 p3, 0x43c80000    # 400.0f

    mul-float p1, p1, p3

    .line 1
    iput p1, p2, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->へぬ〴づぞ:F

    return-void
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 3

    instance-of v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    if-eqz v0, :cond_c

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p1

    if-eqz p1, :cond_c

    const/4 p1, 0x1

    goto :goto_d

    :cond_c
    const/4 p1, 0x0

    :goto_d
    return p1
.end method

.method public computeScroll()V
    .registers 3

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->いいにぽつ(Z)Z

    move-result v0

    if-eqz v0, :cond_22

    iget-boolean v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-nez v0, :cond_13

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ()V

    return-void

    .line 1
    :cond_13
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1f

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_22

    :cond_1f
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_22
    :goto_22
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 9

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ:Landroid/graphics/drawable/Drawable;

    goto :goto_e

    :cond_c
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->びぐびあび:Landroid/graphics/drawable/Drawable;

    :goto_e
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1a

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    goto :goto_1b

    :cond_1a
    const/4 v1, 0x0

    :goto_1b
    if-eqz v1, :cond_47

    if-nez v0, :cond_20

    goto :goto_47

    :cond_20
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    invoke-virtual {p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result v5

    if-eqz v5, :cond_38

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    add-int/2addr v4, v1

    goto :goto_41

    :cond_38
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int v4, v1, v4

    move v6, v4

    move v4, v1

    move v1, v6

    :goto_41
    invoke-virtual {v0, v1, v2, v4, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_47
    :goto_47
    return-void
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .registers 9

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    iget-boolean v2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-eqz v2, :cond_47

    iget-boolean v0, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->〺つふすそ:Z

    if-nez v0, :cond_47

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    if-eqz v0, :cond_47

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ごづごきえ:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    invoke-virtual {p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_32

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ごづごきえ:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget-object v3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v0, Landroid/graphics/Rect;->left:I

    goto :goto_42

    :cond_32
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ごづごきえ:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/Rect;->right:I

    iget-object v3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v0, Landroid/graphics/Rect;->right:I

    :goto_42
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ごづごきえ:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    :cond_47
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p2

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p2
.end method

.method public generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    new-instance v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    invoke-direct {v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;-><init>()V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    new-instance v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_c

    new-instance v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    goto :goto_11

    :cond_c
    new-instance v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_11
    return-object v0
.end method

.method public getCoveredFadeColor()I
    .registers 2

    iget v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->くし〴〺ぅ:I

    return v0
.end method

.method public getParallaxDistance()I
    .registers 2

    iget v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->のぷのちつ:I

    return v0
.end method

.method public getSliderFadeColor()I
    .registers 2

    iget v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ:I

    return v0
.end method

.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->は〲ぱなで:Z

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->は〲ぱなで:Z

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざっざへづ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_d
    if-ge v1, v0, :cond_1d

    iget-object v2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざっざへづ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$〺つふすそ;

    invoke-virtual {v2}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$〺つふすそ;->run()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_1d
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざっざへづ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget-boolean v1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    const/4 v2, 0x1

    if-nez v1, :cond_2a

    if-nez v0, :cond_2a

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-le v1, v2, :cond_2a

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2a

    iget-object v3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v1, v4, v5}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻(Landroid/view/View;II)Z

    move-result v1

    xor-int/2addr v1, v2

    iput-boolean v1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざとぅぼこ〺:Z

    :cond_2a
    iget-boolean v1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_a4

    iget-boolean v1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->てぜきぽく:Z

    if-eqz v1, :cond_36

    if-eqz v0, :cond_36

    goto/16 :goto_a4

    :cond_36
    const/4 v1, 0x3

    const/4 v3, 0x0

    if-eq v0, v1, :cond_9e

    if-ne v0, v2, :cond_3d

    goto :goto_9e

    :cond_3d
    if-eqz v0, :cond_6c

    const/4 v1, 0x2

    if-eq v0, v1, :cond_43

    goto :goto_90

    :cond_43
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v4, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->へぬ〴づぞ:F

    sub-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v4, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->おぐぴう〸ず:F

    sub-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget-object v4, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget v5, v4, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    int-to-float v5, v5

    cmpl-float v5, v0, v5

    if-lez v5, :cond_90

    cmpl-float v0, v1, v0

    if-lez v0, :cond_90

    .line 2
    invoke-virtual {v4}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ()V

    iput-boolean v2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->てぜきぽく:Z

    return v3

    :cond_6c
    iput-boolean v3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->てぜきぽく:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->へぬ〴づぞ:F

    iput v1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->おぐぴう〸ず:F

    iget-object v4, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    iget-object v5, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    float-to-int v0, v0

    float-to-int v1, v1

    invoke-virtual {v4, v5, v0, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻(Landroid/view/View;II)Z

    move-result v0

    if-eqz v0, :cond_90

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->びぐびあび(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_90

    const/4 v0, 0x1

    goto :goto_91

    :cond_90
    :goto_90
    const/4 v0, 0x0

    :goto_91
    iget-object v1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v1, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉ〲なぱぽた(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_9d

    if-eqz v0, :cond_9c

    goto :goto_9d

    :cond_9c
    const/4 v2, 0x0

    :cond_9d
    :goto_9d
    return v2

    :cond_9e
    :goto_9e
    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ()V

    return v3

    :cond_a4
    :goto_a4
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ()V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onLayout(ZIIII)V
    .registers 24

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result v1

    const/4 v2, 0x1

    iget-object v3, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-eqz v1, :cond_f

    const/4 v4, 0x2

    .line 1
    iput v4, v3, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ:I

    goto :goto_11

    :cond_f
    iput v2, v3, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ:I

    :goto_11
    sub-int v3, p4, p2

    if-eqz v1, :cond_1a

    .line 2
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v4

    goto :goto_1e

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v4

    :goto_1e
    if-eqz v1, :cond_25

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v5

    goto :goto_29

    :cond_25
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v5

    :goto_29
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    iget-boolean v8, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->は〲ぱなで:Z

    if-eqz v8, :cond_43

    iget-boolean v8, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-eqz v8, :cond_40

    iget-boolean v8, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざとぅぼこ〺:Z

    if-eqz v8, :cond_40

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_41

    :cond_40
    const/4 v8, 0x0

    :goto_41
    iput v8, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    :cond_43
    move v11, v4

    const/4 v12, 0x0

    :goto_45
    if-ge v12, v7, :cond_d8

    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    const/16 v15, 0x8

    if-ne v14, v15, :cond_57

    const/high16 v9, 0x3f800000    # 1.0f

    goto/16 :goto_d3

    :cond_57
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    iget-boolean v2, v14, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->〺つふすそ:Z

    if-eqz v2, :cond_9f

    iget v2, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v8, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v2, v8

    sub-int v8, v3, v5

    iget v10, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->なぎぱいぢぎ:I

    sub-int v10, v8, v10

    invoke-static {v4, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    sub-int/2addr v10, v11

    sub-int/2addr v10, v2

    iput v10, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺふねづ〺:I

    if-eqz v1, :cond_7d

    iget v2, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_7f

    :cond_7d
    iget v2, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :goto_7f
    add-int v16, v11, v2

    add-int v16, v16, v10

    div-int/lit8 v17, v15, 0x2

    add-int v9, v17, v16

    if-le v9, v8, :cond_8b

    const/4 v8, 0x1

    goto :goto_8c

    :cond_8b
    const/4 v8, 0x0

    :goto_8c
    iput-boolean v8, v14, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->くし〴〺ぅ:Z

    int-to-float v8, v10

    iget v9, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    mul-float v8, v8, v9

    float-to-int v8, v8

    add-int/2addr v2, v8

    add-int/2addr v2, v11

    int-to-float v8, v8

    int-to-float v9, v10

    div-float/2addr v8, v9

    iput v8, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    const/4 v8, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_b8

    :cond_9f
    iget-boolean v2, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-eqz v2, :cond_b4

    iget v2, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->のぷのちつ:I

    if-eqz v2, :cond_b4

    iget v8, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    const/high16 v9, 0x3f800000    # 1.0f

    sub-float v8, v9, v8

    int-to-float v2, v2

    mul-float v8, v8, v2

    float-to-int v2, v8

    move v8, v2

    move v2, v4

    goto :goto_b8

    :cond_b4
    const/high16 v9, 0x3f800000    # 1.0f

    move v2, v4

    const/4 v8, 0x0

    :goto_b8
    if-eqz v1, :cond_c0

    sub-int v10, v3, v2

    add-int/2addr v10, v8

    sub-int v8, v10, v15

    goto :goto_c4

    :cond_c0
    sub-int v8, v2, v8

    add-int v10, v8, v15

    :goto_c4
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v11

    add-int/2addr v11, v6

    invoke-virtual {v13, v8, v6, v10, v11}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    move-result v8

    add-int/2addr v8, v4

    move v11, v2

    move v4, v8

    :goto_d3
    add-int/lit8 v12, v12, 0x1

    const/4 v2, 0x1

    goto/16 :goto_45

    :cond_d8
    iget-boolean v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->は〲ぱなで:Z

    if-eqz v1, :cond_114

    iget-boolean v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_ff

    iget v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->のぷのちつ:I

    if-eqz v1, :cond_e9

    iget v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    invoke-virtual {v0, v1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ(F)V

    :cond_e9
    iget-object v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    iget-boolean v1, v1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->くし〴〺ぅ:Z

    if-eqz v1, :cond_10f

    iget-object v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    iget v2, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    iget v3, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ:I

    invoke-virtual {v0, v1, v2, v3}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ(Landroid/view/View;FI)V

    goto :goto_10f

    :cond_ff
    const/4 v1, 0x0

    :goto_100
    if-ge v1, v7, :cond_10f

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    iget v3, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ:I

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4, v3}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ(Landroid/view/View;FI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_100

    :cond_10f
    :goto_10f
    iget-object v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->いいにぽつ(Landroid/view/View;)V

    :cond_114
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->は〲ぱなで:Z

    return-void
.end method

.method public onMeasure(II)V
    .registers 23

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    const/16 v5, 0x12c

    const/high16 v6, -0x80000000

    const/high16 v7, 0x40000000    # 2.0f

    if-eq v1, v7, :cond_30

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v8

    if-eqz v8, :cond_28

    if-ne v1, v6, :cond_23

    goto :goto_47

    :cond_23
    if-nez v1, :cond_47

    const/16 v2, 0x12c

    goto :goto_47

    :cond_28
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Width must have an exact value or MATCH_PARENT"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_30
    if-nez v3, :cond_47

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_3f

    if-nez v3, :cond_47

    const/high16 v3, -0x80000000

    const/16 v4, 0x12c

    goto :goto_47

    :cond_3f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Height must not be UNSPECIFIED"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_47
    :goto_47
    const/4 v1, 0x0

    if-eq v3, v6, :cond_5b

    if-eq v3, v7, :cond_4f

    const/4 v4, 0x0

    const/4 v5, 0x0

    goto :goto_67

    :cond_4f
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    move v5, v4

    goto :goto_67

    :cond_5b
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    move v5, v4

    const/4 v4, 0x0

    :goto_67
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v8

    sub-int v8, v2, v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v9

    sub-int/2addr v8, v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    const/4 v10, 0x2

    const/4 v10, 0x0

    iput-object v10, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    move v14, v8

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_7e
    const/16 v15, 0x8

    const/16 v16, 0x1

    if-ge v11, v9, :cond_11e

    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v17

    move-object/from16 v7, v17

    check-cast v7, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-ne v10, v15, :cond_9a

    iput-boolean v1, v7, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->くし〴〺ぅ:Z

    goto/16 :goto_115

    :cond_9a
    iget v10, v7, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->げつ〴ぬぐ:F

    const/4 v15, 0x0

    cmpl-float v18, v10, v15

    if-lez v18, :cond_a8

    add-float/2addr v13, v10

    iget v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-nez v10, :cond_a8

    goto/16 :goto_115

    :cond_a8
    iget v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v10, v15

    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v1, -0x2

    if-ne v15, v1, :cond_c1

    sub-int v10, v8, v10

    const/high16 v15, -0x80000000

    invoke-static {v10, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    move v15, v10

    move/from16 p2, v13

    const/4 v1, -0x1

    const/high16 v13, -0x80000000

    goto :goto_d8

    :cond_c1
    move/from16 p2, v13

    const/4 v1, -0x1

    const/high16 v13, -0x80000000

    if-ne v15, v1, :cond_d2

    sub-int v10, v8, v10

    const/high16 v15, 0x40000000    # 2.0f

    invoke-static {v10, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    move v15, v10

    goto :goto_d8

    :cond_d2
    const/high16 v10, 0x40000000    # 2.0f

    invoke-static {v15, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    :goto_d8
    iget v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v1, -0x2

    if-ne v10, v1, :cond_e2

    invoke-static {v5, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_f3

    :cond_e2
    const/4 v1, -0x1

    if-ne v10, v1, :cond_ec

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v5, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    goto :goto_f2

    :cond_ec
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v10, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    :goto_f2
    move v1, v10

    :goto_f3
    invoke-virtual {v6, v15, v1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    if-ne v3, v13, :cond_106

    if-le v10, v4, :cond_106

    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    :cond_106
    sub-int/2addr v14, v1

    if-gez v14, :cond_10b

    const/4 v1, 0x1

    goto :goto_10c

    :cond_10b
    const/4 v1, 0x0

    :goto_10c
    iput-boolean v1, v7, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->〺つふすそ:Z

    or-int/2addr v12, v1

    if-eqz v1, :cond_113

    iput-object v6, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    :cond_113
    move/from16 v13, p2

    :goto_115
    add-int/lit8 v11, v11, 0x1

    const/4 v1, 0x0

    const/high16 v6, -0x80000000

    const/high16 v7, 0x40000000    # 2.0f

    goto/16 :goto_7e

    :cond_11e
    if-nez v12, :cond_125

    const/4 v1, 0x0

    cmpl-float v3, v13, v1

    if-lez v3, :cond_20a

    :cond_125
    iget v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->なぎぱいぢぎ:I

    sub-int v1, v8, v1

    const/4 v3, 0x0

    :goto_12a
    if-ge v3, v9, :cond_20a

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-ne v7, v15, :cond_13d

    :cond_136
    :goto_136
    move/from16 v19, v1

    :cond_138
    :goto_138
    const/4 v1, 0x0

    const/high16 v7, 0x40000000    # 2.0f

    goto/16 :goto_202

    :cond_13d
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-ne v10, v15, :cond_14a

    goto :goto_136

    :cond_14a
    iget v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-nez v10, :cond_157

    iget v10, v7, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->げつ〴ぬぐ:F

    const/4 v11, 0x0

    cmpl-float v10, v10, v11

    if-lez v10, :cond_157

    const/4 v10, 0x1

    goto :goto_158

    :cond_157
    const/4 v10, 0x0

    :goto_158
    if-eqz v10, :cond_15c

    const/4 v11, 0x0

    goto :goto_160

    :cond_15c
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    :goto_160
    if-eqz v12, :cond_1a2

    iget-object v15, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    if-eq v6, v15, :cond_1a2

    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-gez v15, :cond_136

    if-gt v11, v1, :cond_173

    iget v11, v7, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->げつ〴ぬぐ:F

    const/4 v15, 0x0

    cmpl-float v11, v11, v15

    if-lez v11, :cond_136

    :cond_173
    if-eqz v10, :cond_190

    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v10, -0x2

    if-ne v7, v10, :cond_183

    const/high16 v10, -0x80000000

    invoke-static {v5, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    const/high16 v10, 0x40000000    # 2.0f

    goto :goto_19a

    :cond_183
    const/4 v10, -0x1

    if-ne v7, v10, :cond_18d

    const/high16 v10, 0x40000000    # 2.0f

    invoke-static {v5, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    goto :goto_19a

    :cond_18d
    const/high16 v10, 0x40000000    # 2.0f

    goto :goto_196

    :cond_190
    const/high16 v10, 0x40000000    # 2.0f

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    :goto_196
    invoke-static {v7, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    :goto_19a
    invoke-static {v1, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    invoke-virtual {v6, v11, v7}, Landroid/view/View;->measure(II)V

    goto :goto_136

    :cond_1a2
    iget v10, v7, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->げつ〴ぬぐ:F

    const/4 v15, 0x0

    cmpl-float v10, v10, v15

    if-lez v10, :cond_136

    iget v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-nez v10, :cond_1c8

    iget v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v15, -0x2

    if-ne v10, v15, :cond_1bb

    const/high16 v15, -0x80000000

    invoke-static {v5, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    const/high16 v15, 0x40000000    # 2.0f

    goto :goto_1d2

    :cond_1bb
    const/4 v15, -0x1

    if-ne v10, v15, :cond_1c5

    const/high16 v15, 0x40000000    # 2.0f

    invoke-static {v5, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    goto :goto_1d2

    :cond_1c5
    const/high16 v15, 0x40000000    # 2.0f

    goto :goto_1ce

    :cond_1c8
    const/high16 v15, 0x40000000    # 2.0f

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    :goto_1ce
    invoke-static {v10, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    :goto_1d2
    if-eqz v12, :cond_1ea

    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v15, v7

    sub-int v7, v8, v15

    move/from16 v19, v1

    const/high16 v15, 0x40000000    # 2.0f

    invoke-static {v7, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    if-eq v11, v7, :cond_138

    invoke-virtual {v6, v1, v10}, Landroid/view/View;->measure(II)V

    goto/16 :goto_138

    :cond_1ea
    move/from16 v19, v1

    const/4 v1, 0x0

    invoke-static {v1, v14}, Ljava/lang/Math;->max(II)I

    move-result v15

    iget v7, v7, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->げつ〴ぬぐ:F

    int-to-float v15, v15

    mul-float v7, v7, v15

    div-float/2addr v7, v13

    float-to-int v7, v7

    add-int/2addr v11, v7

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v11, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    invoke-virtual {v6, v11, v10}, Landroid/view/View;->measure(II)V

    :goto_202
    add-int/lit8 v3, v3, 0x1

    move/from16 v1, v19

    const/16 v15, 0x8

    goto/16 :goto_12a

    :cond_20a
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    add-int/2addr v1, v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    iput-boolean v12, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    iget-object v1, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget v2, v1, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-eqz v2, :cond_224

    if-nez v12, :cond_224

    .line 2
    invoke-virtual {v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ()V

    :cond_224
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 4

    instance-of v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$SavedState;

    .line 1
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->〺つふすそ:Landroid/os/Parcelable;

    .line 2
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$SavedState;->びぐびあび:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_18

    .line 3
    invoke-virtual {p0, v1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->なぎぱいぢぎ(I)Z

    goto :goto_1b

    .line 4
    :cond_18
    invoke-virtual {p0, v1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->げつ〴ぬぐ(I)Z

    .line 5
    :goto_1b
    iget-boolean p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$SavedState;->びぐびあび:Z

    iput-boolean p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざとぅぼこ〺:Z

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$SavedState;

    invoke-direct {v1, v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1
    iget-boolean v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_1c

    if-eqz v0, :cond_1a

    .line 2
    iget v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-nez v0, :cond_18

    goto :goto_1a

    :cond_18
    const/4 v0, 0x0

    goto :goto_1e

    :cond_1a
    :goto_1a
    const/4 v0, 0x1

    goto :goto_1e

    .line 3
    :cond_1c
    iget-boolean v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざとぅぼこ〺:Z

    :goto_1e
    iput-boolean v0, v1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$SavedState;->びぐびあび:Z

    return-object v1
.end method

.method public onSizeChanged(IIII)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    if-eq p1, p3, :cond_8

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->は〲ぱなで:Z

    :cond_8
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 8

    iget-boolean v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-nez v0, :cond_9

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_9
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺(Landroid/view/MotionEvent;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4f

    if-eq v0, v1, :cond_18

    goto :goto_5b

    :cond_18
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->びぐびあび(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_5b

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->へぬ〴づぞ:F

    sub-float v2, v0, v2

    iget v3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->おぐぴう〸ず:F

    sub-float v3, p1, v3

    iget-object v4, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget v5, v4, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    mul-float v2, v2, v2

    mul-float v3, v3, v3

    add-float/2addr v3, v2

    mul-int v5, v5, v5

    int-to-float v2, v5

    cmpg-float v2, v3, v2

    if-gez v2, :cond_5b

    .line 2
    iget-object v2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    float-to-int v0, v0

    float-to-int p1, p1

    invoke-virtual {v4, v2, v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻(Landroid/view/View;II)Z

    move-result p1

    if-eqz p1, :cond_5b

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->げつ〴ぬぐ(I)Z

    goto :goto_5b

    :cond_4f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->へぬ〴づぞ:F

    iput p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->おぐぴう〸ず:F

    :cond_5b
    :goto_5b
    return v1
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .registers 3

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInTouchMode()Z

    move-result p2

    if-nez p2, :cond_16

    iget-boolean p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-nez p2, :cond_16

    iget-object p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    if-ne p1, p2, :cond_13

    const/4 p1, 0x1

    goto :goto_14

    :cond_13
    const/4 p1, 0x0

    :goto_14
    iput-boolean p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざとぅぼこ〺:Z

    :cond_16
    return-void
.end method

.method public setCoveredFadeColor(I)V
    .registers 2

    iput p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->くし〴〺ぅ:I

    return-void
.end method

.method public setPanelSlideListener(Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;)V
    .registers 2

    iput-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぇぬぎばつ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;

    return-void
.end method

.method public setParallaxDistance(I)V
    .registers 2

    iput p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->のぷのちつ:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iput-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->びぐびあび:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setShadowDrawableRight(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iput-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setShadowResource(I)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->setShadowDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setShadowResourceLeft(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setShadowResourceRight(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->setShadowDrawableRight(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSliderFadeColor(I)V
    .registers 2

    iput p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ:I

    return-void
.end method

.method public 〳ぜぞぜべっ()V
    .registers 7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v0, :cond_19

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_16

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_19
    return-void
.end method

.method public final 〺つふすそ(Landroid/view/View;FI)V
    .registers 7

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-lez v1, :cond_44

    if-eqz p3, :cond_44

    const/high16 v1, -0x1000000

    and-int/2addr v1, p3

    ushr-int/lit8 v1, v1, 0x18

    int-to-float v1, v1

    mul-float v1, v1, p2

    float-to-int p2, v1

    shl-int/lit8 p2, p2, 0x18

    const v1, 0xffffff

    and-int/2addr p3, v1

    or-int/2addr p2, p3

    iget-object p3, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->びぐびあび:Landroid/graphics/Paint;

    if-nez p3, :cond_28

    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->びぐびあび:Landroid/graphics/Paint;

    :cond_28
    iget-object p3, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->びぐびあび:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, p2, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {p1}, Landroid/view/View;->getLayerType()I

    move-result p2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_40

    iget-object p2, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->びぐびあび:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_40
    invoke-virtual {p0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->くし〴〺ぅ(Landroid/view/View;)V

    goto :goto_5f

    :cond_44
    invoke-virtual {p1}, Landroid/view/View;->getLayerType()I

    move-result p2

    if-eqz p2, :cond_5f

    iget-object p2, v0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->びぐびあび:Landroid/graphics/Paint;

    if-eqz p2, :cond_52

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_52
    new-instance p2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$〺つふすそ;

    invoke-direct {p2, p0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$〺つふすそ;-><init>(Landroidx/slidingpanelayout/widget/SlidingPaneLayout;Landroid/view/View;)V

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざっざへづ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_5f
    :goto_5f
    return-void
.end method

.method public final ぁごぐすすぃ(F)V
    .registers 11

    invoke-virtual {p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result v0

    iget-object v1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    iget-boolean v2, v1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->くし〴〺ぅ:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1c

    if-eqz v0, :cond_16

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_18

    :cond_16
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :goto_18
    if-gtz v1, :cond_1c

    const/4 v1, 0x1

    goto :goto_1d

    :cond_1c
    const/4 v1, 0x0

    :goto_1d
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    :goto_21
    if-ge v3, v2, :cond_59

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    if-ne v4, v5, :cond_2c

    goto :goto_56

    :cond_2c
    iget v5, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->いいにぽつ:F

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float v5, v6, v5

    iget v7, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->のぷのちつ:I

    int-to-float v8, v7

    mul-float v5, v5, v8

    float-to-int v5, v5

    iput p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->いいにぽつ:F

    sub-float v8, v6, p1

    int-to-float v7, v7

    mul-float v8, v8, v7

    float-to-int v7, v8

    sub-int/2addr v5, v7

    if-eqz v0, :cond_44

    neg-int v5, v5

    :cond_44
    invoke-virtual {v4, v5}, Landroid/view/View;->offsetLeftAndRight(I)V

    if-eqz v1, :cond_56

    iget v5, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->いいにぽつ:F

    if-eqz v0, :cond_4f

    sub-float/2addr v5, v6

    goto :goto_51

    :cond_4f
    sub-float v5, v6, v5

    :goto_51
    iget v6, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->くし〴〺ぅ:I

    invoke-virtual {p0, v4, v5, v6}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ(Landroid/view/View;FI)V

    :cond_56
    :goto_56
    add-int/lit8 v3, v3, 0x1

    goto :goto_21

    :cond_59
    return-void
.end method

.method public いいにぽつ(Landroid/view/View;)V
    .registers 19

    move-object/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    goto :goto_16

    :cond_12
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v2

    :goto_16
    if-eqz v1, :cond_1d

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v3

    goto :goto_26

    :cond_1d
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    :goto_26
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v5, v6

    if-eqz v0, :cond_66

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isOpaque()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_3d

    goto :goto_53

    :cond_3d
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x12

    if-lt v7, v9, :cond_44

    goto :goto_52

    :cond_44
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v7, :cond_52

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v7

    const/4 v9, -0x1

    if-ne v7, v9, :cond_52

    goto :goto_53

    :cond_52
    :goto_52
    const/4 v8, 0x0

    :goto_53
    if-eqz v8, :cond_66

    .line 2
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLeft()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRight()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTop()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getBottom()I

    move-result v10

    goto :goto_6a

    :cond_66
    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_6a
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v11

    const/4 v12, 0x0

    :goto_6f
    move-object/from16 v13, p0

    if-ge v12, v11, :cond_c6

    invoke-virtual {v13, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    if-ne v14, v0, :cond_7a

    goto :goto_c6

    :cond_7a
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    move-result v15

    const/16 v6, 0x8

    if-ne v15, v6, :cond_85

    move/from16 v16, v1

    goto :goto_bf

    :cond_85
    if-eqz v1, :cond_89

    move v6, v3

    goto :goto_8a

    :cond_89
    move v6, v2

    :goto_8a
    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    move-result v15

    invoke-static {v6, v15}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    move-result v15

    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    move/from16 v16, v1

    if-eqz v1, :cond_a0

    move v0, v2

    goto :goto_a1

    :cond_a0
    move v0, v3

    :goto_a1
    invoke-virtual {v14}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v14}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-lt v6, v7, :cond_bb

    if-lt v15, v9, :cond_bb

    if-gt v0, v8, :cond_bb

    if-gt v1, v10, :cond_bb

    const/4 v0, 0x4

    goto :goto_bc

    :cond_bb
    const/4 v0, 0x0

    :goto_bc
    invoke-virtual {v14, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_bf
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p1

    move/from16 v1, v16

    goto :goto_6f

    :cond_c6
    :goto_c6
    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/View;)V
    .registers 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_21

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    iget-object v2, v2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->びぐびあび:Landroid/graphics/Paint;

    .line 1
    sget-object v3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    if-lt v0, v1, :cond_16

    invoke-virtual {p1, v2}, Landroid/view/View;->setLayerPaint(Landroid/graphics/Paint;)V

    goto :goto_20

    :cond_16
    invoke-virtual {p1}, Landroid/view/View;->getLayerType()I

    move-result v0

    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :goto_20
    return-void

    :cond_21
    const/16 v1, 0x10

    if-lt v0, v1, :cond_5a

    .line 2
    iget-boolean v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〻ぞまぎな〻:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_44

    :try_start_2b
    const-class v0, Landroid/view/View;

    const-string v4, "getDisplayList"

    invoke-virtual {v0, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->でどあくず:Ljava/lang/reflect/Method;
    :try_end_35
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2b .. :try_end_35} :catch_35

    :catch_35
    :try_start_35
    const-class v0, Landroid/view/View;

    const-string v4, "mRecreateDisplayList"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぶでにく〼〳:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_42
    .catch Ljava/lang/NoSuchFieldException; {:try_start_35 .. :try_end_42} :catch_42

    :catch_42
    iput-boolean v3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〻ぞまぎな〻:Z

    :cond_44
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->でどあくず:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_56

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぶでにく〼〳:Ljava/lang/reflect/Field;

    if-nez v0, :cond_4d

    goto :goto_56

    :cond_4d
    :try_start_4d
    invoke-virtual {v0, p1, v3}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->でどあくず:Ljava/lang/reflect/Method;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_55
    .catch Ljava/lang/Exception; {:try_start_4d .. :try_end_55} :catch_5a

    goto :goto_5a

    :cond_56
    :goto_56
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void

    :catch_5a
    :cond_5a
    :goto_5a
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    .line 3
    sget-object v4, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v1, :cond_74

    invoke-virtual {p0, v0, v2, v3, p1}, Landroid/view/View;->postInvalidateOnAnimation(IIII)V

    goto :goto_77

    :cond_74
    invoke-virtual {p0, v0, v2, v3, p1}, Landroid/view/View;->postInvalidate(IIII)V

    :goto_77
    return-void
.end method

.method public final げつ〴ぬぐ(I)Z
    .registers 3

    iget-boolean p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->は〲ぱなで:Z

    const/4 v0, 0x0

    if-nez p1, :cond_e

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ(F)Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_e

    :cond_d
    return v0

    :cond_e
    :goto_e
    iput-boolean v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざとぅぼこ〺:Z

    const/4 p1, 0x1

    return p1
.end method

.method public づざかべべ()Z
    .registers 3

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    goto :goto_9

    :cond_8
    const/4 v1, 0x0

    :goto_9
    return v1
.end method

.method public final なぎぱいぢぎ(I)Z
    .registers 2

    iget-boolean p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->は〲ぱなで:Z

    if-nez p1, :cond_f

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ(F)Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_f

    :cond_d
    const/4 p1, 0x0

    return p1

    :cond_f
    :goto_f
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざとぅぼこ〺:Z

    return p1
.end method

.method public びぐびあび(Landroid/view/View;)Z
    .registers 4

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    iget-boolean v1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_1a

    iget-boolean p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->くし〴〺ぅ:Z

    if-eqz p1, :cond_1a

    iget p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-lez p1, :cond_1a

    const/4 v0, 0x1

    :cond_1a
    return v0
.end method

.method public ぺぁあねじ(F)Z
    .registers 7

    iget-boolean v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    invoke-virtual {p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result v0

    iget-object v2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    if-eqz v0, :cond_32

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v2

    iget-object v2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    int-to-float v3, v3

    int-to-float v0, v0

    iget v4, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺふねづ〺:I

    int-to-float v4, v4

    mul-float p1, p1, v4

    add-float/2addr p1, v0

    int-to-float v0, v2

    add-float/2addr p1, v0

    sub-float/2addr v3, p1

    float-to-int p1, v3

    goto :goto_41

    :cond_32
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v2

    int-to-float v0, v0

    iget v2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺふねづ〺:I

    int-to-float v2, v2

    mul-float p1, p1, v2

    add-float/2addr p1, v0

    float-to-int p1, p1

    :goto_41
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    iget-object v2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v0, v2, p1, v3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇ〳〲〺すっ(Landroid/view/View;II)Z

    move-result p1

    if-eqz p1, :cond_61

    invoke-virtual {p0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ()V

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p1, v0, :cond_5c

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_5f

    :cond_5c
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :goto_5f
    const/4 p1, 0x1

    return p1

    :cond_61
    return v1
.end method
