.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# static fields
.field public static は〲ぱなで:[D


# instance fields
.field public 〳ぜぞぜべっ:D

.field public 〺つふすそ:D

.field public ぁごぐすすぃ:D

.field public いいにぽつ:D

.field public ぇぬぎばつ:D

.field public ぉざぅち〻:Z

.field public おぐぴう〸ず:D

.field public くし〴〺ぅ:D

.field public げつ〴ぬぐ:[D

.field public ざとぅぼこ〺:Z

.field public づざかべべ:D

.field public てぜきぽく:D

.field public なぎぱいぢぎ:D

.field public のぷのちつ:D

.field public びぐびあび:D

.field public へぬ〴づぞ:D

.field public ぺぁあねじ:D

.field public ぺふねづ〺:D


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const/16 v0, 0x5b

    new-array v0, v0, [D

    sput-object v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->は〲ぱなで:[D

    return-void
.end method

.method public constructor <init>(IDDDDDD)V
    .registers 34

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-wide/from16 v2, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v10, p10

    move-wide/from16 v12, p12

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v14, 0x0

    iput-boolean v14, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ざとぅぼこ〺:Z

    const/4 v15, 0x1

    if-ne v1, v15, :cond_1a

    const/4 v14, 0x1

    :cond_1a
    iput-boolean v14, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぉざぅち〻:Z

    iput-wide v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    iput-wide v4, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    sub-double v2, v4, v2

    div-double v2, v16, v2

    iput-wide v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:D

    const/4 v2, 0x3

    if-ne v2, v1, :cond_2d

    iput-boolean v15, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ざとぅぼこ〺:Z

    :cond_2d
    sub-double v1, v10, v6

    sub-double v3, v12, v8

    iget-boolean v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ざとぅぼこ〺:Z

    if-nez v5, :cond_13f

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v16

    const-wide v18, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v5, v16, v18

    if-ltz v5, :cond_13f

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v16

    cmpg-double v5, v16, v18

    if-gez v5, :cond_4c

    goto/16 :goto_13f

    :cond_4c
    const/16 v5, 0x65

    new-array v5, v5, [D

    iput-object v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:[D

    iget-boolean v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぉざぅち〻:Z

    if-eqz v5, :cond_57

    const/4 v15, -0x1

    :cond_57
    int-to-double v14, v15

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v14, v14, v1

    iput-wide v14, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->いいにぽつ:D

    if-eqz v5, :cond_63

    const/4 v15, 0x1

    goto :goto_64

    :cond_63
    const/4 v15, -0x1

    :goto_64
    int-to-double v14, v15

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v14

    iput-wide v3, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺふねづ〺:D

    if-eqz v5, :cond_6f

    move-wide v6, v10

    :cond_6f
    iput-wide v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->てぜきぽく:D

    if-eqz v5, :cond_75

    move-wide v3, v8

    goto :goto_76

    :cond_75
    move-wide v3, v12

    :goto_76
    iput-wide v3, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->のぷのちつ:D

    sub-double v3, v8, v12

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    .line 1
    :goto_81
    sget-object v14, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->は〲ぱなで:[D

    array-length v15, v14

    if-ge v7, v15, :cond_c3

    const-wide v16, 0x4056800000000000L    # 90.0

    int-to-double v5, v7

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v16

    array-length v14, v14

    const/4 v15, -0x1

    add-int/2addr v14, v15

    int-to-double v14, v14

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v14

    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    mul-double v14, v14, v1

    mul-double v5, v5, v3

    if-lez v7, :cond_be

    sub-double v10, v14, v10

    sub-double v12, v5, v12

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v10

    add-double/2addr v8, v10

    sget-object v10, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->は〲ぱなで:[D

    aput-wide v8, v10, v7

    :cond_be
    add-int/lit8 v7, v7, 0x1

    move-wide v12, v5

    move-wide v10, v14

    goto :goto_81

    :cond_c3
    iput-wide v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:D

    const/4 v1, 0x0

    :goto_c6
    sget-object v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->は〲ぱなで:[D

    array-length v3, v2

    if-ge v1, v3, :cond_d3

    aget-wide v3, v2, v1

    div-double/2addr v3, v8

    aput-wide v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_c6

    :cond_d3
    const/4 v14, 0x0

    :goto_d4
    iget-object v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:[D

    array-length v2, v1

    if-ge v14, v2, :cond_136

    int-to-double v2, v14

    array-length v1, v1

    const/4 v4, -0x1

    add-int/2addr v1, v4

    int-to-double v4, v1

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v4

    sget-object v1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->は〲ぱなで:[D

    invoke-static {v1, v2, v3}, Ljava/util/Arrays;->binarySearch([DD)I

    move-result v1

    if-ltz v1, :cond_101

    iget-object v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:[D

    sget-object v3, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->は〲ぱなで:[D

    array-length v3, v3

    const/4 v4, -0x1

    add-int/2addr v3, v4

    div-int/2addr v1, v3

    int-to-double v5, v1

    aput-wide v5, v2, v14

    const-wide/16 v5, 0x0

    goto :goto_133

    :cond_101
    const/4 v4, -0x1

    if-ne v1, v4, :cond_10b

    iget-object v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:[D

    const-wide/16 v5, 0x0

    aput-wide v5, v1, v14

    goto :goto_133

    :cond_10b
    const-wide/16 v5, 0x0

    neg-int v1, v1

    add-int/lit8 v7, v1, -0x2

    add-int/2addr v1, v4

    int-to-double v8, v7

    sget-object v4, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->は〲ぱなで:[D

    aget-wide v10, v4, v7

    sub-double/2addr v2, v10

    aget-wide v10, v4, v1

    aget-wide v12, v4, v7

    sub-double/2addr v10, v12

    div-double/2addr v2, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v2, v8

    array-length v1, v4

    const/4 v4, -0x1

    add-int/2addr v1, v4

    int-to-double v7, v1

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v7

    iget-object v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:[D

    aput-wide v2, v1, v14

    :goto_133
    add-int/lit8 v14, v14, 0x1

    goto :goto_d4

    .line 2
    :cond_136
    iget-wide v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:D

    iget-wide v3, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:D

    mul-double v1, v1, v3

    iput-wide v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->へぬ〴づぞ:D

    return-void

    :cond_13f
    :goto_13f
    const/4 v5, 0x1

    iput-boolean v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ざとぅぼこ〺:Z

    iput-wide v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:D

    iput-wide v10, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ:D

    iput-wide v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ:D

    iput-wide v12, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->〳ぜぞぜべっ:D

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    iput-wide v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:D

    iget-wide v7, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:D

    mul-double v5, v5, v7

    iput-wide v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->へぬ〴づぞ:D

    iget-wide v5, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    iget-wide v7, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    sub-double v9, v5, v7

    div-double/2addr v1, v9

    iput-wide v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->てぜきぽく:D

    sub-double/2addr v5, v7

    div-double/2addr v3, v5

    iput-wide v3, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->のぷのちつ:D

    return-void
.end method


# virtual methods
.method public 〺つふすそ()D
    .registers 7

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->いいにぽつ:D

    iget-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぇぬぎばつ:D

    mul-double v0, v0, v2

    iget-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺふねづ〺:D

    neg-double v2, v2

    iget-wide v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->おぐぴう〸ず:D

    mul-double v2, v2, v4

    iget-wide v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->へぬ〴づぞ:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    div-double/2addr v4, v0

    iget-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぉざぅち〻:Z

    if-eqz v0, :cond_1c

    neg-double v0, v2

    mul-double v0, v0, v4

    goto :goto_1e

    :cond_1c
    mul-double v0, v2, v4

    :goto_1e
    return-wide v0
.end method

.method public ぁごぐすすぃ(D)V
    .registers 13

    iget-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぉざぅち〻:Z

    if-eqz v0, :cond_8

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:D

    sub-double/2addr v0, p1

    goto :goto_c

    :cond_8
    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    sub-double v0, p1, v0

    :goto_c
    iget-wide p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:D

    mul-double v0, v0, p1

    const-wide p1, 0x3ff921fb54442d18L    # 1.5707963267948966

    const-wide/16 v2, 0x0

    cmpg-double v4, v0, v2

    if-gtz v4, :cond_1c

    goto :goto_47

    :cond_1c
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v0, v2

    if-ltz v4, :cond_23

    goto :goto_47

    .line 1
    :cond_23
    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:[D

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    int-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v3

    double-to-int v3, v0

    int-to-double v4, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v0, v4

    aget-wide v4, v2, v3

    add-int/lit8 v6, v3, 0x1

    aget-wide v6, v2, v6

    aget-wide v8, v2, v3

    sub-double/2addr v6, v8

    mul-double v6, v6, v0

    add-double v2, v6, v4

    :goto_47
    mul-double v2, v2, p1

    .line 2
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    iput-wide p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->おぐぴう〸ず:D

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    iput-wide p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぇぬぎばつ:D

    return-void
.end method

.method public くし〴〺ぅ(D)D
    .registers 7

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    sub-double/2addr p1, v0

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:D

    mul-double p1, p1, v0

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:D

    iget-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ:D

    sub-double/2addr v2, v0

    mul-double v2, v2, p1

    add-double/2addr v2, v0

    return-wide v2
.end method

.method public げつ〴ぬぐ()D
    .registers 7

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->いいにぽつ:D

    iget-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぇぬぎばつ:D

    mul-double v0, v0, v2

    iget-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺふねづ〺:D

    neg-double v2, v2

    iget-wide v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->おぐぴう〸ず:D

    mul-double v2, v2, v4

    iget-wide v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->へぬ〴づぞ:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v2

    div-double/2addr v4, v2

    iget-boolean v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぉざぅち〻:Z

    if-eqz v2, :cond_19

    neg-double v0, v0

    :cond_19
    mul-double v0, v0, v4

    return-wide v0
.end method

.method public づざかべべ()D
    .registers 7

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->てぜきぽく:D

    iget-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->いいにぽつ:D

    iget-wide v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->おぐぴう〸ず:D

    mul-double v2, v2, v4

    add-double/2addr v2, v0

    return-wide v2
.end method

.method public なぎぱいぢぎ()D
    .registers 7

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->のぷのちつ:D

    iget-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺふねづ〺:D

    iget-wide v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぇぬぎばつ:D

    mul-double v2, v2, v4

    add-double/2addr v2, v0

    return-wide v2
.end method

.method public びぐびあび(D)D
    .registers 7

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:D

    sub-double/2addr p1, v0

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぺぁあねじ:D

    mul-double p1, p1, v0

    iget-wide v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ:D

    iget-wide v2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->〳ぜぞぜべっ:D

    sub-double/2addr v2, v0

    mul-double v2, v2, p1

    add-double/2addr v2, v0

    return-wide v2
.end method
