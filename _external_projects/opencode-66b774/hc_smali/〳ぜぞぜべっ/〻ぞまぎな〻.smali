.class public final L〳ぜぞぜべっ/〻ぞまぎな〻;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements L〳ぜぞぜべっ/びぐびあび;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/〻ぞまぎな〻$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:L〳ぜぞぜべっ/でどあくず;

.field public ぁごぐすすぃ:Z

.field public final くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;

.field public final づざかべべ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

.field public final なぎぱいぢぎ:Z

.field public びぐびあび:L〳ぜぞぜべっ/のぷのちつ;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/でどあくず;L〳ぜぞぜべっ/ぉ〲なぱぽた;Z)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    iput-object p2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->づざかべべ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    iput-boolean p3, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->なぎぱいぢぎ:Z

    new-instance p2, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;

    invoke-direct {p2, p1, p3}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;-><init>(L〳ぜぞぜべっ/でどあくず;Z)V

    iput-object p2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .registers 5

    .line 1
    iget-object v0, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    iget-object v1, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->づざかべべ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    iget-boolean v2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->なぎぱいぢぎ:Z

    .line 2
    new-instance v3, L〳ぜぞぜべっ/〻ぞまぎな〻;

    invoke-direct {v3, v0, v1, v2}, L〳ぜぞぜべっ/〻ぞまぎな〻;-><init>(L〳ぜぞぜべっ/でどあくず;L〳ぜぞぜべっ/ぉ〲なぱぽた;Z)V

    .line 3
    iget-object v0, v0, L〳ぜぞぜべっ/でどあくず;->〳ぜぞぜべっ:L〳ぜぞぜべっ/のぷのちつ$〺つふすそ;

    .line 4
    check-cast v0, L〳ぜぞぜべっ/へぬ〴づぞ;

    .line 5
    iget-object v0, v0, L〳ぜぞぜべっ/へぬ〴づぞ;->げつ〴ぬぐ:L〳ぜぞぜべっ/のぷのちつ;

    .line 6
    iput-object v0, v3, L〳ぜぞぜべっ/〻ぞまぎな〻;->びぐびあび:L〳ぜぞぜべっ/のぷのちつ;

    return-object v3
.end method

