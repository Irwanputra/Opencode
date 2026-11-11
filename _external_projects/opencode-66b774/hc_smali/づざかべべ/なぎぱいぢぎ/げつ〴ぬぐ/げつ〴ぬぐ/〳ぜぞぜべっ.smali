.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:F

.field public くし〴〺ぅ:F

.field public げつ〴ぬぐ:F

.field public づざかべべ:F

.field public なぎぱいぢぎ:F

.field public びぐびあび:F


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;F)V
    .registers 8

    if-eqz p1, :cond_16

    .line 1
    iget-object v0, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    float-to-double v1, p2

    const/4 p2, 0x0

    invoke-virtual {v0, v1, v2, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->づざかべべ(DI)D

    move-result-wide v3

    double-to-float v0, v3

    .line 2
    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:F

    .line 3
    iget-object p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {p1, v1, v2, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ(DI)D

    move-result-wide p1

    double-to-float p1, p1

    .line 4
    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:F

    :cond_16
    return-void
.end method

.method public くし〴〺ぅ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;F)V
    .registers 4

    if-nez p1, :cond_5

    if-nez p2, :cond_5

    return-void

    :cond_5
    if-nez p1, :cond_d

    invoke-virtual {p1, p3}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(F)F

    move-result p1

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:F

    :cond_d
    if-nez p2, :cond_15

    invoke-virtual {p2, p3}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ(F)F

    move-result p1

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ:F

    :cond_15
    return-void
.end method

.method public げつ〴ぬぐ(FFII[F)V
    .registers 22

    move-object/from16 v0, p0

    move/from16 v1, p3

    const/4 v2, 0x0

    aget v3, p5, v2

    const/4 v4, 0x1

    aget v5, p5, v4

    const/high16 v6, 0x3f000000    # 0.5f

    sub-float v7, p1, v6

    const/high16 v8, 0x40000000    # 2.0f

    mul-float v7, v7, v8

    sub-float v6, p2, v6

    mul-float v6, v6, v8

    iget v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:F

    add-float/2addr v3, v8

    iget v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび:F

    add-float/2addr v5, v8

    iget v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:F

    mul-float v8, v8, v7

    add-float/2addr v8, v3

    iget v3, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ:F

    mul-float v3, v3, v6

    add-float/2addr v3, v5

    iget v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->なぎぱいぢぎ:F

    float-to-double v9, v5

    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    double-to-float v5, v9

    iget v9, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ:F

    float-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v9

    double-to-float v9, v9

    neg-int v10, v1

    int-to-float v10, v10

    mul-float v10, v10, v7

    float-to-double v10, v10

    float-to-double v12, v5

    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v14, v14, v10

    move/from16 v5, p4

    int-to-float v5, v5

    mul-float v5, v5, v6

    float-to-double v5, v5

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v5

    sub-double/2addr v14, v10

    double-to-float v10, v14

    mul-float v10, v10, v9

    add-float/2addr v10, v8

    int-to-float v1, v1

    mul-float v1, v1, v7

    float-to-double v7, v1

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v14

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v14, v14, v7

    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v5

    sub-double/2addr v14, v7

    double-to-float v1, v14

    mul-float v9, v9, v1

    add-float/2addr v9, v3

    aput v10, p5, v2

    aput v9, p5, v4

    return-void
.end method

.method public づざかべべ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;F)V
    .registers 7

    const/4 v0, 0x0

    if-eqz p1, :cond_d

    .line 1
    iget-object p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    float-to-double v1, p3

    invoke-virtual {p1, v1, v2, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->づざかべべ(DI)D

    move-result-wide v1

    double-to-float p1, v1

    .line 2
    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->くし〴〺ぅ:F

    :cond_d
    if-eqz p2, :cond_19

    .line 3
    iget-object p1, p2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    float-to-double p2, p3

    invoke-virtual {p1, p2, p3, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->づざかべべ(DI)D

    move-result-wide p1

    double-to-float p1, p1

    .line 4
    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび:F

    :cond_19
    return-void
.end method

.method public びぐびあび(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;F)V
    .registers 7

    const/4 v0, 0x0

    if-eqz p1, :cond_d

    .line 1
    iget-object p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    float-to-double v1, p3

    invoke-virtual {p1, v1, v2, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->づざかべべ(DI)D

    move-result-wide v1

    double-to-float p1, v1

    .line 2
    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->げつ〴ぬぐ:F

    :cond_d
    if-eqz p2, :cond_19

    .line 3
    iget-object p1, p2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    float-to-double p2, p3

    invoke-virtual {p1, p2, p3, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->づざかべべ(DI)D

    move-result-wide p1

    double-to-float p1, p1

    .line 4
    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ:F

    :cond_19
    return-void
.end method
