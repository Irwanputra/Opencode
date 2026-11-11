.class public final Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final ざとぅぼこ〺:[C

.field public static final は〲ぱなで:[I


# instance fields
.field public 〳ぜぞぜべっ:Ljava/lang/StringBuilder;

.field public final 〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

.field public ぁごぐすすぃ:Ljava/lang/StringBuilder;

.field public いいにぽつ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;

.field public final ぇぬぎばつ:[I

.field public final ぉざぅち〻:[I

.field public おぐぴう〸ず:Ljava/lang/String;

.field public くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

.field public final げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

.field public づざかべべ:Z

.field public てぜきぽく:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;

.field public なぎぱいぢぎ:Ljava/lang/String;

.field public のぷのちつ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$づざかべべ;

.field public びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

.field public へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

.field public ぺぁあねじ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;

.field public ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const/4 v0, 0x7

    new-array v0, v0, [C

    fill-array-data v0, :array_16

    sput-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ざとぅぼこ〺:[C

    const/16 v1, 0x20

    new-array v1, v1, [I

    fill-array-data v1, :array_22

    sput-object v1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->は〲ぱなで:[I

    invoke-static {v0}, Ljava/util/Arrays;->sort([C)V

    return-void

    nop

    :array_16
    .array-data 2
        0x9s
        0xas
        0xds
        0xcs
        0x20s
        0x3cs
        0x26s
    .end array-data

    nop

    :array_22
    .array-data 4
        0x20ac
        0x81
        0x201a
        0x192
        0x201e
        0x2026
        0x2020
        0x2021
        0x2c6
        0x2030
        0x160
        0x2039
        0x152
        0x8d
        0x17d
        0x8f
        0x90
        0x2018
        0x2019
        0x201c
        0x201d
        0x2022
        0x2013
        0x2014
        0x2dc
        0x2122
        0x161
        0x203a
        0x153
        0x9d
        0x17e
        0x178
    .end array-data
.end method

.method public constructor <init>(Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->づざかべべ:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〳ぜぞぜべっ:Ljava/lang/StringBuilder;

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->てぜきぽく:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$づざかべべ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$づざかべべ;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->のぷのちつ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$づざかべべ;

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->へぬ〴づぞ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;

    const/4 v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぇぬぎばつ:[I

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぉざぅち〻:[I

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    iput-object p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V
    .registers 7

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    new-instance v1, Lいいにぽつ/〺つふすそ/づざかべべ/びぐびあび;

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->は〲ぱなで()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "Unexpectedly reached end of file (EOF) in input state [%s]"

    invoke-direct {v1, v2, p1, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/びぐびあび;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_20
    return-void
.end method

.method public 〺つふすそ(Ljava/lang/Character;Z)[I
    .registers 16

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぺふねづ〺()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    return-object v1

    :cond_a
    if-eqz p1, :cond_19

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->いいにぽつ()C

    move-result v0

    if-ne p1, v0, :cond_19

    return-object v1

    :cond_19
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ざとぅぼこ〺:[C

    .line 1
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぺふねづ〺()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_36

    iget-object v2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    aget-char p1, v2, p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result p1

    if-ltz p1, :cond_36

    const/4 p1, 0x1

    goto :goto_37

    :cond_36
    const/4 p1, 0x0

    :goto_37
    if-eqz p1, :cond_3a

    return-object v1

    .line 2
    :cond_3a
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぇぬぎばつ:[I

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    .line 3
    iget v2, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iput v2, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    const-string v2, "#"

    .line 4
    invoke-virtual {v0, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/String;)Z

    move-result v0

    const-string v2, "missing semicolon"

    const-string v5, ";"

    const/16 v6, 0x61

    const/16 v7, 0x41

    const/16 v8, 0x39

    const/16 v9, 0x30

    const/4 v10, -0x1

    if-eqz v0, :cond_115

    iget-object p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    const-string v0, "X"

    invoke-virtual {p2, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->へぬ〴づぞ(Ljava/lang/String;)Z

    move-result p2

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    if-eqz p2, :cond_93

    .line 5
    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget v4, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    :goto_68
    iget v11, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v12, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ge v11, v12, :cond_89

    iget-object v12, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    aget-char v12, v12, v11

    if-lt v12, v9, :cond_76

    if-le v12, v8, :cond_82

    :cond_76
    if-lt v12, v7, :cond_7c

    const/16 v7, 0x46

    if-le v12, v7, :cond_82

    :cond_7c
    if-lt v12, v6, :cond_89

    const/16 v7, 0x66

    if-gt v12, v7, :cond_89

    :cond_82
    add-int/lit8 v11, v11, 0x1

    iput v11, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    const/16 v7, 0x41

    goto :goto_68

    :cond_89
    iget-object v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object v0, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    sub-int/2addr v11, v4

    invoke-static {v6, v0, v4, v11}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    goto :goto_b4

    .line 6
    :cond_93
    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget v4, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    :goto_98
    iget v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v7, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ge v6, v7, :cond_ab

    iget-object v7, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    aget-char v7, v7, v6

    if-lt v7, v9, :cond_ab

    if-gt v7, v8, :cond_ab

    add-int/lit8 v6, v6, 0x1

    iput v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    goto :goto_98

    :cond_ab
    iget-object v7, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object v0, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    sub-int/2addr v6, v4

    invoke-static {v7, v0, v4, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    .line 7
    :goto_b4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_c6

    const-string p1, "numeric reference with no numerals"

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ(Ljava/lang/String;)V

    :cond_bf
    :goto_bf
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    .line 8
    iget p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    iput p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    return-object v1

    .line 9
    :cond_c6
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v1, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d1

    invoke-virtual {p0, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ(Ljava/lang/String;)V

    :cond_d1
    if-eqz p2, :cond_d6

    const/16 p2, 0x10

    goto :goto_d8

    :cond_d6
    const/16 p2, 0xa

    :goto_d8
    :try_start_d8
    invoke-static {v0, p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2
    :try_end_e0
    .catch Ljava/lang/NumberFormatException; {:try_start_d8 .. :try_end_e0} :catch_e1

    goto :goto_e2

    :catch_e1
    const/4 p2, -0x1

    :goto_e2
    if-eq p2, v10, :cond_10a

    const v0, 0xd800

    if-lt p2, v0, :cond_ee

    const v0, 0xdfff

    if-le p2, v0, :cond_10a

    :cond_ee
    const v0, 0x10ffff

    if-le p2, v0, :cond_f4

    goto :goto_10a

    :cond_f4
    const/16 v0, 0x80

    if-lt p2, v0, :cond_107

    sget-object v1, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->は〲ぱなで:[I

    array-length v2, v1

    add-int/2addr v2, v0

    if-ge p2, v2, :cond_107

    const-string v0, "character is not a valid unicode code point"

    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ(Ljava/lang/String;)V

    add-int/lit8 p2, p2, -0x80

    aget p2, v1, p2

    :cond_107
    aput p2, p1, v3

    return-object p1

    :cond_10a
    :goto_10a
    const-string p2, "character outside of valid range"

    invoke-virtual {p0, p2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ(Ljava/lang/String;)V

    const p2, 0xfffd

    aput p2, p1, v3

    return-object p1

    :cond_115
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    .line 10
    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〺つふすそ()V

    iget v7, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    :goto_11c
    iget v11, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    iget v12, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ge v11, v12, :cond_140

    iget-object v12, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    aget-char v11, v12, v11

    const/16 v12, 0x41

    if-lt v11, v12, :cond_12e

    const/16 v12, 0x5a

    if-le v11, v12, :cond_13a

    :cond_12e
    if-lt v11, v6, :cond_134

    const/16 v12, 0x7a

    if-le v11, v12, :cond_13a

    :cond_134
    invoke-static {v11}, Ljava/lang/Character;->isLetter(C)Z

    move-result v11

    if-eqz v11, :cond_140

    :cond_13a
    iget v11, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    add-int/2addr v11, v4

    iput v11, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    goto :goto_11c

    :cond_140
    :goto_140
    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->てぜきぽく()Z

    move-result v6

    if-nez v6, :cond_155

    iget-object v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget v11, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    aget-char v6, v6, v11

    if-lt v6, v9, :cond_155

    if-gt v6, v8, :cond_155

    add-int/lit8 v11, v11, 0x1

    iput v11, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    goto :goto_140

    :cond_155
    iget-object v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget-object v11, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->〳ぜぞぜべっ:[Ljava/lang/String;

    iget v0, v0, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    sub-int/2addr v0, v7

    invoke-static {v6, v11, v7, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    .line 11
    iget-object v6, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    const/16 v7, 0x3b

    invoke-virtual {v6, v7}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->おぐぴう〸ず(C)Z

    move-result v6

    .line 12
    sget-object v7, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ;->げつ〴ぬぐ:[C

    sget-object v7, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->ぁごぐすすぃ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    invoke-virtual {v7, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;)I

    move-result v7

    if-eq v7, v10, :cond_174

    const/4 v7, 0x1

    goto :goto_175

    :cond_174
    const/4 v7, 0x0

    :goto_175
    if-nez v7, :cond_189

    .line 13
    sget-object v7, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->〳ぜぞぜべっ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    invoke-virtual {v7, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;)I

    move-result v7

    if-eq v7, v10, :cond_181

    const/4 v7, 0x1

    goto :goto_182

    :cond_181
    const/4 v7, 0x0

    :goto_182
    if-eqz v7, :cond_187

    if-eqz v6, :cond_187

    goto :goto_189

    :cond_187
    const/4 v7, 0x0

    goto :goto_18a

    :cond_189
    :goto_189
    const/4 v7, 0x1

    :goto_18a
    if-nez v7, :cond_1a2

    .line 14
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    .line 15
    iget p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    iput p2, p1, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    if-eqz v6, :cond_1a1

    new-array p1, v4, [Ljava/lang/Object;

    aput-object v0, p1, v3

    const-string p2, "invalid named referenece \'%s\'"

    .line 16
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ(Ljava/lang/String;)V

    :cond_1a1
    return-object v1

    :cond_1a2
    if-eqz p2, :cond_1d4

    iget-object p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぉざぅち〻()Z

    move-result p2

    if-nez p2, :cond_bf

    iget-object p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    .line 17
    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぺふねづ〺()Z

    move-result v6

    if-eqz v6, :cond_1b5

    goto :goto_1c1

    :cond_1b5
    iget-object v6, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->げつ〴ぬぐ:[C

    iget p2, p2, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->づざかべべ:I

    aget-char p2, v6, p2

    if-lt p2, v9, :cond_1c1

    if-gt p2, v8, :cond_1c1

    const/4 p2, 0x1

    goto :goto_1c2

    :cond_1c1
    :goto_1c1
    const/4 p2, 0x0

    :goto_1c2
    if-nez p2, :cond_bf

    .line 18
    iget-object p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    const/4 v6, 0x3

    new-array v6, v6, [C

    fill-array-data v6, :array_224

    invoke-virtual {p2, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->ぇぬぎばつ([C)Z

    move-result p2

    if-eqz p2, :cond_1d4

    goto/16 :goto_bf

    :cond_1d4
    iget-object p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {p2, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1df

    invoke-virtual {p0, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ(Ljava/lang/String;)V

    :cond_1df
    iget-object p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぉざぅち〻:[I

    .line 19
    sget-object v1, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ;->〺つふすそ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x2

    if-eqz v1, :cond_1fa

    invoke-virtual {v1, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v5

    aput v5, p2, v3

    invoke-virtual {v1, v4}, Ljava/lang/String;->codePointAt(I)I

    move-result v1

    aput v1, p2, v4

    const/4 p2, 0x2

    goto :goto_207

    :cond_1fa
    sget-object v1, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->〳ぜぞぜべっ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    invoke-virtual {v1, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v10, :cond_206

    aput v1, p2, v3

    const/4 p2, 0x1

    goto :goto_207

    :cond_206
    const/4 p2, 0x0

    :goto_207
    if-ne p2, v4, :cond_210

    .line 20
    iget-object p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぉざぅち〻:[I

    aget p2, p2, v3

    aput p2, p1, v3

    return-object p1

    :cond_210
    if-ne p2, v2, :cond_215

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぉざぅち〻:[I

    return-object p1

    :cond_215
    const-string p1, "Unexpected characters returned for "

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 21
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_222

    :goto_221
    throw p2

    :goto_222
    goto :goto_221

    nop

    :array_224
    .array-data 2
        0x3ds
        0x2ds
        0x5fs
    .end array-data
.end method

.method public ぁごぐすすぃ()V
    .registers 3

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぺぁあねじ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;

    .line 1
    iget-object v1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->びぐびあび:Ljava/lang/String;

    if-eqz v1, :cond_9

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->ざとぅぼこ〺()V

    .line 2
    :cond_9
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぺぁあねじ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;

    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)V

    return-void
.end method

.method public いいにぽつ(Lいいにぽつ/〺つふすそ/づざかべべ/ぺふねづ〺;)V
    .registers 8

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_2d

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    new-instance v1, Lいいにぽつ/〺つふすそ/づざかべべ/びぐびあび;

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->は〲ぱなで()I

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v5}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->いいにぽつ()C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    const-string p1, "Unexpected character \'%s\' in input state [%s]"

    invoke-direct {v1, v2, p1, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/びぐびあび;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2d
    return-void
.end method

.method public くし〴〺ぅ(Z)Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;
    .registers 2

    if-eqz p1, :cond_8

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->いいにぽつ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;

    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;->は〲ぱなで()Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;

    goto :goto_d

    :cond_8
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;

    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->は〲ぱなで()Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;

    :goto_d
    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぺぁあねじ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;

    return-object p1
.end method

.method public final げつ〴ぬぐ(Ljava/lang/String;)V
    .registers 7

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    new-instance v1, Lいいにぽつ/〺つふすそ/づざかべべ/びぐびあび;

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->は〲ぱなで()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "Invalid character reference: %s"

    invoke-direct {v1, v2, p1, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/びぐびあび;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_20
    return-void
.end method

.method public づざかべべ(Ljava/lang/String;)V
    .registers 4

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ:Ljava/lang/String;

    if-nez v0, :cond_7

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ:Ljava/lang/String;

    goto :goto_1b

    :cond_7
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_16

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/StringBuilder;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_16
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1b
    return-void
.end method

.method public なぎぱいぢぎ(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;)V
    .registers 4

    iget-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->づざかべべ:Z

    if-nez v0, :cond_26

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->づざかべべ:Z

    iget-object v0, p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;

    sget-object v1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;

    if-ne v0, v1, :cond_16

    check-cast p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〳ぜぞぜべっ;

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〺つふすそ:Ljava/lang/String;

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->おぐぴう〸ず:Ljava/lang/String;

    goto :goto_25

    :cond_16
    sget-object v1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;

    if-ne v0, v1, :cond_25

    check-cast p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぁごぐすすぃ;

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    if-eqz p1, :cond_25

    const-string p1, "Attributes incorrectly present on end tag"

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぺぁあねじ(Ljava/lang/String;)V

    :cond_25
    :goto_25
    return-void

    .line 1
    :cond_26
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "There is an unread token pending!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public びぐびあび(C)V
    .registers 2

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->づざかべべ(Ljava/lang/String;)V

    return-void
.end method

.method public ぺぁあねじ(Ljava/lang/String;)V
    .registers 5

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->〺つふすそ:Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;

    new-instance v1, Lいいにぽつ/〺つふすそ/づざかべべ/びぐびあび;

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v2}, Lいいにぽつ/〺つふすそ/づざかべべ/げつ〴ぬぐ;->は〲ぱなで()I

    move-result v2

    invoke-direct {v1, v2, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/びぐびあび;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    return-void
.end method

.method public ぺふねづ〺()Z
    .registers 3

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->おぐぴう〸ず:Ljava/lang/String;

    if-eqz v0, :cond_14

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->ぺぁあねじ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/いいにぽつ;->おぐぴう〸ず:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 v0, 0x1

    goto :goto_15

    :cond_14
    const/4 v0, 0x0

    :goto_15
    return v0
.end method
