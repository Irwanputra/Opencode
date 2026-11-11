.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/へぬ〴づぞ;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:F

.field public 〺つふすそ:F

.field public ぁごぐすすぃ:F

.field public いいにぽつ:I

.field public くし〴〺ぅ:F

.field public げつ〴ぬぐ:F

.field public づざかべべ:F

.field public てぜきぽく:F

.field public なぎぱいぢぎ:F

.field public のぷのちつ:F

.field public びぐびあび:F

.field public ぺぁあねじ:F

.field public ぺふねづ〺:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/へぬ〴づぞ;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺふねづ〺:Z

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .registers 8

    .line 1
    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:F

    const/high16 v1, 0x40000000    # 2.0f

    cmpg-float v2, p1, v0

    if-gtz v2, :cond_18

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ:F

    mul-float v3, v2, p1

    iget v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    sub-float/2addr v4, v2

    mul-float v4, v4, p1

    mul-float v4, v4, p1

    mul-float v0, v0, v1

    div-float/2addr v4, v0

    add-float/2addr v4, v3

    goto :goto_5a

    :cond_18
    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->いいにぽつ:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_20

    iget v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:F

    goto :goto_5a

    :cond_20
    sub-float v0, p1, v0

    iget v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:F

    cmpg-float v4, v0, v3

    if-gez v4, :cond_3c

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:F

    iget v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    mul-float v5, v4, v0

    add-float/2addr v5, v2

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:F

    sub-float/2addr v2, v4

    mul-float v2, v2, v0

    mul-float v2, v2, v0

    mul-float v3, v3, v1

    div-float/2addr v2, v3

    add-float v4, v2, v5

    goto :goto_5a

    :cond_3c
    const/4 v4, 0x2

    if-ne v2, v4, :cond_42

    iget v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〳ぜぞぜべっ:F

    goto :goto_5a

    :cond_42
    sub-float/2addr v0, v3

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:F

    cmpg-float v3, v0, v2

    if-gez v3, :cond_58

    iget v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〳ぜぞぜべっ:F

    iget v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:F

    mul-float v4, v4, v0

    add-float/2addr v3, v4

    mul-float v4, v4, v0

    mul-float v2, v2, v1

    div-float/2addr v4, v2

    sub-float v4, v3, v4

    goto :goto_5a

    :cond_58
    iget v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺぁあねじ:F

    .line 2
    :goto_5a
    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->のぷのちつ:F

    iget-boolean p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺふねづ〺:Z

    if-eqz p1, :cond_64

    iget p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->てぜきぽく:F

    sub-float/2addr p1, v4

    goto :goto_67

    :cond_64
    iget p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->てぜきぽく:F

    add-float/2addr p1, v4

    :goto_67
    return p1
.end method

.method public 〺つふすそ(FFFFFF)V
    .registers 13

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->てぜきぽく:F

    cmpl-float v1, p1, p2

    if-lez v1, :cond_8

    const/4 v1, 0x1

    goto :goto_9

    :cond_8
    const/4 v1, 0x0

    :goto_9
    iput-boolean v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺふねづ〺:Z

    if-eqz v1, :cond_12

    neg-float v1, p3

    sub-float v2, p1, p2

    move-object v0, p0

    goto :goto_16

    :cond_12
    sub-float v2, p2, p1

    move-object v0, p0

    move v1, p3

    :goto_16
    move v3, p5

    move v4, p6

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび(FFFFF)V

    return-void
.end method

.method public くし〴〺ぅ(F)F
    .registers 5

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:F

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_10

    iget v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ:F

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    :goto_a
    sub-float/2addr v2, v1

    mul-float v2, v2, p1

    div-float/2addr v2, v0

    add-float/2addr v2, v1

    return v2

    :cond_10
    iget v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->いいにぽつ:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_17

    const/4 p1, 0x0

    return p1

    :cond_17
    sub-float/2addr p1, v0

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:F

    cmpg-float v2, p1, v0

    if-gez v2, :cond_23

    iget v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:F

    goto :goto_a

    :cond_23
    const/4 v2, 0x2

    if-ne v1, v2, :cond_29

    iget p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〳ぜぞぜべっ:F

    return p1

    :cond_29
    sub-float/2addr p1, v0

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:F

    cmpg-float v1, p1, v0

    if-gez v1, :cond_37

    iget v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:F

    mul-float p1, p1, v1

    div-float/2addr p1, v0

    sub-float/2addr v1, p1

    return v1

    :cond_37
    iget p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺぁあねじ:F

    return p1
