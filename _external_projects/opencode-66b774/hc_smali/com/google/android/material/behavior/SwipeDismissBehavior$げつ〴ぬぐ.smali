.class public Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;
.super Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/behavior/SwipeDismissBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

.field public げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-direct {p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Landroid/view/View;I)V
    .registers 3

    iput p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    iput p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_12

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_12
    return-void
.end method

.method public 〺つふすそ(Landroid/view/View;II)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    return p1
.end method

.method public いいにぽつ(Landroid/view/View;IIII)V
    .registers 8

    iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    int-to-float p3, p3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p4

    int-to-float p4, p4

    iget-object p5, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget p5, p5, Lcom/google/android/material/behavior/SwipeDismissBehavior;->づざかべべ:F

    mul-float p4, p4, p5

    add-float/2addr p4, p3

    iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    int-to-float p3, p3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p5

    int-to-float p5, p5

    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->なぎぱいぢぎ:F

    mul-float p5, p5, v0

    add-float/2addr p5, p3

    int-to-float p2, p2

    const/high16 p3, 0x3f800000    # 1.0f

    cmpg-float v0, p2, p4

    if-gtz v0, :cond_29

    invoke-virtual {p1, p3}, Landroid/view/View;->setAlpha(F)V

    goto :goto_3e

    :cond_29
    const/4 v0, 0x0

    cmpl-float v1, p2, p5

    if-ltz v1, :cond_32

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    goto :goto_3e

    :cond_32
    sub-float/2addr p2, p4

    sub-float/2addr p5, p4

    div-float/2addr p2, p5

    sub-float p2, p3, p2

    invoke-static {v0, p2, p3}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->どぇぞほだ(FFF)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    :goto_3e
    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/View;)I
    .registers 2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    return p1
.end method

.method public げつ〴ぬぐ(Landroid/view/View;II)I
    .registers 6

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_9

    const/4 p3, 0x1

    goto :goto_a

    :cond_9
    const/4 p3, 0x0

    :goto_a
    iget-object v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget v1, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->くし〴〺ぅ:I

    if-nez v1, :cond_24

    if-eqz p3, :cond_1c

    :cond_12
    iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    sub-int/2addr p3, p1

    iget p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    goto :goto_37

    :cond_1c
    :goto_1c
    iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    add-int/2addr p1, p3

    goto :goto_37

    :cond_24
    if-ne v1, v0, :cond_29

    if-eqz p3, :cond_12

    goto :goto_1c

    :cond_29
    iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int/2addr p3, v0

    iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    add-int/2addr p1, v0

    .line 1
    :goto_37
    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public てぜきぽく(Landroid/view/View;I)Z
    .registers 5

    iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->〺つふすそ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    if-ne v0, p2, :cond_11

    :cond_7
    iget-object p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-virtual {p2, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->なぶひせが(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_11

    const/4 p1, 0x1

    goto :goto_12

    :cond_11
    const/4 p1, 0x0

    :goto_12
    return p1
.end method

.method public ぺぁあねじ(I)V
    .registers 2

    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ぺふねづ〺(Landroid/view/View;FF)V
    .registers 10

    const/4 p3, -0x1

    iput p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    cmpl-float v3, p2, v0

    if-eqz v3, :cond_3e

    .line 1
    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v3

    if-ne v3, v2, :cond_16

    const/4 v3, 0x1

    goto :goto_17

    :cond_16
    const/4 v3, 0x0

    :goto_17
    iget-object v4, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget v4, v4, Lcom/google/android/material/behavior/SwipeDismissBehavior;->くし〴〺ぅ:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1f

    goto :goto_2c

    :cond_1f
    if-nez v4, :cond_30

    if-eqz v3, :cond_28

    cmpg-float p2, p2, v0

    if-gez p2, :cond_2e

    goto :goto_2c

    :cond_28
    cmpl-float p2, p2, v0

    if-lez p2, :cond_2e

    :goto_2c
    const/4 p2, 0x1

    goto :goto_5b

    :cond_2e
    const/4 p2, 0x0

    goto :goto_5b

    :cond_30
    if-ne v4, v2, :cond_2e

    if-eqz v3, :cond_39

    cmpl-float p2, p2, v0

    if-lez p2, :cond_2e

    goto :goto_3d

    :cond_39
    cmpg-float p2, p2, v0

    if-gez p2, :cond_2e

    :goto_3d
    goto :goto_2c

    :cond_3e
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    sub-int/2addr p2, v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget v3, v3, Lcom/google/android/material/behavior/SwipeDismissBehavior;->びぐびあび:F

    mul-float v0, v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-lt p2, v0, :cond_2e

    goto :goto_2c

    :goto_5b
    if-eqz p2, :cond_6a

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    if-ge p2, v0, :cond_67

    sub-int/2addr v0, p3

    goto :goto_68

    :cond_67
    add-int/2addr v0, p3

    :goto_68
    const/4 v1, 0x1

    goto :goto_6c

    :cond_6a
    iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->げつ〴ぬぐ:I

    :goto_6c
    iget-object p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget-object p2, p2, Lcom/google/android/material/behavior/SwipeDismissBehavior;->げつ〴ぬぐ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p3

    invoke-virtual {p2, v0, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〻ぞまぎな〻(II)Z

    move-result p2

    if-eqz p2, :cond_85

    new-instance p2, Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;

    iget-object p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-direct {p2, p3, p1, v1}, Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;-><init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V

    invoke-static {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_8c

    :cond_85
    if-eqz v1, :cond_8c

    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_8c
    :goto_8c
    return-void
.end method
