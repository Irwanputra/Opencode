.class public abstract Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$づざかべべ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$のぷのちつ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$てぜきぽく;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$ぺふねづ〺;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$いいにぽつ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$ぺぁあねじ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$びぐびあび;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〳ぜぞぜべっ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$ぁごぐすすぃ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$なぎぱいぢぎ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$げつ〴ぬぐ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$くし〴〺ぅ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:[F

.field public いいにぽつ:F

.field public くし〴〺ぅ:[I

.field public げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

.field public づざかべべ:I

.field public なぎぱいぢぎ:Ljava/lang/String;

.field public びぐびあび:[[F

.field public ぺぁあねじ:J


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〺つふすそ:I

    const/16 v1, 0xa

    new-array v1, v1, [I

    iput-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->くし〴〺ぅ:[I

    const/4 v1, 0x2

    new-array v1, v1, [I

    fill-array-data v1, :array_28

    const-class v2, F

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[F

    iput-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->びぐびあび:[[F

    const/4 v1, 0x3

    new-array v1, v1, [F

    iput-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->ぁごぐすすぃ:[F

    iput-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〳ぜぞぜべっ:Z

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    return-void

    :array_28
    .array-data 4
        0xa
        0x3
    .end array-data
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->なぎぱいぢぎ:Ljava/lang/String;

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "##.##"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_a
    iget v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->づざかべべ:I

    if-ge v2, v3, :cond_37

    const-string v3, "["

    invoke-static {v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->くし〴〺ぅ:[I

    aget v3, v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " , "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->びぐびあび:[[F

    aget-object v3, v3, v2

    invoke-virtual {v1, v3}, Ljava/text/DecimalFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_37
    return-object v0
.end method

.method public 〺つふすそ(FJLandroid/view/View;Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/びぐびあび;)F
    .registers 23

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    iget-object v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    move/from16 v6, p1

    float-to-double v6, v6

    iget-object v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->ぁごぐすすぃ:[F

    invoke-virtual {v5, v6, v7, v8}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->びぐびあび(D[F)V

    iget-object v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->ぁごぐすすぃ:[F

    const/4 v6, 0x1

    aget v7, v5, v6

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x0

    cmpl-float v11, v7, v9

    if-nez v11, :cond_23

    iput-boolean v10, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〳ぜぞぜべっ:Z

    aget v1, v5, v8

    return v1

    :cond_23
    iget v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_3b

    iget-object v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v4, v3, v5, v10}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/びぐびあび;->げつ〴ぬぐ(Ljava/lang/Object;Ljava/lang/String;I)F

    move-result v5

    iput v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_3b

    iput v9, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    :cond_3b
    iget-wide v11, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->ぺぁあねじ:J

    sub-long v11, v1, v11

    iget v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    float-to-double v13, v5

    long-to-double v11, v11

    const-wide v15, 0x3e112e0be826d695L    # 1.0E-9

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v11, v11, v15

    float-to-double v8, v7

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v11, v11, v8

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v11, v13

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    rem-double/2addr v11, v8

    double-to-float v8, v11

    iput v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    iget-object v9, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->なぎぱいぢぎ:Ljava/lang/String;

    .line 1
    iget-object v11, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/びぐびあび;->げつ〴ぬぐ:Ljava/util/HashMap;

    invoke-virtual {v11, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_74

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    new-array v12, v6, [F

    aput v8, v12, v10

    invoke-virtual {v11, v9, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_89

    :cond_74
    iget-object v11, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/びぐびあび;->げつ〴ぬぐ:Ljava/util/HashMap;

    invoke-virtual {v11, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/HashMap;

    invoke-virtual {v11, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8f

    new-array v12, v6, [F

    aput v8, v12, v10

    invoke-virtual {v11, v9, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_89
    iget-object v4, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/びぐびあび;->げつ〴ぬぐ:Ljava/util/HashMap;

    invoke-virtual {v4, v3, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a1

    :cond_8f
    invoke-virtual {v11, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    array-length v4, v3

    if-gtz v4, :cond_9c

    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v3

    :cond_9c
    aput v8, v3, v10

    invoke-virtual {v11, v9, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    :goto_a1
    iput-wide v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->ぺぁあねじ:J

    iget-object v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->ぁごぐすすぃ:[F

    aget v1, v1, v10

    iget v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    invoke-virtual {v0, v2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->げつ〴ぬぐ(F)F

    move-result v2

    iget-object v3, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->ぁごぐすすぃ:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    mul-float v2, v2, v1

    add-float/2addr v2, v3

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-nez v1, :cond_c0

    cmpl-float v1, v7, v3

    if-eqz v1, :cond_bf

    goto :goto_c0

    :cond_bf
    const/4 v6, 0x0

    :cond_c0
    :goto_c0
    iput-boolean v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〳ぜぞぜべっ:Z

    return v2
.end method

.method public くし〴〺ぅ(IFFIF)V
    .registers 9

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->くし〴〺ぅ:[I

    iget v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->づざかべべ:I

    aput p1, v0, v1

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->びぐびあび:[[F

    aget-object v0, p1, v1

    const/4 v2, 0x0

    aput p2, v0, v2

    aget-object p2, p1, v1

    const/4 v0, 0x1

    aput p3, p2, v0

    aget-object p1, p1, v1

    const/4 p2, 0x2

    aput p5, p1, p2

    iget p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〺つふすそ:I

    invoke-static {p1, p4}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〺つふすそ:I

    iget p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->づざかべべ:I

    add-int/2addr p1, v0

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->づざかべべ:I

    return-void
.end method

.method public げつ〴ぬぐ(F)F
    .registers 6

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〺つふすそ:I

    const v1, 0x40c90fdb

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, 0x3f800000    # 1.0f

    packed-switch v0, :pswitch_data_46

    mul-float p1, p1, v1

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1

    :pswitch_15
    const/high16 v0, 0x40800000    # 4.0f

    mul-float p1, p1, v0

    rem-float/2addr p1, v0

    sub-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sub-float p1, v3, p1

    mul-float p1, p1, p1

    :goto_23
    sub-float/2addr v3, p1

    return v3

    :pswitch_25
    mul-float p1, p1, v1

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1

    :pswitch_2e
    mul-float p1, p1, v2

    add-float/2addr p1, v3

    rem-float/2addr p1, v2

    goto :goto_23

    :pswitch_33
    mul-float p1, p1, v2

    add-float/2addr p1, v3

    rem-float/2addr p1, v2

    sub-float/2addr p1, v3

    return p1

    :pswitch_39
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_23

    :pswitch_3e
    mul-float p1, p1, v1

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    return p1

    nop

    :pswitch_data_46
    .packed-switch 0x1
        :pswitch_3e
        :pswitch_39
        :pswitch_33
        :pswitch_2e
        :pswitch_25
        :pswitch_15
    .end packed-switch
.end method

.method public づざかべべ(I)V
    .registers 16

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->づざかべべ:I

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->くし〴〺ぅ:[I

    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->びぐびあび:[[F

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    .line 1
    array-length v4, v1

    add-int/lit8 v4, v4, 0xa

    new-array v4, v4, [I

    const/4 v5, 0x0

    aput v0, v4, v5

    aput v5, v4, v3

    const/4 v0, 0x2

    const/4 v6, 0x2

    :cond_17
    :goto_17
    if-lez v6, :cond_67

    add-int/lit8 v6, v6, -0x1

    aget v7, v4, v6

    add-int/lit8 v6, v6, -0x1

    aget v8, v4, v6

    if-ge v7, v8, :cond_17

    .line 2
    aget v9, v1, v8

    move v10, v7

    move v11, v10

    :goto_27
    if-ge v10, v8, :cond_42

    aget v12, v1, v10

    if-gt v12, v9, :cond_3f

    .line 3
    aget v12, v1, v11

    aget v13, v1, v10

    aput v13, v1, v11

    aput v12, v1, v10

    aget-object v12, v2, v11

    aget-object v13, v2, v10

    aput-object v13, v2, v11

    aput-object v12, v2, v10

    add-int/lit8 v11, v11, 0x1

    :cond_3f
    add-int/lit8 v10, v10, 0x1

    goto :goto_27

    :cond_42
    aget v9, v1, v11

    aget v10, v1, v8

    aput v10, v1, v11

    aput v9, v1, v8

    aget-object v9, v2, v11

    aget-object v10, v2, v8

    aput-object v10, v2, v11

    aput-object v9, v2, v8

    add-int/lit8 v9, v6, 0x1

    add-int/lit8 v10, v11, -0x1

    .line 4
    aput v10, v4, v6

    add-int/lit8 v6, v9, 0x1

    aput v7, v4, v9

    add-int/lit8 v7, v6, 0x1

    aput v8, v4, v6

    add-int/lit8 v6, v7, 0x1

    add-int/lit8 v11, v11, 0x1

    aput v11, v4, v7

    goto :goto_17

    :cond_67
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 5
    :goto_69
    iget-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->くし〴〺ぅ:[I

    array-length v6, v4

    if-ge v1, v6, :cond_7b

    aget v6, v4, v1

    add-int/lit8 v7, v1, -0x1

    aget v4, v4, v7

    if-eq v6, v4, :cond_78

    add-int/lit8 v2, v2, 0x1

    :cond_78
    add-int/lit8 v1, v1, 0x1

    goto :goto_69

    :cond_7b
    if-nez v2, :cond_7e

    const/4 v2, 0x1

    :cond_7e
    new-array v1, v2, [D

    const/4 v4, 0x3

    new-array v6, v0, [I

    aput v4, v6, v3

    aput v2, v6, v5

    const-class v2, D

    invoke-static {v2, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[D

    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_91
    iget v7, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->づざかべべ:I

    if-ge v4, v7, :cond_d5

    if-lez v4, :cond_a2

    iget-object v7, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->くし〴〺ぅ:[I

    aget v8, v7, v4

    add-int/lit8 v9, v4, -0x1

    aget v7, v7, v9

    if-ne v8, v7, :cond_a2

    goto :goto_d2

    :cond_a2
    iget-object v7, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->くし〴〺ぅ:[I

    aget v7, v7, v4

    int-to-double v7, v7

    const-wide v9, 0x3f847ae147ae147bL    # 0.01

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v9

    aput-wide v7, v1, v6

    aget-object v7, v2, v6

    iget-object v8, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->びぐびあび:[[F

    aget-object v9, v8, v4

    aget v9, v9, v5

    float-to-double v9, v9

    aput-wide v9, v7, v5

    aget-object v7, v2, v6

    aget-object v9, v8, v4

    aget v9, v9, v3

    float-to-double v9, v9

    aput-wide v9, v7, v3

    aget-object v7, v2, v6

    aget-object v8, v8, v4

    aget v8, v8, v0

    float-to-double v8, v8

    aput-wide v8, v7, v0

    add-int/lit8 v6, v6, 0x1

    :goto_d2
    add-int/lit8 v4, v4, 0x1

    goto :goto_91

    :cond_d5
    invoke-static {p1, v1, v2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(I[D[[D)Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    return-void
.end method

.method public abstract びぐびあび(Landroid/view/View;FJLづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/びぐびあび;)Z
.end method
