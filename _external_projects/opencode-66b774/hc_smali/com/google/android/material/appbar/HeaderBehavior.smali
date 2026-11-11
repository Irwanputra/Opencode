.class public abstract Lcom/google/android/material/appbar/HeaderBehavior;
.super Lcom/google/android/material/appbar/ViewOffsetBehavior;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/appbar/HeaderBehavior$げつ〴ぬぐ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Lcom/google/android/material/appbar/ViewOffsetBehavior<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:I

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:Ljava/lang/Runnable;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:I

.field public びぐびあび:Landroid/widget/OverScroller;

.field public ぺぁあねじ:Landroid/view/VelocityTracker;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/material/appbar/ViewOffsetBehavior;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/material/appbar/HeaderBehavior;->なぎぱいぢぎ:I

    iput v0, p0, Lcom/google/android/material/appbar/HeaderBehavior;->〳ぜぞぜべっ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/appbar/ViewOffsetBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->なぎぱいぢぎ:I

    iput p1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->〳ぜぞぜべっ:I

    return-void
.end method


# virtual methods
.method public 〺でおいここ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;III)I"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/material/appbar/ViewOffsetBehavior;->なぶひせが()I

    move-result p1

    if-eqz p4, :cond_15

    if-lt p1, p4, :cond_15

    if-gt p1, p5, :cond_15

    invoke-static {p3, p4, p5}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->てぜきぽく(III)I

    move-result p2

    if-eq p1, p2, :cond_15

    invoke-virtual {p0, p2}, Lcom/google/android/material/appbar/ViewOffsetBehavior;->ぅみぱぎぎ(I)Z

    sub-int/2addr p1, p2

    goto :goto_16

    :cond_15
    const/4 p1, 0x0

    :goto_16
    return p1
.end method

