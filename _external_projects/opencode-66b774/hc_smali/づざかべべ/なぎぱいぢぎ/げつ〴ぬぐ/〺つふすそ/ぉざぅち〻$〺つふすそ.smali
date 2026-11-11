.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public ぁごぐすすぃ:[F

.field public なぎぱいぢぎ:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


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

    invoke-direct {p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;-><init>()V

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    aget-object p1, p1, v0

    iput-object p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->なぎぱいぢぎ:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(IF)V
    .registers 3

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "don\'t call for custom attribute call setPoint(pos, ConstraintAttribute)"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public くし〴〺ぅ(Landroid/view/View;F)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    float-to-double v1, p2

    iget-object p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->ぁごぐすすぃ:[F

    invoke-virtual {v0, v1, v2, p2}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->びぐびあび(D[F)V

    iget-object p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->なぎぱいぢぎ:Landroid/util/SparseArray;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->ぁごぐすすぃ:[F

    invoke-virtual {p2, p1, v0}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->ぁごぐすすぃ(Landroid/view/View;[F)V

    return-void
.end method

.method public びぐびあび(I)V
    .registers 13

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->なぎぱいぢぎ:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->なぎぱいぢぎ:Landroid/util/SparseArray;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;

    invoke-virtual {v1}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->びぐびあび()I

    move-result v1

    new-array v3, v0, [D

    new-array v4, v1, [F

    iput-object v4, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->ぁごぐすすぃ:[F

    const/4 v4, 0x2

    new-array v4, v4, [I

    const/4 v5, 0x1

    aput v1, v4, v5

    aput v0, v4, v2

    const-class v1, D

    invoke-static {v1, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[D

    const/4 v4, 0x0

    :goto_2a
    if-ge v4, v0, :cond_5f

    iget-object v5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->なぎぱいぢぎ:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    iget-object v6, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->なぎぱいぢぎ:Landroid/util/SparseArray;

    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;

    int-to-double v7, v5

    const-wide v9, 0x3f847ae147ae147bL    # 0.01

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v9

    aput-wide v7, v3, v4

    iget-object v5, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->ぁごぐすすぃ:[F

    invoke-virtual {v6, v5}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->くし〴〺ぅ([F)V

    const/4 v5, 0x0

    :goto_4d
    iget-object v6, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻$〺つふすそ;->ぁごぐすすぃ:[F

    array-length v7, v6

    if-ge v5, v7, :cond_5c

    aget-object v7, v1, v4

    aget v6, v6, v5

    float-to-double v8, v6

    aput-wide v8, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_4d

    :cond_5c
    add-int/lit8 v4, v4, 0x1

    goto :goto_2a

    :cond_5f
    invoke-static {p1, v3, v1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(I[D[[D)Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぉざぅち〻;->げつ〴ぬぐ:Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    return-void
.end method
