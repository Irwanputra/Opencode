.class public final Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final 〳ぜぞぜべっ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

.field public static final ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

.field public static final づざかべべ:Ljava/lang/String;

.field public static final なぎぱいぢぎ:Ljava/lang/String;

.field public static final びぐびあび:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;


# instance fields
.field public final 〺つふすそ:I

.field public final くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

.field public final げつ〴ぬぐ:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ;->くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    const/16 v1, 0x200e

    invoke-static {v1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    const/16 v1, 0x200f

    invoke-static {v1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3, v0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;-><init>(ZILづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;)V

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v3, v0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;-><init>(ZILづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;)V

    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->〳ぜぞぜべっ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

    return-void
.end method

.method public constructor <init>(ZILづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    iput p2, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ:I

    iput-object p3, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    return-void
.end method

.method public static 〺つふすそ(Ljava/lang/CharSequence;)I
    .registers 7

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 1
    iget p0, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:I

    iput p0, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    const/4 p0, 0x0

    const/4 v2, 0x0

    :cond_c
    :goto_c
    iget v3, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    const/4 v4, 0x1

    if-lez v3, :cond_41

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ()B

    move-result v3

    if-eqz v3, :cond_39

    if-eq v3, v4, :cond_32

    const/4 v5, 0x2

    if-eq v3, v5, :cond_32

    const/16 v5, 0x9

    if-eq v3, v5, :cond_c

    packed-switch v3, :pswitch_data_42

    if-nez v2, :cond_c

    goto :goto_3f

    :pswitch_26
    add-int/lit8 p0, p0, 0x1

    goto :goto_c

    :pswitch_29
    if-ne v2, p0, :cond_2f

    goto :goto_34

    :pswitch_2c
    if-ne v2, p0, :cond_2f

    goto :goto_3b

    :cond_2f
    add-int/lit8 p0, p0, -0x1

    goto :goto_c

    :cond_32
    if-nez p0, :cond_36

    :goto_34
    const/4 v1, 0x1

    goto :goto_41

    :cond_36
    if-nez v2, :cond_c

    goto :goto_3f

    :cond_39
    if-nez p0, :cond_3d

    :goto_3b
    const/4 v1, -0x1

    goto :goto_41

    :cond_3d
    if-nez v2, :cond_c

    :goto_3f
    move v2, p0

    goto :goto_c

    :cond_41
    :goto_41
    return v1

    :pswitch_data_42
    .packed-switch 0xe
        :pswitch_2c
        :pswitch_2c
        :pswitch_29
        :pswitch_29
        :pswitch_26
    .end packed-switch
.end method

.method public static くし〴〺ぅ()Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;
    .registers 4

    .line 1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/なぎぱいぢぎ;->げつ〴ぬぐ(Ljava/util/Locale;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    goto :goto_d

    :cond_c
    const/4 v1, 0x0

    .line 3
    :goto_d
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    .line 4
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    if-ne v0, v2, :cond_1b

    if-eqz v1, :cond_18

    .line 5
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->〳ぜぞぜべっ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

    goto :goto_22

    :cond_18
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

    goto :goto_22

    .line 6
    :cond_1b
    new-instance v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;

    const/4 v3, 0x2

    invoke-direct {v2, v1, v3, v0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;-><init>(ZILづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;)V

    move-object v0, v2

    :goto_22
    return-object v0
.end method

.method public static げつ〴ぬぐ(Ljava/lang/CharSequence;)I
    .registers 10

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 1
    iput v1, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    const/4 p0, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_d
    :goto_d
    iget v6, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v7, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:I

    if-ge v6, v7, :cond_70

    if-nez v3, :cond_70

    .line 2
    iget-object v7, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/CharSequence;

    invoke-interface {v7, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    iput-char v6, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:C

    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_39

    iget-object v6, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/CharSequence;

    iget v7, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {v6, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    iget v7, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v8, v7

    iput v8, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {v6}, Ljava/lang/Character;->getDirectionality(I)B

    move-result v6

    goto :goto_4d

    :cond_39
    iget v6, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    add-int/2addr v6, v2

    iput v6, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-char v6, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:C

    const/16 v7, 0x700

    if-ge v6, v7, :cond_49

    .line 3
    sget-object v7, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:[B

    aget-byte v6, v7, v6

    goto :goto_4d

    :cond_49
    invoke-static {v6}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v6

    :goto_4d
    if-eqz v6, :cond_6b

    if-eq v6, v2, :cond_68

    const/4 v7, 0x2

    if-eq v6, v7, :cond_68

    const/16 v7, 0x9

    if-eq v6, v7, :cond_d

    packed-switch v6, :pswitch_data_92

    goto :goto_6e

    :pswitch_5c
    add-int/lit8 v5, v5, -0x1

    const/4 v4, 0x0

    goto :goto_d

    :pswitch_60
    add-int/lit8 v5, v5, 0x1

    const/4 v4, 0x1

    goto :goto_d

    :pswitch_64
    add-int/lit8 v5, v5, 0x1

    const/4 v4, -0x1

    goto :goto_d

    :cond_68
    if-nez v5, :cond_6e

    goto :goto_88

    :cond_6b
    if-nez v5, :cond_6e

    goto :goto_8c

    :cond_6e
    :goto_6e
    move v3, v5

    goto :goto_d

    :cond_70
    if-nez v3, :cond_73

    goto :goto_91

    :cond_73
    if-eqz v4, :cond_77

    move v1, v4

    goto :goto_91

    .line 4
    :cond_77
    :goto_77
    iget v4, v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-lez v4, :cond_91

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ()B

    move-result v4

    packed-switch v4, :pswitch_data_a0

    goto :goto_77

    :pswitch_83
    add-int/lit8 v5, v5, 0x1

    goto :goto_77

    :pswitch_86
    if-ne v3, v5, :cond_8e

    :goto_88
    const/4 v1, 0x1

    goto :goto_91

    :pswitch_8a
    if-ne v3, v5, :cond_8e

    :goto_8c
    const/4 v1, -0x1

    goto :goto_91

    :cond_8e
    add-int/lit8 v5, v5, -0x1

    goto :goto_77

    :cond_91
    :goto_91
    return v1

    :pswitch_data_92
    .packed-switch 0xe
        :pswitch_64
        :pswitch_64
        :pswitch_60
        :pswitch_60
        :pswitch_5c
    .end packed-switch

    :pswitch_data_a0
    .packed-switch 0xe
        :pswitch_8a
        :pswitch_8a
        :pswitch_86
        :pswitch_86
        :pswitch_83
    .end packed-switch
.end method


# virtual methods
.method public びぐびあび(Ljava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;Z)Ljava/lang/CharSequence;
    .registers 11

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    check-cast p2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1, v0}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;->〺つふすそ(Ljava/lang/CharSequence;II)Z

    move-result p2

    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 1
    iget v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x1

    if-eqz v2, :cond_1d

    const/4 v2, 0x1

    goto :goto_1e

    :cond_1d
    const/4 v2, 0x0

    :goto_1e
    const/4 v4, -0x1

    const-string v5, ""

    if-eqz v2, :cond_58

    if-eqz p3, :cond_58

    if-eqz p2, :cond_2a

    .line 2
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    goto :goto_2c

    :cond_2a
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    .line 3
    :goto_2c
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    check-cast v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v2, p1, v1, v6}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;->〺つふすそ(Ljava/lang/CharSequence;II)Z

    move-result v2

    iget-boolean v6, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-nez v6, :cond_45

    if-nez v2, :cond_42

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/CharSequence;)I

    move-result v6

    if-ne v6, v3, :cond_45

    :cond_42
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    goto :goto_55

    :cond_45
    iget-boolean v6, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v6, :cond_54

    if-eqz v2, :cond_51

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/CharSequence;)I

    move-result v2

    if-ne v2, v4, :cond_54

    :cond_51
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    goto :goto_55

    :cond_54
    move-object v2, v5

    .line 4
    :goto_55
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_58
    iget-boolean v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eq p2, v2, :cond_6f

    if-eqz p2, :cond_61

    const/16 v2, 0x202b

    goto :goto_63

    :cond_61
    const/16 v2, 0x202a

    :goto_63
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    const/16 v2, 0x202c

    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    goto :goto_72

    :cond_6f
    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :goto_72
    if-eqz p3, :cond_a5

    if-eqz p2, :cond_79

    sget-object p2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    goto :goto_7b

    :cond_79
    sget-object p2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/びぐびあび;

    .line 5
    :goto_7b
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    check-cast p2, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;

    invoke-virtual {p2, p1, v1, p3}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/づざかべべ$くし〴〺ぅ;->〺つふすそ(Ljava/lang/CharSequence;II)Z

    move-result p2

    iget-boolean p3, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-nez p3, :cond_94

    if-nez p2, :cond_91

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/CharSequence;)I

    move-result p3

    if-ne p3, v3, :cond_94

    :cond_91
    sget-object v5, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    goto :goto_a2

    :cond_94
    iget-boolean p3, p0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz p3, :cond_a2

    if-eqz p2, :cond_a0

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/CharSequence;)I

    move-result p1

    if-ne p1, v4, :cond_a2

    :cond_a0
    sget-object v5, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    .line 6
    :cond_a2
    :goto_a2
    invoke-virtual {v0, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_a5
    return-object v0
.end method
