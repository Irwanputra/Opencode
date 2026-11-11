.class public abstract Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$ぁごぐすすぃ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$おぐぴう〸ず;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$へぬ〴づぞ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$のぷのちつ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$てぜきぽく;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$ぺふねづ〺;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$びぐびあび;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$なぎぱいぢぎ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$づざかべべ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$いいにぽつ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$ぺぁあねじ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〳ぜぞぜべっ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$げつ〴ぬぐ;,
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$くし〴〺ぅ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:[I

.field public くし〴〺ぅ:[F

.field public げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

.field public づざかべべ:Ljava/lang/String;

.field public びぐびあび:I


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v1, v0, [I

    iput-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->〺つふすそ:[I

    new-array v0, v0, [F

    iput-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->くし〴〺ぅ:[F

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 6

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->づざかべべ:Ljava/lang/String;

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "##.##"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_a
    iget v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->びぐびあび:I

    if-ge v2, v3, :cond_38

    const-string v3, "["

    invoke-static {v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->〺つふすそ:[I

    aget v3, v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " , "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->くし〴〺ぅ:[F

    aget v3, v3, v2

    float-to-double v3, v3

    invoke-virtual {v1, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_38
    return-object v0
.end method

.method public 〺つふすそ(IF)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->〺つふすそ:[I

    array-length v1, v0

    iget v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->びぐびあび:I

    add-int/lit8 v2, v2, 0x1

    if-ge v1, v2, :cond_1d

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->〺つふすそ:[I

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->くし〴〺ぅ:[F

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->くし〴〺ぅ:[F

    :cond_1d
    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->〺つふすそ:[I

    iget v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->びぐびあび:I

    aput p1, v0, v1

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->くし〴〺ぅ:[F

    aput p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->びぐびあび:I

    return-void
.end method

.method public abstract くし〴〺ぅ(Landroid/view/View;F)V
.end method

.method public げつ〴ぬぐ(F)F
    .registers 5

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    float-to-double v1, p1

    const/4 p1, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ(DI)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method public びぐびあび(I)V
    .registers 16

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->びぐびあび:I

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->〺つふすそ:[I

    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->くし〴〺ぅ:[F

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

    aget v12, v2, v11

    aget v13, v2, v10

    aput v13, v2, v11

    aput v12, v2, v10

    add-int/lit8 v11, v11, 0x1

    :cond_3f
    add-int/lit8 v10, v10, 0x1

    goto :goto_27

    :cond_42
    aget v9, v1, v11

    aget v10, v1, v8

    aput v10, v1, v11

    aput v9, v1, v8

    aget v9, v2, v11

    aget v10, v2, v8

    aput v10, v2, v11

    aput v9, v2, v8

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

    const/4 v2, 0x1

    .line 5
    :goto_69
    iget v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->びぐびあび:I

    if-ge v1, v4, :cond_7c

    iget-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->〺つふすそ:[I

    add-int/lit8 v6, v1, -0x1

    aget v6, v4, v6

    aget v4, v4, v1

    if-eq v6, v4, :cond_79

    add-int/lit8 v2, v2, 0x1

    :cond_79
    add-int/lit8 v1, v1, 0x1

    goto :goto_69

    :cond_7c
    new-array v1, v2, [D

    new-array v0, v0, [I

    aput v3, v0, v3

    aput v2, v0, v5

    const-class v2, D

    invoke-static {v2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[D

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_8e
    iget v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->びぐびあび:I

    if-ge v2, v4, :cond_be

    if-lez v2, :cond_9f

    iget-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->〺つふすそ:[I

    aget v6, v4, v2

    add-int/lit8 v7, v2, -0x1

    aget v4, v4, v7

    if-ne v6, v4, :cond_9f

    goto :goto_bb

    :cond_9f
    iget-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->〺つふすそ:[I

    aget v4, v4, v2

    int-to-double v6, v4

    const-wide v8, 0x3f847ae147ae147bL    # 0.01

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v6, v6, v8

    aput-wide v6, v1, v3

    aget-object v4, v0, v3

    iget-object v6, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->くし〴〺ぅ:[F

    aget v6, v6, v2

    float-to-double v6, v6

    aput-wide v6, v4, v5

    add-int/lit8 v3, v3, 0x1

    :goto_bb
    add-int/lit8 v2, v2, 0x1

    goto :goto_8e

    :cond_be
    invoke-static {p1, v1, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(I[D[[D)Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    return-void
.end method
