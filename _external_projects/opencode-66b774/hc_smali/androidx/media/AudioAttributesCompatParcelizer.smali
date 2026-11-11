.class public final Landroidx/media/AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)Landroidx/media/AudioAttributesCompat;
    .registers 4

    new-instance v0, Landroidx/media/AudioAttributesCompat;

    invoke-direct {v0}, Landroidx/media/AudioAttributesCompat;-><init>()V

    iget-object v1, v0, Landroidx/media/AudioAttributesCompat;->げつ〴ぬぐ:Lづざかべべ/おぐぴう〸ず/げつ〴ぬぐ;

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
    check-cast v1, Lづざかべべ/おぐぴう〸ず/げつ〴ぬぐ;

    iput-object v1, v0, Landroidx/media/AudioAttributesCompat;->げつ〴ぬぐ:Lづざかべべ/おぐぴう〸ず/げつ〴ぬぐ;

    return-object v0
.end method

.method public static write(Landroidx/media/AudioAttributesCompat;Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object p0, p0, Landroidx/media/AudioAttributesCompat;->げつ〴ぬぐ:Lづざかべべ/おぐぴう〸ず/げつ〴ぬぐ;

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/ざっざへづ/くし〴〺ぅ;)V

    return-void
.end method
