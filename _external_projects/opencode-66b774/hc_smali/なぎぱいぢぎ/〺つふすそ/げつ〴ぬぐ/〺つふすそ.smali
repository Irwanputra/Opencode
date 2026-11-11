.class public Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public びぐびあび:I


# direct methods
.method public constructor <init>(I)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_13

    iput p1, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:I

    new-instance p1, Ljava/util/LinkedHashMap;

    const/4 v0, 0x0

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    return-void

    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxSize <= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final declared-synchronized toString()Ljava/lang/String;
    .registers 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    monitor-enter p0

    :try_start_1
    iget v0, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    iget v1, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:I

    add-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_d

    mul-int/lit8 v0, v0, 0x64

    div-int/2addr v0, v1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    const-string v1, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    const/4 v2, 0x1

    iget v4, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    const/4 v2, 0x2

    iget v4, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    const/4 v2, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v2

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_38
    .catchall {:try_start_1 .. :try_end_38} :catchall_3a

    monitor-exit p0

    return-object v0

    :catchall_3a
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public 〺つふすそ(I)V
    .registers 5

    :goto_0
    monitor-enter p0

    :try_start_1
    iget v0, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:I

    if-ltz v0, :cond_4e

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    iget v0, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:I

    if-nez v0, :cond_4e

    :cond_11
    iget v0, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:I

    if-le v0, p1, :cond_4c

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_4c

    :cond_1e
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v2, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:I

    invoke-virtual {p0, v1, v0}, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    sub-int/2addr v2, v0

    iput v2, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:I

    iget v0, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:I

    monitor-exit p0

    goto :goto_0

    :cond_4c
    :goto_4c
    monitor-exit p0

    return-void

    :cond_4e
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".sizeOf() is reporting inconsistent results!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_6d
    move-exception p1

    monitor-exit p0
    :try_end_6f
    .catchall {:try_start_1 .. :try_end_6f} :catchall_6d

    goto :goto_71

    :goto_70
    throw p1

    :goto_71
    goto :goto_70
.end method

.method public final げつ〴ぬぐ(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)I"
        }
    .end annotation

    .line 1
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    move-object v0, p2

    check-cast v0, Landroid/graphics/Bitmap;

    .line 2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    mul-int v0, v0, v1

    if-ltz v0, :cond_13

    return v0

    .line 3
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Negative size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