.method public いいにぽつ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/material/appbar/HeaderBehavior;->〳ぜぞぜべっ:I

    if-gez v0, :cond_12

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/google/android/material/appbar/HeaderBehavior;->〳ぜぞぜべっ:I

    :cond_12
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v1, :cond_40

    iget-boolean v0, p0, Lcom/google/android/material/appbar/HeaderBehavior;->づざかべべ:Z

    if-eqz v0, :cond_40

    iget v0, p0, Lcom/google/android/material/appbar/HeaderBehavior;->なぎぱいぢぎ:I

    if-ne v0, v2, :cond_25

    return v3

    :cond_25
    invoke-virtual {p3, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ne v0, v2, :cond_2c

    return v3

    :cond_2c
    invoke-virtual {p3, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->ぁごぐすすぃ:I

    sub-int v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v5, p0, Lcom/google/android/material/appbar/HeaderBehavior;->〳ぜぞぜべっ:I

    if-le v1, v5, :cond_40

    iput v0, p0, Lcom/google/android/material/appbar/HeaderBehavior;->ぁごぐすすぃ:I

    return v4

    :cond_40
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_87

    iput v2, p0, Lcom/google/android/material/appbar/HeaderBehavior;->なぎぱいぢぎ:I

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, p2}, Lcom/google/android/material/appbar/HeaderBehavior;->じぜこほぱ(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_60

    invoke-virtual {p1, p2, v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざっざへづ(Landroid/view/View;II)Z

    move-result p1

    if-eqz p1, :cond_60

    const/4 p1, 0x1

    goto :goto_61

    :cond_60
    const/4 p1, 0x0

    :goto_61
    iput-boolean p1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->づざかべべ:Z

    if-eqz p1, :cond_87

    iput v1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->ぁごぐすすぃ:I

    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->なぎぱいぢぎ:I

    .line 1
    iget-object p1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->ぺぁあねじ:Landroid/view/VelocityTracker;

    if-nez p1, :cond_77

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->ぺぁあねじ:Landroid/view/VelocityTracker;

    .line 2
    :cond_77
    iget-object p1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->びぐびあび:Landroid/widget/OverScroller;

    if-eqz p1, :cond_87

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_87

    iget-object p1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->びぐびあび:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    return v4

    :cond_87
    iget-object p1, p0, Lcom/google/android/material/appbar/HeaderBehavior;->ぺぁあねじ:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_8e

    invoke-virtual {p1, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_8e
    return v3
.end method

.method public ぉひのべい(Landroid/view/View;)I
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)I"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    return p1
.end method

.method public おかぷせ〱(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)I
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)I"
        }
    .end annotation

    const/high16 v4, -0x80000000

    const v5, 0x7fffffff

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/appbar/HeaderBehavior;->〺でおいここ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I

    move-result p1

    return p1
.end method

.method public final けときぜと(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;III)I"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/material/appbar/HeaderBehavior;->せづっ〸ちね()I

    move-result v0

    sub-int v4, v0, p3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/material/appbar/HeaderBehavior;->〺でおいここ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I

    move-result p1

    return p1
.end method

.method public じぜこほぱ(Landroid/view/View;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public せづっ〸ちね()I
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/appbar/ViewOffsetBehavior;->なぶひせが()I

    move-result v0

    return v0
.end method

.method public びえぁぜい(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v2, p2

    move-object/from16 v7, p3

    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v3, -0x1

    if-eq v0, v8, :cond_59

    const/4 v4, 0x2

    if-eq v0, v4, :cond_34

    const/4 v2, 0x3

    if-eq v0, v2, :cond_be

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1a

    goto :goto_56

    :cond_1a
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    if-nez v0, :cond_22

    const/4 v0, 0x1

    goto :goto_23

    :cond_22
    const/4 v0, 0x0

    :goto_23
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, v6, Lcom/google/android/material/appbar/HeaderBehavior;->なぎぱいぢぎ:I

    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v6, Lcom/google/android/material/appbar/HeaderBehavior;->ぁごぐすすぃ:I

    goto :goto_56

    :cond_34
    iget v0, v6, Lcom/google/android/material/appbar/HeaderBehavior;->なぎぱいぢぎ:I

    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ne v0, v3, :cond_3d

    return v9

    :cond_3d
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    iget v1, v6, Lcom/google/android/material/appbar/HeaderBehavior;->ぁごぐすすぃ:I

    sub-int v3, v1, v0

    iput v0, v6, Lcom/google/android/material/appbar/HeaderBehavior;->ぁごぐすすぃ:I

    invoke-virtual {v6, v2}, Lcom/google/android/material/appbar/HeaderBehavior;->ぺづげぺが(Landroid/view/View;)I

    move-result v4

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/appbar/HeaderBehavior;->けときぜと(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I

    :goto_56
    const/4 v0, 0x0

    goto/16 :goto_cc

    :cond_59
    iget-object v0, v6, Lcom/google/android/material/appbar/HeaderBehavior;->ぺぁあねじ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_be

    invoke-virtual {v0, v7}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object v0, v6, Lcom/google/android/material/appbar/HeaderBehavior;->ぺぁあねじ:Landroid/view/VelocityTracker;

    const/16 v4, 0x3e8

    invoke-virtual {v0, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object v0, v6, Lcom/google/android/material/appbar/HeaderBehavior;->ぺぁあねじ:Landroid/view/VelocityTracker;

    iget v4, v6, Lcom/google/android/material/appbar/HeaderBehavior;->なぎぱいぢぎ:I

    invoke-virtual {v0, v4}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v0

    invoke-virtual {v6, v2}, Lcom/google/android/material/appbar/HeaderBehavior;->ぉひのべい(Landroid/view/View;)I

    move-result v4

    neg-int v4, v4

    const/16 v18, 0x0

    .line 1
    iget-object v5, v6, Lcom/google/android/material/appbar/HeaderBehavior;->くし〴〺ぅ:Ljava/lang/Runnable;

    if-eqz v5, :cond_7f

    invoke-virtual {v2, v5}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iput-object v1, v6, Lcom/google/android/material/appbar/HeaderBehavior;->くし〴〺ぅ:Ljava/lang/Runnable;

    :cond_7f
    iget-object v5, v6, Lcom/google/android/material/appbar/HeaderBehavior;->びぐびあび:Landroid/widget/OverScroller;

    if-nez v5, :cond_8e

    new-instance v5, Landroid/widget/OverScroller;

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v5, v10}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v5, v6, Lcom/google/android/material/appbar/HeaderBehavior;->びぐびあび:Landroid/widget/OverScroller;

    :cond_8e
    iget-object v10, v6, Lcom/google/android/material/appbar/HeaderBehavior;->びぐびあび:Landroid/widget/OverScroller;

    const/4 v11, 0x0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/appbar/ViewOffsetBehavior;->なぶひせが()I

    move-result v12

    const/4 v13, 0x0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v17, v4

    invoke-virtual/range {v10 .. v18}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    iget-object v0, v6, Lcom/google/android/material/appbar/HeaderBehavior;->びぐびあび:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_b7

    new-instance v0, Lcom/google/android/material/appbar/HeaderBehavior$げつ〴ぬぐ;

    move-object/from16 v4, p1

    invoke-direct {v0, v6, v4, v2}, Lcom/google/android/material/appbar/HeaderBehavior$げつ〴ぬぐ;-><init>(Lcom/google/android/material/appbar/HeaderBehavior;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V

    iput-object v0, v6, Lcom/google/android/material/appbar/HeaderBehavior;->くし〴〺ぅ:Ljava/lang/Runnable;

    invoke-static {v2, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_bc

    :cond_b7
    move-object/from16 v4, p1

    invoke-virtual/range {p0 .. p2}, Lcom/google/android/material/appbar/HeaderBehavior;->ぷぞてのほき(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V

    :goto_bc
    const/4 v0, 0x1

    goto :goto_bf

    :cond_be
    const/4 v0, 0x0

    .line 2
    :goto_bf
    iput-boolean v9, v6, Lcom/google/android/material/appbar/HeaderBehavior;->づざかべべ:Z

    iput v3, v6, Lcom/google/android/material/appbar/HeaderBehavior;->なぎぱいぢぎ:I

    iget-object v2, v6, Lcom/google/android/material/appbar/HeaderBehavior;->ぺぁあねじ:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_cc

    invoke-virtual {v2}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v1, v6, Lcom/google/android/material/appbar/HeaderBehavior;->ぺぁあねじ:Landroid/view/VelocityTracker;

    :cond_cc
    :goto_cc
    iget-object v1, v6, Lcom/google/android/material/appbar/HeaderBehavior;->ぺぁあねじ:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_d3

    invoke-virtual {v1, v7}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_d3
    iget-boolean v1, v6, Lcom/google/android/material/appbar/HeaderBehavior;->づざかべべ:Z

    if-nez v1, :cond_db

    if-eqz v0, :cond_da

    goto :goto_db

    :cond_da
    const/4 v8, 0x0

    :cond_db
    :goto_db
    return v8
.end method

.method public ぷぞてのほき(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;)V"
        }
    .end annotation

    return-void
.end method

.method public ぺづげぺが(Landroid/view/View;)I
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)I"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    neg-int p1, p1

    return p1
.end method
