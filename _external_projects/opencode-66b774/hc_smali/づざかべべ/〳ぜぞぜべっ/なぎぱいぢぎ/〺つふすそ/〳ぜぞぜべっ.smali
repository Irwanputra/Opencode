.class public final Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ$げつ〴ぬぐ;
    }
.end annotation


# direct methods
.method public static 〳ぜぞぜべっ(Landroid/content/Context;ILandroid/util/TypedValue;ILづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;Landroid/os/Handler;Z)Landroid/graphics/Typeface;
    .registers 20

    move v8, p1

    move-object v0, p2

    move/from16 v4, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v1, 0x1

    invoke-virtual {v2, p1, p2, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 1
    iget-object v1, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-eqz v1, :cond_9f

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "res/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v11, 0x0

    const/4 v12, -0x3

    if-nez v1, :cond_25

    if-eqz v9, :cond_7d

    goto :goto_7a

    .line 2
    :cond_25
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->〺つふすそ:Lづざかべべ/づざかべべ/なぎぱいぢぎ;

    invoke-static {v2, p1, v4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->くし〴〺ぅ(Landroid/content/res/Resources;II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_3a

    if-eqz v9, :cond_38

    .line 3
    invoke-virtual {v9, v1, v10}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    :cond_38
    move-object v11, v1

    goto :goto_7d

    :cond_3a
    :try_start_3a
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v3, ".xml"

    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_65

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v0

    invoke-static {v0, v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->かづげぃぁ〺(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;)Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〺つふすそ;

    move-result-object v1

    if-nez v1, :cond_56

    if-eqz v9, :cond_7d

    invoke-virtual {v9, v12, v10}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ(ILandroid/os/Handler;)V

    goto :goto_7d

    :cond_56
    move-object v0, p0

    move v3, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    invoke-static/range {v0 .. v7}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〺つふすそ;Landroid/content/res/Resources;IILづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;Landroid/os/Handler;Z)Landroid/graphics/Typeface;

    move-result-object v11

    goto :goto_7d

    :cond_65
    move-object v1, p0

    invoke-static {p0, v2, p1, v0, v4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->〺つふすそ(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v9, :cond_75

    if-eqz v0, :cond_72

    invoke-virtual {v9, v0, v10}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_75

    :cond_72
    invoke-virtual {v9, v12, v10}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ(ILandroid/os/Handler;)V
    :try_end_75
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3a .. :try_end_75} :catch_77
    .catch Ljava/io/IOException; {:try_start_3a .. :try_end_75} :catch_77

    :cond_75
    :goto_75
    move-object v11, v0

    goto :goto_7d

    :catch_77
    nop

    if-eqz v9, :cond_7d

    :goto_7a
    invoke-virtual {v9, v12, v10}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ(ILandroid/os/Handler;)V

    :cond_7d
    :goto_7d
    if-nez v11, :cond_9e

    if-eqz v9, :cond_82

    goto :goto_9e

    .line 4
    :cond_82
    new-instance v0, Landroid/content/res/Resources$NotFoundException;

    const-string v1, "Font resource ID #0x"

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " could not be retrieved."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9e
    :goto_9e
    return-object v11

    .line 5
    :cond_9f
    new-instance v1, Landroid/content/res/Resources$NotFoundException;

    const-string v3, "Resource \""

    invoke-static {v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\" ("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") is not a Font: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static 〺つふすそ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;
    .registers 8

    invoke-static {p1, p3}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_33

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0, p4, p1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_21

    const/16 v1, 0x1f

    if-gt v0, v1, :cond_21

    iget p0, p1, Landroid/util/TypedValue;->data:I

    .line 1
    new-instance p1, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;

    invoke-direct {p1, p3, p3, p0}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p1

    .line 2
    :cond_21
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p4, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    .line 3
    :try_start_2a
    invoke-static {p1, p0, p2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;

    move-result-object p0
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2e} :catch_2f

    goto :goto_30

    :catch_2f
    move-object p0, p3

    :goto_30
    if-eqz p0, :cond_33

    return-object p0

    .line 4
    :cond_33
    new-instance p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;

    invoke-direct {p0, p3, p3, p5}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p0
.end method

.method public static ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    .registers 3

    const-string v0, "http://schemas.android.com/apk/res/android"

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_a

    const/4 p0, 0x1

    goto :goto_b

    :cond_a
    const/4 p0, 0x0

    :goto_b
    return p0
.end method

.method public static くし〴〺ぅ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
    .registers 5

    invoke-static {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    return p4

    :cond_7
    invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p0

    return p0
.end method

.method public static げつ〴ぬぐ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z
    .registers 5

    invoke-static {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    return p4

    :cond_7
    invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p0

    return p0
.end method

.method public static づざかべべ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    .registers 5

    invoke-static {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    return p4

    :cond_7
    invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    return p0
.end method

.method public static なぎぱいぢぎ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    .registers 4

    invoke-static {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    const/4 p0, 0x0

    return-object p0

    :cond_8
    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static びぐびあび(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    .registers 5

    invoke-static {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    return p4

    :cond_7
    invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    return p0
.end method

.method public static ぺぁあねじ(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    .registers 4

    if-nez p1, :cond_7

    invoke-virtual {p0, p2, p3}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0

    return-object p0

    :cond_7
    const/4 p0, 0x0

    invoke-virtual {p1, p2, p3, p0, p0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    return-object p0
.end method
