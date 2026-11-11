.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

.field public final げつ〴ぬぐ:[D


# direct methods
.method public constructor <init>([I[D[[D)V
    .registers 28

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct/range {p0 .. p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>()V

    iput-object v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:[D

    array-length v2, v1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    new-array v2, v2, [Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    iput-object v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    :goto_14
    iget-object v7, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    array-length v8, v7

    if-ge v4, v8, :cond_57

    aget v8, p1, v4

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-eqz v8, :cond_33

    if-eq v8, v3, :cond_30

    if-eq v8, v10, :cond_2d

    if-eq v8, v9, :cond_26

    goto :goto_34

    :cond_26
    if-ne v5, v3, :cond_2a

    const/4 v5, 0x2

    goto :goto_2b

    :cond_2a
    const/4 v5, 0x1

    :goto_2b
    move v6, v5

    goto :goto_34

    :cond_2d
    const/4 v5, 0x2

    const/4 v6, 0x2

    goto :goto_34

    :cond_30
    const/4 v5, 0x1

    const/4 v6, 0x1

    goto :goto_34

    :cond_33
    const/4 v6, 0x3

    :goto_34
    new-instance v22, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    aget-wide v10, v1, v4

    add-int/lit8 v23, v4, 0x1

    aget-wide v12, v1, v23

    aget-object v8, p3, v4

    aget-wide v14, v8, v2

    aget-object v8, p3, v4

    aget-wide v16, v8, v3

    aget-object v8, p3, v23

    aget-wide v18, v8, v2

    aget-object v8, p3, v23

    aget-wide v20, v8, v3

    move-object/from16 v8, v22

    move v9, v6

    invoke-direct/range {v8 .. v21}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(IDDDDDD)V

    aput-object v22, v7, v4

    move/from16 v4, v23

    goto :goto_14

    :cond_57
    return-void
.end method


# virtual methods
.method public 〺つふすそ(DI)D
    .registers 9

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    cmpg-double v4, p1, v2

    if-gez v4, :cond_10

    aget-object p1, v0, v1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    goto :goto_22

    :cond_10
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v2, v0, v2

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpl-double v4, p1, v2

    if-lez v4, :cond_22

    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    aget-object p1, v0, p1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    :cond_22
    :goto_22
    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    array-length v2, v0

    if-ge v1, v2, :cond_5f

    aget-object v2, v0, v1

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpg-double v4, p1, v2

    if-gtz v4, :cond_5c

    aget-object v2, v0, v1

    iget-boolean v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ざとぅぼこ〺:Z

    if-eqz v2, :cond_45

    if-nez p3, :cond_3e

    aget-object p3, v0, v1

    invoke-virtual {p3, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ(D)D

    move-result-wide p1

    return-wide p1

    :cond_3e
    aget-object p3, v0, v1

    invoke-virtual {p3, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび(D)D

    move-result-wide p1

    return-wide p1

    :cond_45
    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ(D)V

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    if-nez p3, :cond_55

    aget-object p1, p1, v1

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ()D

    move-result-wide p1

    return-wide p1

    :cond_55
    aget-object p1, p1, v1

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ()D

    move-result-wide p1

    return-wide p1

    :cond_5c
    add-int/lit8 v1, v1, 0x1

    goto :goto_22

    :cond_5f
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    return-wide p1
.end method

.method public ぁごぐすすぃ()[D
    .registers 2

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:[D

    return-object v0
.end method

.method public くし〴〺ぅ(D[D)V
    .registers 11

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    cmpg-double v4, p1, v2

    if-gez v4, :cond_f

    aget-object p1, v0, v1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    :cond_f
    array-length v2, v0

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    aget-object v2, v0, v2

    iget-wide v4, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpl-double v2, p1, v4

    if-lez v2, :cond_20

    array-length p1, v0

    sub-int/2addr p1, v3

    aget-object p1, v0, p1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    :cond_20
    const/4 v0, 0x0

    :goto_21
    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    array-length v4, v2

    if-ge v0, v4, :cond_64

    aget-object v4, v2, v0

    iget-wide v4, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpg-double v6, p1, v4

    if-gtz v6, :cond_61

    aget-object v4, v2, v0

    iget-boolean v4, v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ざとぅぼこ〺:Z

    if-eqz v4, :cond_47

    aget-object v2, v2, v0

    invoke-virtual {v2, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ(D)D

    move-result-wide v4

    aput-wide v4, p3, v1

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    aget-object v0, v1, v0

    invoke-virtual {v0, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび(D)D

    move-result-wide p1

    aput-wide p1, p3, v3

    return-void

    :cond_47
    aget-object v2, v2, v0

    invoke-virtual {v2, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ(D)V

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ()D

    move-result-wide p1

    aput-wide p1, p3, v1

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ()D

    move-result-wide p1

    aput-wide p1, p3, v3

    return-void

    :cond_61
    add-int/lit8 v0, v0, 0x1

    goto :goto_21

    :cond_64
    return-void
.end method

.method public づざかべべ(DI)D
    .registers 9

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    cmpg-double v4, p1, v2

    if-gez v4, :cond_f

    aget-object p1, v0, v1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    :cond_f
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v2, v0, v2

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpl-double v4, p1, v2

    if-lez v4, :cond_21

    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    aget-object p1, v0, p1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    :cond_21
    :goto_21
    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    array-length v2, v0

    if-ge v1, v2, :cond_5a

    aget-object v2, v0, v1

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpg-double v4, p1, v2

    if-gtz v4, :cond_57

    aget-object v2, v0, v1

    iget-boolean v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ざとぅぼこ〺:Z

    if-eqz v2, :cond_40

    if-nez p3, :cond_3b

    aget-object p1, v0, v1

    .line 1
    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->てぜきぽく:D

    return-wide p1

    .line 2
    :cond_3b
    aget-object p1, v0, v1

    .line 3
    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->のぷのちつ:D

    return-wide p1

    .line 4
    :cond_40
    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ(D)V

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    if-nez p3, :cond_50

    aget-object p1, p1, v1

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ()D

    move-result-wide p1

    return-wide p1

    :cond_50
    aget-object p1, p1, v1

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ()D

    move-result-wide p1

    return-wide p1

    :cond_57
    add-int/lit8 v1, v1, 0x1

    goto :goto_21

    :cond_5a
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    return-wide p1
.end method

.method public なぎぱいぢぎ(D[D)V
    .registers 11

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    const/4 v4, 0x1

    cmpg-double v5, p1, v2

    if-gez v5, :cond_11

    aget-object p1, v0, v1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    goto :goto_21

    :cond_11
    array-length v2, v0

    sub-int/2addr v2, v4

    aget-object v2, v0, v2

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpl-double v5, p1, v2

    if-lez v5, :cond_21

    array-length p1, v0

    sub-int/2addr p1, v4

    aget-object p1, v0, p1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    :cond_21
    :goto_21
    const/4 v0, 0x0

    :goto_22
    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    array-length v3, v2

    if-ge v0, v3, :cond_5f

    aget-object v3, v2, v0

    iget-wide v5, v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpg-double v3, p1, v5

    if-gtz v3, :cond_5c

    aget-object v3, v2, v0

    iget-boolean v3, v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ざとぅぼこ〺:Z

    if-eqz v3, :cond_42

    aget-object p1, v2, v0

    .line 1
    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->てぜきぽく:D

    .line 2
    aput-wide p1, p3, v1

    aget-object p1, v2, v0

    .line 3
    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->のぷのちつ:D

    .line 4
    aput-wide p1, p3, v4

    return-void

    :cond_42
    aget-object v2, v2, v0

    invoke-virtual {v2, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ(D)V

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ()D

    move-result-wide p1

    aput-wide p1, p3, v1

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ()D

    move-result-wide p1

    aput-wide p1, p3, v4

    return-void

    :cond_5c
    add-int/lit8 v0, v0, 0x1

    goto :goto_22

    :cond_5f
    return-void
.end method

.method public びぐびあび(D[F)V
    .registers 11

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    const/4 v4, 0x1

    cmpg-double v5, p1, v2

    if-gez v5, :cond_11

    aget-object p1, v0, v1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    goto :goto_21

    :cond_11
    array-length v2, v0

    sub-int/2addr v2, v4

    aget-object v2, v0, v2

    iget-wide v2, v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpl-double v5, p1, v2

    if-lez v5, :cond_21

    array-length p1, v0

    sub-int/2addr p1, v4

    aget-object p1, v0, p1

    iget-wide p1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    :cond_21
    :goto_21
    const/4 v0, 0x0

    :goto_22
    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    array-length v3, v2

    if-ge v0, v3, :cond_69

    aget-object v3, v2, v0

    iget-wide v5, v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    cmpg-double v3, p1, v5

    if-gtz v3, :cond_66

    aget-object v3, v2, v0

    iget-boolean v3, v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ざとぅぼこ〺:Z

    if-eqz v3, :cond_4a

    aget-object v2, v2, v0

    invoke-virtual {v2, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ(D)D

    move-result-wide v2

    double-to-float v2, v2

    aput v2, p3, v1

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    aget-object v0, v1, v0

    invoke-virtual {v0, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび(D)D

    move-result-wide p1

    double-to-float p1, p1

    aput p1, p3, v4

    return-void

    :cond_4a
    aget-object v2, v2, v0

    invoke-virtual {v2, p1, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ(D)V

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ()D

    move-result-wide p1

    double-to-float p1, p1

    aput p1, p3, v1

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ()D

    move-result-wide p1

    double-to-float p1, p1

    aput p1, p3, v4

    return-void

    :cond_66
    add-int/lit8 v0, v0, 0x1

    goto :goto_22

    :cond_69
    return-void
.end method
