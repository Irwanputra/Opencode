.class public final Landroidx/media/AudioAttributesImplBaseParcelizer;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;
    .registers 4

    new-instance v0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0}, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;-><init>()V

    iget v1, v0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺふねづ〺(II)I

    move-result v1

    iput v1, v0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ:I

    iget v1, v0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺふねづ〺(II)I

    move-result v1

    iput v1, v0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ:I

    iget v1, v0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ:I

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺふねづ〺(II)I

    move-result v1

    iput v1, v0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ:I

    iget v1, v0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->びぐびあび:I

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺふねづ〺(II)I

    move-result p0

    iput p0, v0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->びぐびあび:I

    return-object v0
.end method

.method public static write(Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ:I

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ごづごきえ(I)V

    .line 4
    iget v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ:I

    const/4 v1, 0x2

    .line 5
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ごづごきえ(I)V

    .line 6
    iget v0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->くし〴〺ぅ:I

    const/4 v1, 0x3

    .line 7
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ごづごきえ(I)V

    .line 8
    iget p0, p0, Lづざかべべ/おぐぴう〸ず/くし〴〺ぅ;->びぐびあび:I

    const/4 v0, 0x4

    .line 9
    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ごづごきえ(I)V

    return-void
.end method