.method public 〺つふすそ()L〳ぜぞぜべっ/なぶひせが;
    .registers 15

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    .line 1
    iget-object v0, v0, L〳ぜぞぜべっ/でどあくず;->なぎぱいぢぎ:Ljava/util/List;

    .line 2
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/げつ〴ぬぐ;

    iget-object v2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    .line 3
    iget-object v2, v2, L〳ぜぞぜべっ/でどあくず;->いいにぽつ:L〳ぜぞぜべっ/いいにぽつ;

    .line 4
    invoke-direct {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/いいにぽつ;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/〺つふすそ;

    iget-object v2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    .line 5
    iget-object v2, v2, L〳ぜぞぜべっ/でどあくず;->ぺふねづ〺:L〳ぜぞぜべっ/ぉひのべい/づざかべべ/づざかべべ;

    .line 6
    invoke-direct {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/〺つふすそ;-><init>(L〳ぜぞぜべっ/ぉひのべい/づざかべべ/づざかべべ;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/げつ〴ぬぐ;

    iget-object v2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    invoke-direct {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/でどあくず;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->なぎぱいぢぎ:Z

    if-nez v0, :cond_3e

    iget-object v0, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    .line 7
    iget-object v0, v0, L〳ぜぞぜべっ/でどあくず;->ぁごぐすすぃ:Ljava/util/List;

    .line 8
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_3e
    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〺つふすそ;

    iget-boolean v2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->なぎぱいぢぎ:Z

    invoke-direct {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〺つふすそ;-><init>(Z)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v13, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->づざかべべ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    iget-object v8, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->びぐびあび:L〳ぜぞぜべっ/のぷのちつ;

    iget-object v0, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    .line 9
    iget v9, v0, L〳ぜぞぜべっ/でどあくず;->〻ぞまぎな〻:I

    .line 10
    iget v10, v0, L〳ぜぞぜべっ/でどあくず;->ぉ〲なぱぽた:I

    .line 11
    iget v11, v0, L〳ぜぞぜべっ/でどあくず;->ぇ〳〲〺すっ:I

    move-object v0, v12

    move-object v6, v13

    move-object v7, p0

    .line 12
    invoke-direct/range {v0 .. v11}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;-><init>(Ljava/util/List;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;IL〳ぜぞぜべっ/ぉ〲なぱぽた;L〳ぜぞぜべっ/びぐびあび;L〳ぜぞぜべっ/のぷのちつ;III)V

    invoke-virtual {v12, v13}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/なぎぱいぢぎ;->げつ〴ぬぐ(L〳ぜぞぜべっ/ぉ〲なぱぽた;)L〳ぜぞぜべっ/なぶひせが;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ()L〳ぜぞぜべっ/なぶひせが;
    .registers 5

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->ぁごぐすすぃ:Z

    if-nez v0, :cond_54

    const/4 v0, 0x1

    iput-boolean v0, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->ぁごぐすすぃ:Z

    monitor-exit p0
    :try_end_9
    .catchall {:try_start_1 .. :try_end_9} :catchall_5c

    .line 1
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    const-string v1, "response.body().close()"

    .line 2
    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;

    .line 3
    iput-object v0, v1, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/〳ぜぞぜべっ;->びぐびあび:Ljava/lang/Object;

    .line 4
    iget-object v0, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->びぐびあび:L〳ぜぞぜべっ/のぷのちつ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 6
    :try_start_1b
    iget-object v1, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    .line 7
    iget-object v1, v1, L〳ぜぞぜべっ/でどあくず;->〺つふすそ:L〳ぜぞぜべっ/ぺふねづ〺;

    .line 8
    monitor-enter v1
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_20} :catch_43
    .catchall {:try_start_1b .. :try_end_20} :catchall_41

    :try_start_20
    iget-object v2, v1, L〳ぜぞぜべっ/ぺふねづ〺;->びぐびあび:Ljava/util/Deque;

    invoke-interface {v2, p0}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z
    :try_end_25
    .catchall {:try_start_20 .. :try_end_25} :catchall_3e

    :try_start_25
    monitor-exit v1

    .line 9
    invoke-virtual {p0}, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ()L〳ぜぞぜべっ/なぶひせが;

    move-result-object v1
    :try_end_2a
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_2a} :catch_43
    .catchall {:try_start_25 .. :try_end_2a} :catchall_41

    if-eqz v1, :cond_36

    iget-object v2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    .line 10
    iget-object v2, v2, L〳ぜぞぜべっ/でどあくず;->〺つふすそ:L〳ぜぞぜべっ/ぺふねづ〺;

    .line 11
    iget-object v3, v2, L〳ぜぞぜべっ/ぺふねづ〺;->びぐびあび:Ljava/util/Deque;

    invoke-virtual {v2, v3, p0, v0}, L〳ぜぞぜべっ/ぺふねづ〺;->げつ〴ぬぐ(Ljava/util/Deque;Ljava/lang/Object;Z)V

    return-object v1

    .line 12
    :cond_36
    :try_start_36
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_3e
    move-exception v2

    .line 13
    monitor-exit v1

    throw v2
    :try_end_41
    .catch Ljava/io/IOException; {:try_start_36 .. :try_end_41} :catch_43
    .catchall {:try_start_36 .. :try_end_41} :catchall_41

    :catchall_41
    move-exception v1

    goto :goto_4a

    :catch_43
    move-exception v1

    .line 14
    :try_start_44
    iget-object v2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->びぐびあび:L〳ぜぞぜべっ/のぷのちつ;

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    throw v1
    :try_end_4a
    .catchall {:try_start_44 .. :try_end_4a} :catchall_41

    :goto_4a
    iget-object v2, p0, L〳ぜぞぜべっ/〻ぞまぎな〻;->〺つふすそ:L〳ぜぞぜべっ/でどあくず;

    .line 17
    iget-object v2, v2, L〳ぜぞぜべっ/でどあくず;->〺つふすそ:L〳ぜぞぜべっ/ぺふねづ〺;

    .line 18
    iget-object v3, v2, L〳ぜぞぜべっ/ぺふねづ〺;->びぐびあび:Ljava/util/Deque;

    invoke-virtual {v2, v3, p0, v0}, L〳ぜぞぜべっ/ぺふねづ〺;->げつ〴ぬぐ(Ljava/util/Deque;Ljava/lang/Object;Z)V

    .line 19
    throw v1

    :cond_54
    :try_start_54
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_5c
    move-exception v0

    monitor-exit p0
    :try_end_5e
    .catchall {:try_start_54 .. :try_end_5e} :catchall_5c

    throw v0
.end method
