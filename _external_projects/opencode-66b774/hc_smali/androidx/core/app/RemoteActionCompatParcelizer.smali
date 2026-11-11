.class public Landroidx/core/app/RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)Landroidx/core/app/RemoteActionCompat;
    .registers 4

    new-instance v0, Landroidx/core/app/RemoteActionCompat;

    invoke-direct {v0}, Landroidx/core/app/RemoteActionCompat;-><init>()V

    iget-object v1, v0, Landroidx/core/app/RemoteActionCompat;->げつ〴ぬぐ:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v2, 0x1

    .line 1
    invoke-virtual {p0, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺぁあねじ(I)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_13

    :cond_f
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->おぐぴう〸ず()Lづざかべべ/ざっざへづ/くし〴〺ぅ;

    move-result-object v1

    .line 2
    :goto_13
    check-cast v1, Landroidx/core/graphics/drawable/IconCompat;

    iput-object v1, v0, Landroidx/core/app/RemoteActionCompat;->げつ〴ぬぐ:Landroidx/core/graphics/drawable/IconCompat;

    iget-object v1, v0, Landroidx/core/app/RemoteActionCompat;->〺つふすそ:Ljava/lang/CharSequence;

    const/4 v2, 0x2

    .line 3
    invoke-virtual {p0, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺぁあねじ(I)Z

    move-result v2

    if-nez v2, :cond_21

    goto :goto_25

    :cond_21
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->〳ぜぞぜべっ()Ljava/lang/CharSequence;

    move-result-object v1

    .line 4
    :goto_25
    iput-object v1, v0, Landroidx/core/app/RemoteActionCompat;->〺つふすそ:Ljava/lang/CharSequence;

    iget-object v1, v0, Landroidx/core/app/RemoteActionCompat;->くし〴〺ぅ:Ljava/lang/CharSequence;

    const/4 v2, 0x3

    .line 5
    invoke-virtual {p0, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺぁあねじ(I)Z

    move-result v2

    if-nez v2, :cond_31

    goto :goto_35

    :cond_31
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->〳ぜぞぜべっ()Ljava/lang/CharSequence;

    move-result-object v1

    .line 6
    :goto_35
    iput-object v1, v0, Landroidx/core/app/RemoteActionCompat;->くし〴〺ぅ:Ljava/lang/CharSequence;

    iget-object v1, v0, Landroidx/core/app/RemoteActionCompat;->びぐびあび:Landroid/app/PendingIntent;

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->のぷのちつ(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/app/PendingIntent;

    iput-object v1, v0, Landroidx/core/app/RemoteActionCompat;->びぐびあび:Landroid/app/PendingIntent;

    iget-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->づざかべべ:Z

    const/4 v2, 0x5

    .line 7
    invoke-virtual {p0, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺぁあねじ(I)Z

    move-result v2

    if-nez v2, :cond_4c

    goto :goto_50

    :cond_4c
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->なぎぱいぢぎ()Z

    move-result v1

    .line 8
    :goto_50
    iput-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->づざかべべ:Z

    iget-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->なぎぱいぢぎ:Z

    const/4 v2, 0x6

    .line 9
    invoke-virtual {p0, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺぁあねじ(I)Z

    move-result v2

    if-nez v2, :cond_5c

    goto :goto_60

    :cond_5c
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->なぎぱいぢぎ()Z

    move-result v1

    .line 10
    :goto_60
    iput-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->なぎぱいぢぎ:Z

    return-object v0
.end method

.method public static write(Landroidx/core/app/RemoteActionCompat;Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->げつ〴ぬぐ:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/ざっざへづ/くし〴〺ぅ;)V

    .line 4
    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->〺つふすそ:Ljava/lang/CharSequence;

    const/4 v1, 0x2

    .line 5
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->は〲ぱなで(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->くし〴〺ぅ:Ljava/lang/CharSequence;

    const/4 v1, 0x3

    .line 7
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->は〲ぱなで(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->びぐびあび:Landroid/app/PendingIntent;

    const/4 v1, 0x4

    .line 9
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ざっざへづ(Landroid/os/Parcelable;)V

    .line 10
    iget-boolean v0, p0, Landroidx/core/app/RemoteActionCompat;->づざかべべ:Z

    const/4 v1, 0x5

    .line 11
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぉざぅち〻(Z)V

    .line 12
    iget-boolean p0, p0, Landroidx/core/app/RemoteActionCompat;->なぎぱいぢぎ:Z

    const/4 v0, 0x6

    .line 13
    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぉざぅち〻(Z)V

    return-void
.end method
