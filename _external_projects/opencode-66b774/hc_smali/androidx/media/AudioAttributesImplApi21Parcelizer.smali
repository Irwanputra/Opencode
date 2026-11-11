.class public final Landroidx/media/AudioAttributesImplApi21Parcelizer;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)Lづざかべべ/おぐぴう〸ず/〺つふすそ;
    .registers 4

    new-instance v0, Lづざかべべ/おぐぴう〸ず/〺つふすそ;

    invoke-direct {v0}, Lづざかべべ/おぐぴう〸ず/〺つふすそ;-><init>()V

    iget-object v1, v0, Lづざかべべ/おぐぴう〸ず/〺つふすそ;->げつ〴ぬぐ:Landroid/media/AudioAttributes;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->のぷのちつ(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/media/AudioAttributes;

    iput-object v1, v0, Lづざかべべ/おぐぴう〸ず/〺つふすそ;->げつ〴ぬぐ:Landroid/media/AudioAttributes;

    iget v1, v0, Lづざかべべ/おぐぴう〸ず/〺つふすそ;->〺つふすそ:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺふねづ〺(II)I

    move-result p0

    iput p0, v0, Lづざかべべ/おぐぴう〸ず/〺つふすそ;->〺つふすそ:I

    return-object v0
.end method

.method public static write(Lづざかべべ/おぐぴう〸ず/〺つふすそ;Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/〺つふすそ;->げつ〴ぬぐ:Landroid/media/AudioAttributes;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ざっざへづ(Landroid/os/Parcelable;)V

    .line 4
    iget p0, p0, Lづざかべべ/おぐぴう〸ず/〺つふすそ;->〺つふすそ:I

    const/4 v0, 0x2

    .line 5
    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ごづごきえ(I)V

    return-void
.end method
