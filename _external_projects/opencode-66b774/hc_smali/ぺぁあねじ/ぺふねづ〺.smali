.class public Lぺぁあねじ/ぺふねづ〺;
.super Lぺぁあねじ/〻ぞまぎな〻;
.source ""


# instance fields
.field public づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;


# direct methods
.method public constructor <init>(Lぺぁあねじ/〻ぞまぎな〻;)V
    .registers 3

    invoke-direct {p0}, Lぺぁあねじ/〻ぞまぎな〻;-><init>()V

    if-eqz p1, :cond_8

    iput-object p1, p0, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lぺぁあねじ/〻ぞまぎな〻;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public ぁごぐすすぃ(JLjava/util/concurrent/TimeUnit;)Lぺぁあねじ/〻ぞまぎな〻;
    .registers 5

    iget-object v0, p0, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    invoke-virtual {v0, p1, p2, p3}, Lぺぁあねじ/〻ぞまぎな〻;->ぁごぐすすぃ(JLjava/util/concurrent/TimeUnit;)Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object p1

    return-object p1
.end method

.method public くし〴〺ぅ()J
    .registers 3

    iget-object v0, p0, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lぺぁあねじ/〻ぞまぎな〻;->くし〴〺ぅ()J

    move-result-wide v0

    return-wide v0
.end method

.method public げつ〴ぬぐ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lぺぁあねじ/〻ぞまぎな〻;->げつ〴ぬぐ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public づざかべべ()Z
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lぺぁあねじ/〻ぞまぎな〻;->づざかべべ()Z

    move-result v0

    return v0
.end method

.method public なぎぱいぢぎ()V
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lぺぁあねじ/〻ぞまぎな〻;->なぎぱいぢぎ()V

    return-void
.end method

.method public びぐびあび(J)Lぺぁあねじ/〻ぞまぎな〻;
    .registers 4

    iget-object v0, p0, Lぺぁあねじ/ぺふねづ〺;->づざかべべ:Lぺぁあねじ/〻ぞまぎな〻;

    invoke-virtual {v0, p1, p2}, Lぺぁあねじ/〻ぞまぎな〻;->びぐびあび(J)Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object p1

    return-object p1
.end method
