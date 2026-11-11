.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.source ""


# instance fields
.field public 〺つふすそ:[[D

.field public げつ〴ぬぐ:[D


# direct methods
.method public constructor <init>([D[[D)V
    .registers 14

    invoke-direct {p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>()V

    const/4 v0, 0x0

    aget-object v1, p2, v0

    array-length v1, v1

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    iput-object p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    const/4 v2, 0x2

    if-le v1, v2, :cond_2b

    const-wide/16 v1, 0x0

    move-wide v3, v1

    const/4 v5, 0x0

    :goto_12
    array-length v6, p1

    if-ge v5, v6, :cond_2b

    aget-object v6, p2, v5

    aget-wide v7, v6, v0

    aget-object v6, p2, v5

    aget-wide v9, v6, v0

    if-lez v5, :cond_26

    sub-double v1, v7, v1

    sub-double v3, v9, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->hypot(DD)D

    :cond_26
    add-int/lit8 v5, v5, 0x1

    move-wide v1, v7

    move-wide v3, v9

    goto :goto_12

    :cond_2b
    return-void
.end method


# virtual methods
.method public 〺つふすそ(DI)D
    .registers 12

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    array-length v1, v0

    const/4 v2, 0x0

    aget-wide v3, v0, v2

    cmpg-double v5, p1, v3

    if-gtz v5, :cond_11

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object p1, p1, v2

    aget-wide p2, p1, p3

    return-wide p2

    :cond_11
    add-int/lit8 v1, v1, -0x1

    aget-wide v3, v0, v1

    cmpl-double v0, p1, v3

    if-ltz v0, :cond_20

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object p1, p1, v1

    aget-wide p2, p1, p3

    return-wide p2

    :cond_20
    :goto_20
    if-ge v2, v1, :cond_57

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    aget-wide v3, v0, v2

    cmpl-double v5, p1, v3

    if-nez v5, :cond_31

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object p1, p1, v2

    aget-wide p2, p1, p3

    return-wide p2

    :cond_31
    add-int/lit8 v3, v2, 0x1

    aget-wide v4, v0, v3

    cmpg-double v6, p1, v4

    if-gez v6, :cond_55

    aget-wide v4, v0, v3

    aget-wide v6, v0, v2

    sub-double/2addr v4, v6

    aget-wide v6, v0, v2

    sub-double/2addr p1, v6

    div-double/2addr p1, v4

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object v1, v0, v2

    aget-wide v4, v1, p3

    aget-object v0, v0, v3

    aget-wide v1, v0, p3

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v6, p1

    mul-double v6, v6, v4

    mul-double v1, v1, p1

    add-double/2addr v1, v6

    return-wide v1

    :cond_55
    move v2, v3

    goto :goto_20

    :cond_57
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public ぁごぐすすぃ()[D
    .registers 2

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    return-object v0
.end method

.method public くし〴〺ぅ(D[D)V
    .registers 16

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    array-length v1, v0

    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    const/4 v3, 0x0

    aget-object v2, v2, v3

    array-length v2, v2

    aget-wide v4, v0, v3

    cmpg-double v6, p1, v4

    if-gtz v6, :cond_1e

    const/4 p1, 0x0

    :goto_10
    if-ge p1, v2, :cond_1d

    iget-object p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object p2, p2, v3

    aget-wide v0, p2, p1

    aput-wide v0, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_10

    :cond_1d
    return-void

    :cond_1e
    add-int/lit8 v1, v1, -0x1

    aget-wide v4, v0, v1

    cmpl-double v0, p1, v4

    if-ltz v0, :cond_34

    :goto_26
    if-ge v3, v2, :cond_33

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object p1, p1, v1

    aget-wide v4, p1, v3

    aput-wide v4, p3, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_26

    :cond_33
    return-void

    :cond_34
    const/4 v0, 0x0

    :goto_35
    if-ge v0, v1, :cond_7c

    iget-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    aget-wide v5, v4, v0

    cmpl-double v4, p1, v5

    if-nez v4, :cond_4d

    const/4 v4, 0x0

    :goto_40
    if-ge v4, v2, :cond_4d

    iget-object v5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object v5, v5, v0

    aget-wide v6, v5, v4

    aput-wide v6, p3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_40

    :cond_4d
    iget-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    add-int/lit8 v5, v0, 0x1

    aget-wide v6, v4, v5

    cmpg-double v8, p1, v6

    if-gez v8, :cond_7a

    aget-wide v6, v4, v5

    aget-wide v8, v4, v0

    sub-double/2addr v6, v8

    aget-wide v8, v4, v0

    sub-double/2addr p1, v8

    div-double/2addr p1, v6

    :goto_60
    if-ge v3, v2, :cond_79

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object v4, v1, v0

    aget-wide v6, v4, v3

    aget-object v1, v1, v5

    aget-wide v8, v1, v3

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v10, p1

    mul-double v10, v10, v6

    mul-double v8, v8, p1

    add-double/2addr v8, v10

    aput-wide v8, p3, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_60

    :cond_79
    return-void

    :cond_7a
    move v0, v5

    goto :goto_35

    :cond_7c
    return-void
.end method

.method public づざかべべ(DI)D
    .registers 11

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    array-length v1, v0

    const/4 v2, 0x0

    aget-wide v3, v0, v2

    cmpg-double v5, p1, v3

    if-gez v5, :cond_d

    aget-wide p1, v0, v2

    goto :goto_17

    :cond_d
    add-int/lit8 v3, v1, -0x1

    aget-wide v4, v0, v3

    cmpl-double v6, p1, v4

    if-ltz v6, :cond_17

    aget-wide p1, v0, v3

    :cond_17
    :goto_17
    add-int/lit8 v0, v1, -0x1

    if-ge v2, v0, :cond_3b

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    add-int/lit8 v3, v2, 0x1

    aget-wide v4, v0, v3

    cmpg-double v6, p1, v4

    if-gtz v6, :cond_39

    aget-wide p1, v0, v3

    aget-wide v4, v0, v2

    sub-double/2addr p1, v4

    aget-wide v4, v0, v2

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object v1, v0, v2

    aget-wide v4, v1, p3

    aget-object v0, v0, v3

    aget-wide v1, v0, p3

    sub-double/2addr v1, v4

    div-double/2addr v1, p1

    return-wide v1

    :cond_39
    move v2, v3

    goto :goto_17

    :cond_3b
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public なぎぱいぢぎ(D[D)V
    .registers 14

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    array-length v1, v0

    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    const/4 v3, 0x0

    aget-object v2, v2, v3

    array-length v2, v2

    aget-wide v4, v0, v3

    cmpg-double v6, p1, v4

    if-gtz v6, :cond_12

    aget-wide p1, v0, v3

    goto :goto_1c

    :cond_12
    add-int/lit8 v4, v1, -0x1

    aget-wide v5, v0, v4

    cmpl-double v7, p1, v5

    if-ltz v7, :cond_1c

    aget-wide p1, v0, v4

    :cond_1c
    :goto_1c
    const/4 v0, 0x0

    :goto_1d
    add-int/lit8 v4, v1, -0x1

    if-ge v0, v4, :cond_47

    iget-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    add-int/lit8 v5, v0, 0x1

    aget-wide v6, v4, v5

    cmpg-double v8, p1, v6

    if-gtz v8, :cond_45

    aget-wide p1, v4, v5

    aget-wide v6, v4, v0

    sub-double/2addr p1, v6

    aget-wide v6, v4, v0

    :goto_32
    if-ge v3, v2, :cond_47

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object v4, v1, v0

    aget-wide v6, v4, v3

    aget-object v1, v1, v5

    aget-wide v8, v1, v3

    sub-double/2addr v8, v6

    div-double/2addr v8, p1

    aput-wide v8, p3, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_32

    :cond_45
    move v0, v5

    goto :goto_1d

    :cond_47
    return-void
.end method

.method public びぐびあび(D[F)V
    .registers 16

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    array-length v1, v0

    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    const/4 v3, 0x0

    aget-object v2, v2, v3

    array-length v2, v2

    aget-wide v4, v0, v3

    cmpg-double v6, p1, v4

    if-gtz v6, :cond_1f

    const/4 p1, 0x0

    :goto_10
    if-ge p1, v2, :cond_1e

    iget-object p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object p2, p2, v3

    aget-wide v0, p2, p1

    double-to-float p2, v0

    aput p2, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_10

    :cond_1e
    return-void

    :cond_1f
    add-int/lit8 v1, v1, -0x1

    aget-wide v4, v0, v1

    cmpl-double v0, p1, v4

    if-ltz v0, :cond_36

    :goto_27
    if-ge v3, v2, :cond_35

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object p1, p1, v1

    aget-wide v4, p1, v3

    double-to-float p1, v4

    aput p1, p3, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_27

    :cond_35
    return-void

    :cond_36
    const/4 v0, 0x0

    :goto_37
    if-ge v0, v1, :cond_80

    iget-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    aget-wide v5, v4, v0

    cmpl-double v4, p1, v5

    if-nez v4, :cond_50

    const/4 v4, 0x0

    :goto_42
    if-ge v4, v2, :cond_50

    iget-object v5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object v5, v5, v0

    aget-wide v6, v5, v4

    double-to-float v5, v6

    aput v5, p3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_42

    :cond_50
    iget-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:[D

    add-int/lit8 v5, v0, 0x1

    aget-wide v6, v4, v5

    cmpg-double v8, p1, v6

    if-gez v8, :cond_7e

    aget-wide v6, v4, v5

    aget-wide v8, v4, v0

    sub-double/2addr v6, v8

    aget-wide v8, v4, v0

    sub-double/2addr p1, v8

    div-double/2addr p1, v6

    :goto_63
    if-ge v3, v2, :cond_7d

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->〺つふすそ:[[D

    aget-object v4, v1, v0

    aget-wide v6, v4, v3

    aget-object v1, v1, v5

    aget-wide v8, v1, v3

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v10, p1

    mul-double v10, v10, v6

    mul-double v8, v8, p1

    add-double/2addr v8, v10

    double-to-float v1, v8

    aput v1, p3, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_63

    :cond_7d
    return-void

    :cond_7e
    move v0, v5

    goto :goto_37

    :cond_80
    return-void
.end method
