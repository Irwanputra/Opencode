.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;
.super Landroid/widget/ListView;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;,
        Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Ljava/lang/reflect/Field;

.field public final 〺つふすそ:Landroid/graphics/Rect;

.field public ぁごぐすすぃ:I

.field public いいにぽつ:Z

.field public くし〴〺ぅ:I

.field public づざかべべ:I

.field public てぜきぽく:Z

.field public なぎぱいぢぎ:I

.field public のぷのちつ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/くし〴〺ぅ;

.field public びぐびあび:I

.field public へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;

.field public ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;

.field public ぺふねづ〺:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .registers 5

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->dropDownListViewStyle:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->〺つふすそ:Landroid/graphics/Rect;

    const/4 p1, 0x0

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->くし〴〺ぅ:I

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->びぐびあび:I

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->づざかべべ:I

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->なぎぱいぢぎ:I

    iput-boolean p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぺふねづ〺:Z

    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setCacheColorHint(I)V

    :try_start_1b
    const-class p1, Landroid/widget/AbsListView;

    const-string p2, "mIsChildViewEnabled"

    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->〳ぜぞぜべっ:Ljava/lang/reflect/Field;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_29
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1b .. :try_end_29} :catch_29

    :catch_29
    return-void
.end method

.method private setSelectorEnabled(Z)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;

    if-eqz v0, :cond_6

    .line 1
    iput-boolean p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:Z

    :cond_6
    return-void
.end method


# virtual methods
.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->〺つふすそ:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual {p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_16

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->〺つふすそ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 2
    :cond_16
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public drawableStateChanged()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;

    if-eqz v0, :cond_5

    return-void

    :cond_5
    invoke-super {p0}, Landroid/widget/ListView;->drawableStateChanged()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->setSelectorEnabled(Z)V

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->くし〴〺ぅ()V

    return-void
.end method

.method public hasFocus()Z
    .registers 2

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぺふねづ〺:Z

    if-nez v0, :cond_d

    invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_d

    :cond_b
    const/4 v0, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 v0, 0x1

    :goto_e
    return v0
.end method

.method public hasWindowFocus()Z
    .registers 2

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぺふねづ〺:Z

    if-nez v0, :cond_d

    invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_d

    :cond_b
    const/4 v0, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 v0, 0x1

    :goto_e
    return v0
.end method

.method public isFocused()Z
    .registers 2

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぺふねづ〺:Z

    if-nez v0, :cond_d

    invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_d

    :cond_b
    const/4 v0, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 v0, 0x1

    :goto_e
    return v0
.end method

.method public isInTouchMode()Z
    .registers 2

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぺふねづ〺:Z

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->いいにぽつ:Z

    if-nez v0, :cond_e

    :cond_8
    invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_10

    :cond_e
    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    return v0
.end method

.method public onDetachedFromWindow()V
    .registers 2

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;

    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_b

    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_b
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_21

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;

    if-nez v1, :cond_21

    new-instance v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;

    invoke-direct {v1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;-><init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;)V

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;

    .line 1
    invoke-virtual {p0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 2
    :cond_21
    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    const/16 v2, 0x9

    const/4 v3, -0x1

    if-eq v0, v2, :cond_32

    const/4 v2, 0x7

    if-ne v0, v2, :cond_2e

    goto :goto_32

    :cond_2e
    invoke-virtual {p0, v3}, Landroid/widget/ListView;->setSelection(I)V

    goto :goto_67

    :cond_32
    :goto_32
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1}, Landroid/widget/ListView;->pointToPosition(II)I

    move-result p1

    if-eq p1, v3, :cond_67

    invoke-virtual {p0}, Landroid/widget/ListView;->getSelectedItemPosition()I

    move-result v0

    if-eq p1, v0, :cond_67

    invoke-virtual {p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_64

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ListView;->getTop()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0, p1, v0}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    :cond_64
    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->くし〴〺ぅ()V

    :cond_67
    :goto_67
    return v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_17

    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, v0, v1}, Landroid/widget/ListView;->pointToPosition(II)I

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぁごぐすすぃ:I

    :goto_17
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;

    if-eqz v0, :cond_23

    .line 1
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    const/4 v2, 0x0

    iput-object v2, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$〺つふすそ;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2
    :cond_23
    invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setListSelectionHidden(Z)V
    .registers 2

    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->いいにぽつ:Z

    return-void
.end method

