.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public おぐぴう〸ず:[F

.field public てぜきぽく:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public のぷのちつ:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "[F>;"
        }
    .end annotation
.end field

.field public へぬ〴づぞ:[F

.field public ぺふねづ〺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/util/SparseArray;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/util/SparseArray<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->のぷのちつ:Landroid/util/SparseArray;

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    aget-object p1, p1, v0

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->ぺふねづ〺:Ljava/lang/String;

    iput-object p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->てぜきぽく:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(IFFIF)V
    .registers 6

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "don\'t call for custom attribute call setPoint(pos, ConstraintAttribute,...)"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public づざかべべ(I)V
    .registers 16

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->てぜきぽく:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->てぜきぽく:Landroid/util/SparseArray;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;

    invoke-virtual {v1}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->びぐびあび()I

    move-result v1

    new-array v3, v0, [D

    add-int/lit8 v4, v1, 0x2

    new-array v5, v4, [F

    iput-object v5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->へぬ〴づぞ:[F

    new-array v5, v1, [F

    iput-object v5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->おぐぴう〸ず:[F

    const/4 v5, 0x2

    new-array v5, v5, [I

    const/4 v6, 0x1

    aput v4, v5, v6

    aput v0, v5, v2

    const-class v4, D

    invoke-static {v4, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[D

    const/4 v5, 0x0

    :goto_30
    if-ge v5, v0, :cond_7d

    iget-object v7, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->てぜきぽく:Landroid/util/SparseArray;

    invoke-virtual {v7, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v7

    iget-object v8, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->てぜきぽく:Landroid/util/SparseArray;

    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;

    iget-object v9, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->のぷのちつ:Landroid/util/SparseArray;

    invoke-virtual {v9, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [F

    int-to-double v10, v7

    const-wide v12, 0x3f847ae147ae147bL    # 0.01

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v12

    aput-wide v10, v3, v5

    iget-object v7, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->へぬ〴づぞ:[F

    invoke-virtual {v8, v7}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->くし〴〺ぅ([F)V

    const/4 v7, 0x0

    :goto_5b
    iget-object v8, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->へぬ〴づぞ:[F

    array-length v10, v8

    if-ge v7, v10, :cond_6a

    aget-object v10, v4, v5

    aget v8, v8, v7

    float-to-double v11, v8

    aput-wide v11, v10, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_5b

    :cond_6a
    aget-object v7, v4, v5

    aget v8, v9, v2

    float-to-double v10, v8

    aput-wide v10, v7, v1

    aget-object v7, v4, v5

    add-int/lit8 v8, v1, 0x1

    aget v9, v9, v6

    float-to-double v9, v9

    aput-wide v9, v7, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_30

    :cond_7d
    invoke-static {p1, v3, v4}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(I[D[[D)Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    return-void
.end method

.method public びぐびあび(Landroid/view/View;FJLづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/びぐびあび;)Z
    .registers 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p3

    iget-object v4, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    move/from16 v5, p2

    float-to-double v5, v5

    iget-object v7, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->へぬ〴づぞ:[F

    invoke-virtual {v4, v5, v6, v7}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->びぐびあび(D[F)V

    iget-object v4, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->へぬ〴づぞ:[F

    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    aget v5, v4, v5

    array-length v6, v4

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    aget v4, v4, v6

    iget-wide v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->ぺぁあねじ:J

    sub-long v8, v2, v8

    iget v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v6, :cond_3c

    iget-object v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->ぺふねづ〺:Ljava/lang/String;

    move-object/from16 v12, p5

    invoke-virtual {v12, v1, v6, v11}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/びぐびあび;->げつ〴ぬぐ(Ljava/lang/Object;Ljava/lang/String;I)F

    move-result v6

    iput v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_3c

    iput v10, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    :cond_3c
    iget v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    float-to-double v12, v6

    long-to-double v8, v8

    const-wide v14, 0x3e112e0be826d695L    # 1.0E-9

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v14

    float-to-double v14, v5

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v14

    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v8, v12

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    rem-double/2addr v8, v12

    double-to-float v6, v8

    iput v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->いいにぽつ:F

    iput-wide v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->ぺぁあねじ:J

    invoke-virtual {v0, v6}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->げつ〴ぬぐ(F)F

    move-result v2

    iput-boolean v11, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〳ぜぞぜべっ:Z

    const/4 v3, 0x0

    :goto_63
    iget-object v6, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->おぐぴう〸ず:[F

    array-length v8, v6

    if-ge v3, v8, :cond_85

    iget-boolean v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〳ぜぞぜべっ:Z

    iget-object v9, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->へぬ〴づぞ:[F

    aget v12, v9, v3

    float-to-double v12, v12

    const-wide/16 v14, 0x0

    cmpl-double v16, v12, v14

    if-eqz v16, :cond_77

    const/4 v12, 0x1

    goto :goto_78

    :cond_77
    const/4 v12, 0x0

    :goto_78
    or-int/2addr v8, v12

    iput-boolean v8, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〳ぜぞぜべっ:Z

    aget v8, v9, v3

    mul-float v8, v8, v2

    add-float/2addr v8, v4

    aput v8, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_63

    :cond_85
    iget-object v2, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->てぜきぽく:Landroid/util/SparseArray;

    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;

    iget-object v3, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺$〺つふすそ;->おぐぴう〸ず:[F

    invoke-virtual {v2, v1, v3}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->ぁごぐすすぃ(Landroid/view/View;[F)V

    cmpl-float v1, v5, v10

    if-eqz v1, :cond_98

    iput-boolean v7, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〳ぜぞぜべっ:Z

    :cond_98
    iget-boolean v1, v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ざとぅぼこ〺;->〳ぜぞぜべっ:Z

    return v1
.end method