.end method

.method public げつ〴ぬぐ()F
    .registers 2

    iget-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺふねづ〺:Z

    if-eqz v0, :cond_c

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->のぷのちつ:F

    invoke-virtual {p0, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ(F)F

    move-result v0

    neg-float v0, v0

    goto :goto_12

    :cond_c
    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->のぷのちつ:F

    invoke-virtual {p0, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ(F)F

    move-result v0

    :goto_12
    return v0
.end method

.method public final びぐびあび(FFFFF)V
    .registers 14

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-nez v1, :cond_8

    const p1, 0x38d1b717    # 1.0E-4f

    :cond_8
    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ:F

    div-float v1, p1, p3

    mul-float v2, v1, p1

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/4 v4, 0x3

    const/4 v5, 0x2

    cmpg-float v6, p1, v0

    if-gez v6, :cond_6d

    neg-float p5, p1

    div-float/2addr p5, p3

    mul-float p5, p5, p1

    div-float/2addr p5, v3

    sub-float p5, p2, p5

    mul-float p5, p5, p3

    float-to-double v1, p5

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float p5, v1

    cmpg-float v1, p5, p4

    if-gez v1, :cond_46

    iput v5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->いいにぽつ:I

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ:F

    iput p5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:F

    sub-float p4, p5, p1

    div-float/2addr p4, p3

    iput p4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:F

    div-float p3, p5, p3

    iput p3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:F

    add-float/2addr p1, p5

    mul-float p1, p1, p4

    div-float/2addr p1, v3

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:F

    iput p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〳ぜぞぜべっ:F

    iput p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺぁあねじ:F

    return-void

    :cond_46
    iput v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->いいにぽつ:I

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ:F

    iput p4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iput p4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:F

    sub-float p5, p4, p1

    div-float/2addr p5, p3

    iput p5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:F

    div-float p3, p4, p3

    iput p3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:F

    add-float/2addr p1, p4

    mul-float p1, p1, p5

    div-float/2addr p1, v3

    mul-float p3, p3, p4

    div-float/2addr p3, v3

    sub-float p5, p2, p1

    sub-float/2addr p5, p3

    div-float/2addr p5, p4

    iput p5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:F

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:F

    sub-float p1, p2, p3

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〳ぜぞぜべっ:F

    iput p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺぁあねじ:F

    return-void

    :cond_6d
    cmpl-float v6, v2, p2

    if-ltz v6, :cond_80

    mul-float v3, v3, p2

    div-float/2addr v3, p1

    const/4 p3, 0x1

    iput p3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->いいにぽつ:I

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ:F

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iput p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:F

    iput v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:F

    return-void

    :cond_80
    sub-float v2, p2, v2

    div-float v6, v2, p1

    add-float v7, v6, v1

    cmpg-float p5, v7, p5

    if-gez p5, :cond_9b

    iput v5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->いいにぽつ:I

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ:F

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:F

    iput v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:F

    iput p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〳ぜぞぜべっ:F

    iput v6, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:F

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:F

    return-void

    :cond_9b
    mul-float p5, p3, p2

    mul-float v1, p1, p1

    div-float/2addr v1, v3

    add-float/2addr v1, p5

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float p5, v1

    sub-float v1, p5, p1

    div-float/2addr v1, p3

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:F

    div-float v2, p5, p3

    iput v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:F

    cmpg-float v6, p5, p4

    if-gez v6, :cond_c9

    iput v5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->いいにぽつ:I

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ:F

    iput p5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:F

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:F

    iput v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:F

    add-float/2addr p1, p5

    mul-float p1, p1, v1

    div-float/2addr p1, v3

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:F

    iput p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〳ぜぞぜべっ:F

    return-void

    :cond_c9
    iput v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->いいにぽつ:I

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ:F

    iput p4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:F

    iput p4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:F

    sub-float p5, p4, p1

    div-float/2addr p5, p3

    iput p5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:F

    div-float p3, p4, p3

    iput p3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:F

    add-float/2addr p1, p4

    mul-float p1, p1, p5

    div-float/2addr p1, v3

    mul-float p3, p3, p4

    div-float/2addr p3, v3

    sub-float p5, p2, p1

    sub-float/2addr p5, p3

    div-float/2addr p5, p4

    iput p5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:F

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:F

    sub-float p1, p2, p3

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->〳ぜぞぜべっ:F

    iput p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺぁあねじ:F

    return-void
.end method