.method public setSelector(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    if-eqz p1, :cond_8

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;

    invoke-direct {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;-><init>(Landroid/graphics/drawable/Drawable;)V

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;

    invoke-super {p0, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    if-eqz p1, :cond_18

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    :cond_18
    iget p1, v0, Landroid/graphics/Rect;->left:I

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->くし〴〺ぅ:I

    iget p1, v0, Landroid/graphics/Rect;->top:I

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->びぐびあび:I

    iget p1, v0, Landroid/graphics/Rect;->right:I

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->づざかべべ:I

    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->なぎぱいぢぎ:I

    return-void
.end method

.method public 〺つふすそ(Landroid/view/MotionEvent;I)Z
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v4, :cond_16

    const/4 v5, 0x2

    if-eq v2, v5, :cond_14

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1d

    goto/16 :goto_127

    :cond_14
    const/4 v5, 0x1

    goto :goto_17

    :cond_16
    const/4 v5, 0x0

    :goto_17
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v6

    if-gez v6, :cond_21

    :cond_1d
    const/4 v4, 0x0

    const/4 v5, 0x0

    goto/16 :goto_129

    :cond_21
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    float-to-int v7, v7

    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {v0, v7, v6}, Landroid/widget/ListView;->pointToPosition(II)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_34

    goto/16 :goto_129

    :cond_34
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v5

    sub-int v5, v8, v5

    invoke-virtual {v0, v5}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    int-to-float v7, v7

    int-to-float v6, v6

    .line 1
    iput-boolean v4, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->てぜきぽく:Z

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x15

    if-lt v10, v11, :cond_4b

    invoke-virtual {v0, v7, v6}, Landroid/widget/ListView;->drawableHotspotChanged(FF)V

    :cond_4b
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->isPressed()Z

    move-result v12

    if-nez v12, :cond_54

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setPressed(Z)V

    :cond_54
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->layoutChildren()V

    iget v12, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぁごぐすすぃ:I

    if-eq v12, v9, :cond_71

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v13

    sub-int/2addr v12, v13

    invoke-virtual {v0, v12}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    if-eqz v12, :cond_71

    if-eq v12, v5, :cond_71

    invoke-virtual {v12}, Landroid/view/View;->isPressed()Z

    move-result v13

    if-eqz v13, :cond_71

    invoke-virtual {v12, v3}, Landroid/view/View;->setPressed(Z)V

    :cond_71
    iput v8, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぁごぐすすぃ:I

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v12

    int-to-float v12, v12

    sub-float v12, v7, v12

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v13

    int-to-float v13, v13

    sub-float v13, v6, v13

    if-lt v10, v11, :cond_86

    invoke-virtual {v5, v12, v13}, Landroid/view/View;->drawableHotspotChanged(FF)V

    :cond_86
    invoke-virtual {v5}, Landroid/view/View;->isPressed()Z

    move-result v10

    if-nez v10, :cond_8f

    invoke-virtual {v5, v4}, Landroid/view/View;->setPressed(Z)V

    .line 2
    :cond_8f
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v10

    if-eqz v10, :cond_99

    if-eq v8, v9, :cond_99

    const/4 v11, 0x1

    goto :goto_9a

    :cond_99
    const/4 v11, 0x0

    :goto_9a
    if-eqz v11, :cond_9f

    invoke-virtual {v10, v3, v3}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 3
    :cond_9f
    iget-object v12, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->〺つふすそ:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v13

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v14

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v15

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v12, v13, v14, v15, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget v4, v12, Landroid/graphics/Rect;->left:I

    iget v13, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->くし〴〺ぅ:I

    sub-int/2addr v4, v13

    iput v4, v12, Landroid/graphics/Rect;->left:I

    iget v4, v12, Landroid/graphics/Rect;->top:I

    iget v13, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->びぐびあび:I

    sub-int/2addr v4, v13

    iput v4, v12, Landroid/graphics/Rect;->top:I

    iget v4, v12, Landroid/graphics/Rect;->right:I

    iget v13, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->づざかべべ:I

    add-int/2addr v4, v13

    iput v4, v12, Landroid/graphics/Rect;->right:I

    iget v4, v12, Landroid/graphics/Rect;->bottom:I

    iget v13, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->なぎぱいぢぎ:I

    add-int/2addr v4, v13

    iput v4, v12, Landroid/graphics/Rect;->bottom:I

    :try_start_d0
    iget-object v4, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->〳ぜぞぜべっ:Ljava/lang/reflect/Field;

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v5}, Landroid/view/View;->isEnabled()Z

    move-result v12

    if-eq v12, v4, :cond_f1

    iget-object v12, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->〳ぜぞぜべっ:Ljava/lang/reflect/Field;

    if-nez v4, :cond_e2

    const/4 v4, 0x1

    goto :goto_e3

    :cond_e2
    const/4 v4, 0x0

    :goto_e3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v12, v0, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eq v8, v9, :cond_f1

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->refreshDrawableState()V
    :try_end_ef
    .catch Ljava/lang/IllegalAccessException; {:try_start_d0 .. :try_end_ef} :catch_f0

    goto :goto_f1

    :catch_f0
    nop

    :cond_f1
    :goto_f1
    if-eqz v11, :cond_10c

    .line 4
    iget-object v4, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->〺つふすそ:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v11

    invoke-virtual {v4}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getVisibility()I

    move-result v12

    if-nez v12, :cond_105

    const/4 v12, 0x1

    goto :goto_106

    :cond_105
    const/4 v12, 0x0

    :goto_106
    invoke-virtual {v10, v12, v3}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    invoke-static {v10, v11, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->のびぶけせ(Landroid/graphics/drawable/Drawable;FF)V

    .line 5
    :cond_10c
    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v4, :cond_117

    if-eq v8, v9, :cond_117

    invoke-static {v4, v7, v6}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->のびぶけせ(Landroid/graphics/drawable/Drawable;FF)V

    .line 6
    :cond_117
    invoke-direct {v0, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->setSelectorEnabled(Z)V

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->refreshDrawableState()V

    const/4 v4, 0x1

    if-ne v2, v4, :cond_127

    .line 7
    invoke-virtual {v0, v8}, Landroid/widget/ListView;->getItemIdAtPosition(I)J

    move-result-wide v6

    invoke-virtual {v0, v5, v8, v6, v7}, Landroid/widget/ListView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_127
    :goto_127
    const/4 v4, 0x0

    const/4 v5, 0x1

    :goto_129
    if-eqz v5, :cond_12d

    if-eqz v4, :cond_145

    .line 8
    :cond_12d
    iput-boolean v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->てぜきぽく:Z

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setPressed(Z)V

    invoke-virtual/range {p0 .. p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->drawableStateChanged()V

    iget v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->ぁごぐすすぃ:I

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v4

    sub-int/2addr v2, v4

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_145

    invoke-virtual {v2, v3}, Landroid/view/View;->setPressed(Z)V

    :cond_145
    if-eqz v5, :cond_15d

    .line 9
    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->のぷのちつ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/くし〴〺ぅ;

    if-nez v2, :cond_152

    new-instance v2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/くし〴〺ぅ;

    invoke-direct {v2, v0}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/くし〴〺ぅ;-><init>(Landroid/widget/ListView;)V

    iput-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->のぷのちつ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/くし〴〺ぅ;

    :cond_152
    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->のぷのちつ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/くし〴〺ぅ;

    .line 10
    iget-boolean v3, v2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->ぉざぅち〻:Z

    const/4 v4, 0x1

    iput-boolean v4, v2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->ぉざぅち〻:Z

    .line 11
    invoke-virtual {v2, v0, v1}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_16a

    :cond_15d
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->のぷのちつ:Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/くし〴〺ぅ;

    if-eqz v1, :cond_16a

    .line 12
    iget-boolean v2, v1, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->ぉざぅち〻:Z

    if-eqz v2, :cond_168

    invoke-virtual {v1}, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->びぐびあび()V

    :cond_168
    iput-boolean v3, v1, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/げつ〴ぬぐ;->ぉざぅち〻:Z

    :cond_16a
    :goto_16a
    return v5
.end method

.method public final くし〴〺ぅ()V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 1
    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->てぜきぽく:Z

    if-eqz v1, :cond_17

    .line 2
    invoke-virtual {p0}, Landroid/widget/ListView;->isPressed()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual {p0}, Landroid/widget/ListView;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_17
    return-void
.end method

.method public げつ〴ぬぐ(III)I
    .registers 16

    invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ListView;->getListPaddingBottom()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/ListView;->getDividerHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/ListView;->getDivider()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v4

    add-int/2addr v0, v1

    if-nez v4, :cond_18

    return v0

    :cond_18
    const/4 v1, 0x0

    if-lez v2, :cond_1e

    if-eqz v3, :cond_1e

    goto :goto_1f

    :cond_1e
    const/4 v2, 0x0

    :goto_1f
    invoke-interface {v4}, Landroid/widget/ListAdapter;->getCount()I

    move-result v3

    const/4 v5, 0x0

    move-object v8, v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    :goto_28
    if-ge v6, v3, :cond_74

    invoke-interface {v4, v6}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v10

    if-eq v10, v7, :cond_32

    move-object v8, v5

    move v7, v10

    :cond_32
    invoke-interface {v4, v6, v8, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    if-nez v10, :cond_43

    invoke-virtual {p0}, Landroid/widget/ListView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_43
    iget v10, v10, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v10, :cond_4e

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    goto :goto_52

    :cond_4e
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    :goto_52
    invoke-virtual {v8, p1, v10}, Landroid/view/View;->measure(II)V

    invoke-virtual {v8}, Landroid/view/View;->forceLayout()V

    if-lez v6, :cond_5b

    add-int/2addr v0, v2

    :cond_5b
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    add-int/2addr v0, v10

    if-lt v0, p2, :cond_6c

    if-ltz p3, :cond_6b

    if-le v6, p3, :cond_6b

    if-lez v9, :cond_6b

    if-eq v0, p2, :cond_6b

    move p2, v9

    :cond_6b
    return p2

    :cond_6c
    if-ltz p3, :cond_71

    if-lt v6, p3, :cond_71

    move v9, v0

    :cond_71
    add-int/lit8 v6, v6, 0x1

    goto :goto_28

    :cond_74
    return v0
.end method
