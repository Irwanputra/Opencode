.class public Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;
.super Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:I

.field public ぁごぐすすぃ:I

.field public いいにぽつ:Z

.field public ぺぁあねじ:I


# direct methods
.method public varargs constructor <init>([Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;)V
    .registers 2

    invoke-direct {p0, p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;-><init>([Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->いいにぽつ:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ(F)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->びぐびあび(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public くし〴〺ぅ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;
    .registers 6

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v1, :cond_1c

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v4}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    move-result-object v4

    check-cast v4, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_1c
    new-instance v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;

    invoke-direct {v0, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;-><init>([Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;)V

    return-object v0
.end method

.method public bridge synthetic げつ〴ぬぐ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;
    .registers 2

    invoke-virtual {p0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;

    move-result-object v0

    return-object v0
.end method

.method public びぐびあび(F)I
    .registers 7

    iget v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_57

    iget-boolean v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->いいにぽつ:Z

    if-eqz v0, :cond_2a

    iput-boolean v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->いいにぽつ:Z

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    .line 2
    iput v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    .line 3
    iget v0, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    .line 4
    iput v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->〳ぜぞぜべっ:I

    iget v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    sub-int/2addr v0, v1

    iput v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->ぺぁあねじ:I

    :cond_2a
    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_32

    invoke-interface {v0, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    :cond_32
    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;

    if-nez v0, :cond_40

    iget v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    iget v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->ぺぁあねじ:I

    int-to-float v1, v1

    mul-float p1, p1, v1

    float-to-int p1, p1

    add-int/2addr v0, p1

    return v0

    :cond_40
    iget v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/なぎぱいぢぎ;->〳ぜぞぜべっ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_50
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_57
    const/4 v4, 0x0

    cmpg-float v4, p1, v4

    if-gtz v4, :cond_9d

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    .line 5
    iget v2, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    iget v3, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    .line 6
    iget v0, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iget v4, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    .line 7
    iget-object v1, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    if-eqz v1, :cond_7c

    .line 8
    invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    :cond_7c
    sub-float/2addr p1, v0

    sub-float/2addr v4, v0

    div-float/2addr p1, v4

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;

    if-nez v0, :cond_8a

    sub-int/2addr v3, v2

    int-to-float v0, v3

    mul-float p1, p1, v0

    float-to-int p1, p1

    add-int/2addr v2, p1

    goto :goto_9c

    :cond_8a
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v2

    :goto_9c
    return v2

    :cond_9d
    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v4, p1, v4

    if-ltz v4, :cond_e8

    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    .line 9
    iget v2, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    iget v3, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    .line 10
    iget v0, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iget v4, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    .line 11
    iget-object v1, v1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    if-eqz v1, :cond_c7

    .line 12
    invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    :cond_c7
    sub-float/2addr p1, v0

    sub-float/2addr v4, v0

    div-float/2addr p1, v4

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;

    if-nez v0, :cond_d5

    sub-int/2addr v3, v2

    int-to-float v0, v3

    mul-float p1, p1, v0

    float-to-int p1, p1

    add-int/2addr v2, p1

    goto :goto_e7

    :cond_d5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v2

    :goto_e7
    return v2

    :cond_e8
    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    const/4 v1, 0x1

    :goto_f1
    iget v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:I

    if-ge v1, v2, :cond_138

    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;

    .line 13
    iget v4, v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    cmpg-float v4, p1, v4

    if-gez v4, :cond_134

    .line 14
    iget-object v1, v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/view/animation/Interpolator;

    if-eqz v1, :cond_10b

    .line 15
    invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p1

    .line 16
    :cond_10b
    iget v1, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    sub-float/2addr p1, v1

    iget v3, v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    sub-float/2addr v3, v1

    div-float/2addr p1, v3

    .line 17
    iget v0, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    iget v1, v2, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ$〺つふすそ;->なぎぱいぢぎ:I

    .line 18
    iget-object v2, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;

    if-nez v2, :cond_121

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float p1, p1, v1

    float-to-int p1, p1

    add-int/2addr v0, p1

    goto :goto_133

    :cond_121
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, p1, v0, v1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/てぜきぽく;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    :goto_133
    return v0

    :cond_134
    add-int/lit8 v1, v1, 0x1

    move-object v0, v2

    goto :goto_f1

    :cond_138
    iget-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:Ljava/util/ArrayList;

    sub-int/2addr v2, v3

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_50
.end method
