.class public Landroidx/core/graphics/drawable/IconCompatParcelizer;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)Landroidx/core/graphics/drawable/IconCompat;
    .registers 5

    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    invoke-direct {v0}, Landroidx/core/graphics/drawable/IconCompat;-><init>()V

    iget v1, v0, Landroidx/core/graphics/drawable/IconCompat;->げつ〴ぬぐ:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺふねづ〺(II)I

    move-result v1

    iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->げつ〴ぬぐ:I

    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ:[B

    const/4 v2, 0x2

    .line 1
    invoke-virtual {p0, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺぁあねじ(I)Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_1c

    :cond_18
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぁごぐすすぃ()[B

    move-result-object v1

    .line 2
    :goto_1c
    iput-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ:[B

    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび:Landroid/os/Parcelable;

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->のぷのちつ(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    iput-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび:Landroid/os/Parcelable;

    iget v1, v0, Landroidx/core/graphics/drawable/IconCompat;->づざかべべ:I

    const/4 v3, 0x4

    invoke-virtual {p0, v1, v3}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺふねづ〺(II)I

    move-result v1

    iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->づざかべべ:I

    iget v1, v0, Landroidx/core/graphics/drawable/IconCompat;->なぎぱいぢぎ:I

    const/4 v3, 0x5

    invoke-virtual {p0, v1, v3}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺふねづ〺(II)I

    move-result v1

    iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->なぎぱいぢぎ:I

    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->ぁごぐすすぃ:Landroid/content/res/ColorStateList;

    const/4 v3, 0x6

    invoke-virtual {p0, v1, v3}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->のぷのちつ(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/res/ColorStateList;

    iput-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->ぁごぐすすぃ:Landroid/content/res/ColorStateList;

    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->ぺぁあねじ:Ljava/lang/String;

    const/4 v3, 0x7

    .line 3
    invoke-virtual {p0, v3}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぺぁあねじ(I)Z

    move-result v3

    if-nez v3, :cond_4e

    goto :goto_52

    :cond_4e
    invoke-virtual {p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->へぬ〴づぞ()Ljava/lang/String;

    move-result-object v1

    .line 4
    :goto_52
    iput-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->ぺぁあねじ:Ljava/lang/String;

    .line 5
    invoke-static {v1}, Landroid/graphics/PorterDuff$Mode;->valueOf(Ljava/lang/String;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->〳ぜぞぜべっ:Landroid/graphics/PorterDuff$Mode;

    iget p0, v0, Landroidx/core/graphics/drawable/IconCompat;->げつ〴ぬぐ:I

    packed-switch p0, :pswitch_data_98

    :pswitch_5f
    goto :goto_96

    :pswitch_60
    iget-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ:[B

    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->〺つふすそ:Ljava/lang/Object;

    goto :goto_96

    :pswitch_65
    new-instance p0, Ljava/lang/String;

    iget-object v1, v0, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ:[B

    const-string v2, "UTF-16"

    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->〺つふすそ:Ljava/lang/Object;

    goto :goto_96

    :pswitch_75
    iget-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび:Landroid/os/Parcelable;

    if-eqz p0, :cond_7a

    goto :goto_8b

    :cond_7a
    iget-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ:[B

    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->〺つふすそ:Ljava/lang/Object;

    iput v2, v0, Landroidx/core/graphics/drawable/IconCompat;->げつ〴ぬぐ:I

    const/4 v1, 0x0

    iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->づざかべべ:I

    array-length p0, p0

    iput p0, v0, Landroidx/core/graphics/drawable/IconCompat;->なぎぱいぢぎ:I

    goto :goto_96

    :pswitch_87
    iget-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび:Landroid/os/Parcelable;

    if-eqz p0, :cond_8e

    :goto_8b
    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->〺つふすそ:Ljava/lang/Object;

    goto :goto_96

    :cond_8e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid icon"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_96
    return-object v0

    nop

    :pswitch_data_98
    .packed-switch -0x1
        :pswitch_87
        :pswitch_5f
        :pswitch_75
        :pswitch_65
        :pswitch_60
        :pswitch_65
        :pswitch_75
        :pswitch_65
    .end packed-switch
.end method

.method public static write(Landroidx/core/graphics/drawable/IconCompat;Lづざかべべ/ざっざへづ/げつ〴ぬぐ;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->〳ぜぞぜべっ:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0}, Landroid/graphics/PorterDuff$Mode;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->ぺぁあねじ:Ljava/lang/String;

    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->げつ〴ぬぐ:I

    const-string v1, "UTF-16"

    packed-switch v0, :pswitch_data_90

    :pswitch_12
    goto :goto_40

    :pswitch_13
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->〺つふすそ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ:[B

    goto :goto_40

    :pswitch_24
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->〺つふすそ:Ljava/lang/Object;

    check-cast v0, [B

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ:[B

    goto :goto_40

    :pswitch_2b
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->〺つふすそ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ:[B

    goto :goto_40

    :pswitch_3a
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->〺つふすそ:Ljava/lang/Object;

    check-cast v0, Landroid/os/Parcelable;

    iput-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび:Landroid/os/Parcelable;

    :goto_40
    const/4 v0, -0x1

    .line 3
    iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->げつ〴ぬぐ:I

    if-eq v0, v1, :cond_4c

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ごづごきえ(I)V

    .line 5
    :cond_4c
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->くし〴〺ぅ:[B

    if-eqz v0, :cond_57

    const/4 v1, 0x2

    .line 6
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ざとぅぼこ〺([B)V

    .line 7
    :cond_57
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->びぐびあび:Landroid/os/Parcelable;

    if-eqz v0, :cond_62

    const/4 v1, 0x3

    .line 8
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ざっざへづ(Landroid/os/Parcelable;)V

    .line 9
    :cond_62
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->づざかべべ:I

    if-eqz v0, :cond_6d

    const/4 v1, 0x4

    .line 10
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ごづごきえ(I)V

    .line 11
    :cond_6d
    iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->なぎぱいぢぎ:I

    if-eqz v0, :cond_78

    const/4 v1, 0x5

    .line 12
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ごづごきえ(I)V

    .line 13
    :cond_78
    iget-object v0, p0, Landroidx/core/graphics/drawable/IconCompat;->ぁごぐすすぃ:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_83

    const/4 v1, 0x6

    .line 14
    invoke-virtual {p1, v1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ざっざへづ(Landroid/os/Parcelable;)V

    .line 15
    :cond_83
    iget-object p0, p0, Landroidx/core/graphics/drawable/IconCompat;->ぺぁあねじ:Ljava/lang/String;

    if-eqz p0, :cond_8e

    const/4 v0, 0x7

    .line 16
    invoke-virtual {p1, v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぇぬぎばつ(I)V

    invoke-virtual {p1, p0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->でどあくず(Ljava/lang/String;)V

    :cond_8e
    return-void

    nop

    :pswitch_data_90
    .packed-switch -0x1
        :pswitch_3a
        :pswitch_12
        :pswitch_3a
        :pswitch_2b
        :pswitch_24
        :pswitch_13
        :pswitch_3a
        :pswitch_13
    .end packed-switch
.end method
