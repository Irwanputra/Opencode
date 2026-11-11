.class public Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;
.super Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-direct {p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;II)I
    .registers 5

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね()I

    move-result p1

    iget-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-boolean v0, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eqz v0, :cond_f

    iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    goto :goto_11

    :cond_f
    iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    :goto_11
    invoke-static {p2, p1, p3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->てぜきぽく(III)I

    move-result p1

    return p1
.end method

.method public いいにぽつ(Landroid/view/View;IIII)V
    .registers 6

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが(I)V

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/view/View;II)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    return p1
.end method

.method public てぜきぽく(Landroid/view/View;I)Z
    .registers 8

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v4, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇとしたべど:Z

    if-eqz v4, :cond_e

    return v2

    :cond_e
    const/4 v4, 0x3

    if-ne v1, v4, :cond_2b

    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱:I

    if-ne v1, p2, :cond_2b

    iget-object p2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_20

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    goto :goto_21

    :cond_20
    const/4 p2, 0x0

    :goto_21
    if-eqz p2, :cond_2b

    const/4 v0, -0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p2

    if-eqz p2, :cond_2b

    return v2

    :cond_2b
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_38

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p1, :cond_38

    const/4 v2, 0x1

    :cond_38
    return v2
.end method

.method public びぐびあび(Landroid/view/View;)I
    .registers 3

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-boolean v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eqz v0, :cond_9

    iget p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    return p1

    :cond_9
    iget p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    return p1
.end method

.method public ぺぁあねじ(I)V
    .registers 4

    const/4 v0, 0x1

    if-ne p1, v0, :cond_c

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1
    iget-boolean v1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〻ぞまぎな〻:Z

    if-eqz v1, :cond_c

    .line 2
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱(I)V

    :cond_c
    return-void
.end method

.method public ぺふねづ〺(Landroid/view/View;FF)V
    .registers 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x6

    const/4 v4, 0x3

    cmpg-float v5, p3, v1

    if-gez v5, :cond_24

    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1
    iget-boolean p3, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz p3, :cond_14

    .line 2
    :goto_f
    iget p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉざぅち〻:I

    :goto_11
    const/4 v2, 0x3

    goto/16 :goto_105

    :cond_14
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    iget-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v1, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    if-le p2, v1, :cond_21

    move p2, v1

    goto/16 :goto_be

    :cond_21
    iget p2, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇぬぎばつ:I

    goto :goto_11

    :cond_24
    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-boolean v6, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eqz v6, :cond_87

    invoke-virtual {v5, p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げがぴうあだ(Landroid/view/View;F)Z

    move-result v5

    if-eqz v5, :cond_87

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float p2, p2, v1

    if-gez p2, :cond_42

    const/high16 p2, 0x43fa0000    # 500.0f

    cmpl-float p2, p3, p2

    if-gtz p2, :cond_58

    .line 3
    :cond_42
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    iget-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v1, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    invoke-virtual {p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね()I

    move-result p3

    add-int/2addr p3, v1

    div-int/lit8 p3, p3, 0x2

    if-le p2, p3, :cond_55

    const/4 p2, 0x1

    goto :goto_56

    :cond_55
    const/4 p2, 0x0

    :goto_56
    if-eqz p2, :cond_5f

    .line 4
    :cond_58
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    const/4 v2, 0x5

    goto/16 :goto_105

    :cond_5f
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    iget-boolean p3, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz p3, :cond_66

    goto :goto_f

    .line 6
    :cond_66
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    iget-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇぬぎばつ:I

    sub-int/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p3

    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    sub-int/2addr p3, v1

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    if-ge p2, p3, :cond_ba

    :goto_82
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇぬぎばつ:I

    goto :goto_11

    :cond_87
    cmpl-float v1, p3, v1

    if-eqz v1, :cond_c3

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpl-float p2, p2, p3

    if-lez p2, :cond_98

    goto :goto_c3

    :cond_98
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 7
    iget-boolean p3, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz p3, :cond_a1

    .line 8
    :goto_9e
    iget p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    goto :goto_105

    :cond_a1
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    iget-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    sub-int p3, p2, p3

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int/2addr p2, v1

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-ge p3, p2, :cond_c0

    :cond_ba
    :goto_ba
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    :goto_be
    const/4 v2, 0x6

    goto :goto_105

    :cond_c0
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    goto :goto_9e

    :cond_c3
    :goto_c3
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    iget-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 9
    iget-boolean v1, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz v1, :cond_e4

    .line 10
    iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉざぅち〻:I

    sub-int p3, p2, p3

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int/2addr p2, v1

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-ge p3, p2, :cond_c0

    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    goto/16 :goto_f

    :cond_e4
    iget v1, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    if-ge p2, v1, :cond_f3

    iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int p3, p2, p3

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    if-ge p2, p3, :cond_ba

    goto :goto_82

    :cond_f3
    sub-int p3, p2, v1

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int/2addr p2, v1

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-ge p3, p2, :cond_c0

    goto :goto_ba

    :goto_105
    iget-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {p3, p1, v2, p2, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ながふずは(Landroid/view/View;IIZ)V

    return-void
.end method
