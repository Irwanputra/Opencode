.class public Lづざかべべ/は〲ぱなで/ぉざぅち〻;
.super Lづざかべべ/は〲ぱなで/ぃぜぶの〸ぃ;
.source ""


# instance fields
.field public 〺つふすそ:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/は〲ぱなで/ぃぜぶの〸ぃ;-><init>()V

    const/16 v0, 0x50

    iput v0, p0, Lづざかべべ/は〲ぱなで/ぉざぅち〻;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/view/ViewGroup;Landroidx/transition/Transition;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)J
    .registers 22

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-wide/16 v2, 0x0

    if-nez v1, :cond_b

    if-nez p4, :cond_b

    return-wide v2

    :cond_b
    invoke-virtual/range {p2 .. p2}, Landroidx/transition/Transition;->へぬ〴づぞ()Landroid/graphics/Rect;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz p4, :cond_1d

    invoke-virtual {v0, v1}, Lづざかべべ/は〲ぱなで/ぃぜぶの〸ぃ;->くし〴〺ぅ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)I

    move-result v6

    if-nez v6, :cond_19

    goto :goto_1d

    :cond_19
    move-object/from16 v1, p4

    const/4 v6, 0x1

    goto :goto_1e

    :cond_1d
    :goto_1d
    const/4 v6, -0x1

    :goto_1e
    const/4 v7, 0x0

    .line 1
    invoke-static {v1, v7}, Lづざかべべ/は〲ぱなで/ぃぜぶの〸ぃ;->〺つふすそ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;I)I

    move-result v8

    .line 2
    invoke-static {v1, v5}, Lづざかべべ/は〲ぱなで/ぃぜぶの〸ぃ;->〺つふすそ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;I)I

    move-result v1

    const/4 v9, 0x2

    new-array v10, v9, [I

    move-object/from16 v11, p1

    .line 3
    invoke-virtual {v11, v10}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    aget v12, v10, v7

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getTranslationX()F

    move-result v13

    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    move-result v13

    add-int/2addr v13, v12

    aget v10, v10, v5

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getTranslationY()F

    move-result v12

    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v12

    add-int/2addr v12, v10

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v10

    add-int/2addr v10, v13

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v14

    add-int/2addr v14, v12

    if-eqz v4, :cond_5a

    invoke-virtual {v4}, Landroid/graphics/Rect;->centerX()I

    move-result v9

    invoke-virtual {v4}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    goto :goto_66

    :cond_5a
    add-int v4, v13, v10

    div-int/2addr v4, v9

    add-int v15, v12, v14

    div-int/lit8 v9, v15, 0x2

    move/from16 v16, v9

    move v9, v4

    move/from16 v4, v16

    .line 4
    :goto_66
    iget v15, v0, Lづざかべべ/は〲ぱなで/ぉざぅち〻;->〺つふすそ:I

    const v7, 0x800005

    const v2, 0x800003

    const/4 v3, 0x3

    if-ne v15, v2, :cond_7c

    invoke-static/range {p1 .. p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v15

    if-ne v15, v5, :cond_78

    goto :goto_79

    :cond_78
    const/4 v5, 0x0

    :goto_79
    if-eqz v5, :cond_88

    goto :goto_8a

    :cond_7c
    if-ne v15, v7, :cond_8b

    invoke-static/range {p1 .. p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v15

    if-ne v15, v5, :cond_85

    goto :goto_86

    :cond_85
    const/4 v5, 0x0

    :goto_86
    if-eqz v5, :cond_8a

    :cond_88
    const/4 v15, 0x3

    goto :goto_8b

    :cond_8a
    :goto_8a
    const/4 v15, 0x5

    :cond_8b
    :goto_8b
    if-eq v15, v3, :cond_b2

    const/4 v5, 0x5

    if-eq v15, v5, :cond_aa

    const/16 v4, 0x30

    if-eq v15, v4, :cond_a2

    const/16 v4, 0x50

    if-eq v15, v4, :cond_9a

    const/4 v1, 0x0

    goto :goto_b9

    :cond_9a
    sub-int/2addr v1, v12

    sub-int/2addr v9, v8

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v4

    add-int/2addr v1, v4

    goto :goto_b9

    :cond_a2
    sub-int/2addr v14, v1

    sub-int/2addr v9, v8

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v1, v14

    goto :goto_b9

    :cond_aa
    sub-int/2addr v8, v13

    sub-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v1, v8

    goto :goto_b9

    :cond_b2
    sub-int/2addr v10, v8

    sub-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v1, v10

    :goto_b9
    int-to-float v1, v1

    .line 5
    iget v4, v0, Lづざかべべ/は〲ぱなで/ぉざぅち〻;->〺つふすそ:I

    if-eq v4, v3, :cond_ca

    const/4 v3, 0x5

    if-eq v4, v3, :cond_ca

    if-eq v4, v2, :cond_ca

    if-eq v4, v7, :cond_ca

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    goto :goto_ce

    :cond_ca
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    :goto_ce
    int-to-float v2, v2

    div-float/2addr v1, v2

    move-object/from16 v2, p2

    .line 6
    iget-wide v2, v2, Landroidx/transition/Transition;->びぐびあび:J

    const-wide/16 v4, 0x0

    cmp-long v7, v2, v4

    if-gez v7, :cond_dc

    const-wide/16 v2, 0x12c

    :cond_dc
    int-to-long v4, v6

    mul-long v2, v2, v4

    long-to-float v2, v2

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v2, v3

    mul-float v2, v2, v1

    .line 7
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-long v1, v1

    return-wide v1
.end method
