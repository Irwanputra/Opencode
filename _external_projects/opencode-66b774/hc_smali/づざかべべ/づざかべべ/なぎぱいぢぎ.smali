.class public Lづざかべべ/づざかべべ/なぎぱいぢぎ;
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

    iput p1, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->くし〴〺ぅ:I

    new-instance p1, Ljava/util/LinkedHashMap;

    const/4 v0, 0x0

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object p1, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    return-void

    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxSize <= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final declared-synchronized toString()Ljava/lang/String;
    .registers 7

    monitor-enter p0

    :try_start_1
    iget v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    iget v1, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    add-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_d

    mul-int/lit8 v0, v0, 0x64

    div-int/2addr v0, v1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->くし〴〺ぅ:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const/4 v2, 0x1

    iget v5, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const/4 v2, 0x2

    iget v5, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const/4 v2, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v2

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_3a
    .catchall {:try_start_1 .. :try_end_3a} :catchall_3c

    monitor-exit p0

    return-object v0

    :catchall_3c
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final 〺つふすそ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    if-eqz p1, :cond_29

    if-eqz p2, :cond_29

    monitor-enter p0

    :try_start_5
    iget v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->びぐびあび:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->びぐびあび:I

    iget v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:I

    iget-object v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1f

    iget p2, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:I

    :cond_1f
    monitor-exit p0
    :try_end_20
    .catchall {:try_start_5 .. :try_end_20} :catchall_26

    iget p2, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->くし〴〺ぅ:I

    invoke-virtual {p0, p2}, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->くし〴〺ぅ(I)V

    return-object p1

    :catchall_26
    move-exception p1

    :try_start_27
    monitor-exit p0
    :try_end_28
    .catchall {:try_start_27 .. :try_end_28} :catchall_26

    throw p1

    :cond_29
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "key == null || value == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public くし〴〺ぅ(I)V
    .registers 4

    :goto_0
    monitor-enter p0

    :try_start_1
    iget v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:I

    if-ltz v0, :cond_4a

    iget-object v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    iget v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:I

    if-nez v0, :cond_4a

    :cond_11
    iget v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:I

    if-le v0, p1, :cond_48

    iget-object v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_48

    :cond_1e
    iget-object v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

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

    iget-object v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ:I

    iget v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->づざかべべ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->づざかべべ:I

    monitor-exit p0

    goto :goto_0

    :cond_48
    :goto_48
    monitor-exit p0

    return-void

    :cond_4a
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

    :catchall_69
    move-exception p1

    monitor-exit p0
    :try_end_6b
    .catchall {:try_start_1 .. :try_end_6b} :catchall_69

    goto :goto_6d

    :goto_6c
    throw p1

    :goto_6d
    goto :goto_6c
.end method

.method public final げつ〴ぬぐ(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    if-eqz p1, :cond_1f

    monitor-enter p0

    :try_start_3
    iget-object v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_13

    iget v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->なぎぱいぢぎ:I

    monitor-exit p0

    return-object p1

    :cond_13
    iget p1, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :catchall_1c
    move-exception p1

    monitor-exit p0
    :try_end_1e
    .catchall {:try_start_3 .. :try_end_1e} :catchall_1c

    throw p1

    :cond_1f
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "key == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
