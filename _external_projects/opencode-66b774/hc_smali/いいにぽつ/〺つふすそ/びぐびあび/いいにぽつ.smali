.class public Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;,
        Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;
    }
.end annotation


# static fields
.field public static final 〺つふすそ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final げつ〴ぬぐ:[C


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x2

    new-array v0, v0, [C

    fill-array-data v0, :array_16

    sput-object v0, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ;->げつ〴ぬぐ:[C

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ;->〺つふすそ:Ljava/util/HashMap;

    new-instance v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;-><init>()V

    return-void

    nop

    :array_16
    .array-data 2
        0x2cs
        0x3bs
    .end array-data
.end method

.method public static 〺つふすそ(Ljava/lang/Appendable;Ljava/lang/String;Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;ZZZ)V
    .registers 20

    move-object v0, p0

    move-object/from16 v1, p2

    .line 1
    iget-object v2, v1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    .line 2
    iget-object v3, v1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->びぐびあび:Ljava/lang/ThreadLocal;

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/charset/CharsetEncoder;

    if-eqz v3, :cond_10

    goto :goto_14

    :cond_10
    invoke-virtual/range {p2 .. p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ()Ljava/nio/charset/CharsetEncoder;

    move-result-object v3

    .line 3
    :goto_14
    iget-object v1, v1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->づざかべべ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$げつ〴ぬぐ;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1e
    if-ge v6, v4, :cond_b1

    move-object v9, p1

    invoke-virtual {p1, v6}, Ljava/lang/String;->codePointAt(I)I

    move-result v10

    const/4 v11, 0x1

    if-eqz p4, :cond_40

    invoke-static {v10}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->びぐびあび(I)Z

    move-result v12

    if-eqz v12, :cond_3e

    if-eqz p5, :cond_32

    if-eqz v7, :cond_aa

    :cond_32
    if-eqz v8, :cond_36

    goto/16 :goto_aa

    :cond_36
    const/16 v8, 0x20

    invoke-interface {p0, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    const/4 v8, 0x1

    goto/16 :goto_aa

    :cond_3e
    const/4 v7, 0x1

    const/4 v8, 0x0

    :cond_40
    const/high16 v12, 0x10000

    if-ge v10, v12, :cond_9a

    int-to-char v12, v10

    const/16 v13, 0x22

    if-eq v12, v13, :cond_91

    const/16 v13, 0x26

    if-eq v12, v13, :cond_8b

    const/16 v13, 0x3c

    if-eq v12, v13, :cond_82

    const/16 v13, 0x3e

    if-eq v12, v13, :cond_7d

    const/16 v13, 0xa0

    if-eq v12, v13, :cond_73

    .line 4
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-eqz v13, :cond_66

    if-eq v13, v11, :cond_6c

    invoke-virtual {v3, v12}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z

    move-result v11

    goto :goto_6c

    :cond_66
    const/16 v13, 0x80

    if-ge v12, v13, :cond_6b

    goto :goto_6c

    :cond_6b
    const/4 v11, 0x0

    :cond_6c
    :goto_6c
    if-eqz v11, :cond_6f

    goto :goto_96

    .line 5
    :cond_6f
    invoke-static {p0, v2, v10}, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ;->げつ〴ぬぐ(Ljava/lang/Appendable;Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;I)V

    goto :goto_aa

    :cond_73
    sget-object v11, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    if-eq v2, v11, :cond_7a

    const-string v11, "&nbsp;"

    goto :goto_8d

    :cond_7a
    const-string v11, "&#xa0;"

    goto :goto_8d

    :cond_7d
    if-nez p3, :cond_96

    const-string v11, "&gt;"

    goto :goto_8d

    :cond_82
    if-eqz p3, :cond_88

    sget-object v11, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->なぎぱいぢぎ:Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;

    if-ne v2, v11, :cond_96

    :cond_88
    const-string v11, "&lt;"

    goto :goto_8d

    :cond_8b
    const-string v11, "&amp;"

    :goto_8d
    invoke-interface {p0, v11}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_aa

    :cond_91
    if-eqz p3, :cond_96

    const-string v11, "&quot;"

    goto :goto_8d

    :cond_96
    :goto_96
    invoke-interface {p0, v12}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_aa

    :cond_9a
    new-instance v11, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v3, v11}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_6f

    goto :goto_8d

    :cond_aa
    :goto_aa
    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    move-result v10

    add-int/2addr v6, v10

    goto/16 :goto_1e

    :cond_b1
    return-void
.end method

.method public static げつ〴ぬぐ(Ljava/lang/Appendable;Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;I)V
    .registers 7

    .line 1
    iget-object v0, p1, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->びぐびあび:[I

    invoke-static {v0, p2}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    const-string v1, ""

    if-ltz v0, :cond_1f

    iget-object v2, p1, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->づざかべべ:[Ljava/lang/String;

    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_1c

    iget-object p1, p1, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ$〺つふすそ;->びぐびあび:[I

    add-int/lit8 v3, v0, 0x1

    aget p1, p1, v3

    if-ne p1, p2, :cond_1c

    aget-object p1, v2, v3

    goto :goto_20

    :cond_1c
    aget-object p1, v2, v0

    goto :goto_20

    :cond_1f
    move-object p1, v1

    :goto_20
    const/16 v0, 0x3b

    if-eq p1, v1, :cond_2b

    const/16 p2, 0x26

    .line 2
    invoke-interface {p0, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move-result-object p0

    goto :goto_35

    :cond_2b
    const-string p1, "&#x"

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    :goto_35
    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method
