.class public Lぺぁあねじ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/ぶでにく〼〳;


# instance fields
.field public final synthetic 〺つふすそ:Lぺぁあねじ/ぶでにく〼〳;

.field public final synthetic くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;


# direct methods
.method public constructor <init>(Lぺぁあねじ/くし〴〺ぅ;Lぺぁあねじ/ぶでにく〼〳;)V
    .registers 3

    iput-object p1, p0, Lぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;

    iput-object p2, p0, Lぺぁあねじ/〺つふすそ;->〺つふすそ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 4

    :try_start_0
    iget-object v0, p0, Lぺぁあねじ/〺つふすそ;->〺つふすそ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_5} :catch_e
    .catchall {:try_start_0 .. :try_end_5} :catchall_c

    const/4 v0, 0x1

    iget-object v1, p0, Lぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;

    invoke-virtual {v1, v0}, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ(Z)V

    return-void

    :catchall_c
    move-exception v0

    goto :goto_1d

    :catch_e
    move-exception v0

    :try_start_f
    iget-object v1, p0, Lぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;

    .line 1
    invoke-virtual {v1}, Lぺぁあねじ/くし〴〺ぅ;->ぺふねづ〺()Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_1c

    :cond_18
    invoke-virtual {v1, v0}, Lぺぁあねじ/くし〴〺ぅ;->てぜきぽく(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    .line 2
    :goto_1c
    throw v0
    :try_end_1d
    .catchall {:try_start_f .. :try_end_1d} :catchall_c

    :goto_1d
    iget-object v1, p0, Lぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ(Z)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "AsyncTimeout.source("

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lぺぁあねじ/〺つふすそ;->〺つふすそ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;

    return-object v0
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 5

    iget-object v0, p0, Lぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;

    invoke-virtual {v0}, Lぺぁあねじ/くし〴〺ぅ;->ぺぁあねじ()V

    :try_start_5
    iget-object v0, p0, Lぺぁあねじ/〺つふすそ;->〺つふすそ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-interface {v0, p1, p2, p3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p1
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_b} :catch_14
    .catchall {:try_start_5 .. :try_end_b} :catchall_12

    const/4 p3, 0x1

    iget-object v0, p0, Lぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;

    invoke-virtual {v0, p3}, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ(Z)V

    return-wide p1

    :catchall_12
    move-exception p1

    goto :goto_23

    :catch_14
    move-exception p1

    :try_start_15
    iget-object p2, p0, Lぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;

    .line 1
    invoke-virtual {p2}, Lぺぁあねじ/くし〴〺ぅ;->ぺふねづ〺()Z

    move-result p3

    if-nez p3, :cond_1e

    goto :goto_22

    :cond_1e
    invoke-virtual {p2, p1}, Lぺぁあねじ/くし〴〺ぅ;->てぜきぽく(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    .line 2
    :goto_22
    throw p1
    :try_end_23
    .catchall {:try_start_15 .. :try_end_23} :catchall_12

    :goto_23
    iget-object p2, p0, Lぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/くし〴〺ぅ;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ(Z)V

    throw p1
.end method
